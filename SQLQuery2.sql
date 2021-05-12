USE TimKiemViecLam
CREATE TABLE TAI_KHOAN
(
	Id int identity primary key,
	Email char(1000) not null,
	Pass char(1000) not null,
	Username nvarchar(100) not null,
	Sdt int not null,
	Type int not null
)
CREATE TABLE BANG_CAP
(
	Id int identity primary key,
	TrinhDo nvarchar(100),
	DonViDaoTao nvarchar(100),
	ThoiGianBatDau DATE,
	ThoiGianKetThuc DATE,
	ChuyenNganh nvarchar(100),
	LoaiTotNghiep nvarchar(100),
)
CREATE TABLE NN_TH
(
	Id int identity primary key,
	LoaiNgonNgu nvarchar(100) not null,
	TrinhDo nvarchar(100) not null,
	BangCap NVARCHAR(1000) NOT NULL,
	Word BIT NOT NULL,
	Excel BIT NOT NULL,
	PowerPoint BIT NOT NULL,
	Outlook BIT NOT NULL,
	PhanMemKhac NVARCHAR(1000),
)
CREATE TABLE KI_NANG
(	
	Id INT IDENTITY PRIMARY KEY,
	LanhDao BIT NOT NULL,
	LamViecNhom BIT NOT NULL,
	RaChienLuoc BIT NOT NULL,
	GiaiQuyetVD BIT NOT NULL,
	QuanLyNhanLuc BIT NOT NULL,
	GiaoTiep BIT not NULL,
	QuanLyThoiGian BIT NOT NULL,
	QuanLyDuAn BIT NOT NULL,
	SangTao BIT NOT NULL,
	SoThich NVARCHAR(1000),
	KyNangKhac NVARCHAR(1000),
)
CREATE TABLE DIA_CHI
(
	Id int identity primary key,
	Tinh nvarchar(100),
	DiaChiChiTiet NVARCHAR(1000),
)
CREATE TABLE HO_SO
(
	Id INT PRIMARY KEY,
	Fullname nvarchar(100) not null,
	NgaySinh date not null,
	GioiTinh BIT NOT NULL,
	KinhNghiem nvarchar(100) not null,
	ViTriHienTai NVARCHAR(1000) NOT NULL,
	ViTriMongMuon NVARCHAR(1000) NOT NULL,
	MucLuongMongMuon INT NOT NULL,
	NoiLamViec NVARCHAR(1000) NOT NULL,
	MucTieuCV NVARCHAR(1000),
	TenCongTyDangLam NVARCHAR(1000),
	ThoiGianBatDauLam DATE,
	ThoiGianKetThucLam DATE,
	MucLuong INT,
	MoTaCV NVARCHAR(1000),
	IdDC int not null,
	IdBC int not null,
	IdNN_TH int not null,
	IdKN INT NOT NULL,
	FOREIGN KEY(IdKN) REFERENCES dbo.KI_NANG(Id),
	Foreign key(IdBC) references BANG_CAP(Id),
	Foreign key(IdNN_TH) references NN_TH(Id),
	Foreign key(IdDC) references DIA_CHI(Id),
	Foreign key(Id) references TAI_KHOAN(Id)
)
CREATE TABLE CONG_VIEC
(
	Id int identity primary key,
	IdUser int not null,
	TieuDe nvarchar(1000),
	SoLuongTuyen int,
	GioiTinhTuyen nvarchar(100),
	MoTaCV nvarchar, --Mo ta cong viec
	YeuCauCV nvarchar, --Mo ta yeu cau cong viec 
	HinhThuc nvarchar(1000), --Chinh thuc/Thoi Vu/Part Time/Lam them ngoai gio...
	KinhNghiemTuyen nvarchar(100),
	TGThuViec nvarchar(1000),
	QuyenLoi NVARCHAR(1000),
	NganhNghe nvarchar(1000),
	LuongCoBan int,
	NgayHetHan Date not null,
	TenCongTy NVARCHAR(1000), 
	IdDC int not null,
	SDT INT NOT NULL,
	QuyMoNhanSu INT,
	LinhVucHoatDong NVARCHAR(1000),
	SoLuocCT NVARCHAR(1000),
	TrangThai BIT NOT NULL,
	FOREIGN KEY (IdDC) REFERENCES DIA_CHI(Id),
	FOREIGN KEY (IdUser) REFERENCES HO_SO(Id)
)
ALTER TABLE dbo.CONG_VIEC ADD TrinhDo NVARCHAR(100);
ALTER TABLE dbo.CONG_VIEC ALTER COLUMN QuyMoNhanSu NVARCHAR(100);
ALTER TABLE CONG_VIEC ALTER COLUMN MoTaCV NVARCHAR(4000);
ALTER TABLE dbo.CONG_VIEC ALTER COLUMN YeuCauCV NVARCHAR(4000);
ALTER TABLE dbo.CONG_VIEC ALTER COLUMN LuongCoBan NVARCHAR(100);
ALTER TABLE dbo.CONG_VIEC ALTER COLUMN QuyenLoi NVARCHAR(MAX)
CREATE TABLE CONG_VIEC_LUU
(
	Id INT IDENTITY PRIMARY KEY,
	IdUser INT NOT NULL,
	IdCongViec INT NOT NULL,
	FOREIGN KEY (IdUser) REFERENCES dbo.HO_SO(Id),
	FOREIGN KEY (IdCongViec) REFERENCES dbo.CONG_VIEC(Id)
)
ALTER TABLE dbo.CONG_VIEC_LUU ADD CONSTRAINT fk_idcv FOREIGN KEY (IdCongViec) REFERENCES dbo.CONG_VIEC (Id) ON DELETE CASCADE
ALTER TABLE dbo.CONG_VIEC_LUU ADD CONSTRAINT fk_iduser FOREIGN KEY (IdUser) REFERENCES dbo.HO_SO (Id) ON DELETE CASCADE
INSERT INTO TAI_KHOAN
(
    Email,
    Pass,
    Username,
    Sdt,
    Type
)
VALUES
(   'thanhsang6325@gmail.com',  -- Email - char(1000)
    'sang186001',  -- Pass - char(1000)
    N'ThanhSang', -- Username - nvarchar(100)
    0777908037,   -- Sdt - int
    1    -- Type - int
)
INSERT INTO dbo.DIA_CHI
(
    Tinh,
    DiaChiChiTiet
)
VALUES
(   N'Quang Nam', -- Tinh - nvarchar(100)
    N'Dien An/ DienBan'  -- DiaChiChiTiet - nvarchar(1000)
)
INSERT INTO dbo.BANG_CAP
(
    TrinhDo,
    DonViDaoTao,
    ThoiGianBatDau,
    ThoiGianKetThuc,
    ChuyenNganh,
    LoaiTotNghiep
)
VALUES
(   N'Ky su',       -- TrinhDo - nvarchar(100)
    N'Dai hoc Bach Khoa Da Nang',       -- DonViDaoTao - nvarchar(100)
    GETDATE(), -- ThoiGianBatDau - date
    GETDATE(), -- ThoiGianKetThuc - date
    N'CNTT',       -- ChuyenNganh - nvarchar(100)
    N'Kha'        -- LoaiTotNghiep - nvarchar(100)
    )
