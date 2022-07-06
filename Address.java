public class Address
{
	private String StreetName;
	private String City;
	private int Zip_code;

	public Address()
	{
		StreetName = " ";
		City = " ";
		Zip_code = 0 ;
	}
	public Address(String sn , String c , int zp)
	{
		StreetName = sn;
		City = c;
		Zip_code = zp;
	}
	public void set_StreetName(String sn)
	{
		StreetName = sn;
	}
	public void set_City(String c)
	{
		City = c;
	}
	public void set_ZipCode(int zp)
	{
		Zip_code = zp;
	}
	public String get_StreetName()
	{
		return StreetName;
	}
	public String get_City()
	{
		return City;
	}
	public int get_ZipCode()
	{
		return Zip_code;
	}
}