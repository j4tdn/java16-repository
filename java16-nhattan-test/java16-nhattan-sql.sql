CREATE DATABASE java16_final_test_nhattan_karaoke;

USE java16_final_test_nhattan_karaoke;

CREATE TABLE KHACHHANG (
	MaKH VARCHAR(100) PRIMARY KEY,
    TenKH VARCHAR(200) ,
    DiaChi VARCHAR(200),
    SoDT VARCHAR(200),
    MaSoThue VARCHAR(200)
);

CREATE TABLE MUCTIENGIO (
	MaTienGio VARCHAR(100) PRIMARY KEY,
    DonGia  DOUBLE,
    MoTa VARCHAR(255)
);

CREATE TABLE PHONG (
	MaPhong VARCHAR(100) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(200),
    MoTa VARCHAR(255)
);

CREATE TABLE DICHVU (
	MaDV VARCHAR(100) PRIMARY KEY,
    TenDV VARCHAR(255),
    DonViTinh VARCHAR(255),
    DonGia DOUBLE
);

CREATE TABLE HOADON (
	MaHD VARCHAR(100) PRIMARY KEY,
    MaKH  VARCHAR(255) ,
    MaPhong VARCHAR(100),
    MaTienGio VARCHAR(255),
    ThoiGianBatDauSD DATETIME,
    ThoiGianKetThucSD DATETIME,
    TrangThaiHD VARCHAR(255),
    CONSTRAINT FK_HOADON_KHACHHANG FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
	CONSTRAINT FK_HOADON_PHONG FOREIGN KEY (MaPhong) REFERENCES Phong(MaPhong),
	CONSTRAINT FK_HOADON_MUCTIENGIO FOREIGN KEY (MaTienGio) REFERENCES MucTienGio(MaTienGio)
);

CREATE TABLE CHITIET_SUDUNGDV (
	MaHD VARCHAR(100) ,
    MaDV VARCHAR(100),
    SoLuong VARCHAR(255),
    CONSTRAINT PK_CTSDDV PRIMARY KEY (MaHD,MaDV),
    CONSTRAINT FK_CTSDDV_DonHang FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD),
    CONSTRAINT FK_CTSDDV_DichVu FOREIGN KEY (MaDV) REFERENCES DichVu(MaDV)
);


INSERT INTO KHACHHANG(MaKH,TenKH,DiaChi,SoDT,MaSoThue) 
values("KH001","Tran Van Nam","Hai Chau", "0905123456","12345678"),
	  ("KH002","Nguyen Mai Anh","Hoa Vang", "0905123457","12345679"),
	  ("KH003","Phan Hoai Lan Khue","Lien Chieu", "0905123458","12345680"),
	  ("KH004","Nguyen Hoai Nguyen","Hoa Cam", "0905123459","12342343481"),
	  ("KH005","Le Truong Ngoc Anh","Hai Chau", "0905123460","1234234582");


INSERT INTO PHONG(MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES ("VIP01", 5, 'Duoc Su Dung', 'phong vip'),
	   ("P02", 10, 'Duoc Su Dung', 'phong binh thuong'),
	   ("P03", 15, 'Duoc Su Dung','phong binh thuong'),
	   ("VIP04", 20, 'Duoc Su Dung', 'phong binh thuong');

INSERT INTO DICHVU(MaDV, TenDV, DonViTinh, DonGia)
VALUES ("DV01", 'Hat Dua', 'Bao', 5000),
	   ("DV02", 'Trai Cay', 'Dia', 30000),
	   ("DV03", 'Bia', 'Lon', 35000),
	   ("DV04", 'Nuoc Ngot', 'Chai', 10000),
       ("DV05", 'Ruou', 'Chai', 200000);


INSERT INTO MUCTIENGIO(MaTienGio, DonGia, MoTa)
VALUES ("MT01", 60000, 'Ap dung tu 6 gio den 17 gio'),
	   ("MT02", 80000, 'Ap dung tu 17 gio den 22 gio'),
	   ("MT03", 100000, 'Ap dung tu 22 gio den 6 gio');


INSERT INTO HOADON(MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES ('HD001', 'KH001', 'VIP01','MT01','2015-11-20 8:15','2015-11-20 12:30','Da Thanh Toan'),
	   ('HD002', 'KH002', 'P02','MT01','2015-11-20 13:10','2015-11-20 17:20','Chua Thanh Toan'),
	   ('HD003', 'KH001', 'P02','MT01','2015-10-15 12:12','2015-10-15 16:30','Da Thanh Toan'),
	   ('HD004', 'KH003', 'VIP01','MT02','2015-09-20 18:30','2015-09-20 21:30','Chua Thanh Toan'),
	   ('HD005', 'KH001', 'P03','MT02','2015-11-25 20:15','2015-11-25 21:45','Thanh Toan Mot Phan');


INSERT INTO CHITIET_SUDUNGDV(MaHD, MaDV, SoLuong)
VALUES ('HD001', 'DV01', 5),
	   ('HD002', 'DV01', 8),
	   ('HD002', 'DV02', 5),
	   ('HD002', 'DV03', 2),
	   ('HD003', 'DV04', 1),
	   ("HD003", "DV05", 6),
	   ("HD004", "DV01", 5),
	   ("HD005", "DV02", 3);

-- Câu 3: Liệt kê các phòng karaoke được sử dụng nhiều nhất từ 02.2014 đến 02.2015 (0.5 điểm)
WITH Phong_SoLanSuDung AS(
	SELECT *,
		   count(MaPhong) SoLanSuDung
	  FROM HoaDon
	 WHERE CAST(ThoiGianBatDauSD AS DATE) BETWEEN '2014-02-01'
	   AND '2015-02-31'
		OR CAST(ThoiGianKetThucSD AS DATE) BETWEEN '2014-02-01'
	   AND '2015-02-31'
	 GROUP BY MaPhong
), SoLanSuDungNhieuNhat AS (
	SELECT max(SoLanSuDung) SoLanNhieuNhat
      FROM Phong_SoLanSuDung
) SELECT *
	FROM Phong_SoLanSuDung ps
    JOIN SoLanSuDungNhieuNhat nn
      ON ps.SoLanSuDung = nn.SoLanNhieuNhat;

-- Câu 4: Liệt kê 2 dịch vụ được sử dụng nhiều nhất trong mỗi tháng từ 01.2014 đến 12.2014
(0.5 điểm)
SELECT *,
	   sum(SoLuong) TongSoLuong
  FROM DichVu dv
  JOIN ChiTiet_SuDungDv ctsddv
    ON dv.MaDV = ctsddv.MaDV
  JOIN HoaDon hd
	ON ctsddv.MaHD = hd.MaHD
 WHERE CAST(ThoiGianBatDauSD AS DATE) BETWEEN '2014-01-01'
   AND '2014-12-31'
	OR CAST(ThoiGianKetThucSD AS DATE) BETWEEN '2014-01-01'
   AND '2014-12-31'
   GROUP BY dv.MaDV
   ORDER BY TongSoLuong DESC
   LIMIT 2;

-- Câu 5: Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP" (0.5
-- điểm)
SELECT *
  FROM Phong
 WHERE MaPhong LIKE 'VIP%';