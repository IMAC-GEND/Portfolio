//REIMARC G. CORPUZ
//BSCPE 2GF
//ASSIGNMENT # 3
//USING VOID FUNCTION & CALL-BY-VALUE AND CALL-BY-REFERENCE
#include <iostream>

//VOID FUNCTION DECLARATION
void introduction();
void costumer_input(int& numcostumer);
//Precondition - numcostumer is the number of costumer.
//Postcondition - the value of numcostumer will return to the main program.
void category_orders();
//Display the diff category of orders in three restaurant.

void order_input(char& category, int numcostumer);
//Precondition - category is to be input by the costumer.
//Postcondition - the value to be input in category will return to the main program.
//				- the return value in costumer used in a condition to appear the size offer in three restaurant.

void pasta_input(int pasta, double& carbonara_price);
//Precondition - pasta is the chosen pasta/noodle os the costumer.
//			   - the costumer will input the value in carbonara_price 
//Postcondition - the value of pasta will display
//				- carbonara_price will return to the main program.
double single_carbonara_total (double price, int costumer);
//single_carbonara_total will compute the product of number of customer times the price of the chosen pasta/noodles.
void single_carbonara(int numcostumer, double single_carbonara_cost, double carbonara_price);
//Precondition - single_carbonara_cost is from the computed product of single order.
//             - value return in numcostumer and carbonara_price
//Postcondition - single_carbonara will display the concluding statement of how much the costumers will pay for single order
//				- also display the given offer of the restaurant depending to the number of costumer.
double half_cost (double single_carbonara_cost, double price);
//Display how much money  will it less for half order.
void direct_halfsize(double carbonara_price, int numcostumer);
//Precondition - return value of carbonara_price.
//			   - return value of numcostumer.
//Postcondition - if the costumer is directly choose the half order depending to the number of costumer
//              - calculate the quotient halfsize price to the number of costumer
//				- it will display the amout of money to be paid by each of the costumer. 
void half_carbonara(double carbonara_price, int numcostumer, double halfsize_carbonara_cost, double single_carbonara_cost);
//Precondition - return value for carbonara price, numcostumer and computed product in single_carbonara_cost and diff in halsize_carbonara_cost
//Postcondition - display the concluding statement for half_carbonara from single order.
double whole_cost (double price);
//Getting the diff from half size order.
void whole_carbonara(int numcostumer, double wholesize_carbonara_cost, double price);
//Precondition - return vale for numcostumer and price.
//             - whole_size_carbonara_cost is from whole_cost.
//Postcondition - display a concluding statement how much money will the costumer add from the half size order
// 				- it will display the amout of money to be paid by each of the costumer.
void change_orderR1(int& another1);
//Precondition - another1 used in a loop to return in choosing the preferred pasta/noodles.
//Postconditon - the program will ask the user if he/she want to select new order for restaurant one.

void bihon_input(int pinoy_favorite, double& bihon_price);
double single_bihon_total (double price, int costumer);
void single_bihon(int numcostumer, double single_bihon_cost, double bihon_price);
double medium_cost (double single_bihon_cost, double price);
void direct_mediumsize(double bihon_price, int numcostumer);
void medium_bihon(double bihon_price, int numcostumer, double mediumsize_bihon_cost, double single_bihon_cost);
double large_cost (double price);
void large_bihon(int numcostumer, double largesize_bihon_cost, double price);
void change_orderR2(int& another2);
//THE SAME PROGRAM FROM RESTAURANT ONE
void merienda(int merienda_bundle);
//Precondition - restaurant 2 offered merienda budle 
//Postcondition - display diff category of merienda bundle
//				- it will compute the total payment for merienda bundle depending to their chosen pancit.

void pancit_bilao_input(int pancit_bilao, double& canton_price);
void single_canton(int numcostumer);
//Precondition - return value from numcostumer
//Postcondition - if the costumer is only one
//				- display the restaurant do not have offer for single order.
void medium_bilao_quantity(int& quan_medium_pancit_bilao, double canton_price, int numcostumer);
void medium_bilao_payment(double canton_price, int quan_medium_pancit_bilao, int numcostumer);
double large_bilao_cost (double canton_price);
void add_in_large(double canton_price, double largesize_canton_cost);
void large_bilao_quantity(int quan_large_pancit_bilao, double canton_price);
void change_orderR3(int& another3);
//THE SAME PROGRAM FROM RESTAURANT ONE

