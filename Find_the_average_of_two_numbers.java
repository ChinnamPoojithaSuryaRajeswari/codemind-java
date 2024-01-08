import java.util.Scanner;
public class flot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = ((float)a+b)/2;
        System.out.printf("%.4f",c);
    }
}