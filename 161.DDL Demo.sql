/*
Câu lệnh từ dấu ; trước đó đến dấu ; hiện tại
Để thực thi lệnh --> có 2 cách:
+ Đặt con trỏ vào vị trí giữa câu lệnh --> ctrl entel
+ Bôi đen đoạn lệnh cần chạy --> nhấn nút 'puzz'
*/

-- 1. Tạo cơ sở dữ liệu java16_shopping_test
CREATE DATABASE JAVA16_SHOPPING_TEST CHAR SET utf8mb4;
USE JAVA16_SHOPPING_TEST;
-- 2. Tạo bảng MatHang, LoaiHang
   -- + Tạo khóa chính, khóa ngoại trực tiếp trong lúc tạo bảng	
CREATE TABLE ITEM_GROUP
(
ID      INT PRIMARY KEY,
IG_NAME VARCHAR(50) NOT NULL,
IG_DESC TEXT
);

CREATE TABLE PROVIDER
(
ID       INT,
P_NAME   VARCHAR(50) NOT NULL,
ADDRESS  TEXT NOT NULL,
PHONE    VARCHAR(50) NOT NULL,
CONSTRAINT PK_PROVIDER PRIMARY KEY (ID)
);

CREATE TABLE ITEM 
(
ID           INT,
ITEM_NAME    VARCHAR(20) NOT NULL,
COLOR        VARCHAR(20) NOT NULL,
BUY_PRICE    DOUBLE NOT NULL,
SELL_PRICE   DOUBLE NOT NULL,
MATERIAL     VARCHAR(20) NOT NULL,
ITEM_GROUP_ID INT NOT NULL,
PROVIDER_ID INT NOT NULL,
CONSTRAINT PR_ITEM_GROUP PRIMARY KEY (ID),
CONSTRAINT FK_ITEM_GROUP FOREIGN KEY (ITEM_GROUP_ID) REFERENCES ITEM_GROUP(ID),
CONSTRAINT FK_ITEM_PROVIDER FOREIGN KEY (PROVIDER_ID) REFERENCES PROVIDER(ID)
);
-- 3. Thêm cột NgayTao kiểu DATE vào bảng LoaiHang
ALTER TABLE ITEM_GROUP ADD CREATED_DATE DATE DEFAULT(curdate()) NOT NULL;

-- 4. Thay đổi tên tên cột NgayTao vừa thêm thành DATE_CREATED trong bảng LoaiHang
ALTER TABLE ITEM_GROUP CHANGE CREATED_DATE DATED_CREATED DATE DEFAULT(curdate()) NOT NULL;

-- 5. Tạo bảng DonHang, MatHang
   -- + Tạo khóa chính, khóa ngoại sau khi bảng đã tồn tại
   -- + ALTER
 CREATE TABLE `ORDER`
( 
ID INT PRIMARY KEY,
ORDER_TIME DATETIME DEFAULT(current_timestamp()) NOT NULL,
TOTAL_OF_MONEY DOUBLE,
DELIVERY_FEE DOUBLE DEFAULT(0) NOT NULL,
DELIVERY_PLACE TEXT NOT NULL,
CUSTOMER_ID INT NOT NULL,
PAYMENT_TYPE_ID INT NOT NULL
);

CREATE TABLE PAYMENT_TYPE 
(
ID INT PRIMARY KEY,
`DESC` TEXT NOT NULL
);
ALTER TABLE `ORDER` ADD CONSTRAINT FK_ORDER_PAYMENT_TYPE FOREIGN KEY (PAYMENT_TYPE_ID) REFERENCES PAYMENT_TYPE (ID);
-- 6. Tạo bảng ChiTietDonHang
   -- + Lưu ý khóa chính nhiều cột
CREATE TABLE ORDER_DETAIL 
(
ORDER_ID INT,
ITEM_ID INT,
AMOUNT INT NOT NULL,
CONSTRAINT PK_ORDER_DETAIL PRIMARY KEY (ORDER_ID, ITEM_ID),
CONSTRAINT FK_ORDER_DETAIL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER` (ID),
CONSTRAINT FK_ORDER_DETAIL_ITEM FOREIGN KEY (ITEM_ID) REFERENCES `ITEM` (ID)
);
-- 7. Xóa cột DATE_CREATED vừa thêm trong bảng LoaiHang 
ALTER TABLE ITEM_GROUP DROP COLUMN DATED_CREATED;

-- 8. Xóa khóa ngoại từ bảng MatHang đến LoaiHang
ALTER TABLE ITEM DROP FOREIGN KEY FK_ITEM_PROVIDER;