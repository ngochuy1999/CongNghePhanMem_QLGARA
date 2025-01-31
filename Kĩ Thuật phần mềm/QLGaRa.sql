USE [QLGARA]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 4/20/2020 10:35:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Account](
	[USERNAME] [varchar](20) NOT NULL,
	[PASSWORD] [varchar](20) NOT NULL,
	[EMAIL] [varchar](20) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[USERNAME] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ChiTietPhieuSua]    Script Date: 4/20/2020 10:35:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ChiTietPhieuSua](
	[MAPHIEU] [varchar](15) NOT NULL,
	[MALK] [varchar](10) NULL,
	[MADV] [nvarchar](10) NULL,
	[MAXE] [varchar](10) NULL,
	[NGAY] [date] NULL,
 CONSTRAINT [PK_ChiTietPhieuSua] PRIMARY KEY CLUSTERED 
(
	[MAPHIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[DichVu]    Script Date: 4/20/2020 10:35:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DichVu](
	[MADV] [nvarchar](10) NOT NULL,
	[TENDV] [nvarchar](30) NOT NULL,
	[DONGIA] [int] NOT NULL,
	[SOLUONG] [int] NOT NULL,
 CONSTRAINT [PK_DichVu] PRIMARY KEY CLUSTERED 
(
	[MADV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HangXe]    Script Date: 4/20/2020 10:35:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[HangXe](
	[MAHANG] [varchar](10) NOT NULL,
	[TENHANG] [varchar](10) NULL,
 CONSTRAINT [PK_HangXe] PRIMARY KEY CLUSTERED 
(
	[MAHANG] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 4/20/2020 10:35:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MAKH] [varchar](10) NOT NULL,
	[TENKH] [nvarchar](30) NOT NULL,
	[SDT] [int] NOT NULL,
	[DIACHI] [nvarchar](30) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MAKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[LinhKien]    Script Date: 4/20/2020 10:35:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[LinhKien](
	[MALK] [varchar](10) NOT NULL,
	[MAHANG] [varchar](10) NULL,
	[TENLK] [nvarchar](30) NULL,
	[SOLUONG] [int] NULL,
	[DONGIA] [int] NULL,
 CONSTRAINT [PK_LinhKien] PRIMARY KEY CLUSTERED 
(
	[MALK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 4/20/2020 10:35:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MANV] [int] IDENTITY(1,1) NOT NULL,
	[TENNV] [nvarchar](30) NOT NULL,
	[USERNAME] [varchar](20) NOT NULL,
	[GIOITINH] [nvarchar](3) NOT NULL,
	[CHUCVU] [nvarchar](15) NOT NULL,
	[SDT] [int] NOT NULL,
	[DIACHI] [nvarchar](30) NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MANV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[NhanVien] SET (LOCK_ESCALATION = AUTO)
GO
/****** Object:  Table [dbo].[PhieuSuaXe]    Script Date: 4/20/2020 10:35:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[PhieuSuaXe](
	[MAPHIEU] [varchar](15) NOT NULL,
	[MAKH] [varchar](10) NOT NULL,
	[NGAY] [date] NULL,
	[MANV] [int] NULL,
	[TRANGTHAI] [bit] NULL,
 CONSTRAINT [PK_PhieuSuaXe_1] PRIMARY KEY CLUSTERED 
(
	[MAPHIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[XeKhach]    Script Date: 4/20/2020 10:35:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[XeKhach](
	[MAXE] [varchar](10) NOT NULL,
	[HIEUXE] [nvarchar](20) NOT NULL,
	[BIENSO] [nvarchar](10) NOT NULL,
	[MAKH] [varchar](10) NULL,
 CONSTRAINT [PK_XeKhach] PRIMARY KEY CLUSTERED 
(
	[MAXE] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[ChiTietPhieuSua]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuSua_DichVu] FOREIGN KEY([MADV])
REFERENCES [dbo].[DichVu] ([MADV])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[ChiTietPhieuSua] CHECK CONSTRAINT [FK_ChiTietPhieuSua_DichVu]
GO
ALTER TABLE [dbo].[ChiTietPhieuSua]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuSua_LinhKien] FOREIGN KEY([MALK])
REFERENCES [dbo].[LinhKien] ([MALK])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[ChiTietPhieuSua] CHECK CONSTRAINT [FK_ChiTietPhieuSua_LinhKien]
GO
ALTER TABLE [dbo].[LinhKien]  WITH CHECK ADD  CONSTRAINT [FK_LinhKien_HangXe] FOREIGN KEY([MAHANG])
REFERENCES [dbo].[HangXe] ([MAHANG])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[LinhKien] CHECK CONSTRAINT [FK_LinhKien_HangXe]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_Account] FOREIGN KEY([USERNAME])
REFERENCES [dbo].[Account] ([USERNAME])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_Account]
GO
ALTER TABLE [dbo].[PhieuSuaXe]  WITH CHECK ADD  CONSTRAINT [FK_PhieuSuaXe_ChiTietPhieuSua] FOREIGN KEY([MAPHIEU])
REFERENCES [dbo].[ChiTietPhieuSua] ([MAPHIEU])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PhieuSuaXe] CHECK CONSTRAINT [FK_PhieuSuaXe_ChiTietPhieuSua]
GO
ALTER TABLE [dbo].[PhieuSuaXe]  WITH CHECK ADD  CONSTRAINT [FK_PhieuSuaXe_KhachHang] FOREIGN KEY([MAKH])
REFERENCES [dbo].[KhachHang] ([MAKH])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PhieuSuaXe] CHECK CONSTRAINT [FK_PhieuSuaXe_KhachHang]
GO
ALTER TABLE [dbo].[PhieuSuaXe]  WITH CHECK ADD  CONSTRAINT [FK_PhieuSuaXe_NhanVien] FOREIGN KEY([MANV])
REFERENCES [dbo].[NhanVien] ([MANV])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PhieuSuaXe] CHECK CONSTRAINT [FK_PhieuSuaXe_NhanVien]
GO
ALTER TABLE [dbo].[XeKhach]  WITH CHECK ADD  CONSTRAINT [FK_XeKhach_KhachHang] FOREIGN KEY([MAKH])
REFERENCES [dbo].[KhachHang] ([MAKH])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[XeKhach] CHECK CONSTRAINT [FK_XeKhach_KhachHang]
GO
