public class CountSpecailChar {
    public static void main(String[] args) {
        String str = "Agri123";
        countSpecialCharMethod1(str);
        countSpecialCharMethod2(str);
        char ch = '9';
        int ascii = ch;
//        int castAscii = (int) ch;
//
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
//        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
    static void countSpecialCharMethod1(String s){
        char[] chars = s.toCharArray();
        int count = 0;
        String alphaDigit = "";
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int ch = c;
//            System.out.println("The ASCII value of " + c + " is: " + ch);
            if((ch >= 65 && ch <=90) || (ch >= 97 && ch <=122) || ch == 32 || (ch >=48 && ch <= 57)) {
                alphaDigit+=(char)ch;
            } else {
                count++;
            }
        }
        if(count == 0) {
            System.out.println("No Special Characters");
            System.out.println("String without special characters " + alphaDigit);
        } else {
            System.out.println("Special Characters found " + count);
            System.out.println("String without special characters " + alphaDigit);
        }
    }
    static void countSpecialCharMethod2(String s) {
        int count = 0;
        String withoutSpecialChar = "";
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
                count++;
            } else {
                withoutSpecialChar+=s.charAt(i);
            }
        }
        if(count == 0) {
            System.out.println("No Special Characters");
        } else {
            System.out.println("Special Characters found " + count);
        }
        System.out.println("withoutSpecialChar " + withoutSpecialChar);
    }
}
