//PROBLEM #3
//Using do while loop, print out all the numbers up to a certain limit in C++

#include<iostream>
using namespace std;
int main(){
	int snumber = 1;
	int limit;
	bool yes = true;
	
	cout << "DO WHILE TO PRINT OUT ALL THE NUMBERS UP TO A CERTAIN LIMIT! \n";
	cout << "Enter a number/limit: ";
	cin >> limit;
	
	do 
	{
		if (snumber<=limit)
		{
			cout << snumber;
			snumber++;
			yes = true;
		}
		else
		{
			yes = false;	
		}
	}
	while (yes!=false);
}