#include<iostream>
using namespace std;
int main()
{
	int fn;
	int sn;
	int a;
	
	cout << "Enter first number: ";
	cin >> fn;
	cout << "Enter second number: ";
	cin >> sn;
	
	a = fn % sn;
	cout << "The remaider is: " << a;
	
	if (a==0)
	{
		cout << "\nEQUALLY DIVIDED!";
	}
	else 
	{
		cout << "\nWITH REMAIDER!";
	}
}