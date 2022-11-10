#include "logger.h"

#include <stdarg.h>
#include <stdio.h>

static volatile log_level_t curr = INFO;
static FILE *lfp = NULL;

log_level_t set_logger_level(log_level_t lvl)
{
	log_level_t prev = curr;
	curr = lvl;

	return prev;
}

void set_logfile(const char *fpath)
{
	FILE *fp = fopen(fpath, "a+");
	if (fp != NULL) {
		lfp = fp;
	} else {
		fprintf(stderr, "Unable to open %s for writing.\n", fpath);
	}
}

static char *get_name(log_level_t lvl)
{
	char *name;

	switch (lvl) {
	case TRACE:
		name = "TRACE";
		break;
	case DEBUG:
		name = "DEBUG";
		break;
	case INFO:
		name = "INFO";
		break;
	case WARN:
		name = "WARN";
		break;
	case ERROR:
		name = "ERROR";
		break;
	default:
		name = "UNKNOWN";
		break;
	}

	return name;
}

void logmsg(log_level_t lvl, const char *fname, int lno, const char *fmt, ...)
{
	FILE *fp = (lfp == NULL) ? stderr : lfp;

	if (lvl >= curr) {
		va_list ap;
		fprintf(fp, "%s: %4d: %5s: ", fname, lno, get_name(lvl));
		va_start(ap, fmt);
		vfprintf(fp, fmt, ap);
		va_end(ap);
		fprintf(fp, "\n");
	}
}
