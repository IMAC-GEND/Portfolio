#include <iostream>
using namespace std;
int main()
{
	int number, digit;
    int again;
    int count; 
do
{
    cout << "Enter a positive Value between 0 to 9,999,999 :  ";
    cin >> number;
    
    

    digit = number; 
    
    if ((number<=9999999)&&(number>=0))
    {
    while (number != 0)
    {
    	count++;
        number /= 10;  
    }

    cout << digit << " is " << count << " digit/s";
    cout << "\n\n";
	}	

    if (number<0)
    {
    	cout << "Variable is Negative!\n\n";
	}
	if (number>9999999)
	{
		cout << "10,000,000 was larger than 9,999,999!\n\n";
	}
cout << "Press 1 o try again! :";
cin >> again;
}
while (again==1);

return 0;
}