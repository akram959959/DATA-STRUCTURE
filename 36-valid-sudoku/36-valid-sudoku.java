class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashSet<String> set = new HashSet<>();
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col] != '.'){
                    String dRow = "row"+row+"val"+board[row][col];
                    String dCol = "col"+col+"val"+board[row][col];
                    int rQuad = row - (row%3);
                    int cQuad = col - (col%3);
                    String dQuad = ""+rQuad + cQuad + board[row][col];
                    if(!set.add(dRow)||!set.add(dCol)||!set.add(dQuad)){
                        return false;
                    }
                }
                
            }
        }
        return true;
    }
}