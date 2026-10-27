class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int arr[]=new int [temp.length];
        int tem=0;
        for(int i=0;i<temp.length;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[i]<temp[j]){
                    arr[i]=j-i;
                    break;
                }
            }
        }
        return arr;
    }
}
