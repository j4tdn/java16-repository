ALTER TABLE ITEM 
ADD CONSTRAINT FK_ITEM_ITEMGROUP
FOREIGN KEY (ITEM_GROUP_ID) REFERENCES ITEM_GROUP(ID);


ALTER TABLE ITEM_GROUP
CHANGE IG_NAME `NAME` VARCHAR(50) NOT NULL;

ALTER TABLE ITEM_GROUP
CHANGE IG_DESC `DESC` TEXT NOT NULL;

ALTER TABLE ITEM
CHANGE I_NAME `NAME` VARCHAR(50) NOT NULL;

ALTER TABLE PROVIDER
CHANGE P_NAME `NAME` VARCHAR(50) NOT NULL;

ALTER TABLE PROVIDER
CHANGE ADRESS ADDRESS TEXT NOT NULL;
-- A. DML INSERT
-- 1. thêm 5 dòng dữ liệu vào bảng loại hàng
-- CÁCH 1: SỬ DỤNG GIAO DIỆN ĐỂ INSERT DỮ LIỆU
-- CÁCH 2: DEV/QA TẠO TEST DATA
-- 2.1 --> SỬ DỤNG EXCEL
-- 2.2 --> VIẾT HÀM, ĐOẠN SQL CODE ĐỂ INSERT DATA
INSERT INTO ITEM_GROUP(ID,`NAME`, `DESC`)
VALUES(1, 'ÁO', "LOẠI HÀNG - ÁO"),
(2, 'ÁO', "LOẠI HÀNG - QUẦN"),
(3, 'QUẦN', "LOẠI HÀNG - MŨ"),
(4, 'GIÀY', "LOẠI HÀNG - GIÀY"),
(5, 'DÉP', "LOẠI HÀNG - DÉP");
-- 2. THÊM 10 DÒNG DỮ LIỆU VÀO BẢNG MẶT HÀNG

INSERT INTO PROVIDER(`ID`, `NAME`, `ADDRESS`, `PHONE`)
VALUES(1, 'PROVIDER A', 'P1', '1234566789'),
(2, 'PROVIDER B', 'P1', '1234566789'),
(3, 'PROVIDER C', 'P1', '1234566789');

INSERT INTO ITEM(ID, `NAME`, COLOR, BUY_PRICE, SELL_PRICE, METERIAL,
                 ITEM_GROUP_ID, PROVIDER_ID)
VALUES(1, 'ÁO 1', 'VÀNG', 420, 560, 'COTON', 1, 1),
      (2, 'ÁO 2', 'ĐỎ', 410, 550, 'COTON', 1, 1),
      (3, 'QUẦN 1', 'ĐEN', 520, 570, 'COTON', 2, 2),
      (4, 'QUẦN 2', 'VÀNG', 400, 460, 'COTON', 2, 3),
      (5, 'MŨ 1', 'TRẮNG', 120, 170, 'COTON', 3, 1),
      (6, 'MŨ 2', 'ĐỎ', 120, 160, 'COTON', 3, 2),
      (7, 'GIÀY 1', 'CAM', 620, 700, 'COTON', 4, 3),
      (8, 'GIÀY 2', 'ĐEN', 720, 780, 'COTON', 4, 3),
      (9, 'DÉP 1', 'ĐỎ', 320, 460, 'COTON', 5, 2),
      (10, 'DÉP 1', 'XANH', 450, 550, 'COTON', 5, 3);
      
      
-- 3.  SAO LƯU DỮ LIỆU TỪ BẢNG LOẠI HÀNG SANG BẢNG LOẠI HÀNG SAO
-- 3.1 TẠO BẢNG ITEM_GROUP_BACKUP(ID, NAME, DESC)
-- + LUÔN LẤY TỪ ITEM_GROUP
-- + CÓ CẦN PHẢI TẠO KHÓA CHÍNH CHO ITEM_GROUP_BACKUP 
-- --> DỮ LIỆU KHÔNG TRÙNG 
-- --> THƯỜNG TRUY VẤN TỪ ITEM_GROUP
-- --> KHÔNG 


-- MỤC ĐÍCH CỦA KHÓA CHÍNH 
-- + KHÔNG ĐƯỢC TRÙNG LẮP DỮ LIỆU 
-- + TỰ ĐỘNG TẠO INDEX CHO PK --> TĂNG TỐC ĐỘ TÌM KIẾM
-- --> TẠO INDEX
-- + LỢI: TĂNG TỐC ĐỘ TÌM KIẾM 
-- + HẠI: TĂNG MEMORY

CREATE TABLE ITEM_GROUP_BACKUP(
ID INT NOT NULL,
`NAME` VARCHAR(50) NOT NULL,
`DESC` TEXT NOT NULL
);

INSERT INTO ITEM_GROUP(ID, `NAME`, `DESC`)
VALUES(6,'TÚI XÁCH', "LOẠI HÀNG - TÚI XÁCH"),
	  (7,'THẮT LƯNG', "LOẠI HÀNG - THẮT LƯNG");
INSERT INTO ITEM_GROUP_BACKUP(ID, `NAME`, `DESC`)
SELECT ID, `NAME`, `DESC`
FROM ITEM_GROUP
WHERE NOT EXISTS (SELECT *
                 FROM ITEM_GROUP_BACKUP
                 WHERE ITEM_GROUP.ID = ITEM_GROUP_BACKUP.ID);
-- SAO CHÉP NHỮNG LOẠI HÀNG Ở ITEM_GROUP CHƯA TỒN TẠI TRONG ITEM_GROUP
-- TRANSACTION
-- --> CHỨA TẬP HỢP CÁC THAO TÁC / CHỨC NĂNG 
-- + NẾU TẤT CẢ THAO TÁC THÀNH CÔNG --> COMMIT --> KẾT THÚC TRANSACTION
-- + NẾU TỒN TẠI 1 THAO TÁC THẤT BẠI --> ROLLBACK --> TRỞ VỀ LẠI TRẠNG THÁI 

-- SQL --> MẶC ĐỊNH: AUTO


DELETE FROM ITEM;
ROLLBACK;

DELETE FROM ITEM_GROUP WHERE ID = 1;
-- NO ACTION RESTRICT

ALTER TABLE ITEM 
DROP FOREIGN KEY FK_ITEM_ITEMGROUP;

ALTER TABLE ITEM 
ADD CONSTRAINT FK_ITEM_ITEMGROUP
FOREIGN KEY(ITEM_GROUP_ID) REFERENCES ITEM_GROUP(ID)
ON DELETE CASCADE
ON UPDATE CASCADE;


-- DML UPDATE
-- 1. CẬP NHẬT MÀU SẮC CỦA TẤT CẢ CÁC MẶT HÀNG THÀNH MÀU TRẮNG
UPDATE ITEM
SET COLOR = "TRẮNG";
-- 2. CẬP NHẬT MÀU SẮC CỦA TẤT CẢ CÁC MẶT HÀNG LÀ KÍNH THÀNH THỦY TINH
UPDATE ITEM
SET METERIAL = "THỦY TINH"
WHERE ITEM_GROUP_ID = (
SELECT ID
FROM ITEM_GROUP
WHERE `NAME` = 'Kinh'
);


-- demo
SELECT *
FROM item



