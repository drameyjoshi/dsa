#ifndef _LOGGER_H_
#define _LOGGER_H_

#include "logger.h"

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdarg.h>
#include <errno.h>

#define MAXLINE (4096)

static void print(int errFlag, int errnum, const char* fmt, va_list ap)
{
    char buf[MAXLINE];

    vsnprintf(buf, MAXLINE - 1, fmt, ap);
    if (errFlag) {
        snprintf(buf + strlen(buf), 
                 MAXLINE - strlen(buf) - 1, 
                 ": %s", 
                 strerror(errnum));
    }
    strcat(buf, "\n");
    fflush(stdout);
    fputs(buf, stderr);
    fflush(NULL);
}


void logMessage(const char* fmt, ...)
{
    va_list ap;
    va_start(ap, fmt);
    print(0, 0, fmt, ap);
    va_end(ap);
}

void logError(int errnum, const char* fmt, ...)
{
    va_list ap;
    va_start(ap, fmt);
    print(1, errnum, fmt, ap);
    va_end(ap);
    abort();
}


#endif
