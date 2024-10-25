#include <iostream>
typedef int* NumberPtr;
void fill_array (int entry[], int size);
using namespace std;
int main()
{
	NumberPtr entry;
	entry = new int[10];
	
	cout << "\nWrite code to fill array entry with 10 numbers typed at the keyboard? \n\n";
	
	fill_array (entry, 10);
   
    return 0;
}
void fill_array (int entry[], int size)
{
	for (int i = 0; i < size; i++) 
	{
		cout << "ENTER THE NUMBER FOR ARRAY [" << i + 1 << "]: ";
    	cin >> entry[i];
   	}
    
	int *print_out;
	print_out = new int;
	print_out = entry;
	
	cout << "\nThe numbers you entered are: ";
	for (int n = 0; n < size; n++) 
	{
    	cout << print_out[n] << "  ";
    }
    
    delete [] entry;
}