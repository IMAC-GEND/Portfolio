#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

int main() {
    char filename[100];

    printf("Enter the filename: ");
    scanf("%s", filename);

    char fullPath[MAX_PATH];
    if (GetFullPathName(filename, MAX_PATH, fullPath, NULL) != 0) {
        printf("Location: %s\n", fullPath);
    } else {
        printf("Failed to get file location.\n");
    }

    return 0;
}
