CREATE DATABASE quan_ly_cua_hang;
USE quan_ly_cua_hang;
-- KHACH HANG
CREATE TABLE IF NOT EXISTS KHACHHANG(
	MaKH VARCHAR(50) PRIMARY KEY ,
    TenKH VARCHAR(50) NOT NULL ,
    DiaChi VARCHAR(50) NOT NULL , 
    -- SĐT ko cần check > 0
    -- Bài của Duy Anh và Chiến rất giống nhau
    -- Duy Anh nộp sau ko biết có cope code ko ???
    SoDT INT CHECK(SoDT > 0),
    MaSoThue INT CHECK(MaSoThue > 0 )
);
-- PHONG
CREATE TABLE IF NOT EXISTS PHONG(
	MaPhong VARCHAR(50) PRIMARY KEY ,
    SoKhachToiDa INT CHECK(SoKhachToiDa > 0 ),
    TrangThai VARCHAR(50) NOT NULL ,
    MoTa VARCHAR(50) NOT NULL
);
-- MUCTIENGIO
CREATE TABLE IF NOT EXISTS MUCTIENGIO(
	MaTienGio VARCHAR(50) PRIMARY KEY ,
    DonGia INT ,
    MoTa VARCHAR(50)
);
-- DICH VU
CREATE TABLE IF NOT EXISTS DICHVU(
	MaDV VARCHAR(50) PRIMARY KEY ,
    TenDV VARCHAR(50) NOT NULL ,
    DonViTinh VARCHAR(50) , 
    DonGia INT
);
-- HOA DON
CREATE TABLE IF NOT EXISTS HOADON(
	MaHD VARCHAR(50) PRIMARY KEY ,
    MaKH VARCHAR(50) NOT NULL ,
    MaPhong VARCHAR(50) NOT NULL ,
    MaTienGio VARCHAR(50) NOT NULL ,
    ThoiGianBatDauSD VARCHAR(50) NOT NULL ,
    ThoiGianKetThucSD VARCHAR(50) NOT NULL,
    TrangThaiHD VARCHAR(50) NOT NULL ,
    FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH) ON DELETE CASCADE ,
    FOREIGN KEY (MaPHong) REFERENCES PHONG(MaPhong) ON DELETE CASCADE,
    FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio) ON DELETE CASCADE
);
-- CHITIET_SUDUNGDV
CREATE TABLE IF NOT EXISTS CHITIET_SUDUNGDV(
	MaHD VARCHAR(50) ,
    MaDV VARCHAR(50) ,
    SoLuong INT ,
    PRIMARY KEY (MaHD , MaDV)
);
-- DATABASE 

INSERT INTO KHACHHANG(MaKH,TenKH,DiaChi,SoDT,MaSoThue) VALUES('KH006','Gian Duy Anh','Hai Chau',12345653,12345682);
INSERT INTO KHACHHANG(MaKH,TenKH,DiaChi,SoDT,MaSoThue) VALUES('KH007','Pham Tuan Kha1','Hai Chau',12345653,12345682);
INSERT INTO KHACHHANG(MaKH,TenKH,DiaChi,SoDT,MaSoThue) VALUES('KH001','Tran Van Nam','Hai Chau',0905123456,12345678);
INSERT INTO KHACHHANG(MaKH,TenKH,DiaChi,SoDT,MaSoThue) VALUES('KH002','Nguyen Mai Anh','Lien Chieu',0905123457,12345679);
INSERT INTO KHACHHANG(MaKH,TenKH,DiaChi,SoDT,MaSoThue) VALUES('KH003','Phan Hoai Lan Khue','Hoa Vang',0905123458,12345680);
INSERT INTO KHACHHANG(MaKH,TenKH,DiaChi,SoDT,MaSoThue) VALUES('KH004','Nguyen Hoai Nguyen','Hoa Cam',0905123459,12345681);

