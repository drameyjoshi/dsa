CFLAGS = -g -Wall -ansi

SRCS = dcl_common.c undcl.c

OBJS = $(SRCS:.c=.o)

LFLAGS = -L.

HFLAGS = -I.

LIBS = -lutils

undcl: dcl_common.o undcl.o
	gcc $(CFLAGS) $(HFLAGS) $(LFLAGS) -o undcl dcl_common.o undcl.o $(LIBS)

MAIN = undcl

all: $(MAIN)

.PHONY: depend clean

.c.o:
	gcc $(CLFAGS) -c $< -o $@

clean:
	rm -f $(OBJS) *~ $(MAIN)

format:
	clang-format -i --style=WebKit *.c *.h

depend: $(SRCS)
	makedepend $(INCLUDES) $^

