import java.util.*;
public class Main
{
   static void Cycle(int size)
    {
        int arr[][]= new int[size][size];
        int num=1;
        int top=0,bottom=size-1,right=size-1,left=0;
        while(top<=bottom && left<=right)
        {
            //fill top
             for(int i=top;i<=right;i++)
             {
                 arr[top][i]=num;
                 num++;
             }
             top++;
             //fill right
             for(int i=top;i<=bottom;i++)
             {
                 arr[i][right]=num;
                 num++;
             }
             right--;
             //fill left
             for(int i=right;i>=left;i--)
             {
                 arr[bottom][i]=num;
                 num++;
             }
             bottom--;
             for(int i=bottom;i>=top;i--)
             {
                 arr[i][left]=num;
                 num++;
             }
             left++;
            
             
        }
 for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t"); 
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		Cycle(s);
	}
}
