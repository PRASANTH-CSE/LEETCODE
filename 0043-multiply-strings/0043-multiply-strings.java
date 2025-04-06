class Solution {
    public String multiply(String num1, String num2) {
        int n=0;
        for(char c:num1.toCharArray())
        {
            int a=c-'0';
            n=n*10+a;
        }
        int n1=0;
        for(char c:num2.toCharArray())
        {
            int a=c-'0';
            n1=n1*10+a;
        }
        return String.valueOf(n*n1);
    }
}