import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) {
        String[] romanNum = new String[]{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String[] str = input.split(" ");
        int rnum1 = 0;
        int rnum2 = 0;
        int anum1 = 0;
        int anum2 = 0;
        String aResult = " ";
        String rResult = " ";

        if (str.length > 3) {
            throw new RuntimeException();
        }
        if ((str[1].charAt(0) != '+') && (str[1].charAt(0) != '-') && (str[1].charAt(0) != '*') && (str[1].charAt(0) != '/')) {
            throw new RuntimeException();
        }

        if (str[0].equals("I")) {
            rnum1 = 1;
        } else if (str[0].equals("II")) {
            rnum1 = 2;
        } else if (str[0].equals("III")) {
            rnum1 = 3;
        } else if (str[0].equals("IV")) {
            rnum1 = 4;
        } else if (str[0].equals("V")) {
            rnum1 = 5;
        } else if (str[0].equals("VI")) {
            rnum1 = 6;
        } else if (str[0].equals("VII")) {
            rnum1 = 7;
        } else if (str[0].equals("VIII")) {
            rnum1 = 8;
        } else if (str[0].equals("IX")) {
            rnum1 = 9;
        } else if (str[0].equals("X")) {
            rnum1 = 10;
        } else {
            anum1 = Integer.parseInt(str[0]);
        }

        if (str[2].equals("I")) {
            rnum2 = 1;
        } else if (str[2].equals("II")) {
            rnum2 = 2;
        } else if (str[2].equals("III")) {
            rnum2 = 3;
        } else if (str[2].equals("IV")) {
            rnum2 = 4;
        } else if (str[2].equals("V")) {
            rnum2 = 5;
        } else if (str[2].equals("VI")) {
            rnum2 = 6;
        } else if (str[2].equals("VII")) {
            rnum2 = 7;
        } else if (str[2].equals("VIII")) {
            rnum2 = 8;
        } else if (str[2].equals("IX")) {
            rnum2 = 9;
        } else if (str[2].equals("X")) {
            rnum2 = 10;
        } else {
            anum2 = Integer.parseInt(str[2]);
        }
        if ((anum1 < rnum1 && anum2 > rnum2) || (anum1 > rnum1 && anum2 < rnum2)) {
            throw new RuntimeException();
        }
        if ((anum1 != 0 && anum2 != 0) && (anum1 <= 10 && anum2 <= 10)) {
            switch (str[1]) {
                case "+":
                    return aResult = String.valueOf(anum1 + anum2);
                case "-":
                    return aResult = String.valueOf(anum1 - anum2);
                case "*":
                    return aResult = String.valueOf(anum1 * anum2);
                case "/":
                    return aResult = String.valueOf(anum1 / anum2);
            }
        } else if (anum1 > 10 || anum2 > 10) {
            throw new RuntimeException();
        }
        if (anum1 == 0 && anum2 == 0) {
            switch (str[1]) {
                case "+":
                    int q = rnum1 + rnum2;
                    return rResult = String.valueOf(romanNum[q]);

                case "-":
                    if (rnum1 > rnum2) {
                        int w = rnum1 - rnum2;
                        return rResult = String.valueOf(romanNum[w]);
                    } else throw new RuntimeException();
                case "*":
                    int e = rnum1 * rnum2;
                    return rResult = String.valueOf(romanNum[e]);
                case "/":
                    int r = rnum1 / rnum2;
                    return rResult = String.valueOf(romanNum[r]);
            }
        }
        if (aResult.equals(" ")) {
            return aResult;
        } else {
            return rResult;
        }
    }
}