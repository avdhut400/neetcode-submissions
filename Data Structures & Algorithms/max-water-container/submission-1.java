class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int min=0;
        int area=0;
        int h=0;
        int maxar=0;
        while(l<r){
            min=Math.min(heights[l],heights[r]);
            int wid=r-l;
            area=min*wid;
            maxar=Math.max(area,maxar);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }

        }
        return maxar;
    }
}
