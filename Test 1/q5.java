import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String r = scanner.next().toUpperCase();

        char r1 = r.charAt(0);
        switch (r1) {
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Banana");
                break;
            case 'C':
                System.out.println("Candy");
                break;
            case 'D':
                System.out.println("Dangerous");
                break;
            default:
                System.out.println("Goodbye");
                break;
        }
    }
}
