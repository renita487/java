import java.util.*;
public class statements{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Employee ID");
        String empid = sc.nextLine();
        System.out.println("Enter Employee Name");
        String name= sc.nextLine();
        System.out.println("Enter Salary");
        double sal=sc.nextDouble();
        int bonus;
        if(sal<=80000 && sal>=20000){
            System.out.println("Designation:Manager");
            bonus=500;
            System.out.printf("Bonus: %.2f"+(bonus+sal));
            
        }
        else if(sal>80000){
            System.out.println("Designation:Board Member");
        }
        else if(sal>=10000 && sal<20000){
            System.out.println("Designation:Assistant");
            bonus=200;
            System.out.printf("Bonus: %.2f"+(bonus+sal));
        }
        else if(sal<=0){
            System.out.println("Invalid Salary");
        }
        else{
            System.out.println("Designation:Worker");
            bonus=100;
            System.out.printf("Bonus:%.2f "+(bonus+sal));
        }
    sc.close();}
}