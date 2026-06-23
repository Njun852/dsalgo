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
    public static void square() {
        int size = 5;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hollowSquare() {
        int size = 5;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i == 0 || i == size-1 || j == 0 || j == size-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void leftTriangle() {
        int height = 5;
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hollowLeftTriangle() {
        int height = 5;
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < i+1; j++) {
                if(j == 0 || j == i || i == height-1) {
                    System.out.print("* ");

                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pyramid() {
        int height = 3;
        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= height-i; j++) {
                System.out.print("  ");
            }
            for(int k = 0; k < 2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightTriangle() {
        int height = 5;
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < height+1; j++) {
                if(j >= height-i) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid();
    }
}
