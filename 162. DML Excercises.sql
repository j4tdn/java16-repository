-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
-- + Mathang
-- + LoaiHang
-- + Sử dụng shopping refresh data.sql để refresh data

-- ======================= REFRESH DATA =======================

-- B. DELETE
-- 1. Xóa nhân viên có tên 'Văn Hoàng' trong hệ thống
DELETE FROM NHANVIEN WHERE NAME_NV = 'Văn Hoàng';
-- 2. Xóa bộ phận giao hàng trong hệ thống
DELETE FROM NHANVIEN WHERE ;
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
DELETE FROM ITEM 
WHERE ITEM_GROUP = (
SELECT ID 
FROM ITEM_GROUP
WHERE `NAME` = 'MŨ'
);
-- 4. Xóa tất cả các mặt hàng trong hệ thống
DELETE FROM ITEM;
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi
-- default format Y-m-d h: ~~ DATE_FORMAT( ORDER_TIME , “Ad/Am/AY “Nil: 4S)

-- ORDER_TIME: datetime --> varchar date

-- '23/11/2019": varchar --> varchar date

SELECT DATE_FORMAT(`ORDER_TIME`, '%d/%m/%Y') FORMATED_ORDER_TIME FROM `ORDER` ;

SELECT STR_TO_DATE('27/02/2023', '%d/%m/%Y');

DELETE FROM `ORDER` WHERE DATE_FORMAT(`ORDER_TIME`, '%d/%m/%Y') = '27/02/2023';

DELETE FROM `ORDER` WHERE CAST(`ORDER_TIME` AS DATE) = STR_TO_DATE('27/02/2023', '%d/%m/XY');
DELETE FROM `ORDER` WHERE CAST(`ORDER_TIME` AS DATE) = '2023-02-27';

ROLLBACK;

 




-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
ALTER TABLE `ORDER` ADD COLUMN NOTE TEXT;
UPDATE `ORDER`

SET NOTE = 'Giao hang sau 10H sang'
WHERE ID = 1;

-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K
UPDATE ITEM
SET SELL_PRICE = 199
WHERE ITEM_GROUP_ID = (
SELECT ID
FROM ITEM_GROUP
WHERE 'NAME' = 'MŨ'
);
