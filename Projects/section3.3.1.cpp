#include <iostream>
using namespace std;
int main()
{
	double ans = 0; 
 	for (double sum = 2; sum <= 10; sum++)
 		{
 			ans += 1/sum;	
		}
		cout << "the sum is: " << ans;
}