import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    String a = sc.next();
	    String b = sc.next();
	    String c = sc.next();
	    String d = sc.next();
	    
	    String sum_ab = a+b;
	    String sum_cd = c+d;
	    
	    long A = Long.parseLong(sum_ab);
	    long B = Long.parseLong(sum_cd);
	    
	    System.out.println(A+B);
	}
}