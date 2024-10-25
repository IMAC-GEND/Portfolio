//REIMARC G. CORPUZ
//BSCPE 2GF
//This program find the smallest and largest number in a list of numbers in a file
//and outputs the result in a new file and on the screen.
#include <iostream>
#include <fstream>
#include <cstdlib>
#include <iomanip>
using namespace std;

void smallest (ifstream& input_file, ofstream& output_file);
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
	
	smallest (input_file, output_file);
	
	input_file.close( );
	output_file.close( );
	
	cout << "\n\nEND OF PROGRAM!";
}
void smallest (ifstream& input_file,ofstream& output_file)
{	
	int a, b, c, d, e, f, g, h, i;
	input_file >> a >> b >> c >> d >> e >> f >> g >> h >> i;
	output_file << endl << c << setw(4) 
				<< h << setw(4)
				<< a << setw(4)
				<< i << setw(4)
				<< g << setw(4)
				<< f << setw(5)
				<< e << setw(4)
				<< b << setw(4)
				<< d << setw(4)
				<< endl;
	
	char next;
	int smallest=0;
	input_file.get(next);
	while (! input_file.eof())
	{
		if (next<=2)
		{
			output_file << "The smallest number is: " << next;
		}
	}
}

