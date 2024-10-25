#include <stdio.h>
#include <stdlib.h>

typedef struct Process {
    int processID;
    int arrivalTime;
    int burstTime;
    int completionTime;
    int turnaroundTime;
    int waitingTime;
} Process;

void calculateTimes(Process *processes, int n) {
    int currentTime = 0;
    for (int i = 0; i < n; i++) {
        if (currentTime < processes[i].arrivalTime)
            currentTime = processes[i].arrivalTime;

        processes[i].waitingTime = currentTime - processes[i].arrivalTime;
        processes[i].completionTime = currentTime + processes[i].burstTime;
        processes[i].turnaroundTime = processes[i].completionTime - processes[i].arrivalTime;

        currentTime += processes[i].burstTime;
    }
}

void displayProcessTable(Process *processes, int n) {
    printf("Process\tArrival Time\tBurst Time\tCompletion Time\tTurnaround Time\tWaiting Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", processes[i].processID, processes[i].arrivalTime,
               processes[i].burstTime, processes[i].completionTime, processes[i].turnaroundTime,
               processes[i].waitingTime);
    }
}

int main() {
    int n;
    printf("Enter the number of processes: ");
    scanf("%d", &n);

    Process *processes = (Process *) malloc(n * sizeof(Process));

    printf("Enter arrival time and burst time for each process:\n");
    for (int i = 0; i < n; i++) {
        processes[i].processID = i + 1;
        printf("Process %d:\n", i + 1);
        printf("Arrival Time: ");
        scanf("%d", &processes[i].arrivalTime);
        printf("Burst Time: ");
        scanf("%d", &processes[i].burstTime);
    }

    calculateTimes(processes, n);
    displayProcessTable(processes, n);

    free(processes);
    return 0;
}
