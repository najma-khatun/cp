package leetcode;
public class sort_colour {
    public void sortColors(int[] arr) {
        int zero=0;
        int one =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            zero++;
            else if (arr[i]==1)
            one++;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(j<zero)
            arr[j]=0;
            else if(j>=zero && j<zero+one)
            arr[j]=1;
            else
            arr[j]=2;
        }
        
    }
}
