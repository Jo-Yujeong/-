// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int dataCnt = Integer.parseInt(st.nextToken());
	    int qstCnt = Integer.parseInt(st.nextToken());
	    int[] arr = new int[dataCnt + 1];
	    st = new StringTokenizer(br.readLine());
	    
	    for(int i = 1; i <= dataCnt; i++) {
	        arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
	    }
	    
	    for(int i = 0; i < qstCnt; i++) {
	        st = new StringTokenizer(br.readLine());
	        int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        System.out.println(arr[b] - arr[a-1]);
	    }
	}
}