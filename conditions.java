import java.util.Scanner;
public class conditions{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements");
        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
            System.out.println(a[i]);
        }
        
            
        sc.close();

    }
}