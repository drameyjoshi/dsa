CFLAGS = -g -Wall -ansi

SRCS = logger.c test_logger.c

OBJS = $(SRCS:.c=.o)

MAIN = test_logger

all: $(MAIN)

$(MAIN): $(OBJS)
	gcc $(CLFAGS) -o $(MAIN) $(OBJS)

.c.o:
	gcc $(CLFAGS) -c $< -o $@

logger.o:
	gcc -c $(CFLAGS) logger.c

clean:
	rm -f *.o *~ $(MAIN)

format:
	clang-format -i --style=Microsoft *.c *.h

depend: $(SRCS)
	makedepend $(INCLUDES) $^