void final_payment(double payment_restaurant1, double payment_restaurant2, double payment_restaurant3);
//Precondition - how much money will the costumer to pay in restaurant 1, 2, and 3.
//Postconditio - display which in this three restaurant is better depending to the price of their menu and number of costumer.
void final_order(int final_pasta_order, int chosen_restaurant, int final_price, int order_time);
//Preconditon - retype the chosen pasta, restaurant, its price and the order time.
//Postcondition - summary the final order of the costumer
//				- for restaurant two it will add the payment for merienda bundle
//				- it will ask the quantity of the merienda bundle
//				- display the total payment of the costumer
//				- display the selected pasta, its price and how large the order is
//				- display if the restaurant is open or close depending the input time of order.

void loop_category(int& again);
//Loop for category of order
//Precondition - again is slected to equal 
//postcondition - will return to the new selection of category w/out running the program again
void restaurant1();
//display the new page and name of restaurant one
void restaurant2();
//display the new page and name of restaurant two
void restaurant3();
//display the new page and name of restaurant three


//MAIN PROGRAM
int main()
{
 	int numcostumer;
 	char category;
 	int again;
 	//variable for all the command
 	
 	int another1;
 	int pasta; 
	double carbonara_price;
	double single_carbonara_cost;
	double halfsize_carbonara_cost;
	double wholesize_carbonara_cost;
	//variable used for restaurant one
	
	int another2;
 	int pinoy_favorite; 
	double bihon_price;
	double single_bihon_cost;
	double mediumsize_bihon_cost;
	double largesize_bihon_cost;
	int merienda_bundle;
	//variable used for restaurant two
	
	int another3;
	int pancit_bilao;
	double canton_price;
	int quan_medium_pancit_bilao;
	double largesize_canton_cost;
	int quan_large_pancit_bilao;
	//variable used for restaurant three
	
	double payment_restaurant1;
	double payment_restaurant2;
	double payment_restaurant3;
	//variable to summarize the selected price in three restaurant
	
	int final_pasta_order;
	int chosen_restaurant;
	double final_price;
	int order_time;
	//varibale used to confirm the order
 	
 	introduction();
 	costumer_input(numcostumer);
 	category_orders();
 	do //Loop for all three restaurant
 	{
 	order_input(category, numcostumer);
 	restaurant1();
 		do //Loop for restaurant 1
 		{
 			pasta_input(pasta, carbonara_price);
 			single_carbonara_cost = single_carbonara_total (carbonara_price, numcostumer);
 			single_carbonara(numcostumer, single_carbonara_cost, carbonara_price);
 			halfsize_carbonara_cost = half_cost (single_carbonara_cost, carbonara_price);
 			direct_halfsize(carbonara_price, numcostumer);
 			half_carbonara(carbonara_price, numcostumer,  halfsize_carbonara_cost, single_carbonara_cost);
 			wholesize_carbonara_cost = whole_cost (carbonara_price);
 			whole_carbonara(numcostumer, wholesize_carbonara_cost, carbonara_price);
 			
 			change_orderR1(another1);
		}
		while (another1==1);
	restaurant2();	
		do //Loop for restaurant two
 		{
 			bihon_input(pinoy_favorite, bihon_price);
 			single_bihon_cost = single_bihon_total (bihon_price, numcostumer);
 			single_bihon(numcostumer, single_bihon_cost, bihon_price);
 			mediumsize_bihon_cost = medium_cost (single_bihon_cost, bihon_price);
 			direct_mediumsize(bihon_price, numcostumer);
 			medium_bihon(bihon_price, numcostumer,  mediumsize_bihon_cost, single_bihon_cost);
 			largesize_bihon_cost = large_cost (bihon_price);
 			large_bihon(numcostumer, largesize_bihon_cost, bihon_price);
 			
 			change_orderR2(another2);
		}
		while (another2==1);
	merienda(merienda_bundle);
	
	restaurant3();
		do //Loop for restaurant three
 		{
 			pancit_bilao_input(pancit_bilao, canton_price);
 			single_canton(numcostumer);
 			medium_bilao_quantity(quan_medium_pancit_bilao, canton_price, numcostumer);
 			medium_bilao_payment(canton_price, quan_medium_pancit_bilao, numcostumer);
 			largesize_canton_cost = large_bilao_cost (canton_price);
 			add_in_large(canton_price, largesize_canton_cost);
 			large_bilao_quantity(quan_large_pancit_bilao, canton_price);
 			
 			change_orderR3(another3);
		}
		while (another3==1);
		
	final_payment(payment_restaurant1, payment_restaurant2, payment_restaurant3);
	final_order(final_pasta_order, chosen_restaurant, final_price, order_time);
	
 	loop_category(again);
 	}
 	while(again==1);
}

