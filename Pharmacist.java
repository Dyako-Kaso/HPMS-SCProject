import java.util.Vector;


public class Pharmacist extends Employee
{
	private String Pharmacist_ID;
	private String email;
	Address addr; // aggregation relationship is being applied.
	private String Username;
	private String password;

	// these are vectors to store how many medicine are there to be sold not bound to size.
	Vector<AntiViral> av_v2 = new Vector<AntiViral>();
	Vector<AntiBacterial> ab_v2 = new Vector<AntiBacterial>();
	Vector<PainKiller> pk_v2 = new Vector<PainKiller>();

	// the following arrays are applying the concept of association
	AntiViral [] antv_array;
	PainKiller [] pk_array;
	AntiBacterial [] antb_array;

	String typeOfMedicineToSell; // this determines what type of medicine will the pharmacist sell in the pharmacy based on the order of the Patient.
	int counter_av = 0; // a counter for AntiViral to keep track of the allowable amount of antiviral to be inputted in sell_AntiViral() method
	int counter_ab = 0; // a counter for AntiViral to keep track of the allowable amount of antiBacterial to be inputted in sell_AntiBacterial() method
	int counter_pk = 0;	// a counter for AntiViral to keep track of the allowable amount of PainKiller to be inputted in sell_PainKiller() method

	public Pharmacist()
	{
		Pharmacist_ID = " " ;
		email = " ";
	}
	public Pharmacist(String fn , String ln , int a , String g
	, String p , int pn , double s, String pid ,String e
	, Address add , String u , String pass)
	{
		super(fn ,  ln , a , g , p , pn , s);
		Pharmacist_ID = pid;
		email = e;
		addr = add; // address object that is passed as a parameter is being assigned to address object in the class Pharmacist.
		Username = u;
		password = pass;

	}
	public void set_PharmacistID(String pid)
	{
		Pharmacist_ID = pid;
	}
	public void set_email(String e)
	{
		email = e;
	}
	public String get_PharmacistID()
	{
		return Pharmacist_ID;
	}
	public String get_email()
	{
		return email;
	}

	public void Print_Employee() // overriding the Print_Employee() in class employee.
	{
		System.out.println("\n\nIdentification Number of the Pharmacist : " + Pharmacist_ID);
		System.out.println("First Name of the Pharmacist is : " +  FirstName);
		System.out.println("Last Name of the Pharmacist is : " + LastName);
		System.out.println("Age of the Pharmacist is : " + age);
		System.out.println("Gender of the Pharmacist is : " + Gender);
		System.out.println("Postion of the Pharmacist is : " + position);
		System.out.println("Salary of the Pharmacist is : " + Salary);
		System.out.println("Email Address of the Pharmacist : " + email );
		System.out.println("The phone number of the Pharmacist is : " + phoneNumber);
		System.out.println("The Pharmacist Address is : ");
		System.out.println("Street : " + addr.get_StreetName()); // address object is used to call a method that is present in class Address in order to show aggregation relationship
		System.out.println("City : " + addr.get_City());  // address object is used to call a method that is present in class Address in order to show aggregation relationship
		System.out.println("Zip Code : " + addr.get_ZipCode());  // address object is used to call a method that is present in class Address in order to show aggregation relationship
		System.out.println("Username : " + Username);
		System.out.println("Password : " + password);
	}

	public void set_user(String usr)
	{
		Username = usr;
	}
	public void set_Password(String pssw)
	{
		password = pssw;
	}
	public String get_user()
	{
		return Username;
	}
	public String get_pass()
	{
		return password;
	}

	public void  sell_AntiViral(AntiViral obj1 , int qty) // this method applies association
	 {
		  av_v2.add(obj1);
		 ((AntiViral)av_v2.get(counter_av)).subtract_Quantity(qty);
		 counter_av++;
	 }
	public void  sell_AntiBacterial(AntiBacterial obj2 , int qty)// this method applies association
	{
			  ab_v2.add(obj2);
			 ((AntiBacterial)ab_v2.get(counter_ab)).subtract_Quantity(qty);
			 counter_ab++;
	 }
	 public void  sell_PainKiller(PainKiller obj3 , int qty)// this method applies association
	 	 {
	 		  pk_v2.add(obj3);
	 		 ((PainKiller)pk_v2.get(counter_pk)).subtract_Quantity(qty);
	 		 counter_pk++;
	 }
	 public void show_medicine_sold()
	 {
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		for(int i = 0 ; i < av_v2.size() ; i++)
		{
			antv_array[count1] = ((AntiViral)av_v2.get(i));
			antv_array[count1].print_medicine();
			count1++;
		}
		for(int i = 0 ; i < ab_v2.size() ; i++)
		{
					antb_array[count2] = ((AntiBacterial)ab_v2.get(i));
					antb_array[count2].print_medicine();
					count2++;
		}
		for(int i = 0 ; i < av_v2.size() ; i++)
		{
					pk_array[count3] = ((PainKiller)pk_v2.get(i));
					pk_array[count3].print_medicine();
					count3++;
		}
	 }



}