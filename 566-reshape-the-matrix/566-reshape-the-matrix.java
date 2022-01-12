class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(!(mat!=null && mat.length>0 && r*c==mat.length*mat[0].length)){
            return mat;
            
        }
           int[][] newMatrix = new int[r][c];
        int row=0;
        int col=0;
        int i=0;
        int j=0;
        
        while(i<mat.length && j<mat[i].length) {
            newMatrix[row][col]=mat[i][j];
            if(col!=c-1) {
                col++;
            } else if(row!=r-1) {
                row++;
                col=0;
            }
            if(j==mat[i].length-1 && i<mat.length) {
                i++;
                j=0;
            } else {
                j++;
            }

        }
        return newMatrix;
        
    }
}



