//Using Class, modify your program in Lab Exercise Structure
//CORPUZ, REIMARC G.
//BSCPE 2GF
#include <iostream>

typedef int* NumberPtr;

using namespace std;

class TERM_GRADE
{
	public:
		//CDfunction to input data for PERFORMANCE, RECIATATION, QUIZZES, and EXAM
		//COMPUTE_function to calculate the each raw score
		void CDPerformance(int& numberofPerformance, int& score_performanceArray, int& outof_performanceArray, int term);
		void COMPUTE_PERFORMANCE(int numberofPerformance, double score_performanceArray, double outof_performanceArray, double& PERFORMANCE_TASK); 
		void CDRecitation(int& numberofRecitation, int& score_recitationArray, int& outof_recitationArray, int term);
		void COMPUTE_RECITATION(int numberofRecitation, double score_recitationArray, double outof_recitationArray, double& RECITATION);
		void CDQuizzes(int& numberofQuizzes, int& score_QuizzesArray, int& outof_QuizzesArray, int term);
		void COMPUTE_QUIZZES(int numberofQuizzes, double score_QuizzesArray, double outof_QuizzesArray, double& QUIZ); 
		void CDExam(int& examScore, int& examOutof);
		void COMPUTE_EXAM(double examScore, double examOutof, double& EXAM, int term); 
		//get all each computed raw score to calculate the final grade for the given term
		void TOTAL_TERMGRADE(double PERFORMANCE_TASK, double RECITATION, double QUIZ, double EXAM, int term); 
};

void newLine( );

