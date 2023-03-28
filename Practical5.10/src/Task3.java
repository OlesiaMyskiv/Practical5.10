public class Task3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Додатні дільники числа " + n + ": ");
        for (int i = 1; i <= n; i++) { //перевіряємо, чи є вони дільниками числа 10
            if (n % i == 0) { //перевіряємо, чи ділиться число n на i без залишку
                System.out.print(i + " ");
            }
        }
    }
}
