#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>
#include <time.h>

int main() {
    char filename[100];

    printf("Enter the filename: ");
    scanf("%s", filename);

    struct stat st;
    if (stat(filename, &st) == 0) {
        printf("Created Date: %s", ctime(&st.st_ctime));
    } else {
        printf("Failed to get file creation date and time.\n");
    }

    return 0;
}
