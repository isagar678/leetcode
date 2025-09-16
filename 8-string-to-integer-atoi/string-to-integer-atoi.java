class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0) return 0;
        boolean isneg = false;
        char c;
        int result = 0;
        int i = 0;
        c = s.charAt(i);
        if (c == '-') {
            isneg = true;
            i++;
        } else if (c == '+') {
            i++;
        }

        for (; i < s.length(); i++) {
            c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int digit = c - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isneg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;

            }
            else{
                break;
            }
        }
        return isneg ? result * -1 : result;
    }
}