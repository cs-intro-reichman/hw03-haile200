/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        String ans = uniqueChars(str);
        System.out.println(ans);
    }


    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String ans =" ";
        for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)== ' ' || ans.indexOf(s.charAt(i)) ==-1){
                    ans+=s.charAt(i);
                }
            }
        
        return ans;
}
}


