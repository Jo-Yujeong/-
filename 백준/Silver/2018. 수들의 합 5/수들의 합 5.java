// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index != N) {
		    if(sum == N) {
		        count++;
		        end_index++;
		        sum += end_index;
		    } else if(sum < N) {
		        end_index++;
		        sum += end_index;
		    } else if(sum > N) {
		        sum -= start_index;
		        start_index++;
		    }
		}
		
		System.out.print(count);
	}
}