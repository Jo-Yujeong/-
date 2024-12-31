import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        String strInput = sc.next();
        char[] ch = strInput.toCharArray();
        
        int result = 0;
        
        for(int i = 0; i < ch.length; i++) {
            result += ch[i] - '0';
        }
        System.out.print(result);
    }
}