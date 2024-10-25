//CORPUZ, REIMARC G._BSCPE 2GF
//shipping iformation
//total pricing
#include <iostream>
using namespace std;
int main()
{
	int name;
	int number; 
	int verification;
	int payment;
	int book0=0;int book1=750;int book2=100;int book3=220;int book4=400;int book5=500;int book6=600;int book7=700;int book8=800;int book9=900;int book10=999;
	int shippingfee = 58;
	int preferred1; int preferred2;
	int quantity1; int quantity2;
	
 	cout << "\nSHIPPING INFORMATION";
 	
 	cout << "\n\nCOSTUMER CODE: ";
 	cin >> name;
 	switch (name)
 	{
 		case 123:
 			cout << "CONTACT NUMBER (disregard \"09\"): ";
 			cin >> number;
 			break;
 		default:
 			int msgnumber;
 			cout << "ENTER YOUR MSG NUMBER: ";
 			cin >> msgnumber;
	}
 	int code;
 		switch (name) //for code confirmation
 		{
 			case 123:
 				cout << "\nNAME: Reimarc G. Corpuz\nADRRESS: Ilayang Iyam, Lucena City\nCONTACT NUMBER: 093392590";
 				break;
 			default:
 				cout << "THE CODE YOU ENETRED IS NOT REGISTERED!" << endl;
 				cout << "REENTER YOUR CODE AND WAIT THE VERIFICATION CODE IN YOUR MESSAGE INBOX TO CONFIRM YOUR ACCOUNT";
 				cout << "\nCOSTUMER CODE: ";
 				cin >> code;
 					switch (code)
 					{
 						case 123:
 							cout << "\nNAME: Reimarc G. Corpuz\nADDRESS: Ilayang Iyam, Lucena City";
 						break;
 						default:
 							cout << "\nENTER YOUR VERICICATION CODE: ";
 							cin >> verification;
 					}
		}
 	
 	//getting the total payment
 	cout << "\n\nSTANDARD SHIPPING FEE IS 58 PESOS";
 	cout << "\nENTER THE 1ST NUMBER OF BOOK YOU PREFERRED: ";
 	cin >> preferred1;
 	cout << "QUANTITY: ";							
 	cin >> quantity1;
 	cout << "ENTER THE 2ND NUMBER OF BOOK YOUR PREFERRED: ";		//madaming if statement dahil sa dalawang input.
 	cin >> preferred2;												
 	cout << "QUANTITY: ";											//the design is for provided price indicated by the seller.
 	cin >> quantity2;
	 if ((quantity1>=5)||(quantity2>=5))
	 {										    
 		if ((preferred1==1)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book0 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==1)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book1 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book1 * quantity2)+shippingfee)) << " pesos";}
		if ((preferred1==1)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book2 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book2 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==1)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book3 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book3 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==1)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book4 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book4 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==1)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book5 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book5 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==1)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book6 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book6 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==1)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book7 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book7 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==1)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book8 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book8 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==1)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book9 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book9 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==1)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << (((book1 * quantity1)+(book10 * quantity2))+shippingfee)- (0.05*((book1 * quantity1)+(book10 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book0 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book1 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book2 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book2 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book3 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book3 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book4 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book4 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book5 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book5 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book6 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book6 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book7 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book7 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book8 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book8 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book9 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book9 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==2)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << (((book2 * quantity1)+(book10 * quantity2))+shippingfee)- (0.05*((book2 * quantity1)+(book10 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book0 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book1 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book1 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book2 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book2 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book3 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book3 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book4 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book4 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book5 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book5 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book6 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book6 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book7 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book7 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book8 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book8 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book9 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book9 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==3)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << (((book3 * quantity1)+(book10 * quantity2))+shippingfee)- (0.05*((book3 * quantity1)+(book10 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book0 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book1 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book1 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book2 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book2 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book3 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book3 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book4 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book4 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book5 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book5 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book6 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book6 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book7 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book7 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book8 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book8 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book9 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book9 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==4)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << (((book4 * quantity1)+(book10 * quantity2))+shippingfee)- (0.05*((book4 * quantity1)+(book10 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==5)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book0 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==5)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book1 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book1 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==5)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book2 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book2 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==5)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book3 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book3 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==5)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book4 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book4 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==5)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book5 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book5 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==5)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book6 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book6 * quantity2)+shippingfee)) << " pesos";}
		if ((preferred1==5)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book7 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book7 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==5)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book8 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book8 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==5)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book9 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book9 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==5)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << (((book5 * quantity1)+(book10 * quantity2))+shippingfee)- (0.05*((book5 * quantity1)+(book10 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book0 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book1 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book1 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book2 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book2 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book3 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book3 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book4 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book4 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book5 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book5 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book6 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book6 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book7 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book7 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book8 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book8 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book9 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book9 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==6)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << (((book6 * quantity1)+(book10 * quantity2))+shippingfee)- (0.05*((book6 * quantity1)+(book10 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book0 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book1 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book1 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book2 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book2 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book3 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book3 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book4 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book4 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book5 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book5 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book6 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book6 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book7 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book7 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book8 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book8 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book9 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book9 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==7)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << (((book7 * quantity1)+(book10 * quantity2))+shippingfee)- (0.05*((book7 * quantity1)+(book10 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book0 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book1 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book1 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book2 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book2 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book3 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book3 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book4 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book4 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book5 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book5 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book6 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book6 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book7 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book7 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book8 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book8 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book9 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book9 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==8)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << (((book8 * quantity1)+(book10 * quantity2))+shippingfee)- (0.05*((book8 * quantity1)+(book10 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book0 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book1 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book1 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book2 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book2 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book3 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book3 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book4 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book4 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book5 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book5 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book6 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book6 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book7 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book7 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book8 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book8 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book9 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book9 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==9)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << (((book9 * quantity1)+(book10 * quantity2))+shippingfee)- (0.05*((book9 * quantity1)+(book10 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << (((book10 * quantity1)+(book0 * quantity2))+shippingfee)- (0.05*((book10 * quantity1)+(book0 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << (((book10* quantity1)+(book1 * quantity2))+shippingfee)- (0.05*((book10* quantity1)+(book1 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << (((book10* quantity1)+(book2 * quantity2))+shippingfee)- (0.05*((book10* quantity1)+(book2 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << (((book10* quantity1)+(book3 * quantity2))+shippingfee)- (0.05*((book10* quantity1)+(book3 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << (((book10* quantity1)+(book4 * quantity2))+shippingfee)- (0.05*((book10* quantity1)+(book4 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << (((book10* quantity1)+(book5 * quantity2))+shippingfee)- (0.05*((book10* quantity1)+(book5 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << (((book10* quantity1)+(book6 * quantity2))+shippingfee)- (0.05*((book10* quantity1)+(book6 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << (((book10* quantity1)+(book7 * quantity2))+shippingfee)- (0.05*((book10* quantity1)+(book7 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << (((book10* quantity1)+(book8 * quantity2))+shippingfee)- (0.05*((book10* quantity1)+(book8 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << (((book10* quantity1)+(book9 * quantity2))+shippingfee)- (0.05*((book10* quantity1)+(book9 * quantity2)+shippingfee))<< " pesos";}
		if ((preferred1==10)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << (((book10 * quantity1)+(book10 * quantity2))+shippingfee)- (0.05*((book10 * quantity1)+(book10 * quantity2)+shippingfee))<< " pesos";}
 	}
 	else
 	{
 		if ((preferred1==1)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book0 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==1)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book1 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==1)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book2 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==1)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book3 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==1)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book4 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==1)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book5 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==1)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book6 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==1)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book7 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==1)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book8 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==1)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book9 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==1)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << ((book1 * quantity1)+(book10 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book0 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book1 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book2 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book3 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book4 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book5 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book6 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book7 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book8 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book9 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==2)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << ((book2 * quantity1)+(book10 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book0 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book1 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book2 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book3 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book4 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book5 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book6 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book7 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book8 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book9 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==3)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << ((book3 * quantity1)+(book10 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book0 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book1 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book2 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book3 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book4 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book5 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book6 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book7 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book8 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book9 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==4)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << ((book4 * quantity1)+(book10 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book0 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book1 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book2 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book3 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book4 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book5 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book6 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book7 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book8 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book9 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==5)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << ((book5 * quantity1)+(book10 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book0 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book1 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book2 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book3 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book4 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book5 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book6 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book7 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book8 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book9 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==6)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << ((book6 * quantity1)+(book10 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book0 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book1 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book2 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book3 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book4 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book5 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book6 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book7 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book8 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book9 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==7)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << ((book7 * quantity1)+(book10 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book0 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book1 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book2 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book3 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book4 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book5 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book6 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book7 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book8 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book9 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==8)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << ((book8 * quantity1)+(book10 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book0 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book1 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book2 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book3 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book4 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book5 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book6 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book7 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book8 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book9 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==9)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << ((book9 * quantity1)+(book10 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==0)){cout << "TOTAL PAYMENT: " << ((book10 * quantity1)+(book0 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==1)){cout << "TOTAL PAYMENT: " << ((book10* quantity1)+(book1 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==2)){cout << "TOTAL PAYMENT: " << ((book10* quantity1)+(book2 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==3)){cout << "TOTAL PAYMENT: " << ((book10* quantity1)+(book3 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==4)){cout << "TOTAL PAYMENT: " << ((book10* quantity1)+(book4 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==5)){cout << "TOTAL PAYMENT: " << ((book10* quantity1)+(book5 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==6)){cout << "TOTAL PAYMENT: " << ((book10* quantity1)+(book6 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==7)){cout << "TOTAL PAYMENT: " << ((book10* quantity1)+(book7 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==8)){cout << "TOTAL PAYMENT: " << ((book10* quantity1)+(book8 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==9)){cout << "TOTAL PAYMENT: " << ((book10* quantity1)+(book9 * quantity2))+shippingfee << " pesos";}
		if ((preferred1==10)&&(preferred2==10)){cout << "TOTAL PAYMENT: " << ((book10 * quantity1)+(book10 * quantity2))+shippingfee << " pesos";}
	}
 	cout << "\n\nPAYMENT OPTIONS: \n1. Cash on Deleiver \n2. Checks \n3. Debit Cards \n4. Credit Cards \n5. Mobile Legends \n6. Electronic Bank Transfer";
 	
	//mode of payment
 	cout << "\n\nSELECT PAYMENT METHOD: ";
 	cin >> payment;
 	switch (payment) 
 	{
 		case 1:
		 cout << "Cash on Delivery";
		 break;	
		case 2:
		 cout << "Checks";
		 break;	
		case 3:
		 cout << "Debit cards";
		 break;	
		case 4:
		 cout << "Credit cards";
		 break;	
		case 5:
		 cout << "Mobile payments";
		 break;	
		case 6:
		 cout << "Electronic bank transfers";
		 break;
		deafult:
		 cout << "NOT IN THE PAYMENT METHOD!";	
	}
	
	int information; 
	cout << "\n\n(Type 1 if yes and 0 if no)\nIS INFORMATION CORRECT? "; //checking information
	cin >> information;
	if (information==1)
	{
		cout << "\nPLACE ORDER";
	}
	else
	{
		char change;

		cout << "\nCHANGE INFORMATION";
		cout << "\nENTER THE INFORMATION YOU WANT TO CHANGE: ";
		cin >> change;
		
	}
	
	cout << "\n\nORDER SUCCESFUL! thank you :)";
}
