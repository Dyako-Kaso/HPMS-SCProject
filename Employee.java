public class Employee
{
	protected String FirstName;
	protected String LastName;
	protected int age;
	protected double Salary;
	protected String Gender;
	protected String position;
	protected int phoneNumber;

	public Employee()
	{
		FirstName = " ";
		LastName = " ";
		age = 0;
		Gender = " ";
		position = " ";
		phoneNumber = 0;
	}
	public Employee(String fn , String ln , int a , String g , String p , int pn , double s)
	{
		FirstName = fn;
		LastName = ln;
		age = a;
		Gender = g;
		position = p;
		phoneNumber = pn;
		Salary = s;
	}
	public void set_FirstName(String fn)
	{
		FirstName = fn;
	}
	public void set_LastName(String ln)
	{
		LastName = ln;
	}
	public void set_age(int a)
	{
		age = a;
	}
	public void set_gender(String g)
	{
		Gender = g;
	}
	public void set_position(String p)
	{
		position = p;
	}
	public void set_Salary(double s)
	{
		Salary = s;
	}
	public void set_phoneNumber(int ph)
	{
		phoneNumber = ph ;
	}
	public String get_First_Name()
	{
		return FirstName;
	}
	public String get_LastName()
	{
		return LastName;
	}
	public int get_age()
	{
		return age;
	}
	public String get_gender()
	{
		return Gender;
	}
	public String get_position()
	{
		return position;
	}
	public int get_phoneNumber()
	{
		return phoneNumber;
	}
	public double get_Salary()
	{
		return Salary;
	}
	public void Print_Employee()
	{
		System.out.println("First Name of the Employee is : " +  FirstName);
		System.out.println("Last Name of the Employee is : " + LastName);
		System.out.println("Age of the employee is : " + age);
		System.out.println("Gender of the employee is : " + Gender);
		System.out.println("Postion of the employee is : " + position);
		System.out.println("Salary of the Employee is : " + Salary);
		System.out.println("The phone number of the employee is : " + phoneNumber);
	}


}