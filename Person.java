public class Person
{
	private String Title;
	private String FirstName;
	private String LastName;
	private String FamilyName;
	private int age;
	private String Gender;
	Address addr; // aggregation relationship is being applied in this code.

	public Person()
	{
		Title = " ";
		FirstName = " ";
		LastName = " ";
		FamilyName = " ";
		age = 0;
		Gender = " " ;
	}
	public Person(String t, String fn , String ln , String fmn , int a ,String g , Address add)
	{
		Title = t;
		FirstName = fn;
		LastName = ln;
		FamilyName = fmn;
		age = a;
		Gender = g;
		addr = add; // Address object passed as a parameter is being assigned to the address object in class Person.
	}
	public void set_Title(String t)
	{
		Title = t;
	}
	public void set_FirstName(String fn)
	{
		FirstName = fn;
	}
	public void set_LastName(String ln)
	{
		LastName = ln;
	}
	public void set_FamilyName(String fmn)
	{
		FamilyName = fmn;
	}
	public void set_age(int a)
	{
		age = a;
	}
	public void set_gender(String g)
	{
		Gender = g;
	}
	public void set_address(Address addres)
	{
		addr = addres;
	}
	public String get_Title()
	{
		return Title ;
	}
	public String get_FirstName()
	{
		return FirstName;
	}
	public String get_LastName()
	{
		return LastName;
	}
	public String get_FamilyName()
	{
		return FamilyName;
	}
	public int get_age()
	{
		return age;
	}
	public String get_gender()
	{
		return Gender;
	}
	public void print()
	{
		System.out.println("Title : " + Title);
		System.out.println("FirstName : " + FirstName);
		System.out.println("LastName : " + LastName );
		System.out.println("FamilyName : " + FamilyName);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + Gender);
		System.out.println("Adress -- ");
		System.out.println("	Street : " + addr.get_StreetName());
		System.out.println("	City : " + addr.get_City());
		System.out.println("	Zip Code : " + addr.get_ZipCode());
	}

}