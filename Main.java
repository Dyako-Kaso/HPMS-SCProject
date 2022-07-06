import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import javax.swing.*;

// Name of the System : Hospital Pharmacy Management System.
//Name of the Group Members : Diyako Kaso, Schanga Ayub , Shaklin Hassan , Rahand Mahdi , Ashna Yousif
// Section : 1,2

public class Main
{



	public static void main(String [] args)
	{
		Vector<Pharmacist> users = new Vector<Pharmacist>(); // a vector to hold users of type Pharmacist created for the system.
		ArrayList<Patient> patients = new ArrayList<Patient>(); // an arraylist to store the patient objects created.`
		int MAIN_MENU_CHOICE; // used for first menu to take the choice of the user regarding the first menu.
		Scanner inp = new Scanner(System.in);
		Inventory INV; // New Inventory Object

		// constants each corresponding to a choice of the user


		final int LOGIN = 1;
		final int CREATEUSER = 2;
		final int PATIENTFIIES = 3;
		final int INVENTORY = 4;
		final int TAKEORDER = 5;
		final int QUIT = 6;


		// a do-while loop is used to constantly show the menu and take user choices until the users chooses to exit the system
		do
		{
			showMenu();
			System.out.print("\n\nPlease Enter Number : ");

			MAIN_MENU_CHOICE = getChoice();
			while(MAIN_MENU_CHOICE > QUIT || MAIN_MENU_CHOICE < LOGIN)
			{
				System.out.print("Invalid choice please enter again : ");
				MAIN_MENU_CHOICE = getChoice();
			}
			System.out.println("\n");
							if(MAIN_MENU_CHOICE == LOGIN)
							{

								Scanner login = new Scanner(System.in); // scanner object to recieve username and password as input
								String user;
								String password;
								System.out.print("\n\nEnter Username : ");
								user = login.nextLine();
								System.out.print("\nEnter Password : ");
								password = login.nextLine();

								String u , p;

								 u = ((Pharmacist)users.get(0)).get_user();
								 p = ((Pharmacist)users.get(0)).get_pass();

								 System.out.println(u);
								 System.out.println(p);







							}
							else if(MAIN_MENU_CHOICE == CREATEUSER)
							{

										int i = 0;


										Scanner inp2 = new Scanner(System.in); // for inputting only strings
										// using inp for inputting only integers and doubles.


										String firstName;
										String LastName;
										int age;
										double salary;
										String gender;
										String position;
										int phone;
										String pharma_ID ;
										String email;
										String user;
										String password;
										String streetName;
										String city;
										int zipCode;


										System.out.print("\n\nEnter FirstName : ");
										firstName = inp2.nextLine();
										System.out.print("\nEnter LastName : ");
										LastName = inp2.nextLine();
										System.out.print("\nEnter Age : ");
										age = getInt_Values();               // this method is used to invoke the exception to check if the value entered is an integer or not.
										System.out.print("\nEnter Salary : ");
										salary = getDouble_Values();             // this method is used to invoke the exception to check if value entered is a double or not.
										System.out.print("\nEnter gender : ");
										gender = inp2.nextLine();
										System.out.print("\nEnter Position : ");
										position = inp2.nextLine();
										System.out.print("\nEnter Phone Number : ");
										phone = getInt_Values(); // this method is used to invoke the exception to check if the value entered is an integer or not.
										System.out.print("\nEnter Pharmacist ID number : ");
										pharma_ID = inp2.nextLine();
										System.out.print("\nEnter Email : ");
										email = inp2.nextLine();
										System.out.print("\nEnter Username : ");
										user = inp2.nextLine();
										System.out.print("\nEnter Password : ");
										password = inp2.nextLine();
										System.out.println("\nEnter Address : ");
										System.out.print("\nEnter Street name : ");
										streetName = inp2.nextLine();
										System.out.print("\nEnter City : ");
										city = inp2.nextLine();
										System.out.print("\nEnter Zip Code : ");
										zipCode = getInt_Values(); // this method is used to invoke the exception to check if the value entered is an integer or not.
										Address addr = new Address(streetName , city , zipCode);
										Pharmacist obj = new Pharmacist(firstName , LastName , age , gender ,position , phone , salary ,pharma_ID , email,addr , user, password);
										System.out.println("\n");
									//	obj.Print();
										users.add(obj);
										JOptionPane.showMessageDialog(null,"User Has Been Created");
										print(obj); // this is the static method that applies polymorphism by passing a Pharmacist object to an Employee object to call a method in Pharmacist.








							}
			else if(MAIN_MENU_CHOICE == PATIENTFIIES)
			{
				int PATIENT_FILES_CHOICES ;
				Scanner inp3 = new Scanner(System.in); // using inp3 only for inputting integers and doubles
				Scanner inp4 = new Scanner(System.in); // using inp4 only for inputting Strings
				final int ADD = 1;
				final int MODIFY = 2;
				final int DELETE = 3;
				final int SHOW = 4;
				final int RETURN = 5;



								do
								{
									showPatientFiles();
									System.out.print("\n\nPlease Enter A Number : ");
									PATIENT_FILES_CHOICES= getInt_Values();
									while(PATIENT_FILES_CHOICES > RETURN || PATIENT_FILES_CHOICES < ADD)
												{
													System.out.print("Invalid choice please enter again : ");
													PATIENT_FILES_CHOICES = getInt_Values();
												}
									System.out.println("\n");
									if(PATIENT_FILES_CHOICES == ADD)
									{
										String Title;
										String p_firstName;
										String p_lastName;
										String FamilyName;
										int patient_age;
										String patient_Gender;
										String patient_streetName;
										String patient_city;
										int patient_zipCode;
										String patientCode;
										String Condition;
										String Allergies;

										System.out.print("\nEnter Title of the Patient [Mr, Ms] : ");
										Title = inp4.nextLine();
										System.out.print("\n\nEnter Patient FirstName : ");
										p_firstName = inp4.nextLine();
										System.out.print("\nEnter Patient LastName : ");
										p_lastName = inp4.nextLine();
										System.out.print("\nEnter Patient Family Name : ");
										FamilyName = inp4.nextLine();
										System.out.print("\nEnter Patient Age : ");
										patient_age = getInt_Values(); // this method is invoking the exception checking if the value entered is interger or not in order to stop program crash
										System.out.print("\nEnter Patinet gender : ");
										patient_Gender = inp4.nextLine();
										System.out.print("\nEnter Patient StreetName : ");
										patient_streetName = inp4.nextLine();
										System.out.print("\nEnter Patient City : ");
										 patient_city = inp4.nextLine();
										System.out.print("\nEnter Patient Zip Code : ");
										patient_zipCode = getInt_Values();
										System.out.print("\nEnter Patient Code : ");
										patientCode = inp4.nextLine();
										System.out.print("\nEnter Patient's Condition : ");
										Condition = inp4.nextLine();
										System.out.print("\nEnter Patient Allergies : ");
										Allergies = inp4.nextLine();


										Address addr = new Address(patient_streetName, patient_city , patient_zipCode);
										Patient obj2 = new Patient(Title , p_firstName , p_lastName , FamilyName , patient_age , patient_Gender , addr ,patientCode , Condition , Allergies );
										System.out.println("\n");
									//	obj.Print();

										patients.add(obj2);

										JOptionPane.showMessageDialog(null,"Patient Has Been Created");


								}
								else if(PATIENT_FILES_CHOICES== MODIFY)
								{
									int PATIENT_MODIFY_OPERATIONS;
									Scanner inp5 = new Scanner(System.in); // inp5 is used to input integers and doubles.
									Scanner inp6 = new Scanner(System.in); // inp6 is used to input Strings.

									final int DETAILS = 1;
									final int ADDRESS = 2;
									final int CONDITION = 3;
									final int RETURN2 = 4;

									showPatientModifyOptions();
									System.out.print("\n\nEnter which field do you want to Edit : ");
									 PATIENT_MODIFY_OPERATIONS = getInt_Values();  // Invokes the exception method
									while( PATIENT_MODIFY_OPERATIONS > RETURN2 ||  PATIENT_MODIFY_OPERATIONS < DETAILS)
												{
																		System.out.print("Invalid choice please enter again : ");
																		 PATIENT_MODIFY_OPERATIONS= getInt_Values();
												}
													do
													{
														if( PATIENT_MODIFY_OPERATIONS== DETAILS)
														{   int patient_index; // To determine the index of the patient object in the vector

															System.out.print("\nFor which patient ? ");
															patient_index = getInt_Values();

															String Title2;
															String p_firstName2;
															String p_lastName2;
															String FamilyName2;
															int patient_age2;
															String patient_Gender2;
															System.out.println("======================================================");
															System.out.print("\nPrevious information of the Patient : \n\n");
															((Patient)patients.get(patient_index)).Print_Patient();
															System.out.println("\n======================================================");

															System.out.print("\nEnter Title of the Patient [Mr, Ms] : ");
															Title2 = inp6.nextLine();
															System.out.print("\n\nEnter Patient FirstName : ");
															p_firstName2 = inp6.nextLine();
															System.out.print("\nEnter Patient LastName : ");
															p_lastName2 = inp6.nextLine();
															System.out.print("\nEnter Patient Family Name : ");
															FamilyName2 = inp4.nextLine();
															System.out.print("\nEnter Patient Age : ");
															patient_age2 = getInt_Values();
															System.out.print("\nEnter Patinet gender : ");
															patient_Gender2 = inp6.nextLine();

															((Patient)patients.get(patient_index)).set_Title(Title2);
															((Patient)patients.get(patient_index)).set_FirstName(p_firstName2);
															((Patient)patients.get(patient_index)).set_LastName(p_lastName2);
															((Patient)patients.get(patient_index)).set_FamilyName(FamilyName2);
															((Patient)patients.get(patient_index)).set_age(patient_age2);
															((Patient)patients.get(patient_index)).set_gender(patient_Gender2);

															JOptionPane.showMessageDialog(null,"Patient Has Been Modified");
															System.out.print("\n\nModified Information of the Patient\n\n");
															System.out.println("======================================================");
															System.out.println("Current Info of the Patient : ");
															((Patient)patients.get(patient_index)).Print_Patient();
															System.out.println("======================================================");
															System.out.print("\n\n");
															break;


														}
														else if( PATIENT_MODIFY_OPERATIONS == ADDRESS)
														{
															String patient_streetName3;
															String patient_city3;
															int patient_zipCode3;

															int patient_index2;

															System.out.print("\nFor which patient ? ");
															patient_index2 = getInt_Values();
															System.out.println("======================================================");
															System.out.print("\nPrevious information of the Patient : \n\n");
															((Patient)patients.get(patient_index2)).Print_Patient();
															System.out.println("\n======================================================");

															System.out.print("\nEnter Patient StreetName : ");
															patient_streetName3 = inp6.nextLine();
															System.out.print("\nEnter Patient City : ");
															patient_city3 = inp6.nextLine();
															System.out.print("\nEnter Patient Zip Code : ");
															patient_zipCode3 = getInt_Values();
															JOptionPane.showMessageDialog(null,"Patient Has Been Modified");
															Address addr2 = new Address(patient_streetName3 , patient_city3 , patient_zipCode3);
															((Patient)patients.get(patient_index2)).set_address(addr2);
															System.out.println("\n");
															break;

														}
														else if( PATIENT_MODIFY_OPERATIONS == CONDITION)
														{
															String Condition2;
															String Allergies2;

															int patient_index3;

															System.out.print("\nFor which patient ? ");
															patient_index3 = getInt_Values();
															System.out.println("======================================================");
															System.out.print("\nPrevious information of the Patient : \n\n");
															((Patient)patients.get(patient_index3)).Print_Patient(); // vecotor element based on the patient index is being printed.
															System.out.println("======================================================");

															System.out.print("\nEnter Patient's Condition : ");
															Condition2 = inp6.nextLine();
															System.out.print("\nEnter Patient Allergies : ");
															Allergies2 = inp6.nextLine();
															JOptionPane.showMessageDialog(null,"Patient Has Been Modified");
															((Patient)patients.get(patient_index3)).set_Allergies(Allergies2); // vector element's methods are being printed based on the index of the patient
															((Patient)patients.get(patient_index3)).set_Condition(Condition2);
															((Patient)patients.get(patient_index3)).Print_Patient();
															System.out.println("\n");
															break;





														}


													}while( PATIENT_MODIFY_OPERATIONS != RETURN2); // end of patient operations menu

									}else if(PATIENT_FILES_CHOICES == DELETE)
									{
											int patient_index4;

											System.out.print("\nwhich patient Do you Want to Delete ? ");
											patient_index4 = getInt_Values();
											patients.remove(patient_index4);
											JOptionPane.showMessageDialog(null,"Patient Has Been Deleted");



									}
									else if(PATIENT_FILES_CHOICES == SHOW)
									{
										for(int i = 0 ; i < patients.size() ; i++) // this loop iterates based on SIZE() method of arraylist.
										{	System.out.println("****************************************************");
											((Patient)patients.get(i)).Print_Patient();
											System.out.println("****************************************************");
										}
									}


						}while(PATIENT_FILES_CHOICES != RETURN); // end of patient files menu



				}
				else if(MAIN_MENU_CHOICE == INVENTORY)
				{	int INVENTORY_CHOICE;
					final int ADD_MED = 1;
					final int DEL_MED = 2;
					final int SHOW_MED = 3;
					final int INCREASE_MED = 4;
					final int DECREASE_MED = 5;
					final int RETURN4 = 6;

							do
							{
								showInventoryOperations();
								System.out.print("\n\nPlease Enter A Number : ");
								INVENTORY_CHOICE= getInt_Values();
								while(INVENTORY_CHOICE > RETURN4 || INVENTORY_CHOICE < ADD_MED)
									{
											System.out.print("Invalid choice please enter again : ");
											INVENTORY_CHOICE = getInt_Values();
									}
									System.out.println("\n");

								int pk_amount; // amount of PainKillers to be entered
								int av_amount; // amount of AntiVirals to be entered.
								int ab_amount; // amount of AntiBacterials to be entered


								Scanner int_scanner = new Scanner(System.in); // used to enter integer values.
								System.out.print("\n\nHow Many Medicine (PainKillers) do you wish to enter ?");
								pk_amount = getInt_Values();
								System.out.print("\n\nHow Many Medicine (AntiViral) do you wish to enter ?");
								av_amount = getInt_Values();
								System.out.print("\n\nHow Many Medicine (AntiBacterial) do you wish to enter ?");
								ab_amount = getInt_Values();
								INV = new Inventory(pk_amount , av_amount , ab_amount);// this creates an inventory object that takes the allowable amount of each type of medicine to be entered or to be stored in their vectors inside class inventory

									if(INVENTORY_CHOICE == ADD_MED)
									{
										String med_name; // medicine name
										int med_qty; // medicine quanatity
										String med_desc; // medicine description
										String med_conflict; // medicines that the current medicine conflicts with meaning that they affect eachother negatively.
										String prd_date ; // medicine production date
										String exp_date; // medicine expire date
										double price; // medicine price
										double safe_dosage; // medicines safe dosage
										String target_virus; // determines the type of virus that the antiViral goes against.
										String target_bacteria; // determines the type of virus that the antiBacterial goes against.

										Scanner string_input = new Scanner(System.in); // string_input used to input string values.
										for(int i = 0 ; i < pk_amount; i++)
										{
											System.out.println("\n\nEnter Details for PainKiller [" + (i+1) +"]");
											System.out.print("\nEnter Name of the Medicine : ");
											med_name = string_input.nextLine();
											System.out.print("\nEnter Medicine Quantity : ");
											med_qty = getInt_Values();
											System.out.print("\nEnter Medicine Description : ");
											med_desc = string_input.nextLine();
											System.out.print("\nEnter Medicine conflicts : ");
											med_conflict = string_input.nextLine();
											System.out.print("\nEnter Medicine Production Date : ");
											prd_date = string_input.nextLine();
											System.out.print("\nEnter Medicine Expiration Date : ");
											exp_date = string_input.nextLine();
											System.out.print("\nEnter Medicine Safe Dosage : ");
											safe_dosage = getDouble_Values();
											System.out.print("\nEnter Medicine Price : ");
											price = getDouble_Values();

											PainKiller pk_obj = new PainKiller(med_name , med_qty , med_desc , med_conflict , prd_date , exp_date , price , safe_dosage);
											INV.add_Medicine(pk_obj);
											System.out.println("\n");

										}
										for(int i = 0 ; i < av_amount; i++)
										{
											System.out.println("\n\nEnter Details for AntiViral [" + (i+1) +"]");
											System.out.print("\nEnter Name of the Medicine : ");
											med_name = string_input.nextLine();
											System.out.print("\nEnter Medicine Quantity : ");
											med_qty = getInt_Values(); // invokes the exception method
											System.out.print("\nEnter Medicine Description : ");
											med_desc = string_input.nextLine();
											System.out.print("\nEnter Medicine conflicts : ");
											med_conflict = string_input.nextLine();
											System.out.print("\nEnter Medicine Production Date : ");
											prd_date = string_input.nextLine();
											System.out.print("\nEnter Medicine Expiration Date : ");
											exp_date = string_input.nextLine();
											System.out.print("\nEnter Medicine Target Virus : ");
											target_virus = string_input.nextLine();
											System.out.print("\nEnter Medicine Price : ");
											price = getDouble_Values(); //invokes the exception method for floating point values

											AntiViral av_obj = new AntiViral(med_name , med_qty , med_desc , med_conflict , prd_date , exp_date , price , target_virus);
											INV.add_Medicine(av_obj);
											System.out.println("\n");

										}
										for(int i = 0 ; i < ab_amount; i++)
										{
											System.out.println("\n\nEnter Details for AntiBacterial [" + (i+1) +"]");
											System.out.print("\nEnter Name of the Medicine : ");
											med_name = string_input.nextLine();
											System.out.print("\nEnter Medicine Quantity : ");
											med_qty = getInt_Values(); // invokes the exception method
											System.out.print("\nEnter Medicine Description : ");
											med_desc = string_input.nextLine();
											System.out.print("\nEnter Medicine conflicts : ");
											med_conflict = string_input.nextLine();
											System.out.print("\nEnter Medicine Production Date : ");
											prd_date = string_input.nextLine();
											System.out.print("\nEnter Medicine Expiration Date : ");
											exp_date = string_input.nextLine();
											System.out.print("\nEnter Medicine Target Bacteria : ");
											target_bacteria = string_input.nextLine();
											System.out.print("\nEnter Medicine Price : ");
											price = getDouble_Values(); //invokes the exception method for floating point values

											AntiBacterial ab_obj = new AntiBacterial(med_name , med_qty , med_desc , med_conflict , prd_date , exp_date , price , target_bacteria);
											INV.add_Medicine(ab_obj);
											System.out.println("\n");

										}
										JOptionPane.showMessageDialog(null,"All Medicine have been added to the inventory");

									}
									else if(INVENTORY_CHOICE == DEL_MED)
									{

											Scanner med_delete_string_input = new Scanner(System.in); // used for inputting name of the medicine to be deleted.
											String del_pk_name; // holds the name of the painkiller to be deleted.
											System.out.print("\n\nEnter Name of the Medicine to be Deleted : ");
											del_pk_name = med_delete_string_input.nextLine();
											INV.delete_medicine(del_pk_name);
											JOptionPane.showMessageDialog(null,"All Medicine have been added to the inventory");
									}
									else if(INVENTORY_CHOICE == SHOW_MED)
									{
										int SHOW_MEDICINE_CHOICE;
										final int PAINKILLER = 1;
										final int ANTIVIRAL = 2;
										final int ANTIBACTERIAL = 3;
										final int RETURN5 = 4;



												do
												{
													showPrintMedicineChoice();
													System.out.print("\n\nPlease Enter A Number : ");
													SHOW_MEDICINE_CHOICE = getInt_Values();
													while(SHOW_MEDICINE_CHOICE > RETURN5 || SHOW_MEDICINE_CHOICE < PAINKILLER)
														{
																System.out.print("Invalid choice please enter again : ");
																SHOW_MEDICINE_CHOICE = getInt_Values();
														}
													System.out.println("\n");

													if(SHOW_MEDICINE_CHOICE == PAINKILLER)
													{
														INV.show_PainKiller();
														break;
													}
													else if(SHOW_MEDICINE_CHOICE == ANTIVIRAL)
													{
														INV.show_AntiViral();
														break;
													}
													else if(SHOW_MEDICINE_CHOICE == ANTIBACTERIAL)
													{
														INV.show_AntiBacterial();
														break;
													}

												}while(SHOW_MEDICINE_CHOICE != RETURN5); // show medicine option menu
									}
									else if(INVENTORY_CHOICE == INCREASE_MED)
									{
										Scanner intg_input = new Scanner(System.in); // to input integer values.
										Scanner str_input = new Scanner(System.in); // to input string

										String med_name_increase; // holds the name of the medicine to be increased in quantity.
										int amount;

										System.out.print("\n\nEnter Medicine to be Increased : ");
										med_name_increase = str_input.nextLine();
										System.out.print("\nEnter Amount to be Added : ");
										amount = getInt_Values();

										INV.increase_Medicine(med_name_increase , amount);

									}
									else if(INVENTORY_CHOICE == DECREASE_MED)
									{
										Scanner intg_input2 = new Scanner(System.in); // to input integer values.
										Scanner str_input2 = new Scanner(System.in); // to input string

										String med_name_decrease; // holds the name of the medicine to be increased in quantity.
										int amount2;

										System.out.print("\n\nEnter Medicine to be Decreased : ");
										med_name_decrease = str_input2.nextLine();
										System.out.print("\nEnter Amount to be Added : ");
										amount2 = getInt_Values();

										INV.decrease_Medicine(med_name_decrease , amount2);

									}


							}while(INVENTORY_CHOICE != RETURN4); // end of INVENOTRY OPERATIONS MENU
				}
				else if(MAIN_MENU_CHOICE == TAKEORDER)
				{
					Scanner med_string = new Scanner(System.in); // to input string values
					Scanner med_int = new Scanner(System.in); // to input integer values

					String order_med_name; // medicine name
					int order_med_qty; // medicine quanatity
					String order_med_desc; // medicine description
					String order_med_conflict; // medicines that the current medicine conflicts with meaning that they affect eachother negatively.
					String order_prd_date ; // medicine production date
					String order_exp_date; // medicine expire date
					double order_price; // medicine price
					double order_safe_dosage; // medicines safe dosage
					String order_target_virus; // determines the type of virus that the antiViral goes against.
					String order_target_bacteria; // determines the type of virus that the antiBacterial goes against.
					int Pharmacist_Index;//// Holds the pharmacist index of the pharamcist that does the selling process.

					String type_med; // type of medicine that the pharmacist is going to sell
					int amount_to_sell; // amount of medicine that the pharmacist is going to sell.
					System.out.println("Taking Customer Orders : ");
					int amout_iterate; // holds amount of medicine of medicine to be sold
					System.out.print("\n\nHow Much medicine are you going to sell ?");
					int amount_iterate = getInt_Values(); // this method invokes the exception that checks if the value entered is an integer value.
					for(int i = 0 ; i < amount_iterate ; i++)
					{
						System.out.print("\n\nEnter Type of Medicine : [AntiViral , AntiBacterial , PainKiller] ");
						type_med = med_string.nextLine();

						if(type_med == "AntiViral")
						{


							System.out.println("\n\nEnter Details for AntiViral [" + (i+1) +"]");
							System.out.print("\nEnter Name of the AntiViral : ");
							order_med_name = med_string.nextLine();

							order_med_qty = 10; // a default value is given because we want to test the program.

							System.out.print("\nEnter AntiViral Description : ");
							order_med_desc = med_string.nextLine();
							System.out.print("\nEnter AntiViral conflicts : ");
							order_med_conflict = med_string.nextLine();
							System.out.print("\nEnter AntiViral Production Date : ");
							order_prd_date = med_string.nextLine();
							System.out.print("\nEnter AntiViral Expiration Date : ");
							order_exp_date = med_string.nextLine();
							System.out.print("\nEnter AntiViral Target Virus : ");
							order_target_virus = med_string.nextLine();
							System.out.print("\nEnter AntiViral Price : ");
							order_price = getDouble_Values(); //invokes the exception method for floating point values
							System.out.print("\nEnter Quantity : ");
							amount_to_sell = getInt_Values(); // invokes the exception method for integer values

							for(int j = 0 ; j < users.size() ; j++)
							{
								System.out.println((j+1) + ". " +((Pharmacist)users.get(j)).get_First_Name() + " " +((Pharmacist)users.get(j)).get_LastName() );
								System.out.println();
							}
							System.out.print("\n\nPharmacist Index : ");
							Pharmacist_Index = getInt_Values(); // this method invokes exception that checks if the value entred is integer or not.

							AntiViral order_obj = new AntiViral(order_med_name , order_med_qty , order_med_desc , order_med_conflict , order_prd_date , order_exp_date , order_price , order_target_virus);
							((Pharmacist)users.get(Pharmacist_Index)).sell_AntiViral(order_obj ,amount_to_sell);
							JOptionPane.showMessageDialog(null,"Medicine " + order_med_name + " with the following quantity : " + amount_to_sell + " has been sold by : " + ((Pharmacist)users.get(Pharmacist_Index)).get_First_Name() + " " +((Pharmacist)users.get(Pharmacist_Index)).get_LastName() );

						}
						else if(type_med == "AntiBacterial")
						{


							System.out.println("\n\nEnter Details for AntiBacterial [" + (i+1) +"]");
							System.out.print("\nEnter Name of the AntiBacterial : ");
							order_med_name = med_string.nextLine();

							order_med_qty = 10; // a default value is given because we want to test the program.

							System.out.print("\nEnter AntiBacterial Description : ");
							order_med_desc = med_string.nextLine();
							System.out.print("\nEnter AntiBacterial conflicts : ");
							order_med_conflict = med_string.nextLine();
							System.out.print("\nEnter AntiBacterial Production Date : ");
							order_prd_date = med_string.nextLine();
							System.out.print("\nEnter AntiBacterial Expiration Date : ");
							order_exp_date = med_string.nextLine();
							System.out.print("\nEnter AntiBacterial Target Bacteria : ");
							order_target_bacteria = med_string.nextLine();
							System.out.print("\nEnter AntiBacterial Price : ");
							order_price = getDouble_Values(); //invokes the exception method for floating point values
							System.out.print("\nEnter Quantity to  : ");
							amount_to_sell = getInt_Values(); // invokes the exception method for integer values

							for(int j = 0 ; j < users.size() ; j++)
							{
								System.out.println((j+1) + ". " +((Pharmacist)users.get(j)).get_First_Name() + " " +((Pharmacist)users.get(j)).get_LastName() );
								System.out.println();
							}
							System.out.print("\n\nPharmacist Index : ");
							Pharmacist_Index = getInt_Values(); // this method invokes exception that checks if the value entred is integer or not.

							AntiBacterial order_obj2 = new AntiBacterial(order_med_name , order_med_qty , order_med_desc , order_med_conflict , order_prd_date , order_exp_date , order_price , order_target_bacteria);
							((Pharmacist)users.get(Pharmacist_Index)).sell_AntiBacterial(order_obj2 ,amount_to_sell);
							JOptionPane.showMessageDialog(null,"Medicine " + order_med_name + " with the following quantity : " + amount_to_sell + " has been sold by : " + ((Pharmacist)users.get(Pharmacist_Index)).get_First_Name() + " " +((Pharmacist)users.get(Pharmacist_Index)).get_LastName() );

						}
						if(type_med == "PainKiller")
						{


							System.out.println("\n\nEnter Details for PainKiller [" + (i+1) +"]");
							System.out.print("\nEnter Name of the PainKiller : ");
							order_med_name = med_string.nextLine();

							order_med_qty = 10; // a default value is given because we want to test the program.

							System.out.print("\nEnter PainKiller Description : ");
							order_med_desc = med_string.nextLine();
							System.out.print("\nEnter PainKiller conflicts : ");
							order_med_conflict = med_string.nextLine();
							System.out.print("\nEnter PainKiller Production Date : ");
							order_prd_date = med_string.nextLine();
							System.out.print("\nEnter PainKiller Expiration Date : ");
							order_exp_date = med_string.nextLine();
							System.out.print("\nEnter PainKiller Safe Dosage : ");
							order_safe_dosage = getDouble_Values();
							System.out.print("\nEnter PainKiller Price : ");
							order_price = getDouble_Values(); //invokes the exception method for floating point values
							System.out.print("\nEnter Quantity to  : ");
							amount_to_sell = getInt_Values(); // invokes the exception method for integer values

							for(int j = 0 ; j < users.size() ; j++)
							{
								System.out.println((j+1) + ". " +((Pharmacist)users.get(j)).get_First_Name() + " " +((Pharmacist)users.get(j)).get_LastName() );
								System.out.println();
							}
							System.out.print("\n\nPharmacist Index : ");
							Pharmacist_Index = getInt_Values(); // this method invokes exception that checks if the value entred is integer or not.

							PainKiller order_obj3 = new PainKiller(order_med_name , order_med_qty , order_med_desc , order_med_conflict , order_prd_date , order_exp_date , order_price , order_safe_dosage);
							((Pharmacist)users.get(Pharmacist_Index)).sell_PainKiller(order_obj3 ,amount_to_sell);
							JOptionPane.showMessageDialog(null,"Medicine " + order_med_name + " with the following quantity : " + amount_to_sell + " has been sold by : " + ((Pharmacist)users.get(Pharmacist_Index)).get_First_Name() + " " +((Pharmacist)users.get(Pharmacist_Index)).get_LastName() );

						}


					}


							for(int i = 0 ; i < users.size() ; i++) // this for loop prints all the medicine that has been sold by the pharmacist.
							{
								 ((Pharmacist)users.get(i)).show_medicine_sold();
								 System.out.println("\n\n");
							}




				}


		}while(MAIN_MENU_CHOICE != QUIT);

		System.out.println("\n\nThank You For Using Our System ^ _ ^\n\n");




	}
	public static void showMenu() // a static method that is called without object used to display the System menu
	{
		System.out.println("Welcome to Hospital Pharmacy Management System");
		System.out.println("\n\n1.Log In.");
		System.out.println("2.Create New User.");
		System.out.println("3.Patient File Operations.");
		System.out.println("4.Medicine Inventory File Operations.");
		System.out.println("5.Take Customer Order.");
		System.out.println("6.Exit System.");
	}
	public static void showPatientFiles() // a static method to show the operations that can be done on the patient files. (2nd menu)
	{
		System.out.println("1.Add Patient.");
		System.out.println("2.Modify Patient.");
		System.out.println("3.Delete Patient.");
		System.out.println("4.Show All Patient.");
		System.out.println("5.Return to Main Menu");
	}
	public static void showPatientModifyOptions() // a static method that shows what the user can modify about the patient.(3rd menu)
	{
		System.out.println("\n\n1.Personal Details.");
		System.out.println("2.Patient Address.");
		System.out.println("3.Patient Conditions.");
		System.out.println("4.return to Patient Operation Menu");

	}
	public static int getChoice(){  // exception is used here to validate the choice of the first Menu when the user inputs a value must be a number and not a character.

			Scanner inp = new Scanner(System.in);
			try{
				return inp.nextInt();
			}catch(Exception e){
				System.out.println("Not A valid value you must enter a Number : ");
				return getChoice();
			}
	}

