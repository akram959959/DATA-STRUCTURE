class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    numbers.add(nums2[j]);
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }

        }

        int[] out = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            out[i] = numbers.get(i);
        }
        return out;
        
    }
}