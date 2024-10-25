#include <iostream>
#include <iomanip>
using namespace std;

const int num_stud=4, num_quiz=3;

void fill_array(int a[][num_quiz], int num_stud);
void display(int a[][num_quiz], int num_stud);

int main()
{
 	int score[num_stud][num_quiz];
 	fill_array(score, num_stud);
 	display(score, num_stud);
 	
return 0;
}
void fill_array(int a[][num_quiz], int num_stud)
{
	cout << "Enter " << num_quiz << " scores of " << num_stud << " students:\n";
	for (int index1=0; index1<num_stud; index1++)
	{
		cout << "Students " << index1+1 << " scores:";
		for (int index2=0; index2<num_quiz; index2++)
		{
			int next;
			cin >> next;
			a[index1][index2]=next;
		}
	}
}
void display(int a[][num_quiz], int num_stud)
{
	cout << "Students quiz scores are:\n";
	for (int index1=0; index1<num_stud; index1++)
	{
		for (int index2=0; index2<num_quiz; index2++)
		
			cout << setw(5) << a[index1][index2];
			cout << endl;
		
	}
}