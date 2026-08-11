/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public void sort(List<Interval> intervals){
        int len = intervals.size();
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                Interval temp = intervals.get(i);
                if (intervals.get(i).start > intervals.get(j).start) {
                    // Swapping
                    temp = intervals.get(i);
                    intervals.set(i, intervals.get(j));
                    intervals.set(j, temp);
                } else if (intervals.get(i).start == intervals.get(j).start){
                    if(intervals.get(i).end > intervals.get(i).end){
                        temp = intervals.get(i);
                        intervals.set(i, intervals.get(j));
                        intervals.set(j, temp);
                    }
                }
            }
        }
        return;
    }
    public boolean canAttendMeetings(List<Interval> intervals) {
        //are the intervals sorted?
        if(intervals.size() == 0 || intervals.size() == 1){
            return true;
        }
        
        sort(intervals);

        for(int i = 1; i < intervals.size(); i++){
            Interval prev = intervals.get(i-1);
            Interval cur = intervals.get(i);
            if(prev.start == cur.start){
                return false;
            }
            if(prev.end == cur.end){
                return false;
            }
            if(prev.end > cur.start){
                return false;
            }
        }
        return true;
    }
}