INSERT INTO PHONG(MaPhong,SoKhachToiDa,TrangThai,MoTa) VALUES('VIP01',5,'Duoc Su Dung','phong vip');
INSERT INTO PHONG(MaPhong,SoKhachToiDa,TrangThai,MoTa) VALUES('P02',10,'Duoc Su Dung','phong binh thuong');
INSERT INTO PHONG(MaPhong,SoKhachToiDa,TrangThai,MoTa) VALUES('P03',15,'Duoc Su Dung','phong binh thuong');
INSERT INTO PHONG(MaPhong,SoKhachToiDa,TrangThai,MoTa) VALUES('VIP04',20,'Duoc Su Dung','phong vip');
INSERT INTO PHONG(MaPhong,SoKhachToiDa,TrangThai,MoTa) VALUES('P05',25,'Duoc Su Dung','phong binh thuong');
SELECT * FROM PHONG;
INSERT INTO DICHVU(MaDV,TenDV,DonViTinh,DonGia) VALUES('DV01','Hat Dua','Bao',5000);
INSERT INTO DICHVU(MaDV,TenDV,DonViTinh,DonGia) VALUES('DV02','Trai Cay','Dia',30000);
INSERT INTO DICHVU(MaDV,TenDV,DonViTinh,DonGia) VALUES('DV03','Bia','Lon',35000);
INSERT INTO DICHVU(MaDV,TenDV,DonViTinh,DonGia) VALUES('DV04','Nuoc Ngot','Chai',10000);
INSERT INTO DICHVU(MaDV,TenDV,DonViTinh,DonGia) VALUES('DV05','Ruou','Chai',200000);
INSERT INTO DICHVU(MaDV,TenDV,DonViTinh,DonGia) VALUES('DV06','Vodka','Chai',200000);
SELECT * FROM DICHVU ; 
INSERT INTO MUCTIENGIO(MaTienGio,DonGia,MoTa) VALUES('MT01',60000,'Ap dung tu 6 gio den 17 gio');
INSERT INTO MUCTIENGIO(MaTienGio,DonGia,MoTa) VALUES('MT02',80000,'Ap dung tu 17 gio den 22 gio');
INSERT INTO MUCTIENGIO(MaTienGio,DonGia,MoTa) VALUES('MT03',100000,'Ap dung tu 22 gio den 6 gio sang');
SELECT * FROM MUCTIENGIO;
INSERT INTO HOADON(MaHD,MaKH,MaPhong,MaTienGio,ThoiGianBatDauSD,ThoiGianKetThucSD,TrangThaiHD) VALUES('HD001','KH001','VIP01','MT01',str_to_date('11/20/2015 8:15','%m/%d/%Y %h:%i'),str_to_date('11/20/2015 12:30','%m/%d/%Y %h:%i'),'Da thanh toan');
INSERT INTO HOADON(MaHD,MaKH,MaPhong,MaTienGio,ThoiGianBatDauSD,ThoiGianKetThucSD,TrangThaiHD) VALUES('HD002','KH002','P02','MT01',str_to_date('12/12/2015 13:10','%m/%d/%Y %H:%i'),str_to_date('12/12/2015 17:20','%m/%d/%Y %H:%i'),'Chua thanh toan');
INSERT INTO HOADON(MaHD,MaKH,MaPhong,MaTienGio,ThoiGianBatDauSD,ThoiGianKetThucSD,TrangThaiHD) VALUES('HD003','KH001','P02','MT01',str_to_date('10/15/2014 12:12','%m/%d/%Y %H:%i'),str_to_date('10/15/2014 16:30','%m/%d/%Y %H:%i'),'Da thanh toan');
INSERT INTO HOADON(MaHD,MaKH,MaPhong,MaTienGio,ThoiGianBatDauSD,ThoiGianKetThucSD,TrangThaiHD) VALUES('HD004','KH003','VIP01','MT02',str_to_date('9/20/2015 18:30','%m/%d/%Y %H:%i'),str_to_date('9/20/2015 21:00','%m/%d/%Y %H:%i'),'Chua thanh toan');
INSERT INTO HOADON(MaHD,MaKH,MaPhong,MaTienGio,ThoiGianBatDauSD,ThoiGianKetThucSD,TrangThaiHD) VALUES('HD005','KH001','P03','MT02',str_to_date('11/25/2014 20:00','%m/%d/%Y %H:%i'),str_to_date('11/25/2014 21:45','%m/%d/%Y %H:%i'),'Thanh toan mot phan');
INSERT INTO HOADON(MaHD,MaKH,MaPhong,MaTienGio,ThoiGianBatDauSD,ThoiGianKetThucSD,TrangThaiHD) VALUES('HD007','KH001','P02','MT01',str_to_date('10/15/2014 12:12','%m/%d/%Y %H:%i'),str_to_date('10/15/2014 16:30','%m/%d/%Y %H:%i'),'Da thanh toan');

SELECT * FROM HOADON;
INSERT INTO CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong) VALUES('HD001','DV01',5);
INSERT INTO CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong) VALUES('HD002','DV01',8);
INSERT INTO CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong) VALUES('HD002','DV02',5);
INSERT INTO CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong) VALUES('HD002','DV03',2);
INSERT INTO CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong) VALUES('HD003','DV04',1);
INSERT INTO CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong) VALUES('HD006','DV02',10);
INSERT INTO CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong) VALUES('HD006','DV04',30);
INSERT INTO CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong) VALUES('HD006','DV05',40);
SELECT * FROM CHITIET_SUDUNGDV;
-- CAU 3.
-- Chưa đúng
SELECT
PHONG.MaPhong,
COUNT(HOADON.MaHD) AS SoLanSuDung
FROM PHONG
JOIN HOADON ON PHONG.MaPhong = HOADON.MaPhong
WHERE HOADON.ThoiGianBatDauSD BETWEEN STR_TO_DATE('02/01/2014', '%m/%d/%Y') AND STR_TO_DATE('02/28/2015', '%m/%d/%Y')
GROUP BY PHONG.MaPhong;

-- CAU 4.
-- Chưa đúng
-- Limit 2 có nghĩa là em sau khi tìm được MaDV, Thang --> Tổng số lượng rổi ORDER BY
-- Em limit 2 là nó sẽ lấy 2 MaDV, Thang có số lượng nhiều nhất
-- Còn đề bài là cứ mỗi tháng nếu có thì lấy ra 2 dịch vụ được dùng nhiều nhất
SELECT
EXTRACT(YEAR_MONTH FROM HOADON.ThoiGianBatDauSD) AS Thang,
CHITIET_SUDUNGDV.MaDV,
DICHVU.TenDV,
SUM(CHITIET_SUDUNGDV.SoLuong) AS TongSoLuong
FROM HOADON
JOIN CHITIET_SUDUNGDV ON HOADON.MaHD = CHITIET_SUDUNGDV.MaHD
JOIN DICHVU ON CHITIET_SUDUNGDV.MaDV = DICHVU.MaDV
WHERE HOADON.ThoiGianBatDauSD BETWEEN STR_TO_DATE('01/01/2014', '%m/%d/%Y') AND STR_TO_DATE('12/31/2014', '%m/%d/%Y')
GROUP BY Thang, CHITIET_SUDUNGDV.MaDV
HAVING SUM(CHITIET_SUDUNGDV.SoLuong) > 0
ORDER BY Thang, TongSoLuong DESC
LIMIT 2;

-- CAU 5.
-- ok
SELECT * FROM PHONG WHERE MaPhong like 'VIP%';