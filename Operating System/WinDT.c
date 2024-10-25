#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <windows.h>
#include <time.h>

int main() {
    char filename[100];

    printf("Enter the filename: ");
    scanf("%s", filename);

    struct stat st;
    char fullPath[MAX_PATH];
    if (GetFullPathName(filename, MAX_PATH, fullPath, NULL) != 0) {
        if (stat(fullPath, &st) == 0) {
            printf("Created Date: %s", ctime(&st.st_ctime));
        } else {
            printf("Failed to get file creation date and time.\n");
        }
    } else {
        printf("Failed to get absolute path.\n");
    }

    return 0;
}
