class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols  = matrix[0].length;

        boolean isFirstRowZero=false;
        boolean isFirstColZero=false;

        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){
                isFirstColZero=true;

            }
        }

        for(int i=0;i<cols;i++){
            if(matrix[0][i]==0){
                isFirstRowZero=true;

            }
        }

        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
       System.out.println(isFirstRowZero + " " + isFirstColZero);


        if (isFirstRowZero) {
            for (int j = 0; j < cols; j++) matrix[0][j] = 0;
        }

        if (isFirstColZero) {
            for (int i = 0; i < rows; i++) matrix[i][0] = 0;
        }

    }
}