import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        
        for(int i=0; i<9; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        int tmp = arr[0];
        
        for(int i=1; i<9; i++) {
        	if(arr[i] > tmp) {
        		tmp = arr[i];
        	}
        }
        System.out.println(tmp);
        
        for(int i=0; i<9; i++) {
        	if(arr[i] == tmp) {
        		System.out.println(i+1);
        	}
        }
    }
}