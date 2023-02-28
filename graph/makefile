CFLAGS = -g -Wall -ansi

SRCS = graph.c test_graph.c

OBJS = $(SRCS:.c=.o)

LFLAGS = -L../utils -L../list

HFLAGS = -I../utils -I../list

LIBS = -lutils -llist

HEADERS = graph.h

MAIN = test_graph

all: $(MAIN)

.PHONY: depend clean

$(MAIN): $(OBJS)
	gcc $(CFLAGS) $(HFLAGS) $(LFLAGS) -o $(MAIN) $(OBJS) $(LIBS) 

.c.o:
	gcc $(CFLAGS) $(HFLAGS) -c $< -o $@

clean:
	rm -f *.o *~ $(MAIN)

format:
	clang-format -i --style=WebKit *.c *.h

depend: $(SRCS)
	makedepend $(INCLUDES) $^

