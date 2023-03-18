#!/bin/bash

source ./filenames.sh

cat $LEXER_DEFN | sed -n '91, 390p' > $KEYWORD_FILE
cat $LEXER_JAVA | sed -n '20, 76p' > $TOKEN_1
cat $TOKEN_1 | sed 's/,/\n/g' | sed '/^[[:space:]]*$/d' | sed 's/^[[:space:]]*//g' > $TOKEN_2
