//CORPUZ, REIMARC G.
//BSCPE 2GF
//MULTIDIMENSIONAL ARRAY
#include <iostream>
#include <iomanip>
using namespace std;

const int weeks=5, days=7;


void booking(int book[][days], int days);
//Precondition: book[][days] for whole table.
//				days is constant to seven column.
//Postcondition: it will display each elemnent in an array 1 to 31
//				 using the for loop.
void newLine( );
//Postcondition: it will accept the remaining letters from its first letter.


int main()
{
	char ok1, ok2, ok3;

	cout << "  _____________________________________________________________________________"  << endl << endl << setw(53) << "WELCOME TO IMAC BEACH RESORT" << endl << setw(58) << "\"Better prices. Exceptional people.\"" << endl << "  _____________________________________________________________________________" << endl;
	
	char name [50];
	char address [80];
	char number [12];
	
	cout << endl << "  Name: ";
	cin.getline(name, 50);
	cout << "  Address: ";
	cin.getline(address, 80);
	cout << "  Contact no.: ";
	cin >> number;
	
	cout << endl << "  Hello " << name << "!" << endl << "  Welcome to Imac Beach Resort, " << endl << "  where the sun smiles and the sea is " << endl << "  whispering..";
	cout << endl << endl  << "  CONTINUE? ";
	cin >> ok1 >> ok2 >> ok3;
	if (ok1!='N'&&ok1!='n')
	{
		cout << endl  << endl << setw(49) << "~~ MAY 2022 ~~" << endl << "  _____________________________________________________________________________" << endl << endl;
		cout << setw(10) << "   Sun" 
			 << setw(11) << "Mon" 
			 << setw(10) << "Tue" 
			 << setw(10) << "Wed"
			 << setw(10) << "Thu"
			 << setw(10) << "Fri"
			 << setw(10) << "Sat" << endl << "  _____________________________________________________________________________" << endl;
	 	int week[weeks][days] = {{1, 2, 3, 4, 5, 6, 7}, 
		 				  		 {8, 9, 10, 11, 12, 13, 14},
		 				  		 {15, 16, 17, 18, 19, 20, 21},
						  		 {22, 23, 24, 25, 26, 27, 28}, 
						  		 {29, 30, 31}};
	
		booking(week, weeks);
	}
	else 
	{ 
		cout << "  OK! Try other resort." << endl;
	}
	return 0;
}
void booking(int book[][days], int days)
{
	for (int row=0; row<5; row++)
	{
	cout << endl;
		for (int column=0; column<7; column++)
		{
			cout << setw(10) << book[row][column];
		}
	cout << endl;
	}
	cout << "  _____________________________________________________________________________" << endl; 
	
	int day;
	int weekk;

char again;
do{//loop to for another month of May.
	cout << endl << endl << "  Enter the day of booking: ";
	cin >> day;
	cout << "  Enter the week of booking: ";
	cin >> weekk;
		if (day<8&&weekk==1)
	{
		if (weekk<6)
		{
			cout << "  You are book at May "<< book [weekk-1][day-1] << ", 2022." << endl;
		}
	}
	if (day>7&&day<=14&&weekk==2)
	{
		if (weekk<6)
		{
			cout << "  You are book at May "<< book [weekk-1][day-8] << ", 2022." << endl;
		}
	}
	if (day>14&&day<=21&&weekk==3)
	{
		if (weekk<6)
		{
			cout << "  You are book at May "<< book [weekk-1][day-15] << ", 2022." << endl;
		}
	}
	if (day>21&&day<=28&&weekk==4)
	{
		if (weekk<6)
		{
			cout << "  You are book at May "<< book [weekk-1][day-22] << ", 2022." << endl;
		}
	}
	if (day>28&&day<=31&&weekk==5)
	{
		if (weekk<6)
		{
			cout << "  You are book at May "<< book [weekk-1][day-29] << ", 2022." << endl;
		}
	}
	
	int check_in;
	cout << endl << "  Number of days to check-in: ";
	cin >> check_in;
	if ((day+check_in)<=31)
	{
		cout << "  Check-in: May " << day << ", 2022"
			 << endl << "  Check-out: May " << day+check_in << ", 2022" << endl;
	}
	if ((day+check_in)>31)
	{
		cout << "  Check-in: May " << day << ", 2022"
		     << endl << "  Check-out: June " << (day+check_in)-31 << ", 2022" << endl;
	}
		cout << endl  << endl << setw(49) << "~~ MAY 2022 ~~" << endl << "  _____________________________________________________________________________" << endl << endl;
		cout << setw(8) << "   Sun" 
			 << setw(11) << "Mon" 
			 << setw(11) << "Tue" 
			 << setw(11) << "Wed"
			 << setw(11) << "Thu"
			 << setw(11) << "Fri"
			 << setw(11) << "Sat" << endl << "  _____________________________________________________________________________" << endl;


	//same for loop but it will mark the selcted day of the user.
	for (int row=0; row<5; row++)
	{
	cout << endl;
		for (int column=0; column<7; column++)
		{
			cout << setw(7) << book[row][column];
			if (book[row][column]==day)
			{
				cout << " IN ";
			}
			if (book[row][column]==day+check_in)
			{
				cout << " OUT";
			}
			if (book[row][column]>day&&book[row][column]<day+check_in)
			{
				cout << " RSV";
			}
			if (book[row][column]<=31&&book[row][column]!=0)
			if (book[row][column]<day||book[row][column]>day+check_in)
			{
				cout << "    ";
			}
			if (book[row][column]==0)
			{
				cout << "    ";
			}
		}
	cout << endl;
	} 

	cout << "  _____________________________________________________________________________" << endl; 

	char again0;
	cout << endl << "  Another book? ";
	cin >> again0;
	newLine( );
	//a condition to select another day within the month of May.
	if ((again0!='N')&&(again0!='n'))
	{
	int day1;
	int weekk1;
	char try_again;
	do{//loop if the user selected the reserved days.
	cout << endl << endl << "  Enter the day of booking: ";
	cin >> day1;
	cout << "  Enter the week of booking: ";
	cin >> weekk1;
	if (day1<day||day1>day+check_in){
		if (day1<8&&weekk1==1)
	{
		if (weekk1<6)
		{
			cout << "  You are book at May "<< book [weekk1-1][day1-1] << ", 2022." << endl;
		}
	}
	if (day1>7&&day1<=14&&weekk1==2)
	{
		if (weekk1<6)
		{
			cout << "  You are book at May "<< book [weekk1-1][day1-8] << ", 2022." << endl;
		}
	}
	if (day1>14&&day1<=21&&weekk1==3)
	{
		if (weekk1<6)
		{
			cout << "  You are book at May "<< book [weekk1-1][day1-15] << ", 2022." << endl;
		}
	}
	if (day1>21&&day1<=28&&weekk1==4)
	{
		if (weekk1<6)
		{
			cout << "  You are book at May "<< book [weekk1-1][day1-22] << ", 2022." << endl;
		}
	}
	if (day1>28&&day1<=31&&weekk1==5)
	{
		if (weekk1<6)
		{
			cout << "  You are book at May "<< book [weekk1-1][day1-29] << ", 2022." << endl;
		}
	}
	
	int check_in1;
	cout << endl << "  Number of days to check-in: ";
	cin >> check_in1;
	//it will count what day is the check-in and check-out.
	if ((day1+check_in1)<31)
	{
		cout << "  Check-in: May " << day1 << ", 2022"
			 << endl << "  Check-out: May " << day1+check_in1 << ", 2022" << endl;
	}
	if ((day1+check_in1)>31)
	{
		cout << "  Check-in: May " << day1 << ", 2022"
		     << endl << "  Check-out: June " << (day1+check_in1)-31 << ", 2022" << endl;
	}
		cout << endl  << endl << setw(49) << "~~ MAY 2022 ~~" << endl << "  _____________________________________________________________________________" << endl << endl;
		cout << setw(8) << "   Sun" 
			 << setw(11) << "Mon" 
			 << setw(11) << "Tue" 
			 << setw(11) << "Wed"
			 << setw(11) << "Thu"
			 << setw(11) << "Fri"
			 << setw(11) << "Sat"  << endl << "  _____________________________________________________________________________" << endl;

	//same for loop but it will save the previous selected days 
	//and will print the new selected days.
	for (int row=0; row<5; row++)
	{
	cout << endl;
		for (int column=0; column<7; column++)
		{
			cout << setw(7) << book[row][column];
			if (book[row][column]==day||book[row][column]==day1)
			{
				cout << " IN ";
			}
			if (book[row][column]==day+check_in||book[row][column]==day1+check_in1)
			{
				cout << " OUT";
			}
			if (book[row][column]>day&&book[row][column]<day+check_in||book[row][column]>day1&&book[row][column]<day1+check_in1)
			{
				cout << " RSV";
			}
			if (book[row][column]==0)
			{
				cout << "    ";
			}
		}
	cout << endl;
	} 

	cout << "  _____________________________________________________________________________" << endl; 
	}else 
	{
		cout << "  The day you entered is reserved";
	}
	cout << endl << "  Try again? ";
	cin >> try_again;
	newLine( );
	}
	while ((try_again!='N')&&(try_again!='n'));
	}
	
	cout << endl << "  Advance book for May 2023? ";
	cin >> again;
	newLine( );
}
while ((again!='N')&&(again!='n'));
	
	//end of program.
	cout << endl << "  SUBMIT";
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
     