/*Java String Program to Remove leading zeros
 Input : 00000123789
 Output: 123789
 */

 public class Taskthree3 {
    public static String removeZero(String str){
        int i=0;

        while (i<str.length() && str.charAt(i)=='0') 
        i++;

        StringBuffer sb = new StringBuffer(str);    
        sb.replace(0, i, "" );
        return sb.toString();
    }
    public static void main(String[] args) {
        
        String str = "00000123789";
        System.out.println("Before Removing Leading Zeros The String Is:-");
        System.out.println(str);
        
        str = removeZero(str);
        System.out.println("After Removing Leading Zeros The String Is:-");
        System.out.println(str);
    }
}


