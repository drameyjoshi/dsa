package main

import (
	"fmt"
	"strings"
)

var board = [][]string{
	{"-", "-", "-"},
	{"-", "-", "-"},
	{"-", "-", "-"},
}

func showBoard() {
	for i := 0; i < len(board); i++ {
		fmt.Printf("%s\n", strings.Join(board[i], " "))
	}
}

func checkIfValidEntry(i, j int) bool {
	return board[i][j] == "x" || board[i][j] == "o"
}

func proceed() (bool, string) {
	result := true
	winner := ""

	if checkIfValidEntry(0, 0) {
		if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) ||
			(board[0][0] == board[1][0] && board[1][0] == board[2][0]) ||
			(board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			result = false
			winner = board[0][0]
		}
	}

	if result && checkIfValidEntry(0, 1) {
		if board[0][1] == board[1][1] && board[1][1] == board[2][1] {
			result = false
			winner = board[0][1]
		}
	}

	if result && checkIfValidEntry(0, 2) {
		if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) ||
			(board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
			result = false
			winner = board[0][2]
		}
	}

	if result && checkIfValidEntry(1, 0) {
		if board[1][0] == board[1][1] && board[1][1] == board[1][2] {
			result = false
			winner = board[1][0]
		}
	}

	if result && checkIfValidEntry(2, 0) {
		if board[2][0] == board[2][1] && board[2][1] == board[2][2] {
			result = false
			winner = board[2][0]
		}
	}

	return result, winner
}

func areCoordinatesValid(i, j int) bool {
	return 0 <= i && i <= 2 && 0 <= j && j <= 2
}

func readNextInput(cross bool) (int, int, string, bool) {
	mark := "o"
	if cross {
		mark = "x"
	}

	i := 0
	j := 0

	fmt.Print("Enter i: ")
	fmt.Scanf("%d\n", &i)
	fmt.Print("Enter j: ")
	fmt.Scanf("%d\n", &j)

	return i, j, mark, areCoordinatesValid(i, j)
}

func main() {
	showBoard()

	cross := true
	result := true
	winner := ""

	for n := 0; n < 9; n++ {
		i, j, mark, inputOk := readNextInput(cross)
		if inputOk {
			board[i][j] = mark
			showBoard()
			cross = !cross
			result, winner = proceed()
			if !result {
				fmt.Printf("%s won the round.\n", winner)
				n = 9
			}
		} else {
			fmt.Println("i and j should be one of 0, 1, 2.")
			n--
		}

	}
	if result {
		fmt.Println("The round is over without a winner.")
	} else {
		fmt.Println("The round is over.")
	}
}
