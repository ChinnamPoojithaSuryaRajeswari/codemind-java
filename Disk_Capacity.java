import java.util.Scanner;
public class DiskCapacity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        System.out.print(n*m*p*512*2);
    }
}