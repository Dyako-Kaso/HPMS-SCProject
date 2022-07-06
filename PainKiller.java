public class PainKiller extends Medicine
{
	private double Safe_Dosage;  // this shows the safe dosages for the painkiller

	public PainKiller(String mn , int mq , String md , String mc
	, String pd , String exp , double p , double sd)
	{
			 // invoking the constructor of the super class and passing those parameters to it.
			super(mn , mq , md , mc , pd , exp , p);
			Safe_Dosage = sd;
	}
	public void set_dosage(double sd)
	{
		Safe_Dosage = sd;
	}
	public double get_Dosage()
	{
		return Safe_Dosage;
	}
	public void print_medicine() // the abstract method in class Medicine that is given a body here in the subclass of Medicine - PainKiller class
	{
			System.out.println("PainKiller Name : " + Med_Name);
			System.out.println("PainKiller Quantity : " + Med_Quantity);
			System.out.println("PainKiller Description : " + Med_Description);
			System.out.println("Safe Dosage of the PainKiller : " + Safe_Dosage + " mg");
			System.out.println("Medicine that Conflicts with : " + Med_Conflict);
			System.out.println("PainKiller Production Date : " + Prod_date);
			System.out.println("PainKiller Expiration date : " + Exp_date);
			System.out.println("PainKiller Price : $" + price);

	}



}