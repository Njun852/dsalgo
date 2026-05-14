package leetcode;

public class Week6 {
    public static void heart() {
        int n = 4;
        for (int y = -n; y <= 2 * n; y++) {
            for (int x = -2 * n; x <= 2 * n; x++)
                if ((y <= 0 &&
                        ((int) Math.sqrt((x+n)*(x+n) + y*y) <= n
                                || (int) Math.sqrt((x-n)*(x-n) + y*y) <= n))
                        || (y > 0 && Math.abs(x) <= 2 * n - y))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void triangle() {
        int n = 3;
        int base = n+(n-1);
        int mid = base/2;
        for(int i = n; i >= 0; i--) {
            int x = i+(i-1);
            for(int j = 0; j < base; j++) {
                if(j >= (base-x)/2 && j < x+(base-x)/2) {
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void circle() {
        int r = 5;
    }
    public static void main(String[] args) {
        triangle();
    }
}
