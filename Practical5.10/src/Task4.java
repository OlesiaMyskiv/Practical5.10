public class Task4 {
    public static void main(String[] args) {

        // використання оператора for
        int n,f;
        f = 1;
        n = 10;
        for(int i=1; i<=n; i++) {
            f = f*i;
        }
        System.out.println(n+"! = "+f);


        // використання оператора while
        int num = 10;
        int factorial = 1;
        int i = 1;
        while(i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("Факторіал числа " + n + " дорівнює " + factorial);
    }
}
