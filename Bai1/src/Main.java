import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mode = sc.nextLine().trim(); // 'e' hoặc 'd'
        int key = Integer.parseInt(sc.nextLine().trim()); // 1 - 255
        String text = sc.nextLine();

        StringBuilder result = new StringBuilder();

        // XOR cipher (encrypt & decrypt đều như nhau)
        for (char ch : text.toCharArray()) {
            result.append((char)(ch ^ key));
        }

        System.out.println(result.toString());
        sc.close();
    }
}