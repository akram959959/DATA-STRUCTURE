class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] count = new boolean[nums.length];
        perm(result, list, nums, count);
        return result;
        
    }
    
    public static void perm(List<List<Integer>> result, List<Integer> list, int a[], boolean[]          count) {
        
        for(int i=0;i<a.length;i++){
            if(list.size() == a.length){
                result.add(new ArrayList<>(list));
                return;
            }
            if(!count[i]){
                        count[i]=true;
                        list.add(a[i]);
                        perm(result,list,a,count);
                        list.remove(list.size()-1);
                        count[i]=false;
                }
        }
    }
}


