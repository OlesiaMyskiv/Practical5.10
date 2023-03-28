public class Task2 {
    public static void main(String[] args) {
        int a = 2;
        while (2 * a - 1 < 5000) { //використовуємо цикл while для перевірки,
            // чи є наступне значення послідовності менше 5000.
            int value = 2 * a - 1;
            System.out.println(value);
            a++;
        }
    }
}