int main()
{
	//PERFORMANCE TASK
	int numberofPerformance, score_performanceArray = 0, outof_performanceArray = 0;
	//CLASS PARTICIPATION
	int numberofRecitation, score_recitationArray = 0, outof_recitationArray = 0;
	//QUIZZES
	int numberofQuizzes, score_QuizzesArray = 0, outof_QuizzesArray = 0;
	//EXAM
	int examScore, examOutof;
	
	int term;
	double PERFORMANCE_TASK, RECITATION, QUIZ, EXAM;

 	TERM_GRADE getPerformanceDATA, performanceRAWSCORE, getRecitationDATA, recitationRAWSCORE, getQuizzesDATA, quizzesRAWSCORE, 
 			   getExamDATA, examRAWSCORE, TOTAL_GRADE;
 	
 	char try_again;
 	do 
	{
	 	cout << "\nLET'S COMPUTE YOUR TERM GRADE \nENTER THE TERM: "; 
	 	cin >> term;
	 	
	 	//class > public > void function line 53 - 65
	 	getPerformanceDATA.CDPerformance(numberofPerformance, score_performanceArray, outof_performanceArray, term); 
	 	performanceRAWSCORE.COMPUTE_PERFORMANCE(numberofPerformance, score_performanceArray, outof_performanceArray, PERFORMANCE_TASK);
	 	
	 	getRecitationDATA.CDRecitation(numberofRecitation, score_recitationArray, outof_recitationArray, term); 
	 	recitationRAWSCORE.COMPUTE_RECITATION(numberofRecitation, score_recitationArray, outof_recitationArray, RECITATION);
	 	
	 	getQuizzesDATA.CDQuizzes(numberofQuizzes, score_QuizzesArray, outof_QuizzesArray, term); 
	 	quizzesRAWSCORE.COMPUTE_QUIZZES(numberofQuizzes, score_QuizzesArray, outof_QuizzesArray, QUIZ); 
	 	
	 	getExamDATA.CDExam(examScore, examOutof); 
	 	examRAWSCORE.COMPUTE_EXAM(examScore, examOutof, EXAM, term); 
	 	
	 	TOTAL_GRADE.TOTAL_TERMGRADE(PERFORMANCE_TASK, RECITATION, QUIZ, EXAM, term); 
	 	
	 	
		cout << endl << endl << "Try again? ";
		cin >> try_again;
		newLine( );
    }
    while ((try_again!='N')&&(try_again!='n'));
}
void TERM_GRADE::CDPerformance(int& numberofPerformance, int& score_performanceArray, int& outof_performanceArray, int term)
{
	cout << "\nPERFORMANCE TASK\n";
	if (term == 1) //if satatement to add st, nd, rd in the given statement
	{
		cout << "Enter the number of Performance Task in " << term << "st term (PRELIM): ";
		cin >> numberofPerformance;
	}
	if (term == 2)
	{
		cout << "Enter the number of Performance Task in " << term << "nd term (MIDTERM): ";
		cin >> numberofPerformance;
	}
	if (term == 3)
	{
		cout << "Enter the number of Performance Task in " << term << "rd term (FINAL): ";
		cin >> numberofPerformance;
	}
	
	NumberPtr scores;
	scores = new int[numberofPerformance];
	for (int i = 0; i < numberofPerformance; i++) //loop to input in scores
	{
		cout << "SCORE " << i + 1 << ": ";
    	cin >> scores[i];
    }
   	for( int i = 0; i < numberofPerformance; i++) //loop to get the sum of the scores
      score_performanceArray = score_performanceArray + scores[i];
      cout << "TOTAL SCORE: " << score_performanceArray << endl;
      
    NumberPtr outof;
	outof = new int[numberofPerformance]; //loop to input items
	for (int ii = 0; ii < numberofPerformance; ii++) 
	{
		cout << "ITEM FOR SCORE " << ii + 1 << ": ";
    	cin >> outof[ii];
    }
   	for( int ii = 0; ii < numberofPerformance; ii++) //loop to get the sum of items
      outof_performanceArray = outof_performanceArray + outof[ii];
      cout << "TOTAL ITEM: " << outof_performanceArray << endl;
      
    delete scores;
	delete outof;
}
void TERM_GRADE::COMPUTE_PERFORMANCE(int numberofPerformance, double score_performanceArray, double outof_performanceArray, double& PERFORMANCE_TASK)
{
	cout << "FROM YOUR " << numberofPerformance << " SCORES, YOUR RAW SCORE IN PERFORMANCE TASK (40%) IS " << (score_performanceArray/outof_performanceArray)*40;
	PERFORMANCE_TASK = (score_performanceArray/outof_performanceArray)*40;
}
void TERM_GRADE::CDRecitation(int& numberofRecitation, int& score_recitationArray, int& outof_recitationArray, int term)
{
	cout << "\n\nRECITATION/CLASS PARTICIPATION\n";
	if (term == 1)
	{
		cout << "Enter the number of Recitation in " << term << "st term (PRELIM): ";
		cin >> numberofRecitation;
	}
	if (term == 2)
	{
		cout << "Enter the number of Recitation in " << term << "nd term (MIDTERM): ";
		cin >> numberofRecitation;
	}
	if (term == 3)
	{
		cout << "Enter the number of Recitation in " << term << "rd term (FINAL): ";
		cin >> numberofRecitation;
	}
	
	NumberPtr scores;
	scores = new int[numberofRecitation];
	for (int i = 0; i < numberofRecitation; i++) 
	{
		cout << "SCORE " << i + 1 << ": ";
    	cin >> scores[i];
    }
   	for( int i = 0; i < numberofRecitation; i++)
      score_recitationArray = score_recitationArray + scores[i];
      cout << "TOTAL SCORE: " << score_recitationArray << endl;
      
    NumberPtr outof;
	outof = new int[numberofRecitation];
	for (int ii = 0; ii < numberofRecitation; ii++) 
	{
		cout << "ITEM FOR SCORE " << ii + 1 << ": ";
    	cin >> outof[ii];
    }
   	for( int ii = 0; ii < numberofRecitation; ii++)
      outof_recitationArray = outof_recitationArray + outof[ii];
      cout << "TOTAL ITEM: " << outof_recitationArray << endl;
      
    delete scores;
	delete outof;
}
void TERM_GRADE::COMPUTE_RECITATION(int numberofRecitation, double score_recitationArray, double outof_recitationArray, double& RECITATION)
{
	cout << "FROM YOUR " << numberofRecitation << " SCORES, YOUR RAW SCORE IN RECITATION (15%) IS " << (score_recitationArray/outof_recitationArray)*15;
	RECITATION = (score_recitationArray/outof_recitationArray)*15;
}
void TERM_GRADE::CDQuizzes(int& numberofQuizzes, int& score_QuizzesArray, int& outof_QuizzesArray, int term)
{
	cout << "\n\nQUIZZES\n";
	if (term == 1)
	{
		cout << "Enter the number of Quiz in " << term << "st term (PRELIM): ";
		cin >> numberofQuizzes;
	}
	if (term == 2)
	{
		cout << "Enter the number of Quiz in " << term << "nd term (MIDTERM): ";
		cin >> numberofQuizzes;
	}
	if (term == 3)
	{
		cout << "Enter the number of Quiz in " << term << "rd term (FINAL): ";
		cin >> numberofQuizzes;
	}
	
	NumberPtr scores;
	scores = new int[numberofQuizzes];
	for (int i = 0; i < numberofQuizzes; i++) 
	{
		cout << "SCORE " << i + 1 << ": ";
    	cin >> scores[i];
    }
   	for( int i = 0; i < numberofQuizzes; i++)
      score_QuizzesArray = score_QuizzesArray + scores[i];
      cout << "TOTAL SCORE: " << score_QuizzesArray << endl;
      
    NumberPtr outof;
	outof = new int[numberofQuizzes];
	for (int ii = 0; ii < numberofQuizzes; ii++) 
	{
		cout << "ITEM FOR SCORE " << ii + 1 << ": ";
    	cin >> outof[ii];
    }
   	for( int ii = 0; ii < numberofQuizzes; ii++)
      outof_QuizzesArray = outof_QuizzesArray + outof[ii];
      cout << "TOTAL ITEM: " << outof_QuizzesArray << endl;
      
    delete scores;
	delete outof;
}
void TERM_GRADE::COMPUTE_QUIZZES(int numberofQuizzes, double score_QuizzesArray, double outof_QuizzesArray, double& QUIZ)
{
	cout << "FROM YOUR " << numberofQuizzes << " SCORES, YOUR RAW SCORE IN QUIZZES (20%) IS " << (score_QuizzesArray/outof_QuizzesArray)*20;
	QUIZ = (score_QuizzesArray/outof_QuizzesArray)*20;
}
void TERM_GRADE::CDExam(int& examScore, int& examOutof)
{
	cout << "\n\nEXAM\n";
	cout << "EXAM SCORE: ";
	cin >> examScore;
	cout << "EXAM ITEM: ";
	cin >> examOutof;
}
void TERM_GRADE::COMPUTE_EXAM(double examScore, double examOutof, double& EXAM, int term)
{
	if (term == 1) //if statement to identify if prelim, midterm or final term
	{
		EXAM = (examScore/examOutof)*25;
		cout << "YOUR RAW SCORE IN PRELIMINARY EXAM (25%) IS " << EXAM;
	}
	if (term == 2)
	{
		EXAM = (examScore/examOutof)*25;
		cout << "YOUR RAW SCORE IN MIDTERM EXAM (25%) IS " << EXAM;
	}
	if (term == 3)
	{
		EXAM = (examScore/examOutof)*25;
		cout << "YOUR RAW SCORE IN FINAL EXAM (25%) IS " << EXAM;
	}
}
void TERM_GRADE::TOTAL_TERMGRADE(double PERFORMANCE_TASK, double RECITATION, double QUIZ, double EXAM, int term)
{
	double sum;
	double Term_Grade;
	sum = PERFORMANCE_TASK + RECITATION + QUIZ + EXAM;
	Term_Grade = (sum*0.625) + 37.5;
	if (Term_Grade > 75)
	{
		if (term == 1)
		{
			cout << "\n\nYOUR GRADE FOR PRELIMINARY IS " << Term_Grade << " (PASSED)";
		}
			if (term == 2)
		{
			cout << "\n\nYOUR GRADE FOR MIDTERM IS " << Term_Grade << " (PASSED)";
		}
			if (term == 3)
		{
			cout << "\n\nYOUR GRADE FOR FINAL IS " << Term_Grade << " (PASSED)";
		}
	}
	if (Term_Grade < 75)
	{
		if (term == 1)
		{
			cout << "\n\nYOUR GRADE FOR PRELIMINARY IS " <<  Term_Grade << " (FAILED)";
		}
			if (term == 2)
		{
			cout << "\n\nYOUR GRADE FOR MIDTERM IS " << Term_Grade << " (FAILED)";
		}
			if (term == 3)
		{
			cout << "\n\nYOUR GRADE FOR FINAL IS " << Term_Grade << " (FAILED)";
		}
	}
	if (Term_Grade >= 98 && Term_Grade <= 100)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 1.00"; 
	}
	else if (Term_Grade >= 95 && Term_Grade <= 97)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 1.25"; 
	}
	else if (Term_Grade >= 92 && Term_Grade <= 94)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 1.50"; 
	}
	else if (Term_Grade >= 89 && Term_Grade <= 91)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 1.75"; 
	}
	else if (Term_Grade >= 86 && Term_Grade <= 88)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 2.00"; 
	}
	else if (Term_Grade >= 83 && Term_Grade <= 85)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 2.25"; 
	}
	else if (Term_Grade >= 80 && Term_Grade <= 82)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 2.50"; 
	}
	else if (Term_Grade >= 77 && Term_Grade <= 79)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 2.75"; 
	}
	else if (Term_Grade == 75 && Term_Grade == 76)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 3.00"; 
	}
	else if (Term_Grade >= 70 && Term_Grade <= 74)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 4.00"; 
	}
	else if (Term_Grade >= 37.5 && Term_Grade <= 69)
	{
		cout << endl << "YOUR EQUIVALENT GRADE IS: 5.00"; 
	}
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