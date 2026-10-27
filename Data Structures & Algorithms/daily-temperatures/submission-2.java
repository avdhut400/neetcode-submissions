class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int arr[]=new int [temp.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty()&& temp[i]>temp[st.peek()]){
                int prev=st.pop();
                int w=i-prev;
                arr[prev]=w;
            }
            st.push(i);
        }
          
        return arr;
    }
}
