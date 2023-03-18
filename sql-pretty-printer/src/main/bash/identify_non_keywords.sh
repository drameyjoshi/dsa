#!/bin/bash

source ./filenames.sh

while read line; do
    token=`echo $line | cut -d'=' -f1`
    result=`grep -w $token $KEYWORD_FILE`
    if [[ $result'x' == 'x' ]]; then
        echo $token >> $NON_KEYWORD_FILE
    fi
done < $TOKEN_2
