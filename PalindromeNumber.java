class Solution {
    public boolean isPalindrome(int x) {
        int d =x; 
        int rev=0;
        while(d>0){
            int n=d%10;
            rev=(10*rev)+n;
            d=d/10;
        }
        
        if(rev==x)
            return true;
        else
            return false;
    }
}
