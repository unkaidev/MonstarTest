DROP DATABASE IF EXISTS qldatphong;
CREATE DATABASE qldatphong;
USE qldatphong;

CREATE TABLE KHACH_HANG(
	MaKH VARCHAR(11) ,
	TenKH VARCHAR(255),
	DiaChi VARCHAR(255),
	SoDT VARCHAR(11),
	PRIMARY KEY (MaKH)
);

CREATE TABLE PHONG(
	MaPhong VARCHAR(11) ,
	LoaiPhong VARCHAR(255),
	SoKhachToiDa INT(10),
	GiaPhong1gio INT(20),
	MoTa VARCHAR(255),
	PRIMARY KEY (MaPhong)
);

CREATE TABLE DICH_VU_DI_KEM(
	MaDV VARCHAR(11) ,
	TenDV VARCHAR(255),
	DonViTinh VARCHAR(10),
	DonGia INT(20),
	PRIMARY KEY (MaDV)
);

CREATE TABLE DAT_PHONG(
	MaDatPhong VARCHAR(11),
	NgayDat VARCHAR(30),
	GioBatDau VARCHAR(10),
	GioKetThuc VARCHAR(10),
	TienDatCoc INT(20),
	GhiChu VARCHAR(255),
	TrangThaiDat VARCHAR(30),
	MaPhong VARCHAR(11),
	MaKH VARCHAR(11),
	PRIMARY KEY (MaDatPhong),
	FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong),
	FOREIGN KEY (MaKH) REFERENCES KHACH_HANG(MaKH)
);

CREATE TABLE CHI_TIET_SU_DUNG_DV(
	SoLuong INT(30),
	MaDatPhong VARCHAR(11),
	MaDV VARCHAR(11),
	FOREIGN KEY (MaDatPhong) REFERENCES DAT_PHONG(MaDatPhong),
	FOREIGN KEY (MaDV) REFERENCES dich_vu_di_kem(MADV),
	CONSTRAINT PK_ChiTiet PRIMARY KEY (MaDatPhong,MaDV)
);

INSERT INTO PHONG(MaPhong,LoaiPhong,SoKhachToiDa,GiaPhong1gio,MoTa)
VALUES ('P0001', 'Loai 1', '20', '60000', ''),
 ('P0002', 'Loai 2', '25', '80000', ''),
 ('P0003', 'Loai 3', '15', '50000', ''),
 ('P0004', 'Loai 4', '20', '50000', '');

INSERT INTO khach_hang(MaKH,TenKH,DiaChi,SoDT)
VALUES ('KH0001', 'Nguyen Van A', 'Hoa xuan', '11111111111'),
       ('KH0002', 'Nguyen Van B', 'Hoa hai', '11111111112'),
       ('KH0003', 'Phan Van A', 'Cam le', '11111111113'),
       ('KH0004', 'Phan Van B', 'Hoa xuan', '11111111114');

INSERT INTO dich_vu_di_kem(MaDV,TenDV,DonViTinh,DonGia)
VALUES ('DV001', 'Beer', 'Lon', '10000'),
       ('DV002', 'Nuoc ngot', 'Lon', '8000'),
       ('DV003', 'Trai cay', 'dia', '35000'),
       ('DV004', 'Khan uot', 'cai', '2000');
       
       INSERT INTO dat_phong(MaDatPhong,MaPhong,MaKH,NgayDat,GioBatDau,GioKetThuc,TienDatCoc,GhiChu,TrangThaiDat)
VALUES ('DP0001', 'P0001', 'KH0002', '26/03/2018','11:00','13:30','100_000','','Da dat'),
       ('DP0002', 'P0001', 'KH0003', '27/03/2018','17:15','19:15','50_000','','Da huy'),
       ('DP0003', 'P0002', 'KH0002', '26/03/2018','20:30','22:15','100_000','','Da dat'),
       ('DP0004', 'P0003', 'KH0001', '01/04/2018','19:30','21:15','200_000','','Da dat');

INSERT INTO chi_tiet_su_dung_dv(MaDatPhong,MaDV,SoLuong)
VALUES ('DP0001', 'DV001', '20'),
       ('DP0001', 'DV003', '3'),
       ('DP0001', 'DV002', '10'),
       ('DP0002', 'DV002', '10'),
       ('DP0002', 'DV003', '1'),
       ('DP0003', 'DV003', '2'),
       ('DP0003', 'DV004', '10');

-- -- Cau 2
-- SELECT * FROM chi_tiet_su_dung_dv
-- WHERE
-- 	SoLuong > 3 AND SoLuong < 10

-- -- Cau 3
-- UPDATE phong
-- SET GiaPhong1gio = GiaPhong1gio+ 10000
-- WHERE SoKhachToiDa > 10
-- SELECT * FROM PHONG;
-- -- Cau 4
-- SET FOREIGN_KEY_CHECKS=0;
-- DELETE FROM dat_phong 
-- WHERE TrangThaiDat = 'Da huy'
-- 
-- SET FOREIGN_KEY_CHECKS=1;

