-- Cau 1,2
create database karaoke;
use karaoke;

create table KHACHHANG(
	MaKH varchar(10),
    TenKH varchar(200),
    DiaChi varchar(200),
    SoDT varchar(10),
    MaSoThue varchar(20),
	constraint PK_KH primary key (MaKH)
);

insert into KHACHHANG(MaKH, TenKH, DiaChi, SoDT, MaSoThue) 
values ('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
	   ('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123456', '12345678'),
       ('KH003', 'Phan Hoai Lan Khue', 'Hoa Vang', '0905123456', '12345678'),
       ('KH004', 'Nguyen Hoai Nguyen', 'Hoa Cam', '0905123456', '12345678'),
       ('KH005', 'Le Truong Ngoc Anh', 'Hai Chau', '0905123456', '12345678'),
       ('KH006', 'Ho Hoai Anh', 'Hai Chau', '0905123456', '12345678'),
       ('KH007', 'Pham Thi Huong', 'Son Tra', '0905123456', '12345678'),
       ('KH008', 'Chan Trinh Tri', 'Hai Chau', '0905123456', '12345678'),
       ('KH009', 'Phan Nhu Thao', 'Hoa Khanh', '0905123456', '12345678'),
       ('KH010', 'Tran Thi To Tam', 'Son Tra', '0905123456', '12345678');

create table PHONG(
	MaPhong varchar(10),
    SoKhachToiDa int,
    TrangThai varchar(50),
    MoTa varchar(200),
    constraint PK_P primary key (MaPhong)
);

insert into PHONG(MaPhong, SoKhachToiDa, TrangThai, MoTa) 
values ('VIP01', 5, 'Duoc su dung', 'phong vip'),
       ('P02', 10, 'Duoc su dung', 'phong binh thuong'),
       ('P03', 15, 'Duoc su dung', 'phong binh thuong'),
       ('VIP04', 20, 'Duoc su dung', 'phong vip'),
       ('P05', 25, 'Duoc su dung', 'phong binh thuong'),
       ('P06', 30, 'Duoc su dung', 'phong binh thuong'),
       ('VIP07', 35, 'Duoc su dung', 'phong vip'),
       ('P08', 40, 'Duoc su dung', 'phong binh thuong'),
       ('VIP09', 45, 'Duoc su dung', 'phong vip'),
       ('P10', 50, 'Duoc su dung', 'phong binh thuong');

create table DICHVU (
	MaDV varchar(20),
    TenDV varchar(50),
    DonViTinh varchar(50),
    DonGia int,
    constraint PK_DV primary key (MaDV)
);

insert into DICHVU(MaDV, TenDV, DonViTinh, DonGia)
values ('DV01', 'Hat Dua', 'Bao', 5000),
       ('DV02', 'Trai Cay', 'Dia', 30000),
       ('DV03', 'Bia', 'Lon', 35000),
       ('DV04', 'Nuoc Ngot', 'Chai', 10000),
       ('DV05', 'Ruou', 'Chai', 200000);
       
create table MUCTIENGIO(
	MaTienGio varchar(10),
    DonGia int,
    MoTa varchar(200),
    constraint PK_MTG primary key (MaTienGio)
);

insert into MUCTIENGIO(MaTienGio, DonGia, MoTa)
values ('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
       ('MT02', 80000, 'Ap dung sau 17 gio den 22 gio'),
       ('MT03', 100000, 'Ap dung tu sau 22 gio den 6 gio sang');

create table HOADON (
	MaHD varchar(10),
    MaKH varchar(10),
    MaPhong varchar(10),
    MaTienGio varchar(10),
    ThoiGianBatDauSD datetime,
    ThoiGianKetThucSD datetime,
    TrangThaiHD varchar(200),
    constraint PK_HD primary key (MAHD),
    constraint FK_HD_KH foreign key (MaKH) references KHACHHANG(MaKH),
    constraint FK_HD_Phong foreign key (MaPhong) references PHONG(MaPhong),
    constraint FK_HD_MTG foreign key (MaTienGio) references MUCTIENGIO(MaTienGio)
);

insert into HOADON(MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
values ('HD001','KH001','VIP01','MT01',str_to_date('11/20/2015 8:15','%m/%d/%Y %h:%i'),str_to_date('11/20/2015 12:30','%m/%d/%Y %h:%i'),'Da thanh toan'),
       ('HD002','KH002','P02','MT01',str_to_date('12/12/2015 13:10','%m/%d/%Y %H:%i'),str_to_date('12/12/2015 17:20','%m/%d/%Y %H:%i'),'Chua thanh toan'),
       ('HD003','KH001','P02','MT01',str_to_date('10/15/2014 12:12','%m/%d/%Y %H:%i'),str_to_date('10/15/2014 16:30','%m/%d/%Y %H:%i'),'Da thanh toan'),
       ('HD004','KH003','VIP01','MT02',str_to_date('9/20/2015 18:30','%m/%d/%Y %H:%i'),str_to_date('9/20/2015 21:00','%m/%d/%Y %H:%i'),'Chua thanh toan'),
       ('HD005','KH001','P03','MT02',str_to_date('11/25/2014 20:00','%m/%d/%Y %H:%i'),str_to_date('11/25/2014 21:45','%m/%d/%Y %H:%i'),'Thanh toan mot phan'),
       ('HD006','KH001','P02','MT01',str_to_date('10/15/2014 12:12','%m/%d/%Y %H:%i'),str_to_date('10/15/2014 16:30','%m/%d/%Y %H:%i'),'Da thanh toan');
       

create table CHITIET_SUDUNGDV(
	MaHD VARCHAR(10),
    MaDV VARCHAR(10),
    SoLuong INT,
    PRIMARY KEY (MaHD , MaDV)
);

insert into CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong)
values ('HD001','DV01',5),
       ('HD002','DV01',8),
       ('HD002','DV02',5),
       ('HD002','DV03',2),
       ('HD003','DV04',1),
       ('HD006','DV02',10),
       ('HD006','DV03',20),
       ('HD006','DV04',30),
       ('HD006','DV05',40);

-- Cau 3
SELECT
    PHONG.MaPhong,
    COUNT(HOADON.MaHD) AS SoLanSuDung
FROM PHONG
JOIN HOADON ON PHONG.MaPhong = HOADON.MaPhong
WHERE HOADON.ThoiGianBatDauSD BETWEEN STR_TO_DATE('02/01/2014', '%m/%d/%Y') AND STR_TO_DATE('02/28/2015', '%m/%d/%Y')
GROUP BY PHONG.MaPhong;

-- Cau 4
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

-- Cau 5
SELECT * FROM PHONG
WHERE PHONG.MaPhong LIKE 'VIP%';


