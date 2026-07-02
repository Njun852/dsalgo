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
        //pew pew wata pew pew
        return "";
    }
    public static void main(String[] args) {

    }
}
