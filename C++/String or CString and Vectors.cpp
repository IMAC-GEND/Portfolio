//CORPUZ, REIMARC G.
//BSCPE 2GF
//This program will convert numbers into number words
//from 0 to the highest value of int in C++
#include <iostream>
#include <cstdlib>
#include <cctype>
#include <vector>
using namespace std;

void gettingDigits(int& positive, string address, string date);
//Precondition: positive is the inputed number of positive cases.
//				address and date is the string inputed value.
//Postcondition: it wiil cancel all characters that is not a number.
//      		 it will print out the inputed string in address and date.
void newLine( );

int main()
{
	char try_again;
	do
	{
	string address;
	cout << endl << "ADDRESS: ";
	getline(cin, address);
	
	string date;
	cout << "DATE: ";
	getline(cin, date);
	
	int positive;
	cout << "NUMBER OF POSITIVE CASES: ";
	gettingDigits(positive, address, date);
	
	//vector to store the number words
	vector <string> sample; 		      
	sample.push_back(""); 		      
	sample.push_back(" One"); 		      
	sample.push_back(" Two");
	sample.push_back(" Three"); 		      
	sample.push_back(" Four"); 		      
	sample.push_back(" Five");
	sample.push_back(" Six"); 		      
	sample.push_back(" Seven"); 		      
	sample.push_back(" Eight");
	sample.push_back(" Nine"); 		      
	sample.push_back(" Ten"); 		      
	sample.push_back(" Eleven");
	sample.push_back(" Twelve"); 		      
	sample.push_back(" Thirteen"); 		      
	sample.push_back(" Fourteen");
	sample.push_back(" Fiftheen"); 		      
	sample.push_back(" Sixteen"); 		      
	sample.push_back(" Seventeen");
	sample.push_back(" Eighteen"); 		      
	sample.push_back(" Nineteen"); 		      
	sample.push_back(" Twenty");
	sample.push_back(" Thirty");
	sample.push_back(" Fourty");
    sample.push_back(" Fifty");
	sample.push_back(" Sixty");
	sample.push_back(" Seventy");      
	sample.push_back(" Eighty");
	sample.push_back(" Ninety"); 
	//it can convert the largest int value in C++ 2,147,483,647 
	
	if (positive == 0)
	{
		cout << " Zero";
	}
	//number up to 10 digits
	if (positive >=1000000000)
	{
		int leftDigit = positive/1000000000;
		cout << sample[leftDigit] << " Billion";
		positive -= leftDigit * 1000000000;
	}
	//number up to 9 digits
	if (positive >=100000000)
	{
		int leftDigit = positive/100000000;
		cout << sample[leftDigit] << " Hundred";
		positive -= leftDigit * 100000000;
		if (positive < 1000 && positive >= 0)
		{
			cout << " Million";
		}
	}
	//number up to 8 digits
	if (positive >=21000000)
	{
		int leftDigit = positive/10000000;
		cout << sample[18 + leftDigit];
		positive -= leftDigit * 10000000;
		if (positive < 1000 && positive >= 0)
		{
			cout << " Million";
		}
	}
	//number up to 7 digits
	if (positive >=1000000)
	{
		int leftDigit = positive/1000000;
		cout << sample[leftDigit] << " Million";
		positive -= leftDigit * 1000000;
		if (positive < 1000 && positive >= 0)
		{
			cout << "";
		}
	}
	//number up to 6 digits
	if (positive >=100000)
	{
		int leftDigit = positive/100000;
		cout << sample[leftDigit] << " Hundred";
		positive -= leftDigit * 100000;
		if (positive < 1000 && positive >= 0)
		{
			cout << " Thousand";
		}
	}
	//number up to 5 digits
	if (positive >=21000)
	{
		int leftDigit = positive/10000;
		cout << sample[18 + leftDigit];
		positive -= leftDigit * 10000;
		if (positive < 1000 && positive >= 0)
		{
			cout << " Thousand";
		}
	}
	//number up to 4 digits
	if (positive >=1000)
	{
		int leftDigit = positive/1000;
		cout << sample[leftDigit] << " Thousand ";
		positive -= leftDigit * 1000;
	}
	//number up to 3 digits
	if (positive >=100)
	{
		int leftDigit = positive/100;
		cout << sample[leftDigit] << " Hundred ";
		positive -= leftDigit * 100;
	}
	//number up to 2 digits
	if (positive > 20)
	{
		int leftDigit = positive/10;
		cout << sample[18 + leftDigit] << " ";
		positive -= leftDigit * 10;
	}
	//number for last digit
	cout << sample[positive] << "." << endl ;
	
	cout << "________________________________________________________________________________" << endl; 
	cout << endl << endl << "Try again? ";
	cin >> try_again;
	newLine( );
	}
	while ((try_again!='N')&&(try_again!='n'));
}
void gettingDigits(int& positive, string address, string date)
{
	//constant 13 is base to the highest value of int.
	const int digitSize = 13; 
	char words[digitSize];
	
	char next;
	cin.get(next);
	int index = 0;
	while (next!='\n')
	{
		//check one by one wether the inputed character is a number or not.
		if ((isdigit(next))&&(index < digitSize - 1))
		{
			words[index] = next;
			index++;
		}
		cin.get(next); 
	}
	words[index] = '\0';
	//atoi will print all numbers.
	positive = atoi(words);
	//positive variable will return to the main program to convert in number words.
	cout << endl << "Today is " << date << ". \nIn " << address << " they have the total positive cases\nin COVID-19 of (" << positive << ")";
}
void newLine( )
{
	char symbol;
	do
	{
		cin.get(symbol);
	} 
	while (symbol != '\n');
}
     