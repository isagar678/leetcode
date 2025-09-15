class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> temp = new ArrayList<>();

        if (intervals.length <= 1) {
            return intervals;
        }

        int[] previous = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if(previous[1]>=intervals[i][0]){
                if(previous[1]<intervals[i][1]){
                   previous = new int[]{previous[0],intervals[i][1]};
                }
            }
            else{
                temp.add(previous);
                previous=intervals[i];
            }

        }
        // temp.add(new int[] { intervals[i][0], intervals[i][1] });
        temp.add(previous);
        int[][] result = temp.toArray(new int[temp.size()][]);
        return result;

    }
}