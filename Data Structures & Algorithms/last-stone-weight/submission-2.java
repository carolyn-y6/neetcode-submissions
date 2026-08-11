class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i : stones){
            maxHeap.add(-i);
        }
        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if(x < y){
                maxHeap.add(x - y);
            }
        }
        if(maxHeap.size() == 1){
            return maxHeap.poll() * -1;
        }
        return 0;
    }
}
