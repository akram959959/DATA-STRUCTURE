class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>map=new HashMap<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(map.get(ch)==1)
            {
                return i;
                }
        }
        return -1;
        
    }
}

/*
 Map<Character,Integer> map= new HashMap<>();
        
        char[] ar= s.toCharArray();
        
        for(int i=0;i<ar.length;i++)
        {
            char ch= ar[i];
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        
        for(int i=0;i<ar.length;i++)
        {
            char ch=ar[i];
            if(map.get(ch)==1)
            {
                return i;
            }
        }
        return -1;
        */