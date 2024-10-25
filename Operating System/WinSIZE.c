#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <windows.h>

int main() {
    char filename[100];

    printf("Enter the filename: ");
    scanf("%s", filename);

    struct stat st;
    char fullPath[MAX_PATH];
    if (GetFullPathName(filename, MAX_PATH, fullPath, NULL) != 0) {
        if (stat(fullPath, &st) == 0) {
            printf("File Size: %ld bytes\n", st.st_size);
        } else {
            printf("Failed to get file size.\n");
        }
    } else {
        printf("Failed to get absolute path.\n");
    }

    return 0;
}
