public class AntiBacterial extends Medicine
{
	private String Target_Bacteria;

	public AntiBacterial()
	{
		Target_Bacteria = " ";
	}

	public AntiBacterial(String mn , int mq ,
	String md , String mc , String pd , String exp , double p , String tb)
	{
		 // invoking the constructor of the super class and passing those parameters to it.
		super(mn , mq , md , mc , pd , exp , p);
		Target_Bacteria = tb;
	}

	public AntiBacterial(String ab)
	{
		Target_Bacteria = ab;
	}

	public void set_Target_Bacteria(String tb)
	{
		Target_Bacteria = tb;
	}

	public String get_Target_Bacteria()
	{
		return Target_Bacteria;
	}

	public void print_medicine()  // the abstract method in class Medicine that is given a body here in the subclass of Medicine - AntiBacterial class
		{

					System.out.println("AntiBacterial Name : " + Med_Name);
					System.out.println("AntiBacterial Quantity : " + Med_Quantity);
					System.out.println("Anti Bacterial Description : " + Med_Description);
					System.out.println("Target Bacteria : " + Target_Bacteria);
					System.out.println("Medicine that Conflicts with : " + Med_Conflict);
					System.out.println("AntiBacterial Production Date : " + Prod_date);
					System.out.println("AntiBacterial Expiration date : " + Exp_date);
					System.out.println("AntiBacterial Price : " + price);
	}

}