-- -- Cau 5
-- SELECT TenKH FROM khach_hang
-- WHERE TenKH LIKE 'H%' OR TenKH LIKE 'N%' OR TenKH LIKE 'M%'

-- -- Cau 6 cach 1	
-- SELECT TenKH FROM khach_hang GROUP BY TenKH
-- -- Cau 6 cach 2
-- SELECT DISTINCT TenKH FROM khach_hang;

-- -- Cau 7
-- SELECT * FROM dich_vu_di_kem
-- WHERE 
-- (UPPER(DonViTinh) = UPPER("lon") AND DonGia > 10000)
-- OR
-- (UPPER(DonViTinh) = UPPER("Cai") AND DonGia < 5000)

-- -- Cau 8
-- SELECT dat_phong.MaDatPhong,
--        dat_phong.MaPhong,
--        dat_phong.MaKH,
--        khach_hang.TenKH,
--        khach_hang.SoDT,
--        dat_phong.NgayDat,
--        dat_phong.GioBatDau,
--        dat_phong.GioKetThuc,
--        chi_tiet_su_dung_dv.MaDV,
--        chi_tiet_su_dung_dv.SoLuong,
--        dich_vu_di_kem.DonGia,
--        phong.LoaiPhong,
--        phong.SoKhachToiDa,
--        phong.GiaPhong1gio
-- FROM dat_phong
-- INNER JOIN phong ON dat_phong.MaPhong = phong.MaPhong
-- INNER JOIN chi_tiet_su_dung_dv ON dat_phong.MaDatPhong = chi_tiet_su_dung_dv.MaDatPhong
-- INNER JOIN dich_vu_di_kem ON chi_tiet_su_dung_dv.MaDV = dich_vu_di_kem.MaDV
-- INNER JOIN khach_hang ON dat_phong.MaKH = khach_hang.MaKH
-- WHERE (phong.GiaPhong1gio > 50000
--        AND RIGHT(dat_phong.NgayDat, 4) = '2016')
--   OR (phong.GiaPhong1gio > 50000
--       AND RIGHT(dat_phong.NgayDat, 4) = '2017')

-- -- Cau 9
-- SELECT 
--     main.MaDatPhong,
--     main.MaPhong,
--     main.LoaiPhong,
--     main.GiaPhong1gio,
--     main.TenKH,
--     main.TongTienHat,
--     main.TongTienDichVu,
--     (main.TongTienHat + main.TongTienDichVu) AS TongTienThanhToan
-- FROM 
--     (SELECT 
--         dp.MaDatPhong,
--         dp.MaPhong,
--         p.LoaiPhong,
--         p.GiaPhong1gio,
--         kh.TenKH,
--         (p.GiaPhong1gio * 
--          (HOUR(TIMEDIFF(STR_TO_DATE(dp.GioKetThuc, '%H:%i'), STR_TO_DATE(dp.GioBatDau, '%H:%i'))) + 
--           MINUTE(TIMEDIFF(STR_TO_DATE(dp.GioKetThuc, '%H:%i'), STR_TO_DATE(dp.GioBatDau, '%H:%i'))) / 60)) AS TongTienHat,
--         SUM(ctdv.SoLuong * dvdk.DonGia) AS TongTienDichVu
--     FROM 
--         dat_phong dp
--     INNER JOIN 
--         phong p ON dp.MaPhong = p.MaPhong
--     INNER JOIN 
--         khach_hang kh ON dp.MaKH = kh.MaKH
--     INNER JOIN 
--         chi_tiet_su_dung_dv ctdv ON ctdv.MaDatPhong = dp.MaDatPhong
--     INNER JOIN 
--         dich_vu_di_kem dvdk ON ctdv.MaDV = dvdk.MaDV
--     GROUP BY
--         dp.MaDatPhong,
--         dp.MaPhong,
--         p.LoaiPhong,
--         p.GiaPhong1gio,
--         kh.TenKH,
--         dp.GioBatDau,
--         dp.GioKetThuc
--     ) AS main;

-- -- Cau 10
-- SELECT khach_hang.MaKH, khach_hang.TenKH, khach_hang.DiaChi, khach_hang.SoDT
-- FROM khach_hang
-- INNER JOIN dat_phong
-- ON khach_hang.MaKH = dat_phong.MaKH
-- WHERE
-- khach_hang.DiaChi = 'Hoa xuan'

-- -- Cau 11
-- SELECT phong.MaPhong,
--        phong.LoaiPhong,
--        phong.SoKhachToiDa,
--        phong.GiaPhong1gio,
--        dat_phong.SoLanDat
-- FROM phong
-- INNER JOIN
--   (SELECT MaPhong,
--           COUNT(TrangThaiDat) AS SoLanDat
--    FROM dat_phong
--    WHERE TrangThaiDat = 'Da dat'
--    GROUP BY MaPhong
--    HAVING COUNT(TrangThaiDat) > 2) AS dat_phong ON phong.MaPhong = dat_phong.MaPhong;

