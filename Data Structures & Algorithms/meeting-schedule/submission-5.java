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
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size() == 0 || intervals.size() == 1){
            return true;
        }

        mergeSort(intervals, 0, intervals.size() - 1);

        for(int i = 0; i < intervals.size() - 1; i++){
            Interval cur = intervals.get(i);
            Interval next = intervals.get(i + 1);
            if(cur.end > next.start){
                return false;
            }
        }
        return true;
    }

    public void merge(int l, int m, int r, List<Interval> intervals){
        int n1 = m - l +1;
        int n2 = r - m;

        List<Interval> l1 = new ArrayList<>();
        List<Interval> l2 = new ArrayList<>();

        for(int i = 0; i < n1; i++){
            l1.add(intervals.get(l + i));
        }
        for(int j = 0; j < n2; j++){
            l2.add(intervals.get(m + 1 + j));
        }

        int i = 0, j = 0;
        int k = l;

        while(i < n1 && j < n2){
            if(l1.get(i).start < l2.get(j).start){
                intervals.set(k, l1.get(i));
                i++;
            } else if (l1.get(i).start > l2.get(j).start){
                intervals.set(k, l2.get(j));
                j++;
            } else {
                if(l1.get(i).end < l2.get(j).start){
                    intervals.set(k, l1.get(i));
                    i++;
                } else {
                    intervals.set(k, l2.get(j));
                    j++;
                }
            }
            k++;
        }

        while(i < n1){
            intervals.set(k, l1.get(i));
            i++;
            k++;
        }

        while(j < n2){
            intervals.set(k, l2.get(j));
            j++;
            k++;
        }
    }

    public void mergeSort(List<Interval> intervals, int l, int r){
        if(l < r){
            int m = (l + r) / 2;

            mergeSort(intervals, l, m);
            mergeSort(intervals, m + 1, r);

            merge(l, m, r, intervals);
        }
    }
}