INSERT INTO dbo.NN_TH
(
    LoaiNgonNgu,
    TrinhDo,
    BangCap,
    Word,
    Excel,
    PowerPoint,
    Outlook,
    PhanMemKhac
)
VALUES
(   N'English',  -- LoaiNgonNgu - nvarchar(100)
    N'Trung Binh',  -- TrinhDo - nvarchar(100)
    N'Toeic 650',  -- BangCap - nvarchar(1000)
    1, -- Word - bit
    1, -- Excel - bit
    1, -- PowerPoint - bit
    1, -- Outlook - bit
    N'Khong'   -- PhanMemKhac - nvarchar(1000)
    )
INSERT INTO dbo.KI_NANG
(
    LanhDao,
    LamViecNhom,
    RaChienLuoc,
    GiaiQuyetVD,
    QuanLyNhanLuc,
    GiaoTiep,
    QuanLyThoiGian,
    QuanLyDuAn,
    SangTao,
    SoThich,
    KyNangKhac
)
VALUES
(   1, -- LanhDao - bit
    1, -- LamViecNhom - bit
    1, -- RaChienLuoc - bit
    1, -- GiaiQuyetVD - bit
    0, -- QuanLyNhanLuc - bit
    1, -- GiaoTiep - bit
    1, -- QuanLyThoiGian - bit
    1, -- QuanLyDuAn - bit
    1, -- SangTao - bit
    N'Doc sach, Xe phim, Chay bo',  -- SoThich - nvarchar(1000)
    N'Khong'   -- KyNangKhac - nvarchar(1000)
)
INSERT INTO dbo.HO_SO
(
    Id,
    Fullname,
    NgaySinh,
    GioiTinh,
    KinhNghiem,
    ViTriHienTai,
    ViTriMongMuon,
    MucLuongMongMuon,
    NoiLamViec,
    MucTieuCV,
    TenCongTyDangLam,
    ThoiGianBatDauLam,
    ThoiGianKetThucLam,
    MucLuong,
    MoTaCV,
    IdDC,
    IdBC,
    IdNN_TH,
    IdKN
)
VALUES
(   1,         -- Id - int
    N'Nguyen Thanh Sang',       -- Fullname - nvarchar(100)
    GETDATE(), -- NgaySinh - date
    1,      -- GioiTinh - bit
    N'1 Nam',       -- KinhNghiem - nvarchar(100)
    N'Nhan Vien',       -- ViTriHienTai - nvarchar(1000)
    N'Nhan Vien',       -- ViTriMongMuon - nvarchar(1000)
    20000,         -- MucLuongMongMuon - int
    N'Da Nang',       -- NoiLamViec - nvarchar(1000)
    N'',       -- MucTieuCV - nvarchar(1000)
    N'',       -- TenCongTyDangLam - nvarchar(1000)
    GETDATE(), -- ThoiGianBatDauLam - date
    GETDATE(), -- ThoiGianKetThucLam - date
    0,         -- MucLuong - int
    N'',       -- MoTaCV - nvarchar(1000)
    1,         -- IdDC - int
    1,         -- IdBC - int
    1,         -- IdNN_TH - int
    1          -- IdKN - int
    )
