
//Input : Madam Arora teaches Malayalam
//Output: Malayalam

//Input : Welcome to GeeksforGeeks
//Output : No Palindrome Word




public class Print_Longest_Palindrome_Word_in_a_sentence {


      static boolean isPalindrome(String s){

           
            String str1 = s.toLowerCase();
            
            
            int left = 0;
            int right = str1.length() - 1;
            while(left < right){
                  if(str1.charAt(left) != str1.charAt(right)){
                        return false;
                  }
                  left++;
                  right--;
            }
            return true;
      }


      static String longestPalindrome(String str){

            String arr[] = str.split(" ");
            int n = arr.length;
            // System.out.println(n);


            String maxCount = "";
            for(int i=0; i<n; i++){
                  if(isPalindrome(arr[i])){
                        String x = arr[i];
                        if(x.length() > maxCount.length()){
                              maxCount = x;
                        }
                  }
            }

            return maxCount;
      }


      public static void main(String[] args){

            // String z = longestPalindrome("Madam AroraarorA teaches Malayalam");
            String z = longestPalindrome("Welcome to GeeksforGeeks");
            
            if(z.length() > 0){
                  System.out.println("Palindrome Word Found : " + z);
            }else{
                  System.out.println("No Palindrome Word ");
            }


      }
      
}
