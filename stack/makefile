CFLAGS = -g -Wall -ansi

SRCS = stack.c test_stack.c

OBJS = $(SRCS:.c=.o)

LFLAGS = -L../utils

HFLAGS = -I../utils

LIBS = -lutils

HEADERS = stack.h

MAIN = test_stack

all: $(MAIN)

.PHONY: depend clean

$(MAIN): $(OBJS)
	gcc $(CLFAGS) $(HFLAGS) $(LFLAGS) -o $(MAIN) $(OBJS) $(LIBS) 

.c.o:
	gcc $(CLFAGS) $(HFLAGS) -c $< -o $@

clean:
	rm -f *.o *~ $(MAIN)

format:
	clang-format -i --style=Webkit *.c *.h

depend: $(SRCS)
	makedepend $(INCLUDES) $^

