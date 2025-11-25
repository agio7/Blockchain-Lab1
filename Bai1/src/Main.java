import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mode = sc.nextLine().trim(); 
        int key = Integer.parseInt(sc.nextLine().trim()); 
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
