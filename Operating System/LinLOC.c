#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main() {
    char filename[100];

    printf("Enter the filename: ");
    scanf("%s", filename);

    char *absPath = realpath(filename, NULL);
    if (absPath != NULL) {
        printf("Location: %s\n", absPath);
        free(absPath);
    } else {
        printf("Failed to get file location.\n");
    }

    return 0;
}
