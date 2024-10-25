#include <stdio.h>
#include <stdlib.h>

// Process structure
typedef struct
{
    int pid;    // Process ID
    int burst;  // Burst time
    int waiting; // Waiting time
    int turnaround; // Turnaround time
} Process;

// Function to calculate waiting and turnaround time for each process
void calculateTimes(Process *processes, int n)
{
    int i;
    float totalWaiting = 0, totalTurnaround = 0;
    processes[0].waiting = 0;
    processes[0].turnaround = processes[0].burst;

    for (i = 1; i < n; i++)
    {
        processes[i].waiting = processes[i - 1].waiting + processes[i - 1].burst;
        processes[i].turnaround = processes[i].waiting + processes[i].burst;
        totalWaiting += processes[i].waiting;
        totalTurnaround += processes[i].turnaround;
    }

    printf("\nProcess\tBurst Time\tWaiting Time\tTurnaround Time\n");

    for (i = 0; i < n; i++)
    {
        printf("%d\t%d\t\t%d\t\t%d\n", processes[i].pid, processes[i].burst,
               processes[i].waiting, processes[i].turnaround);
    }

    printf("\nAverage Waiting Time: %.2f", totalWaiting / n);
    printf("\nAverage Turnaround Time: %.2f", totalTurnaround / n);
}

// Function to sort the processes based on their burst time using selection sort
void sortProcesses(Process *processes, int n)
{
    int i, j;
    Process temp;

    for (i = 0; i < n - 1; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (processes[i].burst > processes[j].burst)
            {
                temp = processes[i];
                processes[i] = processes[j];
                processes[j] = temp;
            }
        }
    }
}

int main()
{
    int n, i;

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    Process *processes = (Process *)malloc(n * sizeof(Process));

    printf("\nEnter burst time for each process:\n");

    for (i = 0; i < n; i++)
    {
        printf("Process %d: ", i + 1);
        scanf("%d", &processes[i].burst);
        processes[i].pid = i + 1;
    }

    sortProcesses(processes, n);
    calculateTimes(processes, n);

    free(processes);

    return 0;
}
