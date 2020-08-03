/**
 * @author sphinx
 * @date 2020-08-03
 * @description
 */
public class StrAdd {


    static class Solution {
        public String addStrings(String num1, String num2) {

            String s1 = new StringBuilder(num1).reverse().toString();
            String s2 = new StringBuilder(num2).reverse().toString();

            StringBuilder sb = new StringBuilder();

            int p = 0;
            int minLength = Math.min(s1.length(), s2.length());

            for (int i = 0; i < minLength; i++) {
                int a = s1.charAt(i) - '0';
                int b = s2.charAt(i) - '0';

                int c = a + b + p;
                if (c >= 10) {
                    p = 1;
                } else {
                    p = 0;
                }
                String s = String.valueOf(c);
                sb.append(s.charAt(s.length() - 1));
            }

            if (s1.length() > s2.length()) {

                for (int i = minLength; i < s1.length(); i++) {
                    int a = s1.charAt(i) - '0';


                    int c = a + p;
                    if (c >= 10) {
                        p = 1;
                    } else {
                        p = 0;
                    }
                    String s = String.valueOf(c);
                    sb.append(s.charAt(s.length() - 1));
                }


            } else if (s1.length() < s2.length()) {

                for (int i = minLength; i < s2.length(); i++) {
                    Integer a = s2.charAt(i) - '0';

                    int c = a + p;
                    if (c >= 10) {
                        p = 1;
                    } else {
                        p = 0;
                    }
                    String s = String.valueOf(c);
                    sb.append(s.charAt(s.length() - 1));
                }
            }

            if (p > 0) {
                sb.append(p);
            }

            return sb.reverse().toString();


        }
    }


    public static void main(String[] args) {

        Solution solution = new Solution();
        String s = solution.addStrings("1", "9");
        System.out.println(s);

    }
}
