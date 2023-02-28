ALTER TABLE ITEM 
ADD CONSTRAINT FK_ITEM_PROVIDER 
FOREIGN KEY (PROVIDER_ID) REFERENCES PROVIDER(ID);

ALTER TABLE PROVIDER CHANGE P_NAME `NAME` VARCHAR(50) NOT NULL;
ALTER TABLE ITEM_GROUP CHANGE IG_NAME `NAME` VARCHAR(50) NOT NULL;
ALTER TABLE ITEM_GROUP CHANGE IG_DESC `DESC` TEXT NOT NULL;
ALTER TABLE ITEM CHANGE ITEM_NAME `NAME` VARCHAR(50) NOT NULL;

-- A. DML INSERT
-- 1. Thêm 5 dòng dữ liệu vào bảng Loại Hàng
-- Cách 1: Sử dụng giao diện để insert dữ liệu
-- Cách 2: Dev/Qa tạo test data
--         2.1 --> Sử dụng Excel
--         2.2 --> Viết hàm, đoạn sql code để insert dữ liệu(copy từ database nào đó) 

-- Error Code: 1452 --> Dữ liệu của khoá ngoại ở bảng con chưa tồn tại ở khoá chính của bảng con


-- Error Code: 1451. Cannot delete or update a parent row: a foreign key constraint fails (`java16_shopping_test`.`item`, CONSTRAINT `FK_ITEM_GROUP` FOREIGN KEY (`ITEM_GROUP_ID`) REFERENCES `item_group` (`ID`))
-- --> Dữ liệu cần xoá ở bảng cha đang bị/được tham chiếu ở bảng con 
-- --> Phải xoá dữ liệu ở bảng con trước rồi xoá ở bảng cha sau

INSERT INTO ITEM_GROUP (ID, `NAME`, `DESC`) 
VALUE (1, 'Áo', "Loại Hàng - Áo"),
      (2, 'Quần', "Loại Hàng - Quần"),
      (3, 'Mũ', "Loại Hàng - Mũ"),
      (4, 'Dép', "Loại Hàng - Dép"),
      (5, 'Giày', "Loại Hàng - Giày");
      
INSERT INTO PROVIDER (ID, `NAME`, ADDRESS, PHONE)
VALUE (1, 'Provider A', 'A1', '123456789'),
      (2, 'Provider B', 'A2', '123789456'),
      (3, 'Provider C', 'A3', '456789123');

-- 2. Thêm 10 dòng dữ liệu vào bảng Mặt Hàng
INSERT INTO ITEM(ID, `NAME`, COLOR, BUY_PRICE, SELL_PRICE,
                   MATERIAL, ITEM_GROUP_ID, PROVIDER_ID)
VALUE (1, "Áo 1", 'Vàng', 420, 560, 'Cotton',    1,2),
      (2, "Áo 2", 'Trắng', 520, 560, 'Cotton',   1,3),
      (3, "Mũ 1", 'Đỏ', 120, 160, 'Cotton',      2,1),
      (4, "Mũ 2", 'Xanh', 20, 60, 'Cotton',      2,2),
      (5, "Giày 1", 'Đen', 90, 160, 'Cotton',    3,2),
      (6, "Giày 2", 'Vàng', 50, 70, 'Cotton',    3,1),
      (7, "Quần 1", 'Trắng', 120, 300, 'Cotton', 4,3),
      (8, "Quần 2", 'Đen', 400, 500, 'Cotton',   4,2),
      (9, "Dép 1", 'Đỏ', 40, 50, 'Cotton',       5,2),
      (10, "Dép 2", 'Xanh', 20, 250, 'Cotton',   5,1);
-- TEST
-- DISABLE CHECK-UP FK
SET FOREIGN_KEY_CHECKS = 0;
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO ITEM(ID, `NAME`, COLOR, BUY_PRICE, SELL_PRICE,
                   MATERIAL, ITEM_GROUP_ID, PROVIDER_ID)
VALUE (11, "Kính 1", 'Vàng', 120, 560, 'Nhựa', 6,3);

INSERT INTO ITEM_GROUP (ID, `NAME`, `DESC`) 
VALUE (6, 'Kính', "Loại Hàng - Kính");

-- 3. Sao lưu dữ liệu từ bảng Loại Hàng sang bảng Loại Hàng Sao Lưu
-- 3.1 Tạo bảng ITEM_GROUP_BACKUP(ID, NAME, DESC)
-- + Luôn lấy từ ITEM_GROUP
-- + Có cần phải tạo khoá chính cho ITEM_GROUP_BACKUP
--  --> Dữ liệu không trùng
--  --> Thường truy vấn từ ITEM_GROUP
--  --> Không cần tạo khoá chính

