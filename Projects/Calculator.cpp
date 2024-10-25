#include<iostream>
using namespace std;
int main()
{
	float operand1, operand2;
	char Operator;
	
	cout << "\tBASIC CALCULATOR\n" << endl;
	
		cout << "First Operand: ";
		cin >> operand1;
		cout << "Operator: ";
		cin >> Operator;
		cout <<"Second Operand: ";
		cin >> operand2;
	
		switch(Operator)
		{
			case '+':
				cout << "\nSUM: " << (operand1 + operand2);
				break;
			case '-':
				cout << "\nDIFFRENCE: " << (operand1 - operand2);
				break;
			case '*':
				cout << "\nPRODUCT: " << (operand1 * operand2);
				break;
			case '/':
				cout << "\nQOUTIENT: " << (operand1 / operand2);
				break;
			default:
				cout << "\nWRONG OPERATION!!";
				break;
		}
}