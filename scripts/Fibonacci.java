public class Fibonacci {

    public static void main(String[] args) {
        System.out.print("this code print the Fibonacci seires  \n\n\n ");

        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms:\n\n\n ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
