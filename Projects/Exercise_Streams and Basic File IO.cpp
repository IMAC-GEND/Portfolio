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
	
	//if statement for smallest number						
	if (a<=b&&a<=c&&a<=d&&a<=e&&a<=f&&a<=g&&a<=h&&a<=i)
	{
		cout <<"\nThe smallest number is: " << a;
		output_file << "\nThe smallest number is: " << a;
	}	
	if (b<=a&&b<=c&&b<=d&&b<=e&&b<=f&&b<=g&&b<=h&&b<=i)
	{
		cout <<"\nThe smallest number is: " << b;
		output_file << "\nThe smallest number is: " << b;
	}	
	if (c<=a&&c<=b&&c<=d&&c<=e&&c<=f&&c<=g&&c<=h&&c<=i)
	{
		cout <<"\nThe smallest number is: " << c;
		output_file << "\nThe smallest number is: " << c;
	}	
	if (d<=a&&d<=b&&d<=c&&d<=e&&d<=f&&d<=g&&d<=h&&d<=i)
	{
		cout <<"\nThe smallest number is: " << d;
		output_file << "\nThe smallest number is: " << d;
	}
	if (e<=a&&e<=b&&e<=c&&e<=d&&e<=f&&e<=g&&e<=h&&e<=i)
	{
		cout <<"\nThe smallest number is: " << e;
		output_file << "\nThe smallest number is: " << e;
	}
	if (f<=a&&f<=b&&f<=c&&f<=d&&f<=e&&f<=g&&f<=h&&f<=i)
	{
		cout <<"\nThe smallest number is: " << f;
		output_file << "\nThe smallest number is: " << f;
	}
	if (g<=a&&g<=b&&g<=c&&g<=d&&g<=e&&g<=f&&g<=h&&g<=i)
	{
		cout <<"\nThe smallest number is: " << g;
		output_file << "\nThe smallest number is: " << g;
	}	
	if (h<=a&&h<=b&&h<=c&&h<=d&&h<=e&&h<=f&&h<=g&&h<=i)
	{
		cout <<"\nThe smallest number is: " << h;
		output_file << "\nThe smallest number is: " << h;
	}
	if (i<=a&&i<=b&&i<=c&&i<=d&&i<=e&&i<=f&&i<=g&&i<=h)
	{
		cout <<"\nThe smallest number is: " << i;
		output_file << "\nThe smallest number is: " << i;
	}	
	
	//if statement for largest number
	if (a>=b&&a>=c&&a>=d&&a>=e&&a>=f&&a>=g&&a>=h&&a>=i)
	{
		cout <<"\nThe largest number is: " << a;
		output_file << "\nThe largest number is: " << a;
	}	
	if (b>=a&&b>=c&&b>=d&&b>=e&&b>=f&&b>=g&&b>=h&&b>=i)
	{
		cout <<"\nThe largest number is: " << b;
		output_file << "\nThe largest number is: " << b;
	}	
	if (c>=a&&c>=b&&c>=d&&c>=e&&c>=f&&c>=g&&c>=h&&c>=i)
	{
		cout <<"\nThe largest number is: " << c;
		output_file << "\nThe largest number is: " << c;
	}	
	if (d>=a&&d>=b&&d>=c&&d>=e&&d>=f&&d>=g&&d>=h&&d>=i)
	{
		cout <<"\nThe largest number is: " << d;
		output_file << "\nThe largest number is: " << d;
	}
	if (e>=a&&e>=b&&e>=c&&e>=d&&e>=f&&e>=g&&e>=h&&e>=i)
	{
		cout <<"\nThe largest number is: " << e;
		output_file << "\nThe largest number is: " << e;
	}
	if (f>=a&&f>=b&&f>=c&&f>=d&&f>=e&&f>=g&&f>=h&&f>=i)
	{
		cout <<"\nThe largest number is: " << f;
		output_file << "\nThe largest number is: " << f;
	}
	if (g>=a&&g>=b&&g>=c&&g>=d&&g>=e&&g>=f&&g>=h&&g>=i)
	{
		cout <<"\nThe largest number is: " << g;
		output_file << "\nThe largest number is: " << g;
	}	
	if (h>=a&&h>=b&&h>=c&&h>=d&&h>=e&&h>=f&&h>=g&&h>=i)
	{
		cout <<"\nThe largest number is: " << h;
		output_file << "\nThe largest number is: " << h;
	}
	if (i>=a&&i>=b&&i>=c&&i>=d&&i>=e&&i>=f&&i>=g&&i>=h)
	{
		cout <<"\nThe largest number is: " << i;
		output_file << "\nThe largest number is: " << i;
	}			
}

