class Solution {
    public boolean checkIfPangram(String sentence) {
        // HashSet<Character> set= new HashSet<>();
        // for(char c:sentence.toCharArray())
        // {
        //     set.add(c);
        // }
        // return set.size()==26;
        char[] freq= new char[26];
        for(int i=0;i<sentence.length();i++)
        {
            int index=sentence.charAt(i)-'a';
            freq[index]++;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]==0)
            return false;
        }
        return true;
    }
}