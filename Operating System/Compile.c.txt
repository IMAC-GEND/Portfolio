#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>

#ifdef _WIN32
    #include <windows.h>
    #include <time.h>
#elif __linux__
    #include <sys/types.h>
    #include <sys/stat.h>
    #include <unistd.h>
#endif

void printFileDetails(const char* filename) {
    // Get file size and other details
    struct stat st;

    #ifdef _WIN32
        char fullPath[MAX_PATH];
        if (GetFullPathName(filename, MAX_PATH, fullPath, NULL) != 0) {
            if (stat(fullPath, &st) == 0) {
                printf("File Size: %ld bytes\n", st.st_size);
                printf("Created Date: %s", ctime(&st.st_ctime));
                printf("Location: %s\n", fullPath);
            } else {
                printf("Failed to get file details.\n");
            }
        } else {
            printf("Failed to get absolute path.\n");
        }
    #elif __linux__
        char *absPath = realpath(filename, NULL);
        if (absPath != NULL) {
            if (stat(absPath, &st) == 0) {
                printf("File Size: %ld bytes\n", st.st_size);
                printf("Created Date: %s", ctime(&st.st_ctime));
                printf("Location: %s\n", absPath);
                free(absPath);
            } else {
                printf("Failed to get file details.\n");
                free(absPath);
            }
        } else {
            printf("Failed to get absolute path.\n");
        }
    #endif
}

int main() {
    char filename[100];

    printf("Enter the filename: ");
    scanf("%s", filename);

    printFileDetails(filename);

    return 0;
}
