class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length == 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int card : hand){
            map.merge(card, 1, (a, b) -> a + b);
        }
        Arrays.sort(hand);

        for(int card : hand){
            //starting position
            if(map.get(card) == 0) continue;

            for(int i = card; i < card+groupSize; i++){
                if(!map.containsKey(i) || map.get(i) <= 0) return false;
                map.put(i, map.get(i) - 1);
            }
        }

        return true;
    }
}
