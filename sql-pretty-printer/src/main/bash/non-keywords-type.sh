#!/bin/bash

source ./filenames.sh

echo -n "{" > $TYPE_FILE

first_entry=1
while read non_token; do
    result=`grep -w $non_token $TOKEN_2`
    nktype=`echo $result | cut -d"=" -f2 | sed 's/;//'`

    if [[ $first_entry -eq 1 ]] then
        echo -n $nktype >> $TYPE_FILE
        first_entry=0
    else
        echo -n ", "$nktype >> $TYPE_FILE
    fi

done < $NON_KEYWORD_FILE

echo "}" >> $TYPE_FILE

