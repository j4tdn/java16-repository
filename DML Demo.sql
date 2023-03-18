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