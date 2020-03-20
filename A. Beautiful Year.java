/*https://codeforces.com/contest/271/problem/A*/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt() + 1;
        while(hasDuplicate(n)) n++;
        System.out.print(n);
    }
    public static boolean hasDuplicate(int n){
        String str = Integer.toString(n);
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);
        char d = str.charAt(3);
        if(a==b||a==c||a==d||b==c||b==d||c==d) return true;
        return false;
    }
}
