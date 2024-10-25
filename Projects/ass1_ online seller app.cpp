//CORPUZ, REIMARC G._BSCPE 2GF
//online seller app
//to register as a costumer
#include <iostream>
using namespace std;
int main()
{

	int code;
	char upinfo;
	char ininfo;
	 
	//header
 	cout << "" << endl << "					WELCOME TO ONLINE BOOK SELLING!" <<endl << "\n________________________________________________________________________________________________________________________\n\n				\"We want to help you find the stories you love! \n			Where everything you need to know is only an arm's length away!\" \n\n________________________________________________________________________________________________________________________\n\nAre you already registered with our store?" << endl << "If yes enter your costumer code, and if no enter \"1111\" to register your new account.";
 	
	 //to sign-in or sign-up
 	cout << "\n\nREGISTERED? \nEnter your 3-digit costumer code: ";
 	cin >> code;
 	
	 //condition if your code is already registered or not.
	 //we can also use switch statement if we alraedy have the record of all costumer code.
	
 	if (code<=999)
 	{
 			switch (code)
			{
	 			case 123:
	 				cout << "\nNAME: Reimarc G. CORPUZ\nREGISTERED CONTACT NUMBER: 09503392590\nADDRESS: Ilayang Iyam, Lucena City";
	 				break;
			}
 		cout << "\n\nSIGN IN" << endl;
		cout << "YOU ARE NOW SUCCESSFULLY SIGN-IN!";
		cout << "\nCONTINUE? ";
		cin >> upinfo;
	}
	else 
	{
		cout << "\nSIGN UP" << endl;
		cout << "Enter your (NAME/ADDRESS/CONTACT NUMBER): ";
		cin >> ininfo;
		cout << "YOU ARE A NEW USER!\n";
	}
	
	//home page
	cout << "\n\n________________________________________________________________________________________________________________________\n						WELCOME TO HOME PAGE";
	cout << "\n\n						TOP 10 SELLING BOOKS! \n				     WHAT ARE YOU WAITING FOR? ADD TO CART NOW!!";
	cout << "\nList of books : \n\nFICTION: \n1. ABANDONED IN DEATH by J.D Robb - 750\n2. THE MIDNIGHT LIBRARY by Matt Haig - 100\n3. THE LAST THING HE TOLD ME by Laura Dave - 220\n4. THE LINCOLN HIGHWAY by Amor Towles - 400\n5. CITY OF THE DEAD by Jonathan Kellerman - 500\n\nNONE-FICTION \n6. RED-HANDED by Schweizer - 600\n7. THE NINETIES by Chuch Klosterman - 700\n8. HOW TO BE PERFECT by Michael Schur - 800\n9. STOLEN FOCUS by Johann Hari - 900\n10. ORIGIN by Jennifer Raff - 999\n" << endl;

	cout << "\n\nNEXT >>..." << endl;
}
