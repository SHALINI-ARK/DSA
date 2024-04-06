import java.util.*;
class Main {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++)
        {
            char temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }
    public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char []arr = str.toCharArray();
    reverseString(arr);
    System.out.prntln(String.valueOf(arr));
  }
}



//INPUT
  HELLO
//OUTPUT
  OLLEH
