-- Câu 1: Tạo đầy đủ lược đồ cơ sở dữ liệu quan hệ như mô tả ở trên. Sinh viên tự định nghĩa kiểu dữ liệu cho các cột.
-- Lược đồ quan hệ:
KHACHHANG(MaKH, TenKH, DiaChi, SoDT, MaSoThue)
HOADON(MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
MUCTIENGIO(MaTienGio, DonGia, MoTa)
CHITIET_SUDUNGDV(MaHD, MaDV, SoLuong)
PHONG(MaPhong, SoKhachToiDa, TrangThai, MoTa)
DICHVU(MaDV, TenDV, DonViTinh, DonGia)

-- Tạo bảng

CREATE DATABASE STORE_MANAGER;
USE STORE_MANAGER;

CREATE TABLE KHACHHANG (
    MaKH VARCHAR(15) PRIMARY KEY,
    TenKH VARCHAR(255),
    DiaChi VARCHAR(255),
    SoDT VARCHAR(15),
    MaSoThue VARCHAR(20)
);

CREATE TABLE HOADON (
    MaHD VARCHAR(15) PRIMARY KEY,
    MaKH VARCHAR(15),
    MaPhong VARCHAR(15),
    MaTienGio VARCHAR(15),
    ThoiGianBatDauSD DATETIME,
    ThoiGianKetThucSD DATETIME,
    TrangThaiHD VARCHAR(50),
    FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH),
    FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong),
    FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio)
);

CREATE TABLE MUCTIENGIO (
    MaTienGio VARCHAR(15) PRIMARY KEY,
    DonGia DECIMAL(10, 2),
    MoTa TEXT
);

CREATE TABLE CHITIET_SUDUNGDV (
    MaHD VARCHAR(15),
    MaDV VARCHAR(15),
    SoLuong INT,
    PRIMARY KEY (MaHD, MaDV),
    FOREIGN KEY (MaHD) REFERENCES HOADON(MaHD),
    FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV)
);

CREATE TABLE PHONG (
    MaPhong VARCHAR(15) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(50),
    MoTa TEXT
);

CREATE TABLE DICHVU (
    MaDV VARCHAR(15) PRIMARY KEY,
    TenDV VARCHAR(255),
    DonViTinh VARCHAR(50),
    DonGia DECIMAL(10, 2)
);

-- Câu 2: Chèn tối thiểu 2 dòng dữ liệu mẫu cho mỗi bảng đã được minh họa ở trên vào tất cả các bảng một cách chính xác

INSERT INTO KHACHHANG(MaKH, TenKH, DiaChi, SoDT, MaSoThue)
VALUE ('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '123456789'),
      ('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123457','12345679');

INSERT INTO PHONG(MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUE ('VIP01', 5, 'Duoc su dung', 'phong vip'),
      ('P02', 15, 'Duoc su dung', 'phong binh thuong');

INSERT INTO DICHVU(MaDV, TenDV, DonViTinh, DonGia)
VALUE ('DV01', 'Hat dua', 'Bao', 5000),
      ('DV02', 'Trai cay', 'Dia', 30000);

INSERT INTO MUCTIENGIO(MaTienGio, MoTa)
VALUE ('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
      ('MT02', 80000, 'Ap dung tu 17 gio den 22 gio');

INSERT INTO HOADON(MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUE ('HD001', 'KH001', 'VIP01', 'MT01', '2015-05-22 8:15:00', '2015-05-22 12:30:00', 'Da thanh toan'),
      ('HD002', 'KH002', 'P02', 'MT02', '2015-12-12 12:02:00', '2015-12-12 17:22:00', 'Chua thanh toan');

INSERT INTO CHITIET_SUDUNGDV(MaHD, MaDV, SoLuong)
VALUE ('HD001', 'DV01', 5),
      ('HD002', 'DV01', 8);

-- Câu 3: Liệt kê các phòng karaoke được sử dụng nhiều nhất từ 02.2014 đến 02.2015
SELECT PHONG.MaPhong, COUNT(HOADON.MaHD) AS SoLanSuDung
FROM PHONG
JOIN HOADON 
ON PHONG.MaPhong = HOADON.MaPhong
WHERE HOADON.ThoiGianBatDauSD BETWEEN '2014-02-01' AND '2015-02-28'
GROUP BY PHONG.MaPhong
ORDER BY SoLanSuDung DESC;

-- Câu 4: Liệt kê 2 dịch vụ được sử dụng nhiều nhất trong mỗi tháng từ 01.2014 đến 12.2014
SELECT 
    MONTH(hd.ThoiGianBatDauSD) AS Thang,
    DV.TenDV AS DichVu,
    COUNT(ctdv.MaDV) AS SoLanSuDung
FROM HOADON hd
JOIN CHITIET_SUDUNGDV ctdv
ON hd.MaHD = ctdv.MaHD
JOIN DICHVU dv
ON ctdv.MaDV = dv.MaDV
WHERE hd.ThoiGianBatDauSD BETWEEN '2014-01-01' AND '2014-12-31'
GROUP BY Thang
ORDER BY SoLanSuDung DESC
LIMIT 2;

-- Câu 5: Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP"
SELECT *
FROM PHONG
WHERE MaPhong LIKE 'VIP%';
