class Solution {
    public int romanToInt(String s) {
         HashMap<Character,Integer> hs=new HashMap<>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);
       char []c=s.toCharArray();
       int num=hs.get(c[c.length-1]);
       for (int i = c.length-1; i >0; i--) {
          if (hs.get(c[i])>hs.get(c[i-1])) {
              num-=hs.get(c[i-1]);
          }
          else{
              num+=hs.get(c[i-1]);
          }

       }
       return num;
    }
}