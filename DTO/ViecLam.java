package PBL3_DA.DTO;

import java.sql.Date;

public class ViecLam {
	private int Id;
	private int IdUser;
	private String TieuDe;
	private int SoLuongTuyen;
	private String GioiTinhTuyen;
	private String MoTaCV;
	private String YeuCauCV;
	private String HinhThuc;
	private String KinhNghiemTuyen;
	private String TGThuViec;
	private String QuyenLoi;
	private String NganhNghe;
	private String LuongCoBan;
	private Date NgayHetHan;
	private String TenCT;
	private int IdDC;
	private int SDT;
	private String QuyMoNhanSu;
	private String LinhVucHD;
	private String SoLuocCT;
	private Boolean TrangThai;
	private String TrinhDo;
	public int GetId()
	{
		return Id;
	}
	public void SetId(int id)
	{
		this.Id = id;
	}
	public int GetIdUser()
	{
		return IdUser;
	}
	public void SetIdUser(int iduser)
	{
		this.IdUser = iduser;
	}
	public String GetTieuDe()
	{
		return TieuDe;
	}
	public void SetTieuDe(String tieude)
	{
		this.TieuDe = tieude;
	}
	public int GetSoLuongTuyen()
	{
		return SoLuongTuyen;
	}
	public void SetSoLuongTuyen(int soluongtuyen)
	{
		this.SoLuongTuyen = soluongtuyen;
	}
	public String GetGioiTinhTuyen()
	{
		return GioiTinhTuyen;
	}
	public void SetGioiTinhTuyen(String gioitinhtuyen)
	{
		this.GioiTinhTuyen = gioitinhtuyen;
	}
	public String GetMoTaCV()
	{
		return MoTaCV;
	}
	public void SetMoTaCV(String motacv)
	{
		this.MoTaCV = motacv;
	}
	public String GetYeuCauCV()
	{
		return YeuCauCV;
	}
	public void SetYeuCauCV(String yeucaucv)
	{
		this.YeuCauCV = yeucaucv;
	}
	public String GetHinhThuc()
	{
		return HinhThuc;
	}
	public void SetHinhThuc(String hinhthuc)
	{
		this.HinhThuc = hinhthuc;
	}
	public String GetKinhNghiemTuyen()
	{
		return KinhNghiemTuyen;
	}
	public void SetKinhNghiemTuyen(String kinhnghiemtuyen)
	{
		this.KinhNghiemTuyen = kinhnghiemtuyen;
	}
	public String GetTGThuViec()
	{
		return TGThuViec;
	}
	public void SetTGThuViec(String tgthuviec)
	{
		this.TGThuViec= tgthuviec;
	}
	public String GetQuyenLoi()
	{
		return QuyenLoi;
	}
	public void SetQuyenLoi(String quyenloi)
	{
		this.QuyenLoi = quyenloi;
	}
	public String GetNganhNghe()
	{
		return NganhNghe;
	}
	public void SetNganhNghe(String nganhnghe)
	{
		this.NganhNghe = nganhnghe;
	}
	public String GetLuongCoBan()
	{
		return LuongCoBan;
	}
	public void SetLuongCoBan(String luongcoban)
	{
		this.LuongCoBan = luongcoban;
	}
	public Date GetNgayHetHan()
	{
		return NgayHetHan;
	}
	public void SetNgayHetHan(Date ngayhethan)
	{
		this.NgayHetHan = ngayhethan;
	}
	public String GetTenCT()
	{
		return TenCT;
	}
	public void SetTenCT(String tenct)
	{
		this.TenCT = tenct;
	}
	public int GetIdDC()
	{
		return IdDC;
	}
	public void SetIdDC(int iddc)
	{
		this.IdDC = iddc;
	}
	public int GetSDT()
	{
		return SDT;
	}
	public void SetSDT(int sdt)
	{
		this.SDT = sdt;
	}
	public String GetQuyMoNhanSu()
	{
		return QuyMoNhanSu;
	}
	public void SetQuyMoNhanSu(String qmns)
	{
		this.QuyMoNhanSu = qmns;
	}
	public String GetLinhVucHD()
	{
		return LinhVucHD;
	}
	public void SetLinhVucHD(String linhvuchd)
	{
		this.LinhVucHD = linhvuchd;
	}
	public String GetSoLuocCT()
	{
		return SoLuocCT;
	}
	public void SetSoLuocCT(String soluocct)
	{
		this.SoLuocCT = soluocct;
	}
	public boolean GetTrangThai()
	{
		return TrangThai;
	}
	public void SetTrangThai(Boolean trangthai)
	{
		this.TrangThai = trangthai;
	}
	
	public String GetTrinhDo()
	{
		return TrinhDo;
	}
	public void SetTrinhDo(String trinhdo)
	{
		this.TrinhDo = trinhdo;
	}
	public void SetViecLam(ViecLam i)
	{
		this.SetId(i.GetId());
		this.SetIdUser(i.GetIdUser());
		this.SetTieuDe(i.GetTieuDe());
		this.SetSoLuongTuyen(i.GetSoLuongTuyen());
		this.SetGioiTinhTuyen(i.GetGioiTinhTuyen());
		this.SetMoTaCV(i.GetMoTaCV());
		this.SetYeuCauCV(i.GetYeuCauCV());
		this.SetHinhThuc(i.GetHinhThuc());
		this.SetKinhNghiemTuyen(i.GetKinhNghiemTuyen());
		this.SetTGThuViec(i.GetTGThuViec());
		this.SetQuyenLoi(i.GetQuyenLoi());
		this.SetNganhNghe(i.GetNganhNghe());
		this.SetLuongCoBan(i.GetLuongCoBan());
		this.SetNgayHetHan(i.GetNgayHetHan());
		this.SetTenCT(i.GetTenCT());
		this.SetIdDC(i.GetIdDC());
		this.SetSDT(i.GetSDT());
		this.SetQuyMoNhanSu(i.GetQuyMoNhanSu());
		this.SetLinhVucHD(i.GetLinhVucHD());
		this.SetSoLuocCT(i.GetSoLuocCT());
		this.SetTrangThai(i.GetTrangThai());
		this.SetTrinhDo(i.GetTrinhDo());
	}
}
