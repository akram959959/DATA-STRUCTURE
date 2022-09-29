class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
     int temp = 0;
     int len = arr.length-1;
     while(len - temp >= k){
         if(Math.abs(arr[temp] - x) > Math.abs(arr[len] - x)){
             temp++;
         }
         else{
             len--;
         }
     }
        List <Integer> result = new ArrayList<>(k);
        for(int i = temp; i<=len;i++){
            result.add(arr[i]);
        }
        return result;
        
        
    }
}
