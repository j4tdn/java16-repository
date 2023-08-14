CREATE DATABASE java16_final_test_karaoke CHAR SET utf8mb4;
USE java16_final_test_karaoke;
-- cau 1
CREATE TABLE KhachHang (
	MaKH VARCHAR(255) PRIMARY KEY,
    TenKH VARCHAR(200) ,
    DiaChi VARCHAR(200),
    SoDT VARCHAR(200),
    MaSoThue VARCHAR(200)
    
);
CREATE TABLE MucTienGio (
	MaTienGio VARCHAR(255) PRIMARY KEY,
    DonGia  BIGINT,
    MoTa VARCHAR(255)
);
CREATE TABLE DichVu (
	MaDV VARCHAR(255) PRIMARY KEY,
    TenDV VARCHAR(255),
    DonViTinh VARCHAR(255),
    DonGia BIGINT
);
CREATE TABLE Phong (
	MaPhong VARCHAR(100) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(200),
    MoTa VARCHAR(255)
);
CREATE TABLE HoaDon (
	MaHD VARCHAR(255) PRIMARY KEY,
    MaKH  VARCHAR(255) ,
    MaPhong VARCHAR(100),
    MaTienGio VARCHAR(255),
    ThoiGianBatDauSD TIMESTAMP,
    ThoiGianKetThucSD TIMESTAMP,
    TrangThaiHD VARCHAR(255),
    CONSTRAINT FK_KH FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
	CONSTRAINT FK_PHong FOREIGN KEY (MaPhong) REFERENCES Phong(MaPhong),
	CONSTRAINT FK_MATIENGIO FOREIGN KEY (MaTienGio) REFERENCES MucTienGio(MaTienGio)
);

CREATE TABLE CHITIET_SUDUNGDV (
	MaHD VARCHAR(255) ,
    MaDV VARCHAR(255),
    SoLuong VARCHAR(255),
    CONSTRAINT PK_CTDH PRIMARY KEY (MaHD,MaDV),
    CONSTRAINT FK_DonHang FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD),
    CONSTRAINT FK_DichVu FOREIGN KEY (MaDV) REFERENCES DichVu(MaDV)
);
-- cau 2
INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) 
VALUES
("KH01","Tran Van Nam","Hai Chau", "0905123456","12345678"),
("KH02","Nguyen Mai Anh","Lien Chieu", "0905123457","12345679"),
("KH03","Phan Hoai Lan Khue","Hoa Vang", "0905123458","12345680"),
("KH04","Nguyen Hoai Lan Khue","Hoa Cam", "0905123459","12345681");



INSERT INTO Phong (MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES
("VIP01", 5, 'Duoc Su Dung', 'Phong vip'),
("P02", 10, 'Duoc Su Dung', 'Phong binh thuong'),
("P03", 15, 'Duoc Su Dung','Phong binh thuong'),
("VIP04", 20, 'Duoc Su Dung', 'Phong vip');


INSERT INTO DichVu (MaDV, TenDV, DonViTinh, DonGia)
VALUES
("DV01", 'Hat Dua', 'Bao', 5000),
("DV02", 'Trai Cay', 'Dia', 30000),
("DV03", 'Bia', 'Lon', 35000),
("DV04", 'Nuoc Ngot', 'Chai', 10000);

INSERT INTO MucTienGio (MaTienGio, DonGia, MoTa)
VALUES
("MT01", 60000, 'Ap dung tu 6 gio den 17 gio'),
("MT02", 80000, 'Ap dung sau 17 gio den 22 gio'),
("MT03", 100000, 'Ap dung tu sau 22 gio den 6 gio sang	');


INSERT INTO HoaDon (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES
("HD001", "KH001", "VIP01", "MT001", '11/20/2015 8:15', '11/20/2015 12:30', 'Da thanh toan'),
("HD002", "KH002", "P02", "MT001", '12/12/2015 13:10', '12/12/2015 17:20', 'Chưa thanh toan'),
("HD003", "KH001", "P02", "MT001", '10/15/2014 12:12', '10/15/2014 16:30', 'Da thanh toan'),
("HD004", "KH003", "VIP01", "MT002", '9/20/2015 18:30', '9/20/2015 21:00', 'Chưa thanh toan');


INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong)
VALUES
("HD001", "DV01", 5),
("HD001", "DV01", 8),
("HD001", "DV02", 5),
("HD002", "DV03", 2);

-- cau 3
SELECT
    P.MaPhong,
    COUNT(HD.MaHD) AS SoLanSuDung
FROM PHONG P
JOIN HOADON HD ON P.MaPhong = HD.MaPhong
WHERE HD.ThoiGianBatDauSD BETWEEN '2014-02-01' AND '2015-02-28'
GROUP BY P.MaPhong
ORDER BY SoLanSuDung DESC;

-- cau 4
SELECT R.Thang,
    DV.TenDV,
    DV.DonViTinh,
    R.TongSoLuong
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
   ORDER BY TongSoLuong DESC;

-- cau 5
SELECT *
FROM Phong 
WHERE MaPhong LIKE 'VIP%';
