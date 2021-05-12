package PBL3_DA.DTO;

public class DiaChi {
	private int Id;
	private String Tinh;
	private String DiaChiChiTiet;
	public int GetId()
	{
		return Id;
	}
	public void SetId(int id)
	{
		this.Id = id;
	}
	public String GetTinh()
	{
		return Tinh;
	}
	public void SetTinh(String tinh)
	{
		this.Tinh = tinh;
	}
	public String GetDCCT()
	{
		return DiaChiChiTiet;
	}
	public void SetDCCT(String dcct)
	{
		this.DiaChiChiTiet = dcct;
	}
}
