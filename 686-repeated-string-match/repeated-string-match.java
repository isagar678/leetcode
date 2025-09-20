class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        int[] lps = getLps(b, n2);

        int count = 1;
        int i = 0;
        int j = 0;
        while (i < (n1 + n2) * 2) {
            if (j == n2)
                return count;
            if (a.charAt(i % n1) == b.charAt(j)) {
                i++;
                j++;
                if (j == n2) return count;
                if (i>0 && i % n1 == 0)
                    count++;
                
            } else {
                if (j != 0)
                    j = lps[j - 1];
                else {
                    i++;
                }
            }

        }
        return -1;

    }

    public int[] getLps(String s, int n) {
        int[] lps = new int[n];
        int i = 1;
        int len = 0;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len))
                lps[i++] = ++len;
            else {
                if (len != 0)
                    len = lps[len - 1];
                else
                    i++;
            }
        }
        return lps;
    }
}