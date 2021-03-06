package ticTacToe;

public abstract class Player {
    protected char symbol;

    protected Player(char symbol) {
        this.symbol = symbol;
    }

    abstract boolean request(char[][] matrix);

    public char getSymbol() {
        return symbol;
    }

    public boolean set(char[][]matrix, int x, int y, char el){
        if(matrix[x][y] == Main.EMPTY){
            matrix[x][y] = el;
            return true;
        }else{
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }
    }
}
