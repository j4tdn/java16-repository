-- B. DELETE
-- 1. Xóa nhân viên có tên 'Văn Hoàng' trong hệ thống
DELETE FROM EMPLOYEE WHERE `NAME` = 'Văn Hoàng';
-- 2. Xóa bộ phận giao hàng trong hệ thống

-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
DELETE FROM ITEM WHERE ITEM_GROUP_ID = ( SELECT ID FROM ITEM_GROUP WHERE `NAME` = 'Mũ');
-- 4. Xóa tất cả các mặt hàng trong hệ thống
DELETE FROM ITEM;
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi
DELETE FROM `ORDER` WHERE ORDER_TIME = '23/11/2019';
-- Default format Y-m-d h:i:s -- DATE_FORMAT(`ORDER_TIME`, 
SELECT DATE_FORMAT(`ORDER_TIME`, '%d/%m/%Y') FORMATED_ORDER_TIME FROM `ORDER`;
SELECT STR_TO_DATE('23/11/2019','%d/%m/%Y');
DELETE FROM `ORDER` WHERE DATE_FORMAT(`ORDER_TIME`, '%d/%m/%Y') = '23/11/2019';
DELETE FROM `ORDER` WHERE CAST(`ORDER_TIME` AS DATE) = STR_TO_DATE('23/11/2019','%d/%m/%Y');
DELETE FROM `ORDER` WHERE CAST(`ORDER_TIME` AS DATE) = '2023-02-27';

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
UPDATE XXX SET `NAME` = 'Bộ phận quản lý' WHERE ID = 2;
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
ALTER TABLE `ORDER` ADD COLUMN NOTE TEXT;
UPDATE `ORDER` SET NOTE = 'Giao hàng sau 10H sáng' WHERE ID = 01;
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật 
-- MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
INSERT INTO ORDER_STATUS_DETAIL(ORDER_ID, ORDER_STATUS_ID, EMPLOYEE_ID, STATUS_TIME)
VALUES (1,4,2, current_timestamp());
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
UPDATE BILL SET REMANINING_FEE = 890 WHERE ORDER_ID = 01;
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K
UPDATE ITEM SET SELL_PRICE = 199 WHERE ITEM_GROUP_ID = (SELECT ID FROM ITEM_GROUP WHERE `NAME` = 'Mũ');
