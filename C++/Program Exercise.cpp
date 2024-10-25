//REIMARC G. CORPUZ
//BSCPE 2GF
//This program find the smallest and largest number in a list of numbers in a file
//and outputs the result in a new file and on the screen.
#include <iostream>
#include <fstream>
#include <cstdlib>
#include <iomanip>
using namespace std;

void smallest_largest (ifstream& input_file, ofstream& output_file);
//Precondition: - the stream output_file have been connected to files using the function open.
//				- the stream input_file have been connected to files using the function open.
//Postcondition: - the data from input_file will copy and compare in the output_file
//				   w/c is the smallest and the largest number.
//				 - the compared number will also appear in the screen.

int main()
{
 	ifstream input_file;
 	ofstream output_file;
 	
 	input_file.open("numberin.txt");
 	if (input_file.fail( ) )
	{                
		cout << "Input file opening failed.\n";            
		exit(1);
	}
	output_file.open("numberout.txt");
 	if (input_file.fail( ) )
	{                
		cout << "Input file opening failed.\n";            
		exit(1);
	}
	
	smallest_largest (input_file, output_file);
	
	input_file.close( );
	output_file.close( );
	
	cout << "\n\nEND OF PROGRAM!";
}
void smallest_largest (ifstream& input_file,ofstream& output_file)
{	
 	double set_of_numbers;
	input_file >> set_of_numbers;
	
	double smallest = set_of_numbers;
	double largest = set_of_numbers;
	
	output_file.setf(ios::right);		
	output_file.setf(ios::showpoint); 		
	output_file.width(30);
	cout.setf(ios::right);		
	cout.setf(ios::showpoint); 		
	cout.width(30);
	
	while (input_file >> set_of_numbers)
	{
		if (set_of_numbers >= smallest)
		{
			smallest = set_of_numbers;
		}
		else
		{
			if (set_of_numbers <= largest)
			{
				largest = set_of_numbers;
			}
		}
	}
	output_file  << "\nThe largest number is:" << setw(29) << smallest
		         << "\nThe smallest number is:" << setw(28) << largest;	
		         
	cout << "\nThe largest number is:" << setw(29) << smallest
		 << "\nThe smallest number is:" << setw(28) << largest;
}