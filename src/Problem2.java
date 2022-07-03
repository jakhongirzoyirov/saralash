import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 dan katta butun son kiriting: ");
        int n = scanner.nextInt();
        System.out.println(problem2(n));
    }

    private static int problem2(int n) {
        if (n >= 5) {
            return 1;
        } else {
            return 0;
        }
        /**
         * Masala matematik bilimlarni ham talab qilingani uchun osongina yechildi.
         * Yani 0 bilan tugashi uchun son 10 ga karrali degani.
         * 10 ga karrali bolsa son ham 2ga ham 5ga karrali degani.
         * tub sonlar ichida 2 yagona juft son bolgani uchun, masalada soralyotgan kopaytma ixtiyoriy holatda
         * doim 1ta nol bilan tugaydi, agarda n>=5 bolsa.
         */
    }
}
