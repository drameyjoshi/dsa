#ifndef _LOGGER_H_
#define _LOGGER_H_

typedef enum
{
    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR
} log_level_t;

log_level_t set_logger_level(log_level_t lvl);
void set_logfile(const char *fpath);
void logmsg(log_level_t lvl, const char *fname, int lno, const char *fmt, ...);

#define trace(fmt, ...) logmsg(TRACE, __FILE__, __LINE__, fmt, ##__VA_ARGS__)
#define debug(fmt, ...) logmsg(DEBUG, __FILE__, __LINE__, fmt, ##__VA_ARGS__)
#define info(fmt, ...) logmsg(INFO, __FILE__, __LINE__, fmt, ##__VA_ARGS__)
#define warn(fmt, ...) logmsg(WARN, __FILE__, __LINE__, fmt, ##__VA_ARGS__)
#define error(fmt, ...) logmsg(ERROR, __FILE__, __LINE__, fmt, ##__VA_ARGS__)

#endif
