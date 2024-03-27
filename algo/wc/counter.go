package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strings"
)

type Tree struct {
	word  string
	freq  int32
	left  *Tree
	right *Tree
}

func InsertWord(word string, counter *Tree) *Tree {
	root := counter
	found := false
	var parent *Tree
	toLeft := true

	for root != nil && !found {
		if root.word == word {
			found = true
			root.freq += 1
		} else if root.word > word {
			parent = root
			root = root.left
			toLeft = true
		} else {
			parent = root
			root = root.right
			toLeft = false
		}
	}

	if root == nil && !found {
		if toLeft {
			parent.left = &Tree{word: word, freq: 1, left: nil, right: nil}
		} else {
			parent.right = &Tree{word: word, freq: 1, left: nil, right: nil}
		}
	}

	return counter
}

func ProcessWords(words []string, counter *Tree) *Tree {
	for i := 0; i < len(words); i++ {
		counter = InsertWord(words[i], counter)
	}

	return counter
}

func CloseFile(ifp *os.File) {
	if err := ifp.Close(); err != nil {
		panic(err)
	}
}

func ProcessFile(filename string, counter *Tree) *Tree {
	ifp, err := os.Open(filename)

	if err != nil {
		panic(err)
	}

	log.Printf("Opened file %s.\n", filename)
	defer CloseFile(ifp)

	filescanner := bufio.NewScanner(ifp)
	filescanner.Split(bufio.ScanLines)

	for filescanner.Scan() {
		line := filescanner.Text()
		words := strings.Fields(line)
		if counter == nil {
			counter = &Tree{word: words[0], freq: 1, left: nil, right: nil}
			counter = ProcessWords(words[1:], counter)
		} else {
			counter = ProcessWords(words, counter)
		}
	}

	return counter
}

func showResults(counter *Tree) {
	root := counter

	if root != nil {
		showResults(root.left)
		fmt.Printf("%s: %d, ", root.word, root.freq)
		showResults(root.right)
	}
}

func main() {
	if len(os.Args) == 2 {
		var counter *Tree
		counter = ProcessFile(os.Args[1], counter)
		showResults(counter)
	} else {
		fmt.Printf("The program takes filename as an argument.")
	}
}
