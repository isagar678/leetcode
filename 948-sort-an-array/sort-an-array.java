class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public static void mergeSort(int[]nums,int low,int high){
        if(low>=high) return;

        int mid = (low + high) >>> 1;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);

    }

    public static int[] merge(int []nums,int low, int mid,int high){
        int n1=(mid+1)-low;
        int n2=high-mid;
        int temp;
        int l=0;
        int r=0;

        int []left = new int[n1];
        int []right = new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=nums[i+low];
        }
        for(int j=0;j<n2;j++){
            right[j]=nums[mid+j+1];
        }

        int k=low;

        while(l<n1 && r<n2){
            if(left[l]<=right[r]){
                nums[k++]=left[l++];
            }
            else{
                nums[k++]=right[r++];
            }
        }

        while(l<n1){
            nums[k++]=left[l++];
        }

        while(r<n2){
            nums[k++]=right[r++];
        }

        return nums;
    }
}