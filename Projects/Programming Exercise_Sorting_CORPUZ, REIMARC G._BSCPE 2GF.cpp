//REIMARC G. CORPUZ
//BSCPE 2GF
//SORTING ARRAY: Reverse the inputed elements
#include<iostream>
#include <iomanip>

void input(char letter[], int index);
//Precondition: index is the declared size of the array letter.
//Postcondition: index is the number stored in array letter.
//			   : user will input letters w/ max value number of index.
//             : print the reverse format of the array letter.

using namespace std;
int main()
{
	const int index = 10;
	char letter [index];
	char again1, again2, again3;
	
	cout << endl << setw(49) << "SORTING ARRAYS" << endl
		 << setw(57) << "Reverse the Inputed Elements" << endl
		 << "__________________________________________________________________________________"
		 << endl;
	do
	{
	input(letter, index);
	
	cout << "\nType YES or NO:\nTest the next week? ";
 	cin >> again1 >> again2 >> again3;
 	cout << "__________________________________________________________________________________"
			 << endl;
	}
	while ((again1!='N')&&(again1!='n'));
}
void input(char letter[], int index)
{
	cout << "Enter capital letter X to stop!" << endl;
	cout << "Enter up to " << index << " letters: ";
	char lttr;
	int ndex = 0;
	cin >> lttr;
	while ((lttr != 'X') && (ndex < index))
		{
			letter[ndex] = lttr;
			ndex++;
			cin >> lttr;
		}
		
	cout << "Displayed in reverse format: ";
	for (int reverse = ndex; reverse >= 0; reverse--)
	{
		cout << letter [reverse];
	}
	cout << endl;
}