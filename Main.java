import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        Character ch = sc.next().charAt(0);

        ASCII ascii = new ASCII();
        ascii.ascii(ch);
    }
}