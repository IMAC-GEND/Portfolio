#include <iostream>
using namespace std;
int main()
{
	double price;
	double items;
	int product;
	double total;
 	
	cout << "\nEnter product name: ";
 	cin >> product;
 		switch (product)
 		{
 			case 1:
			 cout << "long nose plier";
			 break;
			default:
			cout << "not included in the product";	
		}
 		
 	cout << "\n\nEnter unit price: ";
 	cin >> price;
 	cout << "\nEnter no. of items: ";
 	cin >> items;

 	cout << endl << items << " long nose plier cost " << items*price << " pesos.";
 	
 	cout << "\nEnter your cost: ";
 	cin >> total;
 	cout << "\nWith 10% additional, it cost " << (total*0.10)+total;
}
