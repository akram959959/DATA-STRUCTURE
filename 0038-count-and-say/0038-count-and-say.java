class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
		return "1";
	}
	String str = "1", result = "";
	int count = 0, curr = 0, prev = 0;
	char[] ch;
	for (int i = 2; i <= n; i++) {
		ch = str.toCharArray();
		result = "";
		count = 0;
		curr = 0; 
		prev = 0;
		for (int j = 0; j < ch.length; j++){
			curr = (int)(ch[j] - '0');
			if (curr == prev) {
				count++;
			} else if (curr != prev && count != 0) {
				result += count + "" + prev;
				prev = curr;
				count = 1;
			} else {
				prev = curr;
				count++;
			}
		}
		result += count + "" + curr;
		str = result;
	}
	
    return str;
        
    }
}