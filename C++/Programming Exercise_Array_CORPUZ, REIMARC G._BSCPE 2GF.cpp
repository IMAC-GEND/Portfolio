//REIMARC G. CORPUZ
//BSCPE 2GF
//WEEKLY AVERAGE OF FAMILY EXPENSES
#include <iostream>
#include <iomanip>

const int DAYS = 7;

void perday_expenses(int weekly[],int  number_of_days);	
//Precondition - number_of_days is the declared size of the array weekly.
//Postcondition - The statement per day will appear in the screen.
//				- it also include a loop that will repeat the array from day 1 to until one week.
//				- every another day it will get the sum of all cost from the previous day added to next day
//				  except for do while loop.
//				- the average will print in the screen after all seven days cost are inputed.
void expenses_per_day(int& per_day, int number_cost, double& sum);
//Precondition - per_day is an array for each day.
//			   - number_cost is the inputed data from the user.
//			   - sum is the total of all cost per day.
//Postcondition - using an array in every day, another array will print in the screen
//				  for how many expenses per day using the number_cost
//				  and the sum will compute and added in every next day.

using namespace std;
int main()
{
	cout << endl << setw(50) << "FAMILY EXPENSES" << endl
		 << setw(50) << "WEEKLY AVERAGES" << endl
		 << "__________________________________________________________________________________"
		 << endl;
	 
 	int weekly_expenses[DAYS], per_day;
 	char again;
 	
 	perday_expenses(weekly_expenses, DAYS);
 		
	return 0;
}
void perday_expenses(int weekly[],int  number_of_days)
{
	char again;
	do
	{
	int number_cost;
	double sum;
	for (int number=1; number<=number_of_days; number++)
	{
		cout << "DAY " << number << " EXPENSES "; 
		cout << "\nNumber of cost a day : ";
	    cin >> number_cost;
		expenses_per_day(weekly[number-1], number_cost, sum);
		sum+-1; //to get the sum of every next day.
		cout << "__________________________________________________________________________________"
			 << endl;
	}
	cout << "\nWEEKLY AVERAGE EXPENSES IS : " << sum/7; //to print after 7th array.
	
	double another_week = 0; //use to reassign zero value for sum and the loop will start at zero value. 
	sum = another_week;
	cout << "\nType YES or NO:\nTest the next week? ";
 	cin >> again;
	}
	while ((again!='N')&&(again!='n'));
}
void expenses_per_day(int& per_day, int number_cost, double& sum)
{
	double next; 
	int cost_per_day[number_cost];
	

	for (int a_day=1; a_day<=number_cost; a_day++)
	{
	cout <<"Cost " << a_day << " : ";
	cin >> next;
	sum+=next; //to print Cost depending how many number is inputed by the user.
	}		   //and get the sum of cost each day.
	cout << "SUM : " << sum << endl;
}