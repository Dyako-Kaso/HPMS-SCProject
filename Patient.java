public class Patient extends Person implements PatientInterface // interface has been used in this class
{
	private String patientCode;
	private String Condition;
	private String Allergies;
	// THIS CLASS HAS A (HAS-A) RELATIONSHIP WITH CLASS ADDRESS THROUGH IT'S SUPER CLASS(CLASS PERSON)

	// Default Constructor.
	public Patient()
	{
		patientCode = " ";
		Condition = " ";
		Allergies = " ";

	}
	// Parameterized Constructor
	public Patient(String t, String fn , String ln , String fmn , int a ,String g , Address add, String p , String c , String al)
	{
		super(t,  fn , ln , fmn ,  a ,g ,add);
		patientCode = p;
		Condition = c;
		Allergies = al;

	}

	// Setter (Mutator) functions
	public void set_PatientCode(String pc)
	{
		patientCode = pc;
	}
	public void set_Condition(String c)
	{
		Condition = c;
	}
	public void set_Allergies(String a)
	{
		Allergies = a;
	}

	// Getter (Accessor) methods
	public String get_PatientCode()
	{
		return patientCode;
	}
	public String get_Condition()
	{
		return Condition;
	}
	public String get_Allergies()
	{
		return Allergies;
	}




	public void Print_Patient() // using the PatientInterface's Abstract Method.
	{
		super.print(); // Calling the overriden method but in Super Class's version.
		System.out.println("Patient Code : " + patientCode );
		System.out.println("Patient's Condition : " + Condition);
		System.out.println("Patient's Allergies towards certain medicine : " + Allergies);

	}
}