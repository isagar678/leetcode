class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        int l;
        int r;

        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

         for(int i=0;i<matrix.length;i++){
            l=0;
            r=matrix[i].length-1;
            while(l<=r){
                temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }

    }
}