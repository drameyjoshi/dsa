CFLAGS = -g -ggdb -Wall -ansi

SRCS = tree.c test_tree.c

OBJS = $(SRCS:.c=.o)

LFLAGS = -L../utils

HFLAGS = -I../utils

LIBS = -lutils

HEADERS = tree.h

MAIN = test_tree

all: $(MAIN)

.PHONY: depend clean

$(MAIN): $(OBJS)
	gcc $(CFLAGS) $(HFLAGS) $(LFLAGS) -o $(MAIN) $(OBJS) $(LIBS) 

.c.o:
	gcc $(CFLAGS) $(HFLAGS) -c $< -o $@

clean:
	rm -f *.o *~ $(MAIN)

format:
	clang-format -i --style=Webkit *.c *.h

depend: $(SRCS)
	makedepend $(INCLUDES) $^

