class TimeMap {
    Map<String, List<MyPair<Integer, String>>> map;

    /** Initialize your data structure here. */
    public TimeMap() {
        map = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) map.put(key, new ArrayList<MyPair<Integer,String>>());
        map.get(key).add(new MyPair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        
        List<MyPair<Integer, String>> values = map.get(key);
        
        if (timestamp<values.get(0).getValue()) return "";//If the timestamp is less than the smallest timestamp, there are no values;
        return binarySearch(values, timestamp);
    }
    
	//Searches for the largest previous timestamp less than or equal to the time stamp we are searchign for
    private String binarySearch(List<MyPair<Integer, String>> values, Integer timestamp) {
        int low = 0;
        int high = values.size()-1;
        while (low<high -1) {
            int mid = low + (high-low)/2;
            if (values.get(mid).getValue() < timestamp) low = mid;
            else high = mid;
        }
        if (values.get(high).getValue()<=timestamp) return values.get(high).getKey();
        else return values.get(low).getKey();
    }
}



public class MyPair<Integer,String>
{
    private final String key;
    private final Integer value;

    public MyPair(Integer aValue, String aKey)
    {
        key   = aKey;
        value = aValue;
    }

    public String getKey()   { return key; }
    public Integer getValue() { return value; }
}