package leetcode;

public class Week7 {
    public static String convert(String s, int numRows) {
        boolean isDown = true;
        StringBuilder sb = new StringBuilder();
        int visits = 0;
        int i = 0;
        int j = 0;
        sb.append(s.charAt(0));
        while (visits < s.length()) {
            int k = numRows-i-1;
            int k1 = i;
            int steps = isDown && i != numRows-1 || i == 0 ? Math.max(0, 2*k-1) : Math.max(0, 2*k1-1);

            j += steps+1;
            if(j >= s.length()) {
                i++;
                j = i;
                visits++;
                if(visits < s.length()){
                    sb.append(s.charAt(i));
                }
                isDown = true;
                continue;
            }
            char c = s.charAt(j);
            sb.append(c);
            visits++;
            isDown = !isDown;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }
}
