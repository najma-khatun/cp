import java.util.Scanner;
public class printRecursion {
    public static void print(int N) {
        if(N == 0)
            return ;
        else {
            System.out.println("I love Recursion");
            print(N-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        print(N);
        sc.close();
    }
}
