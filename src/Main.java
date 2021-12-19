public class Main {
    public static void main(String[] argss){
        double converted = calcFeetAndInchesToCentimeters(0, -10);
        System.out.println(converted);
        double anothernum = calcFeetAndInchesToCentimeters(156);
        System.out.println(anothernum);
    }


    public static double calcFeetAndInchesToCentimeters(double y, double x){
        if (y >= 0 && (x >= 0) && (x <= 12)){
            double feet = y * (2.54 * 12);
            double inches = x * 2.54;
            System.out.println(y + " feet, " + x + " inches = " + (feet + inches) + " Centimeters");
            return feet + inches;
        }else {
            System.out.println("Invalid feet or inches input parameters!");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double w){
        if(w >= 0){
            double feet = (int) w / 12;
            double remainingInches = (int) w % 12;
            System.out.println(w + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            System.out.println("Invalid feet or inches input parameters!");
            return -1;
        }
    }
}
