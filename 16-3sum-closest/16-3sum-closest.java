class Solution {
      public int threeSumClosest(int arr[], int target) 
    {
        int sum = arr[0]+arr[1]+arr[2];
        Arrays.sort(arr);
        for(int i=1; i<arr.length-1; i++)
        {
            int low = 0, high = arr.length-1;
            while(high>i && i>low)
            {
                int temp = arr[i] + arr[low] + arr[high];
                if(Math.abs(temp-target)<Math.abs(sum-target))
                    sum = temp;
                if(temp==target)
                    break;
                else if((temp-target)<0)
                    low++;
                else
                    high--;
            }
        }
        return sum;
      }
}