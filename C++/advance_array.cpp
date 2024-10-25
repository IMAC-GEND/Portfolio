#include<iostream>
using namespace std;
int main()
{
	int number [10];
	
	for (int i = 0; i < 10; i++)
	{
		cout << "Enter a number in " << i << ": ";
		cin >> number [i];
	}
	
	cout << "\nDisplay all the values of the array: " << endl;
	for (int ii = 0;ii < 10; ii++)
	{
		cout << "The value in array ["<< ii << "] is: " << number [ii] << endl;
	}
	
	cout << "\nDisplay all the values of the array: " << endl;
	for (int iii = 0;iii < 10; iii++)
	{
		cout << number [iii] << " ";
	}
}