#include "logger.h"

void happy_path_1()
{
	trace("%d + %d = %d", 2, 1, 3);
	debug("%d + %d = %d", 2, 2, 4);
	info("%d + %d = %d", 2, 3, 5);
	warn("%d + %d = %d", 2, 4, 6);
	error("This is an error %d", 98);

	set_logger_level(DEBUG);
	trace("%d + %d = %d", 2, 1, 3);
	debug("%d + %d = %d", 2, 2, 4);

	set_logger_level(TRACE);
	trace("%d + %d = %d", 2, 1, 3);
}

void happy_path_2()
{
	set_logfile("./test_logger.log");

	trace("%d + %d = %d", 2, 1, 3);
	debug("%d + %d = %d", 2, 2, 4);
	info("%d + %d = %d", 2, 3, 5);
	warn("%d + %d = %d", 2, 4, 6);
	error("This is an error %d", 98);
}

void write_error()
{
	set_logfile("/var/log/test_logger.log");
}

int main()
{
	happy_path_1();
	happy_path_2();

	return 0;
}
