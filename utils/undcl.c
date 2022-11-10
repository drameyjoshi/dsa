#include "dcl.h"

#include <stdio.h>
#include <string.h>

/*
This is a modification of the code given in Kernighan and Ritchie's book
'The C Programming Language' in section 5.12. It takes a symbolic description
of a function and returns a valid C declaration.
*/
int main()
{
	int type;
	const int BUFSIZE = 1024;
	const int maxcpy = BUFSIZE - 1;
	char temp[BUFSIZE];
	char token[BUFSIZE];
	char out[BUFSIZE];

	while (get_token(token) != EOF) {
		/* For each line of input. */
		strncpy(out, token, maxcpy);
		while ((type = get_token(token)) != '\n') {
			if (type == PARENS || type == BRACKETS) {
				strcat(out, token);
			} else if (type == '*') {
				sprintf(temp, "(*%s)", out);
				strncpy(out, temp, maxcpy);
			} else if (type == NAME) {
				sprintf(temp, "%s %s", token, out);
				strncpy(out, temp, maxcpy);
			} else {
				printf("Invalid input at %s\n", token);
			}
		}
		printf("%s\n", out);
	}

	return 0;
}
