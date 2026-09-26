class Solution
{
	public String reverseOnlyLetters(String s) {
        byte b[] = s.getBytes();
        int i=0,j=b.length-1;
        while (i<j){
            while(!rightByte(b[i]) && i<j){
                i++;
            }
            while(!rightByte(b[j]) && i<j){
                j--;
            }
            byte t = b[i];
            b[i] = b[j];
            b[j] = t;
			i++;
			j--;
        }
        return new String(b);
    }
    public boolean rightByte(byte b){
        return (b<=99 && b>=65) || (b>=97 && b<=122);
    }
	public int strStr(String haystack, String needle) {
        int s1 = haystack.length(), s2 = needle.length();
		if(s2>s1) return -1;			
		if(s2==s1) return haystack.equals(needle)?0:-1;			
        for(int i=0;i<s1-s2+1;i++){
            int k=0;
			int j = i;
            while(k<s2){
				if(haystack.charAt(i)!=needle.charAt(k)){
					break;
				}
				i++;
				k++;
				if(k==s2)
				return i-s2;
			}
			i=j;
        }
		return -1;
    }
	public static void main(String[] args)
	{
		Solution s = new Solution();
		//System.out.println(s.strStr("sadbutsad","sad"));
		//System.out.println(s.strStr("leetcode","leeto"));
		System.out.println(s.strStr("mississippi","issip"));
		
		//System.out.println(s.reverseOnlyLetters("a-bC-dEf-ghIj"));
		//System.out.println(s.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
	}
}

/*
class Solution {
    public int strStr(String haystack, String needle) {
        int s1 = haystack.length(), int s2 = needle.length();
        for(int i=0;i<s1;i++){
            char ch = haystack.charAt(i);
            for()
        }
    }
}
/*
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

*/