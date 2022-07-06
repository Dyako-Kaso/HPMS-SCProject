public abstract class Medicine      // abstract class is used
{
	protected String Med_Name;
	protected int Med_Quantity;
	protected String Med_Description;
	protected String Med_Conflict;   // shows what type of medicine conflicts with the current
									 // type of medicine.

	protected String Prod_date; // production date of the medicine.
	protected String Exp_date; // expiration date of the medicine.
	protected double price;

	// Default constructor
	public Medicine()
	{
		Med_Name = " ";
		Med_Quantity = 0;
		Med_Description = " ";
		Med_Conflict = " ";
		Prod_date = " ";
		Exp_date = " ";
		price = 0.0;
	}
	// Parameterized Constructor
	public Medicine(String mname , int mqn , String mddesc , String medc , String prd , String Expd , double pr)
	{
		Med_Name = mname;
		Med_Quantity = mqn;
		Med_Description = mddesc;
		Med_Conflict = medc;
		Prod_date = prd;
		Exp_date = Expd;
		price = pr;
	}

	// Setter (Mutator) Methods
	public void set_Med_Name(String mn)
	{
		Med_Name = mn;
	}
	public void set_Med_Quantity(int mq)
	{
		Med_Quantity = mq;
	}
	public void set_Med_Description(String md)
	{
		Med_Description = md;
	}
	public void set_Med_Conflict(String mc)
	{
		Med_Conflict = mc;
	}
	public void set_Prod_Date(String pd)
	{
		Prod_date = pd;
	}
	public void set_Exp_date(String ed)
	{
		Exp_date = ed;
	}
	public void set_Price(double p)
	{
		price = p;
	}

	// Getter(Accessor) methods
	public String get_Med_Name()
	{
		return Med_Name;
	}
	public int get_Med_Quantity()
	{
		return Med_Quantity;
	}
	public String get_Med_Description()
	{
		return Med_Description;
	}
	public String get_Med_Conflict()
	{
		return Med_Conflict;
	}
	public String get_prod_date()
	{
		return Prod_date;
	}
	public String get_Exp_date()
	{
		return Exp_date;
	}

	// The (ABSTRACT) Method that will be overriden and given a body in the subclasses of class (Medicine)
	// this is the abstract method that needs to
	//be given a body in the other subclasses.
	public abstract void print_medicine();



	// the following methods will increase and decrease medicine quantity when dealt with by Inventory class and class Pharmacist upon selling medicine.
	public void subtract_Quantity(int byHowMuch) //this method decrements quantity based on the number of medicine sold
	{
		Med_Quantity -= byHowMuch;
	}
	public void add_quantity(int byHowMuch)  // this method increments the quantity of medicine especially when it is used in the inventory
	{
		Med_Quantity += byHowMuch;
	}



}