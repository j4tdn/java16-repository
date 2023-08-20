// Em thiếu tạo và use database

CREATE TABLE KHACHHANG (
    MaKH NVARCHAR(50) PRIMARY KEY,
    TenKH NVARCHAR(50),
    DiaChi NVARCHAR(100),
    SDT NVARCHAR(15),
	MaSoThue NVARCHAR(15)
);

CREATE TABLE PHONG (
    MaPhong NVARCHAR(50) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai NVARCHAR(50),
    MoTa NVARCHAR(50)
);

CREATE TABLE MUCTIENGIO (
    MaTienGio NVARCHAR(50) PRIMARY KEY,
    DonGia INT,
    MoTa NVARCHAR(50)
);

CREATE TABLE HOADON (
    MaHD NVARCHAR(50) PRIMARY KEY,
    MaKH NVARCHAR(50),
	MaPhong NVARCHAR(50),
	MaTienGio NVARCHAR(50),
    ThoiGianBatDauSD DATETIME,
	ThoiGianKetThucSD DATETiME,
	TrangThaiHD NVARCHAR(50)
    FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH),
	FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong),
	FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio)
);

CREATE TABLE DICHVU (
    MaDV NVARCHAR(50) PRIMARY KEY,
    TenDV NVARCHAR(50),
    DonViTinh NVARCHAR(50),
	DonGia INT
);

CREATE TABLE CHITIET_SUDUNGDV (
    MaHD NVARCHAR(50),
    MaDV NVARCHAR(50),
    SoLuong INT,
    FOREIGN KEY (MaHD) REFERENCES HOADON(MaHD),
    FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV)

    // Em quên tạo khóa cihnhs cho bảng CHITIET_SUDUNGDV
);

-- Chèn dữ liệu mẫu cho bảng KHACHHANG
INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SDT, MaSoThue)
VALUES
    ('KH001', 'Tran Van Nam', 'Hai Chau', '0123456789', '1234567890'),
    ('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0987654321', '0987654321'),
    ('KH003', 'Pham Hoai Lan Khue', 'Hoa Vang', '0123987654', '1112223334'),
    ('KH004', 'Nguyen Hoai Nguyen', 'Hoa Cam', '0909090909', '5556667778'),
    ('KH005', 'Le Truong Ngoc Anh', 'Hai Chau', '0765432109', '8889990001');

-- Chèn dữ liệu mẫu cho bảng PHONG
INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES
    ('VIP01', 5, 'Duoc su dung', 'phong vip'),
    ('P02', 10, 'Duoc su dung', 'phong binh thuong'),
    ('P03', 15, 'Duoc su dung', 'phong binh thuong'),
    ('VIP04', 20, 'Duoc su dung', 'phong vip'),
    ('P05', 25, 'Duoc su dung', 'phong binh thuong');

-- Chèn dữ liệu mẫu cho bảng MUCTIENGIO
INSERT INTO MUCTIENGIO (MaTienGio, DonGia, MoTa)
VALUES
    ('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
    ('MT02', 80000, 'Ap dung tu sau 17 gio den 22 gio'),
    ('MT03', 100000, 'Ap dung tu sau 22 gio den 6 gio sang');

-- Chèn dữ liệu mẫu cho bảng HOADON
INSERT INTO HOADON (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES
    ('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 08:15', '2015-11-20 12:30', 'Da thanh toan'),
    ('HD002', 'KH002', 'P02', 'MT01', '2015-12-12 13:10', '2015-12-12 17:20', 'Chua thanh toan'),
    ('HD003', 'KH003', 'P02', 'MT01', '2014-10-15 12:12', '2014-10-15 16:30', 'Da thanh toan'),
    ('HD004', 'KH004', 'VIP01', 'MT02', '2015-09-20 18:30', '2015-09-20 21:00', 'Chua thanh toan'),
    ('HD005', 'KH005', 'P03', 'MT02', '2014-11-25 20:00', '2014-11-25 21:45', 'Thanh toan mot phan');

-- Chèn dữ liệu mẫu cho bảng DICHVU
INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia)
VALUES
    ('DV01', 'Hat Dua', 'Bao', 5000),
    ('DV02', 'Trai cay', 'Dia', 30000),
    ('DV03', 'Bia', 'Lon', 35000),
    ('DV04', 'Nuoc Ngot', 'Chai', 10000),
    ('DV05', 'Ruou', 'Chai', 200000);

-- Chèn dữ liệu mẫu cho bảng CHITIET_SUDUNGDV
INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong)
VALUES
    ('HD001', 'DV01', 5),
    ('HD002', 'DV01', 8),
    ('HD003', 'DV02', 5),
    ('HD004', 'DV03', 2),
    ('HD005', 'DV04', 1);

-- Câu 3 
-- Em thấy trong bảng HoaDon, mỗi hóa đơn sẽ là hóa đơn cho phòng nào
-- Thông qua đó mình biết được phòng đó sử dụng được mấy ngày, giờ, phút
-- Em phải group by theo mã phòng và sum(thời gian kết thức - thời gian bắt đầu) ra giờ, phút
-- Sau đó sắp xếp mới được
SELECT
    P.MaPhong,
    COUNT(HD.MaHD) AS SoLanSuDung
FROM
    PHONG P
JOIN
    HOADON HD ON P.MaPhong = HD.MaPhong
WHERE
    HD.ThoiGianBatDauSD BETWEEN '2014-02-01' AND '2015-02-28'
GROUP BY
    P.MaPhong
ORDER BY
    SoLanSuDung DESC;


-- Câu 4
-- Rất tốt em
WITH SuDungDichVu AS (
    SELECT
        MONTH(HD.ThoiGianBatDauSD) AS Thang,
        CSDV.MaDV,
        SUM(CSDV.SoLuong) AS TongSoLuong
    FROM
        CHITIET_SUDUNGDV CSDV
    JOIN
        HOADON HD ON CSDV.MaHD = HD.MaHD
    WHERE
        HD.ThoiGianBatDauSD BETWEEN '2014-01-01' AND '2014-12-31'
    GROUP BY
        MONTH(HD.ThoiGianBatDauSD),
        CSDV.MaDV
),
RankingDichVu AS (
    SELECT
        Thang,
        MaDV,
        TongSoLuong,
        ROW_NUMBER() OVER(PARTITION BY Thang ORDER BY TongSoLuong DESC) AS Rank
    FROM
        SuDungDichVu
)
SELECT
    R.Thang,
    DV.TenDV,
    DV.DonViTinh,
    R.TongSoLuong
FROM
    RankingDichVu R
JOIN
    DICHVU DV ON R.MaDV = DV.MaDV
WHERE
    R.Rank <= 2
ORDER BY
    R.Thang,
    R.Rank;


-- Câu 5 
-- ok
SELECT *
FROM PHONG
WHERE MaPhong LIKE 'VIP%';

