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
		long[] S = new long[N];
		long[] C = new long[M];
        long result = 0;
		
		// 연속된 부분 입력의 합 배열
		S[0] = in.nextInt();
		for(int i = 1; i < N; i++) {
		    S[i] = S[i-1] + in.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
		    int remainder = (int) (S[i] % M);
		    
		    if(remainder == 0) {
		        result++;
		    }
		    
		    C[remainder]++;
		    
		}
		
		for(int i = 0; i < M; i++) {
		    if(C[i] > 1) {
		        result = result + (C[i] * (C[i]-1)/2);
		    }
		}
		System.out.print(result);
	}
}