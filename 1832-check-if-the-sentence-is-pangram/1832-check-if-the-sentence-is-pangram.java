class Solution {
    public boolean checkIfPangram(String sentence) {
         Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
        
    }
}