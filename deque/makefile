CFLAGS = -g -ggdb -Wall -ansi

SRCS = deque.c deque_driver.c

OBJS = $(SRCS:.c=.o)

LFLAGS = -L../utils

HFLAGS = -I../utils

LIBS = -lutils

HEADERS = deque.h

MAIN = deque_driver

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

