#include <stdio.h>

// Structure to represent a process
typedef struct {
    int processID;
    int burstTime;
    int remainingTime;
} Process;

// Function to execute the Round-Robin scheduling algorithm
void roundRobin(Process processes[], int n, int timeQuantum) {
    int i, totalTime = 0;
    int currentTime = 0;
    int completedProcesses = 0;

    // Calculate the total burst time of all processes
    for (i = 0; i < n; i++) {
        totalTime += processes[i].burstTime;
        processes[i].remainingTime = processes[i].burstTime;
    }

    // Execute the processes in a round-robin fashion
    while (completedProcesses < n) {
        for (i = 0; i < n; i++) {
            if (processes[i].remainingTime > 0) {
                if (processes[i].remainingTime <= timeQuantum) {
                    currentTime += processes[i].remainingTime;
                    processes[i].remainingTime = 0;
                } else {
                    currentTime += timeQuantum;
                    processes[i].remainingTime -= timeQuantum;
                }

                printf("Process %d executed. Current time: %d\n", processes[i].processID, currentTime);

                if (processes[i].remainingTime == 0) {
                    completedProcesses++;
                }
            }
        }
    }

    printf("\nAll processes executed successfully!\n");
}

int main() {
    int n, timeQuantum, i;

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    Process processes[n];

    printf("Enter burst time for each process:\n");
    for (i = 0; i < n; i++) {
        printf("Process %d: ", i + 1);
        scanf("%d", &processes[i].burstTime);
        processes[i].processID = i + 1;
    }

    printf("Enter the time quantum: ");
    scanf("%d", &timeQuantum);

    printf("\nExecuting Round-Robin CPU Scheduling\n\n");
    roundRobin(processes, n, timeQuantum);

    return 0;
}
