class Solution {
    public String largestOddNumber(String num) {
        char c[] =  num.toCharArray();
        int i=c.length-1;
        for(;i>=0;i--){
            if(((int)c[i])%2!=0){
                break;
            }
        }
        return num.substring(0,i+1);
    }
}