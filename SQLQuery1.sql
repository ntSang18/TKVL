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
	Id INT primary key,
	Fullname nvarchar(100) not null,
	NgaySinh date not null,
	GioiTinh nvarchar(100),
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

