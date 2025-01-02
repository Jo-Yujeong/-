// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(st.nextToken());
	    int qstCnt = Integer.parseInt(st.nextToken());
	    int A[][] = new int[N + 1][N + 1];
	    int D[][] = new int[N + 1][N + 1];
	    
	    // 입력된 배열 세팅
	    for(int i = 1; i <= N; i++) {
    	    st = new StringTokenizer(br.readLine());
	        for(int j = 1; j <= N; j++) {
	            A[i][j] = Integer.parseInt(st.nextToken());
	        }
	    }
	    
	    // 구간 합 배열
	    for(int i = 1; i <= N; i++) {
	        for(int j = 1; j <= N; j++) {
	            D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + A[i][j];
	        }
	    }
	    
	    // 입력받은 구간의 구간 합 구하기
	    for(int i = 0; i < qstCnt; i++) {
	        st = new StringTokenizer(br.readLine());
	        int X1 = Integer.parseInt(st.nextToken());
	        int Y1 = Integer.parseInt(st.nextToken());
	        int X2 = Integer.parseInt(st.nextToken());
	        int Y2 = Integer.parseInt(st.nextToken());
	        
	        System.out.println(D[X2][Y2] - D[X1-1][Y2] - D[X2][Y1-1] + D[X1-1][Y1-1]);
	    }
	}
}