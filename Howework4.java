import java.util.Scanner;

class Howework4 {
    public static int gcd (int n, int m) {

        if(n % m == 0)
            return m;

        return gcd(m,n%m);
    }

    public static void main (String[] args) {

        int n, m;

        System.out.println("두 수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int big,small;

        big = Math.max(n, m);
        small = Math.min(n, m);

        System.out.println("두 수의 최대 공약수는 " + gcd(big,small) + "입니다.");
    }
}