-- Mục đích của khoá chính
-- + Không trùng lặp dữ liệu
-- + Tạo index cho khoá chính -->Tăng tốc độ tìm kiếm
-- + Tạo Index 
--            + Lợi: Tăng tốc độ tìm kiếm
--            + Hại: Tốn memory để lưu giá trị của index

CREATE TABLE ITEM_GROUP_BACKUP(
ID INT NOT NULL,
`NAME` VARCHAR(50) NOT NULL,
`DESC` TEXT NOT NULL
);
INSERT INTO ITEM_GROUP_BACKUP(ID,`NAME`,`DESC`)
SELECT ID,`NAME`,`DESC` FROM ITEM_GROUP WHERE ITEM_GROUP.ID <=6;

-- Sao chép những loại hàng ở bảng ITEM_GROUP chưa tồn tại ở bảng ITEM_GROUP_BACKUP
-- Oracle: MERGE
INSERT INTO ITEM_GROUP (ID, `NAME`, `DESC`) 
VALUE (7, 'Túi xách', "Loại Hàng - Túi xách"),
      (8, 'Thắt lưng', "Loại Hàng - Thắt lưng");
-- Xoá sạch thông tin trong bảng
TRUNCATE ITEM_GROUP_BACKUP;
-- ITEM_GROUP: 8
-- ITEM_GROUP_BACKUP: 6

-- 1 -->  Tìm những phần tử có trong ITEM_GROUP không có trong ITEM_GROUP_BACKUP
 INSERT INTO ITEM_GROUP_BACKUP
 SELECT * FROM ITEM_GROUP
 WHERE NOT EXISTS (SELECT * FROM ITEM_GROUP_BACKUP WHERE ITEM_GROUP.ID = ITEM_GROUP_BACKUP.ID);
 
 -- TRANSACTION --> Chứa tập hợp các thao tác/chức năng
 -- + Nếu tất cả thành công --> commit --> kết thúc transaction
 -- + Nếu tồn tại 1 thao tác thất bại --> rollback --> trở về trạng thái ban đầu
 
 -- SQL --> Mặc định: Auto Commit --> INSERT, UPDATE, DELETE
 -- Tắt Auto commit mode --> DML
 -- Khi ok ->> tự commit, ko --> rollback
 
 -- DML DELETE
 -- 1. Xoá dữ liệu từ bảng ITEM_GROUP
DELETE FROM ITEM;
ROLLBACK;

INSERT INTO ITEM_GROUP(ID, `NAME`, `DESC`)
VALUE (99, 'IG 99', "IG 99 - DESC");

DELETE FROM ITEM_GROUP WHERE ID = 99;

DELETE FROM ITEM_GROUP WHERE ID = 1;
ROLLBACK;
-- NO ACTION RESTRICT
ALTER TABLE ITEM 
DROP FOREIGN KEY FK_ITEM_GROUP;

ALTER TABLE ITEM ADD CONSTRAINT FK_ITEM_GROUP
FOREIGN KEY(ITEM_GROUP_ID) REFERENCES ITEM_GROUP(ID)
        ON DELETE CASCADE
        ON UPDATE CASCADE;
-- 2 --> Thêm những phần tử đó vào ITEM_GROUP_BACKUP
-- Truy vấn con - Sub Query
-- Trong 1 câu lệnh DML có lồng 1 câu lệnh DML khác
-- Sẽ thực hiện truy vấn con trước đến cha

-- DML UPDATE --

-- 1. Cập nhật màu sắc của tất cả mặt hàng thành màu trắng
UPDATE ITEM SET COLOR = 'Trắng';
-- 2. Cập nhật vật liệu của các mặt hàng là kính thành thuỷ tinh
UPDATE ITEM SET MATERIAL = 'Thuỷ tinh' WHERE ITEM_GROUP_ID = ( SELECT ID FROM ITEM_GROUP WHERE `NAME` = 'Kính');

-- DML - SELECT --
SELECT ID, `NAME`, `DESC` DESCRIPTION  -- Alias of column
FROM ITEM_GROUP;
SELECT current_time() CURRENT_DATE_TIME;

SELECT DISTINCT MATERIAL FROM ITEM;

-- offset: bắt đầu từ hàng số mấy (mặc định 0)
-- row_count: số dòng muốn lấy tính từ offset
SELECT * FROM ITEM LIMIT 4, 2;

SELECT ID,
       `NAME`,
       SELL_PRICE,
       ROUND(SELL_PRICE * 0.92) PROMOTION_PRICE
 FROM ITEM;
 SELECT ID,
        `NAME`,
        ITEM_GROUP_ID,
        CASE ITEM_GROUP_ID 
           WHEN 2 THEN 'Loại hàng 2'
           WHEN 4 THEN 'Loại hàng 4'
           ELSE ITEM_GROUP_ID
           END ITEM_GROUP_DESC
	FROM ITEM;