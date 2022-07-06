import java.util.Vector;

public class Inventory
{

	Vector<PainKiller> pk_V = new Vector<PainKiller>(); // PainKiller vector to hold the PainKiller objects
	Vector<AntiViral> av_V = new Vector<AntiViral>(); // AntiViral vector to hold the AntiViral objects
	Vector<AntiBacterial> ab_V = new Vector<AntiBacterial>(); // AntiBacterial vector to hold the AntiBacterial objects

	private int pk_Size; // holds the size of the painkiller objects that the user wants to enter
	private int av_Size; // holds the size of the antiViral objects that the user wants to enter
	private int ab_Size; // holds the size of the antiBacterial objects that the user wants to enter.

	private int count_pk= 0; // keeps track of the allowable number of PainKiller Objects to be inputted
	private int count_av = 0; // keeps track of the allowable number of AntiViral Objects to be inputted
	private int count_ab = 0; // keeps track of the allowable number of AntiBacterial Objects to be inputted




	public Inventory(int pk_S ,int av_S , int ab_S)
	{
		pk_Size = pk_S;
		av_Size = av_S;
		ab_Size = ab_S;

		count_pk = pk_Size;
		count_av = av_Size;
		count_ab = ab_Size;

	}
	// the following setter methods have been overloaded.
	public void add_Medicine(AntiViral av) // overloaded add_Medicine() with AntiViral object as it's parameter
	{
		if(count_av != 0)
					{
						av_V.add(av);
						count_av--;
					}
					else
					{
						System.out.println("AntiViral is full");
					}
	}
	public void add_Medicine(AntiBacterial ab)// overloaded add_Medicine() with AntiBacterial object as it's parameter
	{


		if(count_ab != 0)
			{
				ab_V.add(ab);
				count_ab--;
			}
			else
				{
							System.out.println("AntiBacterial is full");
				}


	}
	public void add_Medicine(PainKiller pk) // overloaded add_Medicine() with PainKiller object as it's parameter
	{
		if(count_pk != 0)
		{
			pk_V.add(pk);
			count_pk--;
		}
		else
		{
			System.out.println("PainKiller is full");
		}
	}


	public void delete_medicine(String med_delete)
	{
		for(int i = 0 ; i < pk_V.size() ; i++)
		{
			if( ((PainKiller)pk_V.get(i)).get_Med_Name() == med_delete)
			{
				pk_V.remove(i);
			}
		}
		for(int i = 0 ; i < ab_V.size() ; i++)
		{
			if( ((AntiBacterial)ab_V.get(i)).get_Med_Name() == med_delete)
			{
				ab_V.remove(i);
			}
		}
		for(int i = 0 ; i < av_V.size() ; i++)
		{
			if( ((AntiViral)av_V.get(i)).get_Med_Name() == med_delete)
			{
				av_V.remove(i);
			}
		}
	}


	public void show_AntiViral() // show_AntiViral() prints the elements of AntiViral objects stored in av_V vector.
	{
		for(int m = 0 ; m < av_V.size() ; m++)
		{
			((AntiViral)av_V.get(m)).print_medicine();
			System.out.println("\n");
		}
	}
	public void show_AntiBacterial() // show_AntiBacterial() prints the elements of AntiBacterial objects stored in ab_V vector.
		{
			for(int n = 0 ; n < ab_V.size() ; n++)
			{
				((AntiBacterial)ab_V.get(n)).print_medicine();
				System.out.println("\n");
			}
		}
	public void show_PainKiller() // show_PainKiller() prints the elements of PainKiller objects stored in pk_V vector.
		{
			for(int j = 0 ; j < pk_V.size() ; j++)
			{
				((PainKiller)pk_V.get(j)).print_medicine();
				System.out.println("\n");
		 	}
	}

	public void decrease_Medicine(String med_name , int ByHowMuch)
		{
			for(int i = 0 ; i < ab_V.size() ; i++)
			{
				if( ((AntiBacterial)ab_V.get(i)).get_Med_Name() == med_name)
				{
					((AntiBacterial)ab_V.get(i)).subtract_Quantity(ByHowMuch);
				}
			}
			for(int i = 0 ; i < av_V.size() ; i++)
			{
				if( ((AntiViral)av_V.get(i)).get_Med_Name() == med_name)
				{
					((AntiViral)av_V.get(i)).subtract_Quantity(ByHowMuch);
				}
			}
			for(int i = 0 ; i < pk_V.size() ; i++)
			{
				if( ((PainKiller)pk_V.get(i)).get_Med_Name() == med_name)
				{
					((PainKiller)pk_V.get(i)).subtract_Quantity(ByHowMuch);
				}
			}

	}


	public void increase_Medicine(String med_name , int ByHowMuch)
	{
					for(int i = 0 ; i < av_V.size() ; i++)
					{
						if( ((AntiViral)av_V.get(i)).get_Med_Name() == med_name)
						{
							((AntiViral)av_V.get(i)).add_quantity(ByHowMuch);
						}
					}
					for(int i = 0 ; i < ab_V.size() ; i++)
					{
						if( ((AntiBacterial)ab_V.get(i)).get_Med_Name() == med_name)
						{
							((AntiBacterial)ab_V.get(i)).add_quantity(ByHowMuch);
						}

					}
					for(int i = 0 ; i < pk_V.size() ; i++)
					{
						if( ((PainKiller)pk_V.get(i)).get_Med_Name() == med_name)
						{
							((PainKiller)pk_V.get(i)).add_quantity(ByHowMuch);
						}

					}
	}





}