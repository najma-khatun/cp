import java.util.Scanner;
import java.util.Arrays;
public class Twin_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            int arr[] =new int[N];
            for(int j=0;j<N;j++)
            {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int k=0;k<N;k++)
            {
                System.out.print(N+1-arr[k]+" ");
            }
            System.out.println();
        }
    }
}
