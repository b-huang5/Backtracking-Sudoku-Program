import re


def uniqueRow(col , row, board):
    for i in range (len(board)):
        if(board[row][i] == board[row][col] and col != i):
            return False
    return True

def uniqueColumn(col, row, board):
    for i in range(len(board[row])):
        if(board[i][col] == board[row][col] and row != i):
            return False
    return True

def valid(col, row, board):
    if(uniqueRow(col, row, board) and uniqueColumn(col, row, board)):
        return True
    return False

def solve(col, row, board):
    if(row == len(board) - 1 and col == len(board[row])):
        for r in board:
            for c in r:
                print (c + str(", "),)
            print ("")
    if(len(board[row]) == col):
        return solve(0, row + 1, board)
    if(board[row][col] != 0):
        return solve(col + 1, row, board)
    for value in range(1, len(board[row]) + 1):
        board[row][col] = value
        if(valid(col, row, board)):
            if(solve(col + 1, row, board)):
                return True
    board[row][col] = 0
    return False


board = [[0,0,0,0,0,0,0,0,0],
[0,4,0,5,0,3,0,8,0],
[0,0,1,0,4,0,5,0,0],
[0,0,6,2,0,7,4,0,0],
[0,0,0,0,9,0,0,0,0],
[0,5,9,4,0,1,8,7,0],
[0,9,0,0,3,0,0,2,0],
[0,7,0,0,0,0,0,5,0],
[5,2,3,0,0,0,6,4,7]]

solve(0, 0, board)
