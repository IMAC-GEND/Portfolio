//This program compute Term Grade with the following grading policies.
//Term Grade is computed as Raw Score *.625 +37.5. 
//Any grade of 75 or more is Passed and Failed if below 75. 
//There should be at least three functions: 
//one for input, one to do the computation, and one for output. 
//Define and use a structure type for the student record.

//CORPUZ, REIMARC G.
//BSCPE 2GF

#include <iostream>

typedef int* NumberPtr;

using namespace std;

//the user will input data for performance
struct CDPerformance
{
	int numberofPerformance; //ask the user the number of performance output
	int score_performanceArray = 0; //array for total scores
	int outof_performanceArray = 0; //array for total items
};
//input data for recitation
struct CDRecitation //same code from performance
{
	int numberofRecitation;
	int score_recitationArray = 0;
	int outof_recitationArray = 0;
};
//input data for quizzes
struct CDQuizzes //same code from performance
{
	int numberofQuizzes;
	int score_QuizzesArray = 0;
	int outof_QuizzesArray = 0;
};
//input data for exam
struct CDExam // the inputed data will use in the main program for function
{
	int examScore;
	int examOutof;
};

void getPerformanceDATA(CDPerformance& PTask, int term); //function for inputing data
void performanceRAWSCORE(int numberofPerformance, double totalScorePT,double totalOutofPT, double& PERFORMANCE); //funtion for computing the raw score for performance

void getRecitationDATA(CDRecitation& CParticipation, int term); //same
void recitationRAWSCORE(int numberofRecitation, double totalScoreCP,double totalOutofCP, double& RECITATION); //same 

void getQuizzesDATA(CDQuizzes& MyQuizzes, int term); //same
void quizzesRAWSCORE(int numberofQuizzes, double totalScoreQ,double totalOutofQ, double& QUIZ); //same

void getExamDATA(CDExam& Exam, int term); //same
void examRAWSCORE(double examScore, double examOutof, double& EXAM, int term); //same

void TERM_GRADE(double PERFORMANCE_TASK, double RECITATION, double QUIZ, double EXAM, int term); //funtion getting the final termm grade if PASSED or FAILED

void newLine( );

