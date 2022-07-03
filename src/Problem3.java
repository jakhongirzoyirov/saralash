import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(problem3(s));
    }

    private static String problem3(String s) {
        StringBuilder cipher = new StringBuilder();
        for (char ch : s.toCharArray()) {
            for (int i = 97; i < 123; i++) {
                if ((ch & i) == 96){
                    cipher.append((char)i);
                    break;
                }
            }
        }
        return cipher.toString();
    }
}
