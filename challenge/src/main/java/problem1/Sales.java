package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int SALESPEOPLE ;
        System.out.println("Enter SALESPEOPLE number: ");
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int maxSales;
        int minSales;
        int maxId=0;
        int minId=0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        maxSales = 0;
        minSales = sales[0];
        for (int i=0; i<sales.length; i++)
        {
            //calculate the maxsales and minsales with their ids
            if (maxSales < sales[i]){
                maxSales = sales[i];
                maxId = i;
            }
            if  (minSales > sales[i]){
                minSales = sales[i];
                minId = i;
            }
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        //1)
        System.out.println("\nThe average sales: " + sum/SALESPEOPLE);
        System.out.println("\nSalesperson "+(maxId+1)+" had the highest sale with $"+maxSales);
        System.out.println("\nSalesperson "+(minId+1)+" had the samllest sale with $"+minSales);
        System.out.println("\n enter a salesvalue: ");
        int value= scan.nextInt();
        System.out.println("The people whose sales exceed "+value+"sales ");
        int count=0;
        for  (int i=0; i<sales.length; i++)
        {
            if (sales[i] > value){
                System.out.println("person "+(i+1)+": " +sales[i]+" sales");
                count++;
            }
        }
        System.out.println("The total nums of salespeople whose sales exceeded "+value+": "+count);


    }
}