	public static double getDouble_Values(){  // exception is used here to validate input of double values in salaries and price.

				Scanner inp = new Scanner(System.in);
				try{
					return inp.nextDouble();
				}catch(Exception e){
					System.out.print("Not A valid value you must enter a Floating Point Number : ");
					return getDouble_Values();
				}
	}
	public static int getInt_Values(){  // exception is used here to validate the choice of the first Menu when the user inputs a value must be a number and not a character.

				Scanner inp = new Scanner(System.in);
				try{
					return inp.nextInt();
				}catch(Exception e){
					System.out.print("Not A valid value you must enter an integer Number : ");
					return getInt_Values();
				}
	}

	public static void print(Employee E)
	{
		//  a static method to show polymorphism when
		//  Print_Employee() is invoked by an Employee object
		//but shows the version of Pharmacist class

		System.out.println("======================================================");
		System.out.println("The following Pharmacist has been created : ");
		E.Print_Employee();
		System.out.print("\n");
		System.out.println("======================================================");
	}
	public static void showInventoryOperations()
	{
		System.out.println("\n\n1.Add Medicine");
		System.out.println("2.Delete Medicine");
		System.out.println("3.Show Medicine");
		System.out.println("4.Increase Medicine Quantity");
		System.out.println("5.Decrease Medicine Quantity");
		System.out.println("6.Return to Main Menu");
	}
	public static void showPrintMedicineChoice() // this method shows a menu containing which type of medicine to print and show all of the medicine inside of it.
	{
		System.out.println("\n\n1.Show PainKiller Medicine");
		System.out.println("2.Show AntiViral Medicine");
		System.out.println("3.Show AntiBacterial Medicine");
		System.out.println("4.Return to Inventory Operations Menu");

	}


}