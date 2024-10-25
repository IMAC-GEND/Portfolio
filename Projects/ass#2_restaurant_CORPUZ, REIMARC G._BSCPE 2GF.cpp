//CORPUZ, REIMARC G.
//BS CPE 2GF
//ASSIGMENT # 2
#include <iostream>
using namespace std;

//function declaration for restaurant 1, 2, 3
double single_cost (double price, int costumer);
double half_cost (double single_carbonara_cost);
double whole_cost (double carbonara_price);
//for restaurant 1 - Carbonara
//getting the price of carbonara if the costumer chose single order
//what will be the price if the costumer chose half and whole order rather than single order.

double medium_cost (double single_bihon_cost);
double large_cost (double bihon_price);
//for restaurant 2 - Seafood Bihon
//getting the less payment if the costumer chose medium size
//getting the additional payment from medium size.

double large_bilao_cost (double canton_price);
//for restaurant 3 - Pancit Canton
//geeting the additional payment for large bilao

int main()
{
	//variables
	int numcostumer;
	char category;
	int again;
	int restaurant;
	//variables for first block of main program
	
	int pasta;
	double carbonara_price; double single_carbonara_cost; double halfsize_carbonara_cost; double wholesize_carbonara_cost;
	int final_pasta_order; int final_price;
	int chosen_restaurant; int order_time; 
	//variables for restaurant 1
	//variables for Carbonara
	
	int pinoy_favorite;
	double bihon_price;double single_bihon_cost; double mediumsize_bihon_cost; double largesize_bihon_cost;
	int merienda;
	double bundle; double bundle_quantity;
	double total_payment;
	//variables for restaurant 2
	//variables for Pancit Bihon
	//additional variables for bundle because of what the restaurant offers.
	
	int pancit_bilao;
	double canton_price; int quan_medium_pancit_bilao; double quan_large_bilao; double largesize_canton_cost;
	//variables for restaurant 3
	//variable for Pancit Canton
	
	double payment_restaurant1;
	double payment_restaurant2;
	double payment_restaurant3;

	
 	cout << "\n\nNUMBER OF COSTUMER: ";
	cin >> numcostumer;
	
	//diff category of menu for three restaurant
	cout << "\nCATEGORY OF ORDERS:"
		   "\nA. Pasta/Noodles"
		   "\nB. Dish"
		   "\nC. Rice"
		   "\nD. Drinks";
//do while statement used for choosing another category of orders
do
{		 
	cout << "\n\nCHOOSE THE CATEGORY OF ORDERS: ";
	cin >> category;
		switch (category)
		 	{
		 		//case for category of pasta
		 		case 'A': case 'a':
		 			//single order or good for only one people
		 			cout << "PASTA/NOODLES"
		 				   "\n\n1. LA COLAZIONE KITCHEN"
		 				   "\nSINGLE ORDERS: "
		 				   "\n11. Carbonara				-	147.00"
		 				   "\n12. Tuna Pasta				-	137.00"
		 				   "\n13. Pasta Arrabiata 			-	137.00"
		 				   "\n14. Spanish Sardines Style Pasta	-	147.00";
		 				 	if (numcostumer<=9)
		 				 	{
		 				 		//offers of restaurant 1
		 				 		cout << "\nHALF SIZE:"
								  	   "\n111. Carbonara				-	480.00"
		 				 			   "\n122. Tuna Pasta				-	470.00"
		 				 			   "\n133. Pasta Arrabiata 			-	470.00"
		 				 			   "\n144. Spanish Sardines Style Pasta	-	490.00";
							}
							else 
							{
								cout << "\nWHOLE SIZE:"
								  	   "\n112. Carbonara				-	900.00"
		 				 			   "\n123. Tuna Pasta				-	850.00"
		 				 			   "\n134. Pasta Arrabiata 			-	850.00"
		 				 			   "\n145. Spanish Sardines Style Pasta	-	950.00";
							}
		 			//single order of pasta for restaurant 2	 
					cout << "\n\n2. ANNEVILLE CAFE & RESTO"
							"\nSINGLE ORDERS: "
		 				    "\nPINOY FAVORITE"
		 				    "\n21. Seafood Bihon				-	268.00"
		 				    "\n22. Pancit Lucban				-	258.00"
		 				    "\n23. Chami					-	238.00";
		 					if (numcostumer<=10)
		 					{
		 						//size offer
		 						// there is also another offer inside the block of restaurant 2
		 						cout << "\nMEDIUM SIZE:"
		 							    "\n211. Seafood Bihon				-	538.00"
		 				 			    "\n222. Pancit Lucban				-	508.00"
		 				 			    "\n233. Chami					-	578.00";
							}
							else
							{
								cout << "\nLARGE SIZE:"
									    "\n212. Seafood Bihon				-	707.00"
		 				 			    "\n223. Pancit Lucban				-	668.00"
		 				 			    "\n234. Chami					-	618.00";
							}
		 			//there is no available orders for one people	 
					cout << "\n\n3. LUICA AND DAUTHER";
					if (numcostumer==1)
					{
					     cout << "\n=>No available solo orders for pasta/noodles";
					}
					else
					{
					}
							//offers of restaurant 3
					     	if ((numcostumer>=1)&&(numcostumer<=10))
					     	{
					     		cout << "\nMEDIUM SIZE:"
					     			    "\n31. Canton					-	420.00"
					     			    "\n32. Bihon					-	320.00"
					     			    "\n33. Chami					-	320.00"
					     			    "\n34. Pancit Lucban				-	320.00"
					     			    "\n35. Sotanghon					-	670.00"
					     			    "\n36. Canton Sotanghon				-	670.00";
							}
							else
							{
								cout <<"\nLARGE SIZE:"
									   "\n312. Canton					-	860.00"
					     			   "\n323. Bihon					-	650.00"
					     			   "\n334. Chami					-	650.00"
					     			   "\n345. Pancit Lucban				-	650.00"
					     			   "\n356. Sotanghon					-	1,150.00"
					     			   "\n367. Canton Sotanghon				-	1,150.00"; 
							}		 							
			 								
					cout << "\n____________________________________________________________________________________________________________";
			 								
			 		cout << "\n\nLA COLAZIONE KITCHEN";										 
			 		int another1; //variable that scope within only in restaurant 1
			 									
					//do-while loop to change the chosen pasta/noodles 
					do
			 		{
			 			cout << "\nENTER YOUR CHOSEN PASTA/NOODLES: ";
			 			cin >> pasta;
			 				switch (pasta)			 										
			 					{
			 						case 11: case 111: case 112:
			 							cout << "\nYOU CHOSE CARBONARA"
			 								 << "\nENTER THE PRICE: ";
			 							cin >> carbonara_price;																																																																											 		 											
			 						break;
			 						case 12: 
			 						break;
			 						case 13:
			 						break;
			 						case 14:
			 						break;
								}
							if (carbonara_price==147)
								{
									single_carbonara_cost = single_cost (carbonara_price, numcostumer);	
									//function call for computing the total payment of the number of costumers
												
												
									cout << "\nIf you chose single order of carbonara and you are all " << numcostumer << " people you will pay " << single_carbonara_cost << " pesos.";
									if (numcostumer>1)
										cout << "\nFrom your total payment in single orders, I recommend to order our half size that is only 480 pesos for 5 to 9 people \nor our whole size that is 900 pesos for 10 - 15 people.";
								}
								//for half size of carbonara
							if ((carbonara_price==480)&&(numcostumer<=9)&&(numcostumer!=1))
								{
									double individual_cost;
									if (single_carbonara_cost>=480)
										{
											halfsize_carbonara_cost = half_cost (single_carbonara_cost);
											//function call for computing the less payment from choosing half size carbonara	
												
											cout.setf(ios::fixed);		
											cout.setf(ios::showpoint);		
											cout.precision(2); //having two decimal point
																
											//declare the answer or function call for half size carbonara
											cout << "\nFrom " << single_carbonara_cost << " pesos, you can less " << halfsize_carbonara_cost << " pesos and you will only pay 480 pesos.";
															
											//ass statement to find what will be the payment of each costumer from their computed payment
											individual_cost = carbonara_price/numcostumer;
											cout << "\nAnd each of you will only pay " << individual_cost << " pesos.";
										}
								}
							//for whole size of carbonara
							if ((carbonara_price==900)&&(numcostumer>9)&&(numcostumer<=15))
								{
									double individual_cost;
									wholesize_carbonara_cost = whole_cost (carbonara_price);
									//function call for computing the less payment from choosing whole size carbonara
														
									cout.setf(ios::fixed);		
									cout.setf(ios::showpoint);		
									cout.precision(2);
														
									cout << "\nBecause you are all " << numcostumer << " people, you may choose our whole size carbonara."
										 << "\nYou can only add " << wholesize_carbonara_cost << " pesos from our 480 pesos half size.";
														
									//ass statement to get what will be the payment of every costumer for whole size carbonara
									individual_cost = 900/numcostumer;
									cout << "\nFor 900 pesos each of you cost " << individual_cost << " pesos.";
								}
						//command to return in choosing another pasta/noodles in restaurant 1
						cout << "\n\nTYPE 1 IF YES & 0 IF NO"
						     << "\nANOTHER PASTA/NOODLES? ";
						cin >> another1;
					}
			 		while (another1==1);
											
											
					cout << "\n____________________________________________________________________________________________________________";	
					//the same code from restaurant 1
					//but the diff is that restaurant two has additional offer for bundle meal (line 312)
							
					cout << "\nANNEVILLE CAFE & RESTO";
			 																	 
			 		int another2;
			 		do
			 		{
			 			cout << "\nENTER YOUR CHOSEN PINOY FAVORITE: ";
			 			cin >> pinoy_favorite;
			 				switch (pinoy_favorite)			 										
			 					{
			 						case 21: case 211: case 212:
			 							cout << "\nSEAFOOD BIHON"
			 								 << "\nENTER THE PRICE: ";
			 							cin >> bihon_price;																																																																											 		 											
			 						break;
			 						case 22: 
			 						break;
			 						case 23:
			 						break;
								}
					if (bihon_price==268)
						{
							single_bihon_cost = single_cost (bihon_price, numcostumer);													
																				
							cout << "\nIf you chose single order of Seafood Bihon and you are all " << numcostumer << " people you will pay " << single_bihon_cost << " pesos.";
							if (numcostumer>1)
								cout << "\nFrom your total payment in single orders, \nI recommend to order our medium size that is only 538 pesos for 8 to 10 people \nor our large size that is 707 pesos for 11 - 14 people.";
						}
					if ((bihon_price==538)&&(numcostumer<=10)&&(numcostumer!=1))
						{
							double individual_cost;
							if (single_bihon_cost>=538)
								{
									mediumsize_bihon_cost = medium_cost (single_bihon_cost);	
												
									cout.setf(ios::fixed);		
									cout.setf(ios::showpoint);		
									cout.precision(2);
														
									cout << "\nFrom " << single_bihon_cost << " pesos, you can less " << mediumsize_bihon_cost << " pesos and you will only pay 538 pesos.";
															
									individual_cost = bihon_price/numcostumer;
									cout << "\nAnd each of you will only pay " << individual_cost << " pesos.";
								}
						}
					if ((bihon_price==707)&&(numcostumer>10)&&(numcostumer<=14))
						{
							double individual_cost;
							largesize_bihon_cost = large_cost (bihon_price);
														
							cout.setf(ios::fixed);		
							cout.setf(ios::showpoint);		
							cout.precision(2);
														
							cout << "\nBecause you are all " << numcostumer << " people, you may choose our large size Seafood Bihon."
								 << "\nYou can only add " << largesize_bihon_cost << " pesos from our 538 pesos medium size.";
							individual_cost = 707/numcostumer;
							cout << "\nFor 707 pesos each of you cost " << individual_cost << " pesos.";
						}
													
						cout << "\n\nTYPE 1 IF YES & 0 IF NO"
							 << "\nANOTHER PASTA/NOODLES? ";
						cin >> another2;
					}
					while (another2==1);
											
					//additional program for offering merienda bundle of restaurant 2
					cout << "\n\nWE ALSO HAVE MERIENDA BUNDLE IF YOU WANT!!"
							"\n201. A (Chami/Pancit Lucban + Fried Chicken + Juice"
							"\n202. B (Chami/Pancit Lucban + Margerita Pizza + Juice"
							"\n203. C (Fries/Cheese Stick Lumpia + Spaghetti Bolognese + Juice";
					cout << "\n\nTYPE THE NO. OF MERIENDA BUNDLE IF YES, AND TYPE 000 IF NO"
							"\nDO YOU WANT OUR OFFER? ";
					cin >> merienda;
											
					//this switch statement scope only for restaurant 2
					switch (merienda)
						{
							int pancit;
							double pancit_price;
							case 201:
								cout << "\n1. Chami				-	238.00"
										"\n2. Pancit Lucban			-	258.00"
										"\n3. Fried Chiken				-	50.00"
										"\n4. Juice				-	35.00";
								cout << "\n\nCHAMI OR PANCIT LUCBAN? ";
								cin >> pancit;
								cout << "ENTER THE PRICE: ";
								cin >> pancit_price;
								if (pancit==1)
									{
										cout << "\n1. Chami				-	238.00";
										cout << "\nYou will pay " << pancit_price + 50 + 35 << " pesos.";
									}
									else
									{
										cout << "\n2. Pancit Lucban				-	258.00";
										cout << "\nYou will pay " << pancit_price + 50 + 35 << " pesos.";
									}
							break;
							case 202:
								cout << "\n1. Chami				-	238.00"
										"\n2. Pancit Lucban		-	258.00"
										"\n3. Margerita Pizza		-	78.00"
										"\n4. Juice			-	35.00";
								cout << "\n\nCHAMI OR PANCIT LUCBAN? ";
								cin >> pancit;
								cout << "ENTER THE PRICE: ";
								cin >> pancit_price;
								if (pancit==1)
									{
										cout << "\n1. Chami			-	238.00";
										cout << "\nYou will pay " << pancit_price + 78 + 35 << " pesos.";
									}
									else
									{
										cout << "\n2. Pancit Lucban				-	258.00";
										cout << "\nYou will pay " << pancit_price + 78 + 35 << " pesos.";
									}
							break;
							case 203:
								cout << "\n1. Fries			-	100.00"
										"\n2. Cheese Stick Lumpia		-	85.00"
										"\n3. Spaghetti Bolognese		-	120.00"
										"\n4. Juice			-	35.00";
								cout << "\n\nFRIES OR LUMPIA? ";
								cin >> pancit;
								cout << "ENTER THE PRICE: ";
								cin >> pancit_price;
								if (pancit==1)
									{
										cout << "\n1. Fries				-	100.00";
										cout << "\nYou will pay " << pancit_price + 120 + 35 << " pesos.";
									}
									else
									{
										cout << "\n2. Cheese Stick Lumpia				-	85.00";
										cout << "\nYou will pay " << pancit_price + 120 + 35 << " pesos.";
									}
							break;
													
							//default line if the costumer dont want to order merienda bundle
							default:
								cout << "\nCONTINUE FOR YOUR ORDERS";
						}
											
										
					cout << "\n____________________________________________________________________________________________________________";
					cout << "\nLUICA AND DAUTHER";
																					 
			 		int another3; //it is ok to have the same name of variable but make it sure that it is in diff block
			 		do
			 		{
			 			cout << "\nENTER YOUR CHOSEN PANCIT BILAO: ";
			 			cin >> pancit_bilao;
			 			switch (pancit_bilao)			 										
			 				{
			 					case 31: case 312:
			 						cout << "\nCANTON"
			 							 << "\nENTER THE PRICE: ";
			 						cin >> canton_price;																																																																											 		 											
			 					break;
			 					case 22: 
			 					break;
			 					case 23:
			 					break;
							}
					if (numcostumer==1)
						{
							cout << "\nWE DONT HAVE A SINGLE ORDER FOR PANCIT CANTON!!";
						}
					if ((canton_price==420)&&(numcostumer<=10)&&(numcostumer>=1))
						{
							double medium_total_payment;
							cout << "\nQUANTITY OF MEDIUM SIZE PANCIT BILAO: ";
							cin >> quan_medium_pancit_bilao;
														
							medium_total_payment = canton_price*quan_medium_pancit_bilao;
							cout << "\nYou will pay " << medium_total_payment << " pesos."
								    "\nTry our large size bilao that is good for 11 - 20 people."
									"\nLARGE SIZE:"
								 	"\n312. Canton					-	860.00"
					     			"\n323. Bihon					-	650.00"
					     			"\n334. Chami					-	650.00"
					     			"\n345. Pancit Lucban				-	650.00"
					     			"\n356. Sotanghon					-	1,150.00"
					     			"\n367. Canton Sotanghon				-	1,150.00"; 
														
						}
					if (canton_price==860)
						{
							double large_total_payment;
							largesize_canton_cost = large_bilao_cost (canton_price);
							//function call for getting the diff of lerge bilao from medium bilao
																											
							cout << "\n\nYou can only add " << largesize_canton_cost << " pesos from our 420 pesos medium size.";
							cout << "\nHOW MANY OF LARGE SIZE BILAO WILL YOU ORDER? ";
							cin >> quan_large_bilao;
														
							//ass statement to get the total payment depending the number of costumers
							large_total_payment = 860*quan_large_bilao;
							cout << "\nFor " << quan_large_bilao << " large size of bilao, you will pay " << large_total_payment << " pesos.";
						}
						cout << "\n\nTYPE 1 IF YES & 0 IF NO"
							 << "\nANOTHER PASTA/NOODLES? ";
						cin >> another3;
					}
				while (another3==1);
					
			 	  	cout << "\n____________________________________________________________________________________________________________";
											
					cout << "\n\nENTER YOUR TOTAL PAYMENT FOR RESTAURANT 1: ";
					cin >> payment_restaurant1;
					cout << "ENTER YOUR TOTAL PAYMENT FOR RESTAURANT 2: ";
					cin >> payment_restaurant2;
					cout << "ENTER YOUR TOTAL PAYMENT FOR RESTAURANT 3: ";
					cin >> payment_restaurant3;	
						if ((payment_restaurant1<payment_restaurant2)&&(payment_restaurant1<payment_restaurant3))
						{
							cout << "\n\nTHE RESTAURANT THAT YOU CAN LESS PAYMENT IS LA COLAZIONE KITCHEN.";
						}
						if ((payment_restaurant2<payment_restaurant1)&&(payment_restaurant2<payment_restaurant3))
						{
							cout << "\n\nTHE RESTAURANT THAT YOU CAN LESS PAYMENT IS ANNEVILLE CAFE & RESTO.";
						}	
						if ((payment_restaurant3<payment_restaurant1)&&(payment_restaurant3<payment_restaurant2))
						{
							cout << "\n\nTHE RESTAURANT THAT YOU CAN LESS PAYMENT IS LUICA AND DAUTHER.";
						}					
			 						
			 		cout << "\n____________________________________________________________________________________________________________";				
			 		//command to summarize or to finalize your order from three diff restaurant
			 		cout << "\n\nWHAT IS YOUR FINAL ORDER?"
						 << "\nENTER YOUR CHOSEN PASTA/NOODLES: ";
					cin >> final_pasta_order;
					cout << "ENTER YOUR CHOSEN RESTAURANT: ";
			 		cin >> chosen_restaurant;
			 			if (chosen_restaurant==2)
			 			{
			 				cout << "ENTER THE PRICE OF MERIENDA BUNDLE: ";
			 				cin >> bundle;
			 				cout << "QUANTITY: ";
			 				cin >> bundle_quantity;
						}
					cout << "ENTER THE PRICE OF PASTA/NOODLES: "; 
					cin >> final_price;
						switch (final_price)
						{
							case 147:
								cout << "\nLA COLAZIONE KITCHEN\nSINGLE ORDER : Carbonara		-	P 147.00";
								break;
							case 480:
								cout << "\nLA COLAZIONE KITCHEN\nHALF ORDER : Carbonara		-		P 480.00";
								break;
							case 900:
								cout << "\nLA COLAZIONE KITCHEN\nWHOLE ORDER : Carbonara		-		P 900.00";
								break;
							case 268:
								cout << "\nANNEVILLE CAFE & RESTO\nSINGLE ORDER : Seafood Bihon		-	P 268.00";
								break;
							case 538:
								cout << "\nANNEVILLE CAFE & RESTO\nMEDIUM ORDER : Seafood Bihon		-		P 538.00";
								break;
							case 707:
								cout << "\nANNEVILLE CAFE & RESTO\nLARGE ORDER : Seafood Bihon		-		P 707.00";
						}
					
					total_payment = (bundle*bundle_quantity) + final_price;
					cout << "\nYOU WILL PAY THE TOTAL OF " << total_payment << " pesos";
						
					//determine if the restaurant you ordering is open or close at a given time
					cout << "\n\nORDER TIME: ";
					cin >> order_time;
						if (chosen_restaurant==1)
						{
							if ((order_time>=10)&&(order_time<=12)||(order_time>=1)&&(order_time<=6))
							{
								cout << "\nWE ARE OPEN!!\n10:00 AM - 6:00 PM (Mon - Sat)\n#3 Juarez St. Brgy. V. Lucena city\nCONTACT US: #09956285274";
							}
							else
							{
								cout << "\nWE ARE CLOSE!!";	
							}						
						}
						if (chosen_restaurant==2)
						{
							if ((order_time>=11)&&(order_time<=12)||(order_time>=1)&&(order_time<=8))
							{
								cout << "\nWE ARE OPEN!!\n11:00 AM - 8:00 PM (Mon - Sun)\nLot A and B National Road, Gulang-Gulang, Lucena City\nCONTACT US: #(042795) 6135";
							}
							else
							{
								cout << "\nWE ARE CLOSE!!";	
							}
						}
						if (chosen_restaurant==3)
						{
							if ((order_time>=7)&&(order_time<=12)||(order_time>=1)&&(order_time<=9))
							{
								cout << "\nWE ARE OPEN!!\n7:00 AM - 9:00 PM (Mon - Sun)\nBrgy. Gulang Gulang Lucena City\nCONTACT US: #(042) 710 7543";
							}
							else
							{
								cout << "\nWE ARE CLOSE!!";	
							}
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
			 
	cout << "\n\nTYPE 1 IF YES & 0 IF NO"
		 << "\nDO YOU WANT TO ORDER OTHER CATEGORY OF FOODS? ";
	cin >> again;
}
while (again==1);	
}
//function definition for all three restaurant
double single_cost (double price, int costumer)
{
	double total_cost;
	
	total_cost = price * costumer;
	return total_cost;
}
//half order or carbonara
double half_cost (double single_carbonara_cost)
{
	const double Half_Size = 480;	
	double halfsize_cost;
	
	halfsize_cost = Half_Size - single_carbonara_cost;
	return halfsize_cost;
}  
//whole order of carbonara  
double whole_cost (double carbonara_price)
{
	const double Half_Size = 480;	
	double wholesize_cost;
	
	wholesize_cost = carbonara_price - Half_Size;
	return wholesize_cost;
}
//medium order of pancit bihon 
double medium_cost (double single_bihon_cost)
{
	const double medium_Size = 538;	
	double mediumsize_cost;
	
	mediumsize_cost = medium_Size - single_bihon_cost;
	return mediumsize_cost;
} 
//large order of pancit bihon 
double large_cost (double bihon_price)
{
	const double medium_Size = 538;	
	double largesize_cost;
	
	largesize_cost = bihon_price - medium_Size;
	return largesize_cost;
} 
//getting the diff of large bilao from its medium size   
double large_bilao_cost (double canton_price)
{
	const double medium_bilao = 420;	
	double large_bilao;
	
	large_bilao = canton_price - medium_bilao;
	return large_bilao;
}                    
	
		