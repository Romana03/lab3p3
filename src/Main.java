import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceți valoarea până la care să se afișeze șirul lui Fibonacci: ");
        int n = in.nextInt();

        int n1 = 0, n2=1, sum=0;
        System.out.print("Șirul lui Fibonacci până la " + n + " este: ");

        while( n1<=n ) {

            sum = n1 + n2;
            System.out.print(n1+" ");
            n1 = n2;
            n2 = sum;
        }
    }
}