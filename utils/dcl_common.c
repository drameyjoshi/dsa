#include "dcl.h"
#include "logger.h"

#include <ctype.h>
#include <stdio.h>
#include <string.h>

static const int BUFSIZE = 128;
static int buffer[128]; /* This is same as BUFSIZE. Avoiding a macro. */
static unsigned int bufp = 0;

static int getch(void)
{
    return (bufp > 0) ? buffer[--bufp] : getchar();
}

static int ungetch(int c)
{
    if (bufp >= BUFSIZE) {
        error("%s: too many characters.", __func__);
    } else {
        buffer[bufp++] = c;
    }
}

static int skip_ws()
{
    int c;

    while ((c = getch()) == ' ' || c == '\t') {
        ; /* Move to the next character. */
    }

    return c;
}

static void copy_upto(char token[], int startc, int endc)
{
    char* p = token;

    for (*p++ = startc; (*p++ = getch()) != endc;) {
        ;
    }
    *p = '\0';
}

int get_token(char token[])
{
    int c;
    char* p = token;

    c = skip_ws();

    if (c == '(') {
        copy_upto(token, c, ')');
        return PARENS;
    } else if (c == '[') {
        for (*p++ = c; (*p++ = getch()) != ']';) {
            ;
        }
        return BRACKETS;
    } else if (isalpha(c)) {
        for (*p++ = c; isalnum(c = getch());) {
            *p++ = c;
        }
        *p = '\0';
        ungetch(c);
        return NAME;
    } else {
        return c;
    }
}
