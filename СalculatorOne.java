import java.util.Scanner;


public class СalculatorOne {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] num = str.split("[/*+-]");
        int x1;
        int x2;
        char operation = str.charAt(num[0].length());


        if (isInteger(num[0]) && isInteger(num[1])) {
            x1 = Integer.parseInt(num[0]);
            x2 = Integer.parseInt(num[1]);
        } else {
            x1 = RimArabConverter.rimArab(num[0]);
            x2 = RimArabConverter.rimArab(num[1]);
        }
        if (x1 <= 0 || x1 > 10 || x2 <= 0 || x2 > 10) {
            throw new Exception("the range of numbers is limited 1-10");
        }


        int s = result(operation, x1, x2);
        String rim = RimArabConverter.arabRim(s);
        if (isInteger(num[0])){
            System.out.println(result(operation, x1, x2));
        } else {
            System.out.println(rim);
        }

    }


        public static Integer result (char xy, int xt1, int xt2) throws Exception {
            int sut;
            switch (xy) {
                case '+':
                    sut = xt1 + xt2;
                    break;
                case '-':
                    sut = xt1 - xt2;
                    break;
                case '*':
                    sut = xt1 * xt2;
                    break;
                case '/':
                    sut = xt1 / xt2;
                    break;
                default:
                    System.out.println("because the wrong operator is specified (+-*/)");
                    throw new Exception("because the wrong operator is specified (+-*/)");

            }


            return sut;
        }

        public static boolean isInteger (String truFalse){
            try {
                Integer.parseInt(truFalse);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }
        }


}