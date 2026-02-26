public class Bitwise {

    public static void main(String[] args) {

        //AND operator
        int a = 0b111 & 0b101;

        int read = 0b100;
        int write = 0b010;
        int execute = 0b001;

        int userPermission = 0b000;

        //OR operator
        userPermission = read | write;

        //XOR operator
        userPermission ^= read;
        System.out.println((int)'1');
        //NOT operator
        int b = ~0b0000;
        int z = 0b001 + 0b001;
        //shift operators
        int c = 0b0000_0101<<1;
        int d = 0b0000_0101>>1;

        int t1 = 1;
        int t2 = 1;
        System.out.println(t1^t2);
        System.out.println(c);
        if((userPermission & read) == read) {
            System.out.println("User can read");
        }
        if((userPermission & write) == write) {
            System.out.println("User can write");
        }
        if((userPermission & execute) == execute) {
            System.out.println("User can execute");
        }
    }
}
