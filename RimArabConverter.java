public class RimArabConverter {

    public static Integer rimArab (String str) throws Exception {
        int numRiAr;
        switch (str) {

            case "I":
                numRiAr = 1;
                break;
            case "II":
                numRiAr = 2;
                break;
            case "III":
                numRiAr = 3;
                break;
            case "IV":
                numRiAr = 4;
                break;
            case "V":
                numRiAr = 5;
                break;
            case "VI":
                numRiAr = 6;
                break;
            case "VII":
                numRiAr = 7;
                break;
            case "IIX":
                numRiAr = 8;
                break;
            case "IX":
                numRiAr = 9;
                break;
            case "X":
                numRiAr = 10;
                break;
            default:
                System.out.println("because the value entered does not correspond to the specified parameters(I-X)");
                throw new Exception("because the value entered does not correspond to the specified parameters(I-X)");

        }

        return numRiAr;
    }

    public static String arabRim(Integer s) {
        String resultRim = "";
        if (s <=0 ){
            System.err.println("because the value entered does not correspond to the specified parameters(I-X)");
        }
        while (s >= 100) {
            if (s % 100 == 0) {
                resultRim+="C";
                break;
            }
            resultRim+="C";
            s -= 100;
        }
        while (s >= 90 && s < 100) {
            if (s % 90 == 0) {
                resultRim+="XC";
                break;
            }
            resultRim+="XC";
            s -= 90;
        }
        while (s >= 50 && s < 90) {
            if (s % 50 == 0) {
                resultRim+="L";
                break;
            }
            resultRim+="L";
            s -= 50;
        }
        while (s >= 40 && s < 50) {
            if (s % 40 == 0) {
                resultRim+="XL";
                break;
            }
            resultRim+="XL";
            s -= 40;
        }
        while (s >= 10 && s < 40) {
            if (s % 10 == 0) {
                resultRim+="X";
                break;
            }
            resultRim+="X";
            s -= 10;
        }
        while (s == 9) {
            resultRim+="IX";
            break;
        }
        while (s >= 5 && s < 9) {
            if (s % 5 == 0) {
                resultRim+="V";
                break;
            }
            resultRim+="V";
            s -= 5;
        }
        while (s == 4) {
            resultRim+="IV";
            break;
        }
        while (s >= 1 && s < 4) {
            if (s == 1) {
                resultRim+="I";
                break;
            }
            resultRim+="I";
            s -= 1;
        }

        return resultRim;
    }
}
