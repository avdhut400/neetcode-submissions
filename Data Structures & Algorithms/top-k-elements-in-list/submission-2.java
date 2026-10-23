class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // List<Integer> list = new ArrayList<>(map.keySet());

        // list.sort((a, b) ->
        //     Integer.compare(map.get(b), map.get(a))
        // );
        PriorityQueue<Integer>pro=new PriorityQueue<>((a,b)->Integer.compare(map.get(a), map.get(b)));
        for(int num:map.keySet()){
             pro.offer(num);
            if(pro.size()>k){
                pro.poll();
            }
           
        }
        int ans[]=new int [k];
        for(int i=0;i<k;i++){
            ans[i]=pro.poll();
        }
        return ans;
    }
}
