CFLAGS = -g -Wall -ansi

SRCS = list.c test_list.c

OBJS = $(SRCS:.c=.o)

LFLAGS = -L../utils

HFLAGS = -I../utils

LIBS = -lutils

HEADERS = list.h

MAIN = test_list

all: $(MAIN)

.PHONY: depend clean

$(MAIN): $(OBJS)
	gcc $(CLFAGS) $(HFLAGS) $(LFLAGS) -o $(MAIN) $(OBJS) $(LIBS) 

.c.o:
	gcc $(CLFAGS) $(HFLAGS) -c $< -o $@

clean:
	rm -f *.o *~ $(MAIN)

format:
	indent -linux *.c *.h

depend: $(SRCS)
	makedepend $(INCLUDES) $^

