import java.util.Scanner;
public class HandShakes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = (n*(n-1))/2;
        System.out.print(l);
    }
}