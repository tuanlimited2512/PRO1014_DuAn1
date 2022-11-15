Create Database DuAn1
Use DuAn1

Create Table VaiTro(
	MaVaiTro varchar(10) primary key,
	TenVaiTro nvarchar(100) not null,
)
go

Create Table NhanVien(
	MaNV varchar(10) primary key,
	HoTen nvarchar(100) not null,
	GioiTinh bit,
	SDT varchar(10) not null,
	NgaySinh date not null,
	DiaChi nvarchar(100) not null,
	Email nvarchar(100) not null,
	TinhTrang bit,
	MaVaiTro varchar(10) foreign key references VaiTro(MaVaiTro),
)
go

Create table BoNho(
	MaBoNho varchar(10) primary key,
	TenBoNho nvarchar(100) not null,
	NgaySanXuat date,
	QuocGia nvarchar(100),
	MoTa nvarchar(100)
)
go

Create table DongSP(
	MaDongSP varchar(10) primary key,
	TenDongSP nvarchar(100) not null,
)
go

Create table NSX(
	MaNSX varchar(10) primary key,
	TenNSX nvarchar(100)
)
go

Create table CPU(
	MaCPU varchar(10) primary key,
	TenCPU nvarchar(100) not null,
	NgaySanXuat date,
	QuocGia nvarchar(100),
	MoTa nvarchar(100)
)
go

Create table ManHinh(
	MaManHinh varchar(10) primary key,
	TenManHinh nvarchar(100) not null,
	DoPhanGiai nvarchar(50) not null,
	KichThuoc nvarchar(50) not null,
	NgaySanXuat date,
	QuocGia nvarchar(100),
	MoTa nvarchar(100)
)
go

Create table SanPham(
	MaSP varchar(10) primary key,
	TenSP nvarchar(100) not null,
	MauSac nvarchar(30),
	HeDieuHanh nvarchar(30),
	Model varchar(30),
	NamBH int, 
	TrongLuong decimal(20, 0),
	MoTa nvarchar(100)
)
go

Create table KhuyenMai(
	MaKM varchar(10) primary key,
	TenKM nvarchar(100) not null,
	HinhThucGiam nvarchar(50),
	GiamGia nvarchar(50),
	NgayBatDau date,
	NgayKetThuc date,
	TrangThai bit
)
go

Create table ChiTietSP(
	MaSP varchar(10) foreign key references SanPham(MaSP),
	MaDongSP varchar(10) foreign key references DongSP(MaDongSP),
	MaNSX varchar(10) foreign key references NSX(MaNSX),
	MaKM varchar(10) foreign key references KhuyenMai(MaKM),
	MaCPU varchar(10) foreign key references CPU(MaCPU),
	MaBoNho varchar(10) foreign key references BoNho(MaBoNho),
	MaManHinh varchar(10) foreign key references ManHinh(MaManHinh),
	GiaNhap decimal(20, 0),
	GiaBan decimal(20, 0),
	SoLuong int, 
	MoTa nvarchar(100),
	primary key(MaSP)
)
go

Create table KhachHang(
	MaKH varchar(10) primary key,
	TenKH nvarchar(100) not null,
	SDT varchar(12),
	GioiTinh BIT,
	NgaySinh date,
	DiaChi nvarchar(200)
)
go

Create table HoaDon(
	MaHD varchar(10) primary key,
	NgayTao date,
	NgayThanhToan date,
	TinhTrang bit,
	MaKH varchar(10) foreign key references KhachHang(MaKH),
	MaNV varchar(10) foreign key references NhanVien(MaNV)
)
go

Create table HoaDonChiTiet(
	MaHD varchar(10) foreign key references HoaDon(MaHD), 
	MaSP varchar(10) foreign key references ChiTietSP(MaSP),
	SoLuong int,
	DonGia decimal(20, 0),
	primary key(MaHD, MaSP)
)
go