//VOID FUNCTION DEFINITION
void introduction()
{
	using namespace std;
	cout << "\n______________________________________________________________________________________________________________________________________";
	cout << "\t\t\t\t\t\t\t\n\t\t\t\t\t\t\tDINING ON A BUDGET\n\t\t\t\t\t\t   WHICH RESTAURANT IS BETTER?";
	cout << "\n______________________________________________________________________________________________________________________________________";
}
void costumer_input(int& numcostumer)
{
	using namespace std;
	cout << "\n\n\tNUMBER OF COSTUMER: ";
	cin >> numcostumer;
}
void category_orders()
{
	using namespace std;
	cout << "\n\tCATEGORY OF ORDERS:"
		   "\n\tA. Pasta/Noodles"
		   "\n\tB. Dish"
		   "\n\tC. Rice"
		   "\n\tD. Drinks";
}
void order_input(char& category, int numcostumer)
{
	using namespace std;
	cout << "\n\n\tCHOOSE THE CATEGORY OF ORDERS: ";
	cin >> category;
	switch (category)
	{
		case 'A': case 'a':
		 	cout << "\tPASTA/NOODLES"
		 	  	    "\n\n\t1. LA COLAZIONE KITCHEN"
		 			"\n\tSINGLE ORDERS: "
		 			"\n\t11. Carbonara					-	147.00"
		 			"\n\t12. Tuna Pasta					-	137.00"
		 			"\n\t13. Pasta Arrabiata 				-	137.00"
		 			"\n\t14. Spanish Sardines Style Pasta		-	147.00";
		 			if (numcostumer<=9)
		 			{
		 				cout << "\n\tHALF SIZE:"
								"\n\t111. Carbonara					-	480.00"
		 				 		"\n\t122. Tuna Pasta					-	470.00"
		 				 		"\n\t133. Pasta Arrabiata 				-	470.00"
		 				 		"\n\t144. Spanish Sardines Style Pasta		-	490.00";
					}
					else 
					{
						cout << "\n\tWHOLE SIZE:"
								"\n\t112. Carbonara					-	900.00"
		 				 		"\n\t123. Tuna Pasta					-	850.00"
		 				 		"\n\t134. Pasta Arrabiata 				-	850.00"
		 				 		"\n\t145. Spanish Sardines Style Pasta		-	950.00";
					}
			cout << "\n\n\t2. ANNEVILLE CAFE & RESTO"
					"\n\tSINGLE ORDERS: "
		 			"\n\tPINOY FAVORITE"
		 			"\n\t21. Seafood Bihon				-	268.00"
		 			"\n\t22. Pancit Lucban				-	258.00"
		 			"\n\t23. Chami					-	238.00";
		 			if (numcostumer<=10)
		 			{
		 				cout << "\n\tMEDIUM SIZE:"
		 						"\n\t211. Seafood Bihon				-	538.00"
		 				 		"\n\t222. Pancit Lucban				-	508.00"
		 				 		"\n\t233. Chami					-	578.00";
					}
					else
					{
						cout << "\n\tLARGE SIZE:"
								"\n\t212. Seafood Bihon				-	707.00"
		 				 		"\n\t223. Pancit Lucban				-	668.00"
		 				 		"\n\t234. Chami					-	618.00";
					}	 
			cout << "\n\n\t3. LUICA AND DAUTHER";
					if (numcostumer==1)
					{
						cout << "\n=>No available solo orders for pasta/noodles";
					}
					if ((numcostumer>=1)&&(numcostumer<=10))
					{
					    cout << "\n\tMEDIUM SIZE:"
					     		"\n\t31. Canton					-	420.00"
					   			"\n\t32. Bihon					-	320.00"
					   			"\n\t33. Chami					-	320.00"
				    			"\n\t34. Pancit Lucban				-	320.00"
				     			"\n\t35. Sotanghon					-	670.00"
					     		"\n\t36. Canton Sotanghon				-	670.00";
					}
					else
					{
						cout <<"\n\tLARGE SIZE:"
								"\n\t312. Canton					-	860.00"
					     		"\n\t323. Bihon					-	650.00"
					     		"\n\t334. Chami					-	650.00"
					     		"\n\t345. Pancit Lucban				-	650.00"
					     		"\n\t356. Sotanghon					-	1,150.00"
					     		"\n\t367. Canton Sotanghon				-	1,150.00"; 
					}
		break;
		// case for category of dish
		case 'B': case 'b':
			cout << "DISH";
		break;
		//case for category of rice
		case 'C': case 'c':
			cout << "Rice";
		break;
		//case for category of drinks
		case 'D': case 'd':
			cout << "Drinks";
		break;
		default:
			cout << "NOT IN THE CATEGORY";
	}
}
void loop_category(int& again)
{
	using namespace std;
	cout << "\n\n\tTYPE 1 IF YES & 0 IF NO"
		 << "\n\tDO YOU WANT TO ORDER OTHER CATEGORY OF FOODS? ";
	cin >> again;
}
void restaurant1()
{
	using namespace std;
	cout << "\n______________________________________________________________________________________________________________________________________";
	cout << "\n\n\tLA COLAZIONE KITCHEN";
}
void change_orderR1(int& another1)
{
	using namespace std;
	cout << "\n\n\tTYPE 1 IF YES & 0 IF NO"
		 << "\n\tANOTHER PASTA/NOODLES? ";
	cin >> another1;
}
void pasta_input(int pasta, double& carbonara_price)
{
	using namespace std;
	cout << "\n\tENTER YOUR CHOSEN PASTA/NOODLES: ";
	cin >> pasta;
	switch (pasta)			 										
	{
		case 11: case 111: case 112:
			cout << "\n\tYOU CHOSE CARBONARA"
			 	 << "\n\tENTER THE PRICE: ";
			cin >> carbonara_price;																																																																											 		 											
		break;
		case 12: 
		break;
		case 13:
		break;
		case 14:
		break;
	}
}
double single_carbonara_total (double price, int costumer)
{
	double total_cost;
	if (price==147)
	{
		total_cost = price * costumer;	
	}
return total_cost;
}
void single_carbonara(int numcostumer, double single_carbonara_cost, double carbonara_price)
{
	using namespace std;
	if (carbonara_price==147)
	{
		cout << "\n\tIf you chose single order of carbonara and you are all " << numcostumer << " people you will pay " << single_carbonara_cost << " pesos.";
	
	if (numcostumer>1)
	
		cout << "\n\tFrom your total payment in single orders, I recommend to order our half size that is only 480 pesos for 5 to 9 people \n\tor our whole size that is 900 pesos for 10 - 15 people.";
	}
}
double half_cost (double single_carbonara_cost, double price)
{
	const double Half_Size = 480;
	double halfsize_cost;	
	if (price==480)
	{
	halfsize_cost = Half_Size - single_carbonara_cost;
	}
return halfsize_cost;
} 
void direct_halfsize(double carbonara_price, int numcostumer)
{
	using namespace std;
	if (carbonara_price==480)
	{
		cout << "\n\tEach of you will pay " << carbonara_price/numcostumer;
	} 
}
void half_carbonara(double carbonara_price, int numcostumer, double halfsize_carbonara_cost, double single_carbonara_cost)
{
	using namespace std;
	if ((carbonara_price==480)&&(numcostumer<=9)&&(numcostumer!=1))
	{
		if (single_carbonara_cost>=480)
		{
			cout.setf(ios::fixed);		
			cout.setf(ios::showpoint);		
			cout.precision(2);
			
			cout << "\n\tFrom " << single_carbonara_cost << " pesos, you can less " << halfsize_carbonara_cost << " pesos and you will only pay 480 pesos.";
		}
	}
} 
double whole_cost (double price)
{	
	double wholesize_cost;
	if (price==900)
	{
	wholesize_cost = price - 480;
	}
return wholesize_cost;
}
void whole_carbonara(int numcostumer, double wholesize_carbonara_cost, double price)
{
	using namespace std;
	if ((price==900)&&(numcostumer>9)&&(numcostumer<=15))
	{
		double individual_cost;
	
		cout.setf(ios::fixed);		
		cout.setf(ios::showpoint);		
		cout.precision(2);
	
		cout << "\n\tBecause you are all " << numcostumer << " people, you may choose our whole size carbonara."
			 << "\n\tYou can only add " << wholesize_carbonara_cost << " pesos from our 480 pesos half size.";
		 
		individual_cost = 900.00/numcostumer;
		cout << "\n\tFor 900 pesos each of you will pay " << individual_cost << " pesos.";
	}
}





