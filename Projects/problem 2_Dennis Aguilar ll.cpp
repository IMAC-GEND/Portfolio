#include <iostream>
using namespace std;
int main()
{
	double passengers;
	double fare;
	int bus;
	double totalfare;
	
 	cout << "Enter Bus plate number: ";
 	cin >> bus;
 		switch (bus)
 		{
 			case 1123:
 				cout << "BUS-1123";
 				break;
 			default:
 				cout << "";
		}
	cout << "\nEnter number of passengers: ";
	cin >> passengers;
	cout << "\nEnter individual fare: ";
	cin >> fare;
	
	cout << "\nBUS-" << bus	<< " will have " << passengers * fare << " pesos total fare.";
	cout << "\nEnter your total fare: ";
	cin >> totalfare;
	cout << "\nWith 20% discout, it will have " << totalfare-(0.20*totalfare);
	}
