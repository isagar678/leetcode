class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int high=(m*n)-1;
        int mid;
        int middleNum;
        while(low<=high){
            mid = (int)Math.floor((low+high)/2);
            middleNum=matrix[(int)(mid/n)][(int)(mid%n)];
            if(middleNum==target) return true;
            else if(middleNum>target) high=mid-1;
            else low=mid+1;
        }
        return false;


    }
}