class Solution {
    public boolean isValid(String word) {
        if (word == null || word.length() < 3)
        return false;
        boolean hasVowel = false, hasConsonant = false;
        for (char c : word.toCharArray()) 
        {
            if (Character.isLetter(c)) 
            {
                char lc = Character.toLowerCase(c);
                if ("aeiou".indexOf(lc) >= 0) hasVowel = true;
                else hasConsonant = true;
            }
             else if (!Character.isDigit(c)) 
            {
                return false;
            }
        }
        return hasVowel && hasConsonant;
    }
}