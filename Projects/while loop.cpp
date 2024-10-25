// PROBLEM #2
// Create a loop that will print out the limit of a number using C++

#include<iostream>
using namespace std;
int main(){
	int snumber = 1;
	int limit;
	cout << "LOOP TO PRINT OUT ALL THE NUMBERS FROM THE GIVEN LIMIT NUMBER" << endl;
	cout << "Enter your limit number: ";
	cin >> limit;
	
	while (snumber<=limit){
		cout << snumber << " ay hindi lumampas sa ibinigay mong limit number! \n";
		snumber++;
	}
	cout << "\nNaabot mo na ang ibinigay mong limit number!";
	
	return 0;
}