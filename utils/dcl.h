#ifndef _DCL_H_
#define _DCL_H_

typedef enum {
    NAME,
    PARENS,
    BRACKETS
} token_t;

int get_token(char token[]);
#endif
