ALTER TABLE ITEM
ADD CONSTRAINT FK_ITEM_ITEMGROUP
FOREIGN KEY (ITEM_GROUP_ID) REFERENCES ITEM_GROUP(ID);

-- A. DML INSERT
-- 1. thêm 5 dòng dữ liệu vào bảng loại hàng
-- Cách 1: Sử dụng giao diện để insert dữ liệu
-- Cách 2: Dev/Qa tạo test data
	/*		2.1 sử dụng excel
			2.2 Viết hàm, đoạn sql code để insert dữ liệu(copy từ database nào đó)*/
INSERT INTO ITEM_GROUP(ID, NAME, IG_DESC)
VALUES	(1, "Áo", "Loại Hàng - Áo"), 
		(2, "Quần", "Loại Hàng - Quần"),
        (3, "Mũ", "Loại Hàng - Mũ"),
        (4, "Giày", "Loại Hàng - Giày"),
        (5, "Dép", "Loại Hàng - Dép");
 -- 2. Thêm 10 dòng dữ liệu vào bảng Mặt Hàng
INSERT INTO PROVIDER (`ID`, `NAME`, `ADDRESS`, `PHONE`)
VALUES	(1, 'Provider A', 'P1', '123456789'),
		(2, 'Provider B', 'P2', '123416749'),
        (3, 'Provider C', 'P3', '103436739');
INSERT INTO ITEM(ID, `NAME`, COLOR, BUY_PRICE, SELL_PRICE, METERIAL, ITEM_GROUP_ID, PROVIDER_ID)
VALUES	(1,	 'Áo 1',   'Vàng',  420, 560, 'Coton', 1, 1),
		(2,  'Áo 2',   'Trắng', 130, 630, 'Coton', 1, 3),
		(3,  'Quần 1', 'Xanh',  400, 560, 'Coton', 2, 2),
        (4,  'Quần 2', 'Vàng',  320, 490, 'Coton', 2, 2),
        (5,  'Mũ 1',   'Xanh',  120, 360, 'Coton', 3, 1),
        (6,  'Mũ 2',   'Đỏ',    200, 260, 'Coton', 3, 3),
        (7,  'Giày 1', 'Xanh',  220, 460, 'Coton', 4, 3),
        (8,  'Giày 2', 'Đỏ',    100, 360, 'Coton', 4, 1),
        (9,  'Dép 1',  'Xanh',  220, 360, 'Coton', 5, 1),
        (10, 'Dép 2',  'Vàng',  920, 990, 'Coton', 5, 2);
        
 -- 3. Sao lưu/chép dữ liệu từ bảng Loại Hàng sang bảng Loại Hàng Sao Lưu
 -- 3.1 Tạo bảng ITEM_GROUP_BACKUP(ID, NAME, DESC)
 -- + Luôn lấy từ ITEM_GROUP
 -- + Có cần phải tạo khoá chính cho ITEM_GROUP_BACKUP
 --   --> Dữ liệu ko trùng
 --   --> Thường truy vấn từ ITEM_GROUP
 --   --> Không.
 
 -- Mục đích của khoá chính
 -- + Không được trùng lắp dữ liệu
 -- + Tự động tạo index cho PK --> tăng tốc độ tìm kiếm
 -- --> Tạo index
 -- 		+ Lợi: Tăng tốc độ tìm kiếm
 --  		+ Hại: Tốn memory để lưu trữ giá trị của index
 
 CREATE TABLE ITEM_GROUP_BACKUP
 (
	ID			INT			NOT NULL,
    `NAME`		VARCHAR(50)	NOT NULL,
    `DESC`		TEXT		NOT NULL
 );
 INSERT INTO ITEM_GROUP_BACKUP(ID, `NAME`, `DESC`)
 SELECT ID,
		`NAME`,
        `IG_DESC`
	FROM ITEM_GROUP;
    
 -- ITEM_GROUP: 8
 -- ITEM_GROUP_BACKUP: 6
 -- 1 --> Tìm những phần tử có trong item_group mà k có trong backup
INSERT INTO ITEM_GROUP_BACKUP(ID, `NAME`, `DESC`)
SELECT *
	FROM ITEM_GROUP
    WHERE NOT EXISTS (SELECT *
						FROM ITEM_GROUP_BACKUP
						WHERE ITEM_GROUP.ID = ITEM_GROUP_BACKUP.ID);

 -- 2 --> Thêm những phần tử đó vào backup
 
 -- TRANSACTION
 -- --> Chứa tập hợp các thao tác, chức năng / Đảm bảo tất cả các thao tác trong 1 transaction
 -- + Nếu tất cả thao tác thành công --> commit --> kết thúc transaction
 -- + nếu tồn tại 1 thao tác thất bại -- rollback --> trở về lại trạng thái ban đầu
 
 -- SQL --> Mặc định: Auto Commit -- INSERT, UPDATE, DELETE
 -- Tắt auti commit mode -> DML
 -- khi ok ->> tự commit, ko --> rollback
 
 -- DML DELETE
 -- 1. Xoá dữ liệu từ bảng Loại Hàng
 DELETE FROM ITEM_GROUP WHERE ID = 1;
 DELETE FROM ITEM;
 
 -- DML UPDATE
 -- 1. Cập nhật màu sắc của tất cả các mặt hàng thành màu trắng
UPDATE ITEM
SET COLOR = 'Trắng';
 -- 2. Cập nhật vật liệu của các mặt hàng là kính thành thuỷ tinh
UPDATE ITEM
SET METERIAL = 'Thủy Tinh'
WHERE ITEM_GROUP_ID = (
	SELECT ID
		FROM ITEM_GROUP
        WHERE `NAME` = 'Kính'
);

-- DML -- SELECT --
SELECT 	ID,
		`NAME`,
        `IG_DESC` `DESCRIPTION` -- alias of column
	FROM ITEM_GROUP;
    
SELECT DISTINCT METERIAL FROM ITEM;
-- offset: bắt đầu từ hàng có chỉ số bao nhiêu (mặc định là 0)
-- row_count: số dòng muốn lấy tính từ offset
SELECT * 
	FROM ITEM
  LIMIT 0, 5;
  
SELECT 	ID,
		`NAME`,
        SELL_PRICE,
        ROUND(SELL_PRICE*0.9, 4) as PROMOTION
	FROM ITEM;

SELECT	ID,
		`NAME`,
        ITEM_GROUP_ID,
        CASE ITEM_GROUP_ID 
			WHEN 2 THEN 'Loại Hàng 2'
            WHEN 4 THEN 'Loại Hàng 4'
            ELSE ITEM_GROUP_ID
		END as ITEM_GROUP_DESC
	FROM ITEM;