void restaurant2()
{
	using namespace std;
	cout << "\n______________________________________________________________________________________________________________________________________";
	cout << "\n\n\tANNEVILLE CAFE & RESTO";	
}
void change_orderR2(int& another2)
{
	using namespace std;
	cout << "\n\n\tTYPE 1 IF YES & 0 IF NO"
		 << "\n\tANOTHER PASTA/NOODLES? ";
	cin >> another2;
}
void bihon_input(int pinoy_favorite, double& bihon_price)
{
	using namespace std;
	cout << "\n\tENTER YOUR CHOSEN PINOY FAVORITE: ";
	cin >> pinoy_favorite;
	switch (pinoy_favorite)			 										
	{
		case 21: case 211: case 212:
			cout << "\n\tSEAFOOD BIHON"
			 	 << "\n\tENTER THE PRICE: ";
			cin >> bihon_price;																																																																											 		 											
		break;
		case 22: 
		break;
		case 23:
		break;
	}
}
double single_bihon_total (double price, int costumer)
{
	double total_cost;
	if (price==268)
	{
		total_cost = price * costumer;	
	}
return total_cost;
}
void single_bihon(int numcostumer, double single_bihon_cost, double bihon_price)
{
	using namespace std;
	if (bihon_price==268)
	{
		cout << "\n\tIf you chose single order of Seafood Bihon and you are all " << numcostumer << " people you will pay " << single_bihon_cost << " pesos.";
	
	if (numcostumer>1)
	
		cout << "\n\tFrom your total payment in single orders, \n\tI recommend to order our medium size that is only 538 pesos for 8 to 10 people \n\tor our large size that is 707 pesos for 11 - 14 people.";
	}
}
double medium_cost (double single_bihon_cost, double price)
{
	const double Medium_Size = 538;
	double mediumsize_cost;	
	if (price==538)
	{
	mediumsize_cost = Medium_Size - single_bihon_cost;
	}
return mediumsize_cost;
} 
void direct_mediumsize(double bihon_price, int numcostumer)
{
	using namespace std;
	if (bihon_price==538)
	{
		cout << "\n\tEach of you will pay " << bihon_price/numcostumer;
	} 
}
void medium_bihon(double bihon_price, int numcostumer, double mediumsize_bihon_cost, double single_bihon_cost)
{
	using namespace std;
	if ((bihon_price==538)&&(numcostumer<=10)&&(numcostumer!=1))
	{
		if (single_bihon_cost>=538)
		{
			cout.setf(ios::fixed);		
			cout.setf(ios::showpoint);		
			cout.precision(2);
			
			cout << "\n\tFrom " << single_bihon_cost << " pesos, you can less " << mediumsize_bihon_cost << " pesos and you will only pay 538 pesos.";
		}
	}
} 
double large_cost (double price)
{	
	double largesize_cost;
	if (price==707)
	{
	largesize_cost = price - 538;
	}
return largesize_cost;
}
void large_bihon(int numcostumer, double largesize_bihon_cost, double price)
{
	using namespace std;
	if ((price==707)&&(numcostumer>10)&&(numcostumer<=14))
	{
		double individual_cost;
	
		cout.setf(ios::fixed);		
		cout.setf(ios::showpoint);		
		cout.precision(2);
	
		cout << "\n\tBecause you are all " << numcostumer << " people, you may choose our whole size Seafood Bihon."
			 << "\n\tYou can only add " << largesize_bihon_cost << " pesos from our 538 pesos medium size.";
		 
		individual_cost = 707.00/numcostumer;
		cout << "\n\tFor 707 pesos each of you will pay " << individual_cost << " pesos.";
	}
}
void merienda(int merienda_bundle)
{
	using namespace std;
	cout << "\n\n\tWE ALSO HAVE MERIENDA BUNDLE IF YOU WANT!!"
			"\n\t201. A (Chami/Pancit Lucban + Fried Chicken + Juice"
			"\n\t202. B (Chami/Pancit Lucban + Margerita Pizza + Juice"
			"\n\t203. C (Fries/Cheese Stick Lumpia + Spaghetti Bolognese + Juice";
	cout << "\n\n\tTYPE THE NO. OF MERIENDA BUNDLE IF YES, AND TYPE 000 IF NO"
			"\n\tDO YOU WANT OUR OFFER? ";
	cin >> merienda_bundle;
	switch (merienda_bundle)
	{
		int pancit;
		double pancit_price;
		case 201:
			cout << "\n\t1. Chami				-	238.00"
					"\n\t2. Pancit Lucban			-	258.00"
					"\n\t3. Fried Chiken				-	50.00"
					"\n\t4. Juice				-	35.00";
			cout << "\n\n\tCHAMI OR PANCIT LUCBAN? ";
			cin >> pancit;
			cout << "\tENTER THE PRICE: ";
			cin >> pancit_price;
				if (pancit==1)
				{
					cout << "\n\t1. Chami				-	238.00";
					cout << "\n\tYou will pay " << pancit_price + 50 + 35 << " pesos.";
				}
				else
				{
					cout << "\n\t2. Pancit Lucban				-	258.00";
					cout << "\n\tYou will pay " << pancit_price + 50 + 35 << " pesos.";
				}
		break;
		case 202:
			cout << "\n\t1. Chami			-	238.00"
					"\n\t2. Pancit Lucban		-	258.00"
					"\n\t3. Margerita Pizza		-	78.00"
					"\n\t4. Juice			-	35.00";
			cout << "\n\n\tCHAMI OR PANCIT LUCBAN? ";
			cin >> pancit;
			cout << "\tENTER THE PRICE: ";
			cin >> pancit_price;
				if (pancit==1)
				{
					cout << "\n\t1. Chami			-	238.00";
					cout << "\n\tYou will pay " << pancit_price + 78 + 35 << " pesos.";
				}
				else
				{
					cout << "\n\t2. Pancit Lucban				-	258.00";
					cout << "\n\tYou will pay " << pancit_price + 78 + 35 << " pesos.";
				}
		break;
		case 203:
			cout << "\n\t1. Fries			-	100.00"
					"\n\t2. Cheese Stick Lumpia		-	85.00"
					"\n\t3. Spaghetti Bolognese		-	120.00"
					"\n\t4. Juice			-	35.00";
			cout << "\n\n\tFRIES OR LUMPIA? ";
			cin >> pancit;
			cout << "\tENTER THE PRICE: ";
			cin >> pancit_price;
				if (pancit==1)
				{
					cout << "\n\t1. Fries				-	100.00";
					cout << "\n\tYou will pay " << pancit_price + 120 + 35 << " pesos.";
				}
				else
				{
					cout << "\n\t2. Cheese Stick Lumpia				-	85.00";
					cout << "\n\tYou will pay " << pancit_price + 120 + 35 << " pesos.";
				}
		break;
		default:
			cout << "\n\tCONTINUE FOR YOUR ORDERS";
	}
}



