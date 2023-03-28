public class Task1 {
    public static void main(String[] args) {

        // використання оператора for
        System.out.println("За допомогою оператора for:");
        for (int i = 500; i <= 650; i += 10) {
            System.out.println(i);
        }


        // використання оператора while
        System.out.println("За допомогою оператора while:");
        int j = 500;
        while (j <= 650) {
            System.out.println(j);
            j += 10;
        }

        // використання оператора do-while
        System.out.println("За допомогою оператора do-while:");
        int k = 500;
        do {
            System.out.println(k);
            k += 10;
        } while (k <= 650);
    }
}