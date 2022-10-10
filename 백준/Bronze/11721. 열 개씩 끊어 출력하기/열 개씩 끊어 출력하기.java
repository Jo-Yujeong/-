import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String alp = br.readLine();
	    
	    for(int i=0; i<alp.length(); i++) {
	        System.out.print(alp.charAt(i));
	        if(i % 10 == 9)
	            System.out.println();
	    }
	}
}