package leetcode;

public class Week7 {
    public static String convert(String s, int numRows) {
        boolean isDown = false;
        StringBuilder sb = new StringBuilder();
        int visits = 0;
        int i = 0;
        int j = 0;
        sb.append(s.charAt(0));
        while (visits < s.length()) {
            int k = i == numRows-1 ? i : numRows-i-1;
            System.out.println(k+" k "+(i==numRows-1));
            int steps = isDown ? Math.max(0, 2*k-1) : Math.max(0, 2*i-3);

            j += steps+1;
            if(j >= s.length()) {
                i++;
                j = i;
                visits++;
                if(visits < s.length()){
                    sb.append(s.charAt(i));
                }
                isDown = false;
                continue;
            }
            char c = s.charAt(j);
            System.out.println(steps + " "+c);
            sb.append(c);
            visits++;
            isDown = !isDown;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
