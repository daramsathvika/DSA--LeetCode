class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i=0,j=0;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!isValid(i,j,board)){return false;}
                }
            }
        }
        return true;
    }
    public boolean isValid(int i, int j,char[][] board){
        int col,row,r=i-i%3,c=j-j%3;
        for(col=0;col<9;col++){
            if(i!=col&&(board[i][j]==board[col][j])){return false;}
        }
        for(row=0;row<9;row++){
            if(j!=row&&(board[i][j]==board[i][row])){return false;}
        }
        for(row=r;row<r+3;row++){
            if(row==i){continue;}
            for(col=c;col<c+3;col++){
                if(col==j){continue;}
                if(board[i][j]==board[row][col]){return false;}
            }
        }
        return true;
    }
}