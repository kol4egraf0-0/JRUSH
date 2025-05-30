import java.util.regex.Pattern;

/*
Двоичный конвертер
*/

public class zd101 {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        String binaryN="";
        if(decimalNumber<=0){
           return binaryN;
        }
         while(decimalNumber!=0){
          binaryN=decimalNumber%2 + binaryN;
          decimalNumber=decimalNumber/2;
        }
        return binaryN;
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        int decimalNumber=0;
        if(binaryNumber==null || binaryNumber.trim().isEmpty()){
            return 0;
        }
        for(int i=0; i<binaryNumber.length();i++){
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNumber += value * Math.pow(2, i);
        }
        return decimalNumber;
    }
}