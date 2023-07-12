import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        float a;
        float b;
        float c;
        Scanner s = new Scanner(System.in);
        a = s.nextFloat();
        b = s.nextFloat();
        c = a * b;
        System.out.format("%.2f",c);
    }
}