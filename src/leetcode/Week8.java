package leetcode;

public class Week8 {

    public static void printTree(int upperHeight, int logHeight) {
        int baseWidth = 2*upperHeight-1;
        int mid = baseWidth/2;
        for(int i = 0; i < upperHeight; i++) {
            for(int j = 0; j < baseWidth; j++) {
                if(j < mid-i || j > mid+i) {
                    System.out.print(' ');
                    continue;
                }
                System.out.print('*');
            }
            System.out.println();
        }
        int idk = baseWidth-2;
        int idk2 = (baseWidth-idk)/2;
        for(int i = 0; i < logHeight; i++) {
            for(int j = 0; j < baseWidth; j++) {
                if(j < mid-idk2 || j > mid+idk2) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");

            }
            System.out.println();

        }

    }
    public static String multiply(String num1, String num2) {
        int n1 = 0;
        int n2 = 0;
        int places = 1;
        for(int i = num1.length()-1; i > 0; i--) {
            n1 += (num1.charAt(i)-48)*places;
            places *= 10;
        }
        if(num1.charAt(0)==48) {
            n1*=-1;
        }else {
            n1 += (num1.charAt(0)-48)*places;
        }

        places = 1;
        for(int i = num2.length()-1; i > 0; i--) {
            n2 += (num2.charAt(i)-48)*places;
            places *= 10;
        }
        if(num2.charAt(0)==48) {
            n2*=-1;
        }else {
            n2 += (num2.charAt(0)-48)*places;
        }
        return String.valueOf(n1*n2);
    }
    public static void main(String[] args) {
        System.out.println(multiply("2", "3"));
    }
}