INSERT INTO dbo.CONG_VIEC
(
    IdUser,
    TieuDe,
    SoLuongTuyen,
    GioiTinhTuyen,
    MoTaCV,
    YeuCauCV,
    HinhThuc,
    KinhNghiemTuyen,
    TGThuViec,
    QuyenLoi,
    NganhNghe,
    LuongCoBan,
    NgayHetHan,
    TenCongTy,
    IdDC,
    SDT,
    QuyMoNhanSu,
    LinhVucHoatDong,
    SoLuocCT,
    TrangThai
)
VALUES
(   1,         -- IdUser - int
    N'Tuyen Developer',       -- TieuDe - nvarchar(1000)
    3,         -- SoLuongTuyen - int
    N'Khong',       -- GioiTinhTuyen - nvarchar(100)
    N'Phat trien web',       -- MoTaCV - nvarchar
    N'Co ki nang lap trinh va kinh nghiem tren 1 nam',       -- YeuCauCV - nvarchar
    N'full time',       -- HinhThuc - nvarchar(1000)
    N'tren 1 nam',       -- KinhNghiemTuyen - nvarchar(100)
    N'3 thang',       -- TGThuViec - nvarchar(1000)
    N'Dang ki bao hiem lao dong',       -- QuyenLoi - nvarchar(1000)
    N'CNTT',       -- NganhNghe - nvarchar(1000)
    20000,         -- LuongCoBan - int
    GETDATE(), -- NgayHetHan - date
    N'ABC',       -- TenCongTy - nvarchar(1000)
    1,         -- IdDC - int
    0907143987,         -- SDT - int
    100,         -- QuyMoNhanSu - int
    N'CNTT',       -- LinhVucHoatDong - nvarchar(1000)
    N'',       -- SoLuocCT - nvarchar(1000)
    0       -- TrangThai - bit
    )
INSERT INTO dbo.CONG_VIEC_LUU
(
    IdUser,
    IdCongViec
)
VALUES
(   1, -- IdUser - int
    16  -- IdCongViec - int
)
INSERT INTO dbo.CONG_VIEC_LUU
(
    IdUser,
    IdCongViec
)
VALUES
(   1, -- IdUser - int
    15  -- IdCongViec - int
)
SELECT * FROM dbo.TAI_KHOAN 
SELECT * FROM dbo.HO_SO
SELECT * FROM DIA_CHI WHERE Tinh = N'Quang Nam' AND DiaChiChiTiet = N'Dien An/ DienBan'
SELECT * FROM dbo.DIA_CHI
SELECT * FROM CONG_VIEC WHERE TrangThai = 1
SELECT CONG_VIEC.Id, CONG_VIEC.IdUser, CONG_VIEC.TieuDe, CONG_VIEC.SoLuongTuyen, CONG_VIEC.GioiTinhTuyen, CONG_VIEC.MoTaCV, CONG_VIEC.YeuCauCV, 
CONG_VIEC.HinhThuc,CONG_VIEC.KinhNghiemTuyen, CONG_VIEC.TGThuViec, CONG_VIEC.QuyenLoi, CONG_VIEC.NganhNghe, CONG_VIEC.LuongCoBan, 
CONG_VIEC.NgayHetHan, CONG_VIEC.TenCongTy,CONG_VIEC.IdDC,CONG_VIEC.SDT, CONG_VIEC.QuyMoNhanSu, CONG_VIEC.LinhVucHoatDong, CONG_VIEC.SoLuocCT, 
CONG_VIEC.TrangThai, CONG_VIEC.TrinhDo 
FROM dbo.CONG_VIEC, dbo.CONG_VIEC_LUU, dbo.HO_SO 
WHERE dbo.CONG_VIEC.Id = dbo.CONG_VIEC_LUU.IdCongViec AND dbo.CONG_VIEC_LUU.IdUser = 1;
/*DELETE dbo.CONG_VIEC_LUU WHERE IdUser = 1 AND IdCongViec = 15*/
UPDATE dbo.CONG_VIEC SET TrangThai = 1 WHERE Id = 28;
DELETE dbo.CONG_VIEC WHERE Id = 17
DELETE dbo.CONG_VIEC WHERE NgayHetHan < GETDATE()
SELECT COUNT(*) FROM dbo.CONG_VIEC WHERE TrangThai = 1
SELECT Id FROM dbo.CONG_VIEC WHERE NgayHetHan < GETDATE()
SELECT * 
FROM dbo.CONG_VIEC
INNER JOIN dbo.CONG_VIEC_LUU
ON CONG_VIEC_LUU.IdCongViec = CONG_VIEC.Id WHERE NgayHetHan < GETDATE()