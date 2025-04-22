  
/*
Восьмеричный конвертер
*/

public class zd10 {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        
        int i=0;
        double octalNumber=0;
        if(decimalNumber<=0){
            return 0;
        }
        while(decimalNumber!=0){
            octalNumber=octalNumber+(decimalNumber%8)*Math.pow(10,i);
            decimalNumber = decimalNumber/8;
            i++;
        }
        int result = (int) octalNumber;
        return result;
    }

    public static int toDecimal(int octalNumber) {

        int i=0;
        double decimalNumber=0;
        if(octalNumber<=0){
            return 0;  
        }
        while(octalNumber!=0){
            decimalNumber=decimalNumber+(octalNumber%10)*Math.pow(8,i);
            octalNumber=octalNumber/10;
            i++;
        }
        int result = (int) decimalNumber;
        return result;
    }
}