int main()
{
	int term;
	double PERFORMANCE_TASK, RECITATION, QUIZ, EXAM;

 	//from the given structure outside the main program
	CDPerformance Performance_Task;
 	CDRecitation Class_Participation;
 	CDQuizzes Quizzes;
 	CDExam Exam;
 	
 	char try_again;
 	do 
	{
	 	cout << "\nLET'S COMPUTE YOUR TERM GRADE \nENTER THE TERM: "; //to know what term is to be compute
	 	cin >> term;
	 	
	 	getPerformanceDATA(Performance_Task, term); //line 45
	 	performanceRAWSCORE(Performance_Task.numberofPerformance, Performance_Task.score_performanceArray, Performance_Task.outof_performanceArray, PERFORMANCE_TASK); //line 46
	 	
	 	getRecitationDATA(Class_Participation, term); //line 48
	 	recitationRAWSCORE(Class_Participation.numberofRecitation, Class_Participation.score_recitationArray, Class_Participation.outof_recitationArray, RECITATION); //line 49
	 	
	 	getQuizzesDATA(Quizzes, term); //line 51
	 	quizzesRAWSCORE(Quizzes.numberofQuizzes, Quizzes.score_QuizzesArray, Quizzes.outof_QuizzesArray, QUIZ); //line 52
	 	
	 	getExamDATA(Exam, term); //line 54
	 	examRAWSCORE(Exam.examScore, Exam.examOutof, EXAM, term); //line 55
	 	
	 	TERM_GRADE(PERFORMANCE_TASK, RECITATION, QUIZ, EXAM, term); //it will compute the total term grade using each raw scores
	 	
	 	
		cout << endl << endl << "Try again? ";
		cin >> try_again;
		newLine( );
    }
    while ((try_again!='N')&&(try_again!='n'));
}
void getPerformanceDATA(CDPerformance& PTask, int term)
{
	cout << "\nPERFORMANCE TASK\n";
	if (term == 1) //if satatement to add st, nd, rd in the given statement
	{
		cout << "Enter the number of Performance Task in " << term << "st term (PRELIM): ";
		cin >> PTask.numberofPerformance;
	}
	if (term == 2)
	{
		cout << "Enter the number of Performance Task in " << term << "nd term (MIDTERM): ";
		cin >> PTask.numberofPerformance;
	}
	if (term == 3)
	{
		cout << "Enter the number of Performance Task in " << term << "rd term (FINAL): ";
		cin >> PTask.numberofPerformance;
	}
	
	NumberPtr scores;
	scores = new int[PTask.numberofPerformance];
	for (int i = 0; i < PTask.numberofPerformance; i++) //loop to input in scores
	{
		cout << "SCORE " << i + 1 << ": ";
    	cin >> scores[i];
    }
   	for( int i = 0; i < PTask.numberofPerformance; i++) //loop to get the sum of the scores
      PTask.score_performanceArray = PTask.score_performanceArray + scores[i];
      cout << "TOTAL SCORE: " << PTask.score_performanceArray << endl;
      
    NumberPtr outof;
	outof = new int[PTask.numberofPerformance]; //loop to input items
	for (int ii = 0; ii < PTask.numberofPerformance; ii++) 
	{
		cout << "ITEM FOR SCORE " << ii + 1 << ": ";
    	cin >> outof[ii];
    }
   	for( int ii = 0; ii < PTask.numberofPerformance; ii++) //loop to get the sum of items
      PTask.outof_performanceArray = PTask.outof_performanceArray + outof[ii];
      cout << "TOTAL ITEM: " << PTask.outof_performanceArray << endl;
      
    delete scores;
	delete outof;
}
void performanceRAWSCORE(int numberofPerformance, double totalScorePT,double totalOutofPT, double& PERFORMANCE)
{
	cout << "FROM YOUR " << numberofPerformance << " SCORES, YOUR RAW SCORE IN PERFORMANCE TASK (40%) IS " << (totalScorePT/totalOutofPT)*40;
	PERFORMANCE = (totalScorePT/totalOutofPT)*40;
}
void getRecitationDATA(CDRecitation& CParticipation, int term)
{
	cout << "\n\nRECITATION/CLASS PARTICIPATION\n";
	if (term == 1)
	{
		cout << "Enter the number of Recitation in " << term << "st term (PRELIM): ";
		cin >> CParticipation.numberofRecitation;
	}
	if (term == 2)
	{
		cout << "Enter the number of Recitation in " << term << "nd term (MIDTERM): ";
		cin >> CParticipation.numberofRecitation;
	}
	if (term == 3)
	{
		cout << "Enter the number of Recitation in " << term << "rd term (FINAL): ";
		cin >> CParticipation.numberofRecitation;
	}
	
	NumberPtr scores;
	scores = new int[CParticipation.numberofRecitation];
	for (int i = 0; i < CParticipation.numberofRecitation; i++) 
	{
		cout << "SCORE " << i + 1 << ": ";
    	cin >> scores[i];
    }
   	for( int i = 0; i < CParticipation.numberofRecitation; i++)
      CParticipation.score_recitationArray = CParticipation.score_recitationArray + scores[i];
      cout << "TOTAL SCORE: " << CParticipation.score_recitationArray << endl;
      
    NumberPtr outof;
	outof = new int[CParticipation.numberofRecitation];
	for (int ii = 0; ii < CParticipation.numberofRecitation; ii++) 
	{
		cout << "ITEM FOR SCORE " << ii + 1 << ": ";
    	cin >> outof[ii];
    }
   	for( int ii = 0; ii < CParticipation.numberofRecitation; ii++)
      CParticipation.outof_recitationArray = CParticipation.outof_recitationArray + outof[ii];
      cout << "TOTAL ITEM: " << CParticipation.outof_recitationArray << endl;
      
    delete scores;
	delete outof;
}
void recitationRAWSCORE(int numberofRecitation, double totalScoreCP,double totalOutofCP, double& RECITATION)
{
	cout << "FROM YOUR " << numberofRecitation << " SCORES, YOUR RAW SCORE IN RECITATION (15%) IS " << (totalScoreCP/totalOutofCP)*15;
	RECITATION = (totalScoreCP/totalOutofCP)*15;
}
void getQuizzesDATA(CDQuizzes& MyQuizzes, int term)
{
	cout << "\n\nQUIZZES\n";
	if (term == 1)
	{
		cout << "Enter the number of Quiz in " << term << "st term (PRELIM): ";
		cin >> MyQuizzes.numberofQuizzes;
	}
	if (term == 2)
	{
		cout << "Enter the number of Quiz in " << term << "nd term (MIDTERM): ";
		cin >> MyQuizzes.numberofQuizzes;
	}
	if (term == 3)
	{
		cout << "Enter the number of Quiz in " << term << "rd term (FINAL): ";
		cin >> MyQuizzes.numberofQuizzes;
	}
	
	NumberPtr scores;
	scores = new int[MyQuizzes.numberofQuizzes];
	for (int i = 0; i < MyQuizzes.numberofQuizzes; i++) 
	{
		cout << "SCORE " << i + 1 << ": ";
    	cin >> scores[i];
    }
   	for( int i = 0; i < MyQuizzes.numberofQuizzes; i++)
      MyQuizzes.score_QuizzesArray = MyQuizzes.score_QuizzesArray + scores[i];
      cout << "TOTAL SCORE: " << MyQuizzes.score_QuizzesArray << endl;
      
    NumberPtr outof;
	outof = new int[MyQuizzes.numberofQuizzes];
	for (int ii = 0; ii < MyQuizzes.numberofQuizzes; ii++) 
	{
		cout << "ITEM FOR SCORE " << ii + 1 << ": ";
    	cin >> outof[ii];
    }
   	for( int ii = 0; ii < MyQuizzes.numberofQuizzes; ii++)
      MyQuizzes.outof_QuizzesArray = MyQuizzes.outof_QuizzesArray + outof[ii];
      cout << "TOTAL ITEM: " << MyQuizzes.outof_QuizzesArray << endl;
      
    delete scores;
	delete outof;
}
void quizzesRAWSCORE(int numberofQuizzes, double totalScoreQ,double totalOutofQ, double& QUIZ)
{
	cout << "FROM YOUR " << numberofQuizzes << " SCORES, YOUR RAW SCORE IN QUIZZES (20%) IS " << (totalScoreQ/totalOutofQ)*20;
	QUIZ = (totalScoreQ/totalOutofQ)*20;
}
void getExamDATA(CDExam& Exam, int term)
{
	cout << "\n\nEXAM\n";
	cout << "EXAM SCORE: ";
	cin >> Exam.examScore;
	cout << "EXAM ITEM: ";
	cin >> Exam.examOutof;
}
void examRAWSCORE(double examScore, double examOutof, double& EXAM, int term)
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
void TERM_GRADE(double PERFORMANCE_TASK, double RECITATION, double QUIZ, double EXAM, int term)
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