void restaurant3()
{
	using namespace std;
	cout << "\n\n______________________________________________________________________________________________________________________________________";
	cout << "\n\n\tLUICA AND DAUTHER";
}
void change_orderR3(int& another3)
{
	using namespace std;
	cout << "\n\n\tTYPE 1 IF YES & 0 IF NO"
		 << "\n\tANOTHER PASTA/NOODLES? ";
	cin >> another3;
}
void pancit_bilao_input(int pancit_bilao, double& canton_price)
{
	using namespace std;
	cout << "\n\tENTER YOUR CHOSEN PANCIT BILAO: ";
	cin >> pancit_bilao;
	switch (pancit_bilao)			 										
	{
		case 31: case 312:
			cout << "\n\tCANTON"
			 	 << "\n\tENTER THE PRICE: ";
			cin >> canton_price;																																																																											 		 											
	   break;
       case 22: 
	   break;
	   case 23:
       break;
	}
}
void single_canton(int numcostumer)
{
	using namespace std;
	if (numcostumer==1)
	{
		cout << "\n\tWE DONT HAVE A SINGLE ORDER FOR PANCIT CANTON!!";
	}
}
void medium_bilao_quantity(int& quan_medium_pancit_bilao, double canton_price, int numcostumer)
{
	using namespace std;
	if ((canton_price==420)&&(numcostumer<=10)&&(numcostumer>=1))
	{
		cout << "\tQUANTITY OF MEDIUM SIZE PANCIT BILAO: ";
		cin >> quan_medium_pancit_bilao;
	}
}
void medium_bilao_payment(double canton_price, int quan_medium_pancit_bilao, int numcostumer)
{
	using namespace std;
	if ((canton_price==420)&&(numcostumer<=10)&&(numcostumer>=1))
	{
	double medium_total_payment;
	medium_total_payment = canton_price*quan_medium_pancit_bilao;
	
	cout << "\tYou will pay " << medium_total_payment << " pesos."
			"\n\n\tTry our large size bilao that is good for 11 - 20 people."
			"\n\tLARGE SIZE:"
			"\n\t312. Canton					-	860.00"
			"\n\t323. Bihon					-	650.00"
			"\n\t334. Chami					-	650.00"
			"\n\t345. Pancit Lucban				-	650.00"
			"\n\t356. Sotanghon					-	1,150.00"
			"\n\t367. Canton Sotanghon				-	1,150.00"; 
	}
}
double large_bilao_cost (double canton_price)
{
	double large_bilao;
	if (canton_price==860)
	{
	large_bilao = canton_price - 420;
	}
return large_bilao;
}
void add_in_large(double canton_price, double largesize_canton_cost)
{
	using namespace std;
	if (canton_price==860)
	{
		cout << "\n\tYou can only add " << largesize_canton_cost << " pesos from our 420 pesos medium size.";
	}
}
void large_bilao_quantity(int quan_large_pancit_bilao, double canton_price)
{
	using namespace std;
	if (canton_price==860)
	{
		double large_total_payment;
		cout << "\n\n\tHOW MANY OF LARGE SIZE BILAO WILL YOU ORDER? ";
		cin >> quan_large_pancit_bilao;
		
		large_total_payment = 860*quan_large_pancit_bilao;
		cout << "\n\tFor " << quan_large_pancit_bilao << " large size of bilao, you will pay " << large_total_payment << " pesos.";
	}
}
void final_payment(double payment_restaurant1, double payment_restaurant2, double payment_restaurant3)
{
	using namespace std;
	cout << "\n\n______________________________________________________________________________________________________________________________________";
	cout << "\n\n\tENTER YOUR TOTAL PAYMENT FOR RESTAURANT 1: ";
	cin >> payment_restaurant1;
	cout << "\tENTER YOUR TOTAL PAYMENT FOR RESTAURANT 2: ";
	cin >> payment_restaurant2;
	cout << "\tENTER YOUR TOTAL PAYMENT FOR RESTAURANT 3: ";
	cin >> payment_restaurant3;	
	if ((payment_restaurant1<payment_restaurant2)&&(payment_restaurant1<payment_restaurant3))
	{
		cout << "\n\n\tTHE RESTAURANT THAT YOU CAN LESS PAYMENT IS LA COLAZIONE KITCHEN.";
	}
	if ((payment_restaurant2<payment_restaurant1)&&(payment_restaurant2<payment_restaurant3))
	{
		cout << "\n\n\tTHE RESTAURANT THAT YOU CAN LESS PAYMENT IS ANNEVILLE CAFE & RESTO.";
	}	
	if ((payment_restaurant3<payment_restaurant1)&&(payment_restaurant3<payment_restaurant2))
	{
		cout << "\n\n\tTHE RESTAURANT THAT YOU CAN LESS PAYMENT IS LUICA AND DAUTHER.";
	}		
}
void final_order(int final_pasta_order, int chosen_restaurant, int final_price, int order_time)
{
	using namespace std;
	cout << "\n\n______________________________________________________________________________________________________________________________________";
	cout << "\n\n\tWHAT IS YOUR FINAL ORDER?"
		 << "\n\tENTER YOUR CHOSEN PASTA/NOODLES: ";
	cin >> final_pasta_order;
	cout << "\tENTER YOUR CHOSEN RESTAURANT: ";
	cin >> chosen_restaurant;
	
	double bundle;
	int bundle_quantity;
	double total_payment;
	if (chosen_restaurant==2)
	{
		cout << "\tENTER THE PRICE OF MERIENDA BUNDLE: ";
		cin >> bundle;
		cout << "\tQUANTITY: ";
		cin >> bundle_quantity;
	}
	cout << "\tENTER THE PRICE OF PASTA/NOODLES: "; 
	cin >> final_price;
	switch (final_price)
	{
		case 147:
			cout << "\n\tLA COLAZIONE KITCHEN\n\tSINGLE ORDER : Carbonara		-	P 147.00";
		break;
		case 480:
			cout << "\n\tLA COLAZIONE KITCHEN\n\tHALF ORDER : Carbonara		-		P 480.00";
		break;
		case 900:
			cout << "\n\tLA COLAZIONE KITCHEN\n\tWHOLE ORDER : Carbonara		-		P 900.00";
		break;
		case 268:
			cout << "\n\tANNEVILLE CAFE & RESTO\n\tSINGLE ORDER : Seafood Bihon		-	P 268.00";
		break;
		case 538:
			cout << "\n\tANNEVILLE CAFE & RESTO\n\tMEDIUM ORDER : Seafood Bihon		-		P 538.00";
		break;
		case 707:
			cout << "\n\tANNEVILLE CAFE & RESTO\n\tLARGE ORDER : Seafood Bihon		-		P 707.00";
	}
					
	total_payment = (bundle*bundle_quantity) + final_price;
	cout << "\n\tYOU WILL PAY THE TOTAL OF " << total_payment << " pesos";
						
	cout << "\n\n\tORDER TIME: ";
	cin >> order_time;
	if (chosen_restaurant==1)
	{
		if ((order_time>=10)&&(order_time<=12)||(order_time>=1)&&(order_time<=6))
		{
			cout << "\n\tWE ARE OPEN!!\n\t10:00 AM - 6:00 PM (Mon - Sat)\n\t#3 Juarez St. Brgy. V. Lucena city\n\tCONTACT US: #09956285274";
		}
		else
		{
		cout << "\n\tWE ARE CLOSE!!";	
		}						
	}
	if (chosen_restaurant==2)
	{
		if ((order_time>=11)&&(order_time<=12)||(order_time>=1)&&(order_time<=8))
		{								
			cout << "\n\tWE ARE OPEN!!\n\t11:00 AM - 8:00 PM (Mon - Sun)\n\tLot A and B National Road, Gulang-Gulang, Lucena City\n\tCONTACT US: #(042795) 6135";
		}
		else
		{
			cout << "\n\tWE ARE CLOSE!!";	
		}
	}
	if (chosen_restaurant==3)
	{
		if ((order_time>=7)&&(order_time<=12)||(order_time>=1)&&(order_time<=9))
		{
			cout << "\n\tWE ARE OPEN!!\n\t7:00 AM - 9:00 PM (Mon - Sun)\n\tBrgy. Gulang Gulang Lucena City\n\tCONTACT US: #(042) 710 7543";
		}
		else
		{
			cout << "\n\tWE ARE CLOSE!!";	
		}
	}
}