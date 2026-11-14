class Solution {
    public int findKthLargest(int[] nums, int k) {
        //max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            if(pq.size() < k){
                pq.add(cur);
                continue;
            }
            if(cur > pq.peek()){
                pq.poll();
                pq.add(cur);
            }
        }

        return pq.poll();
    }
}
