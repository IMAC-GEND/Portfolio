#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>

int main() {
    char filename[100];

    printf("Enter the filename: ");
    scanf("%s", filename);

    struct stat st;
    if (stat(filename, &st) == 0) {
        printf("File Size: %ld bytes\n", st.st_size);
    } else {
        printf("Failed to get file size.\n");
    }

    return 0;
}
