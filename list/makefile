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
	gcc $(CFLAGS) $(HFLAGS) $(LFLAGS) -o $(MAIN) $(OBJS) $(LIBS) 
	ar rcs liblist.a list.o

.c.o:
	gcc $(CFLAGS) $(HFLAGS) -c $< -o $@

clean:
	rm -f *.o *~ $(MAIN)

format:
	clang-format -i --style=WebKit *.c *.h

depend: $(SRCS)
	makedepend $(INCLUDES) $^

