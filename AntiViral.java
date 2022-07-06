public class AntiViral extends Medicine
{
	private String Target_Viruses;

	public AntiViral()
	{
		Target_Viruses = " ";
	}

	public AntiViral(String mn , int mq
	, String md , String mc , String pd , String exp , double p , String tv)
	{
		// invoking the constructor of the super class and passing those parameters to it.
		super(mn , mq , md , mc , pd , exp , p);
		Target_Viruses = tv;
	}

	public void set_Target_Viruses(String tv)
	{
		Target_Viruses = tv;
	}

	public String get_Target_Viruses()
	{
		return Target_Viruses;
	}

	public void print_medicine()  // the abstract method in class Medicine that is given a body here in the subclass of Medicine - AntiViral class
	{

				System.out.println("AntiViral Name : " + Med_Name);
				System.out.println("AntiViral Quantity : " + Med_Quantity);
				System.out.println("AntiViral Description : " + Med_Description);
				System.out.println("Target Viruses : " + Target_Viruses);
				System.out.println("Medicine that Conflicts with : " + Med_Conflict);
				System.out.println("AntiViral Production Date : " + Prod_date);
				System.out.println("AntiViral Expiration date : " + Exp_date);
				System.out.println("AntiViral Price : " + price);


	}
}