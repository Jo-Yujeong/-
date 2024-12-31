import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        int[] arrInput = new int[input];
        
        for(int i = 0; i < input; i++) {
            arrInput[i] = sc.nextInt();
        }
        
        double max = 0;
        double sum = 0;
        
        for(int i = 0; i < input; i++) {
            if(arrInput[i] > max) {
                max = arrInput[i];
            }
            sum += arrInput[i];
        }
        
        System.out.print((sum * 100)/max/input);
    }
}