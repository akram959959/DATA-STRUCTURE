class Solution {
    public int maxArea(int[] height) {
        int max = -1;
        int l = 0;
        int r = height.length-1;
        int lh , rh;
        while(l < r){
            lh = height[l];
            rh = height[r];
            max = Math.max(max , Math.min(lh , rh)*(r-l));
            if(lh < rh)     l = l+1;
            else       r = r-1;
        }
        return max;
        
    }
}
