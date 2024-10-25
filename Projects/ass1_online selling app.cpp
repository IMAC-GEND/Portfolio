//CORPUZ, REIMARC G._BSCPE 2GF
//online buyer app program 2
//selecting the orders
#include <iostream>
using namespace std;
int main()
{
	int category;
	int book;
	int bbook;
	int qquantity1;
	int quantity1;
	int quantity2;
	int ncategory;
	int newbook;
	int nbook; int obook;
	
	
	cout << "=> second page..." << endl << endl;
	
	//choosing the category with 2 cases
	cout << "WHICH CATEGORY YOU PREFERRED? ";
	cin >> category;
	switch (category)
	{
		case 1:
			cout << "Your chosen categry is FICTION \n";
			cout << "\nFICTION: \n1. ABANDONED IN DEATH by J.D Robb \n2. THE MIDNIGHT LIBRARY by Matt Haig \n3. THE LAST THING HE TOLD ME by Laura Dave \n4. THE LINCOLN HIGHWAY by Amor Towles \n5. CITY OF THE DEAD by Jonathan Kellerman";
			break;
		case 2:
			cout << "Your chosen category is NONE-FICTION \n";
			cout << "\nNONE-FICTION \n6. RED-HANDED by Schweizer \n7. THE NINETIES by Chuch Klosterman \n8. HOW TO BE PERFECT by Michael Schur \n9. STOLEN FOCUS by Johann Hari \n10. ORIGIN by Jennifer Raff";
			break;
		default:
			cout << "\"WRONG INPUT\"\n";
			
			//if statement inlcuded another switch for wrong input
			if (category > 2)
			{
				int again;
				cout << "\nTRY AGAIN!\n";
				cout << "WHICH CATEGORY YOU PREFERRED? ";
			    cin >> again;
			    
			    //for wrong input of category
			    switch (again)
			    {
			    	case 1:
						cout << "Your chosen category is FICTION \n";
							cout << "\nFICTION: \n1. ABANDONED IN DEATH by J.D Robb \n2. THE MIDNIGHT LIBRARY by Matt Haig \n3. THE LAST THING HE TOLD ME by Laura Dave \n4. THE LINCOLN HIGHWAY by Amor Towles \n5. CITY OF THE DEAD by Jonathan Kellerman";
						break;
					case 2:
						cout << "Your chosen category is NONE-FICTION \n";
						cout << "\nNONE-FICTION \n6. RED-HANDED by Schweizer \n7. THE NINETIES by Chuch Klosterman \n8. HOW TO BE PERFECT by Michael Schur \n9. STOLEN FOCUS by Johann Hari \n10. ORIGIN by Jennifer Raff";
						break;	
				}
			}
	}
	
	//if-else and switch statement for category one
	if (category==1)
	{
	cout << "\n\nSELECT THE NUMBER OF THE BOOK YOU PREFERRED: ";
	cin >> book;
	cout << "\nQUANTITY: ";
	cin >> quantity1;
	
		switch (book)
		{	
			case 1:
				cout << "You chose "<< quantity1 <<" of ABANDONED IN DEATH by J.D Robb";
				break;
			case 2:
				cout << "You chose "<< quantity1 <<" of THE MIDNIGHT LIBRARY by Matt Haig";
				break;
			case 3:
				cout << "You chose "<< quantity1 <<" of THE LAST THING HE TOLD ME by Laura Dave";
				break;
			case 4:
				cout << "You chose "<< quantity1 <<" of THE LINCOLN HIGHWAY by Amor Towles";
				break;
			case 5:
				cout << "You chose "<< quantity1 <<" of CITY OF THE DEAD by Jonathan Kellerman";
				break;
			default:
				cout << "\nWRONG INPUT\nYour chosen number of book is not in your chosen category.";
		}
	}
	else //switch for category two
	{
	cout << "\n\nSELECT THE NUMBER OF THE BOOK YOU PREFERRED: ";
	cin >> bbook;
	cout << "\nQUANTITY: ";
	cin >> qquantity1;
		switch (bbook)
		{
			case 6:
				cout << "You chose "<< qquantity1 <<" of RED-HANDED by Schweizer";
				break;
			case 7:
				cout << "You chose "<< qquantity1 <<" of THE NINETIES by Chuch Klosterman";
				break;
			case 8:
				cout << "You chose "<< qquantity1 <<" of HOW TO BE PERFECT by Michael Schur";
				break;
			case 9:
				cout << "You chose "<< qquantity1 <<" of STOLEN FOCUS by Johann Hari";
				break;
			case 10:
				cout << "You chose "<< qquantity1 <<" of ORIGIN by Jennifer Raff";
				break;
			default:
				cout << "\nWRONG INPUT\nYour chosen number of book is not in our TOP 10 list.";
		}
	}
	//for new order
 	cout << "\n\n(Type 1 if YES, and 0 if NO)BUY NEW? ";
 	cin >> newbook;
 	if (newbook==1)
 	{
 		cout << "\nSELECT CATEGORY: ";
 		cin >> ncategory;
 		switch (ncategory)
		{
			case 1:
				cout << "Your chosen categry is FICTION \n";
				cout << "\nFICTION: \n1. ABANDONED IN DEATH by J.D Robb \n2. THE MIDNIGHT LIBRARY by Matt Haig \n3. THE LAST THING HE TOLD ME by Laura Dave \n4. THE LINCOLN HIGHWAY by Amor Towles \n5. CITY OF THE DEAD by Jonathan Kellerman";
			break;
			case 2:
				cout << "Your chosen category is NONE-FICTION \n";
				cout << "\nNONE-FICTION \n6. RED-HANDED by Schweizer \n7. THE NINETIES by Chuch Klosterman \n8. HOW TO BE PERFECT by Michael Schur \n9. STOLEN FOCUS by Johann Hari \n10. ORIGIN by Jennifer Raff";
			break;
 		}
 	//switch having all cases
 	cout << "\n\nSELECT A NEW BOOK: ";
 	cin >> nbook;
 	cout << "\nQUANTITY: ";
 	cin >> quantity2;

 		switch (nbook)
		{
			case 1:
				cout << "You chose "<< quantity2 <<" of ABANDONED IN DEATH by J.D Robb";
				break;
			case 2:
				cout << "You chose "<< quantity2 <<" of THE MIDNIGHT LIBRARY by Matt Haig";
				break;
			case 3:
				cout << "You chose "<< quantity2 <<" of THE LAST THING HE TOLD ME by Laura Dave";
				break;
			case 4:
				cout << "You chose "<< quantity2 <<" of THE LINCOLN HIGHWAY by Amor Towles";
				break;
			case 5:
				cout << "You chose "<< quantity2 <<" of CITY OF THE DEAD by Jonathan Kellerman";
				break;
			case 6:
				cout << "You chose "<< quantity2 <<" of RED-HANDED by Schweizer";
				break;
			case 7:
				cout << "You chose "<< quantity2 <<" of THE NINETIES by Chuch Klosterman";
				break;
			case 8:
				cout << "You chose "<< quantity2 <<" of HOW TO BE PERFECT by Michael Schur";
				break;
			case 9:
				cout << "You chose "<< quantity2 <<" of STOLEN FOCUS by Johann Hari";
				break;
			case 10:
				cout << "You chose "<< quantity2 <<" of ORIGIN by Jennifer Raff";
				break;
			default:
				cout << "\nWRONG INPUT\nYour chosen number of book is not in our TOP 10 list.";
	}
    }
    else //preferred not to add costumer order
    {
 		cout << "\nSELECT AN OLD BOOK: ";
 		cin >> obook;
 			//order confirmation
 			if (category==1)
			{
 				char confirm;
 				cout << "\n\nADDING TO YOUR CART...";
 				cout << "\nREVIEWING YOUR ORDER...";
 				cout << "\nORDERS CONFIRMATION: \nYour order is " << quantity1 << " of Category " << category <<" (1-FICTION & 2-NONE FICTION) and you chose is number " << book << " in this category." ;
				cout << "\n\nADD TO CART? ";
 				cin >> confirm;
 			}
 			else
 			{
 				char confirmm;
 				cout << "\n\nADDING TO YOUR CART...";
	 			cout << "\nREVIEWING YOUR ORDER...";
	 			cout << "\nORDERS CONFIRMATION: \nYour order is " << qquantity1 << " of Category " << category <<" (1-FICTION & 2-NONE FICTION) and you chose is number " << bbook << " in this category." ;
 				cout << "\n\nADD TO CART? ";
 				cin >> confirmm;		
			}
					
	}//order confirmation and adding new order
	if (newbook==1)
	{
		if (category==1)
			{
 				char confirm;
 				cout << "\n\nADDING TO YOUR CART...";
 				cout << "\nREVIEWING YOUR ORDER...";
 				cout << "\n\nORDERS CONFIRMATION: \nYour order is " << quantity1 << " of Category " << category <<" (1-FICTION & 2-NONE FICTION) and you chose is number " << book << " in this category." ;
 				cout << "\nPlus your new selected book is " << nbook << " with a quantity of " << quantity2 << " in Category " << ncategory << ".";
				cout << "\n\nADD TO CART? ";
 				cin >> confirm;
 			}
 			else
 			{
 				char confirmm;
 				cout << "\n\nADDING TO YOUR CART...";
	 			cout << "\nREVIEWING YOUR ORDER...";
	 			cout << "\n\nORDERS CONFIRMATION: \nYour order is " << qquantity1 << " of Category " << category <<" (1-FICTION & 2-NONE FICTION) and you chose is number " << bbook << " in this category." ;
 				cout << "\nPlus your new selected book is " << nbook << " with a quantity of " << quantity2 << " in Category " << ncategory << ".";
				cout << "\n\nADD TO CART? ";
 				cin >> confirmm;			
			}
	}
	else
	{
		cout << " ";
	}
}
			
