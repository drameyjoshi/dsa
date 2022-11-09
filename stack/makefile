CFLAGS = -g -Wall -ansi

SRCS = stack.c test_stack.c

OBJS = $(SRCS:.c=.o)

MAIN = test_stack

all: $(MAIN)

$(MAIN): $(OBJS)
	gcc $(CLFAGS) -o $(MAIN) $(OBJS)

.c.o:
	gcc $(CLFAGS) -c $< -o $@

stack.o: stack.c stack.h
	gcc -c $(CFLAGS) stack.c

clean:
	rm -f *.o *~ $(MAIN)

format:
	clang-format -i --style=Microsoft *.c *.h

depend: $(SRCS)
	makedepend $(INCLUDES) $^

