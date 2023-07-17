import java.util.Scanner;
public class RowSum {
    static void colsum(int arr[][],int size1,int size2)
    {
        int sum[]=new int[size2];
        for(int i = 0; i < size1; i++) {
            for (int j=0; j < size2; j++) {
                sum[i]+=arr[i][j];
            }
        }
        for(int i=0;i<size1;i++)
        {
            System.out.print(sum[i]+" ");

        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        colsum(arr,rows,cols);
    }
}