#ifndef _LOGGER_H_
#define _LOGGER_H_

void logMessage(const char* fmt, ...);
void logError(int errno, const char* fmt, ...);

#endif
