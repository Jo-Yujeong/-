// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] arr = new int[N];
		
		int i = 0;
		int j = N-1;
		int result = 0;
		
		for(int idx = 0; idx < N; idx++) {
		    arr[idx] = in.nextInt();
		}
		Arrays.sort(arr);
		
		while(i < j) {
		    if(arr[i] + arr[j] > M) {
		        j--;
		    } else if(arr[i] + arr[j] < M) {
		        i++;
		    } else {
		        result++;
		        i++;
		        j--;
		    }
		}
		
		System.out.print(result);
	}
}