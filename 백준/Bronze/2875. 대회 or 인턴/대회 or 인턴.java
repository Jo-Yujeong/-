import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); //15
	    int m = sc.nextInt(); //6
	    int k = sc.nextInt(); //11
	    
	    int q_n = n/2; //7
	    int r_n = n%2; //1
	    int q_m = m;
	    int max_team = 0;
	    
	    if(m >= q_n){ //8 >= 7
	        while(r_n + m - q_n < k){ //1+8-7 < 11, 3+8-6 < 11, 5+8-5 < 11, 7+8-4 !< 11
	            q_n--; //6, 5, 4
	            r_n = r_n + 2; //3, 5, 7
	        }
	        max_team = q_n;
	    } else{ //6 < 7
	        while(n - q_m*2 + m - q_m < k){ //15-6*2+6-6 < 11, 15-5*2+6-5 < 11, 15-4*2+6-4 < 11, 15-3*2+6-3 !< 11
	            q_m--; //5, 4, 3
	        }
	        max_team = q_m;
	    }
	    System.out.println(max_team);
	}
}