package HW2;

public class HomeWork2 {
    public static void main(String[] args) {
        int x = -7;
        int y = 0;
        tenToTwenty(x,y);
        isItPositiveOrNegative(x);
        isItReallyNegative(x);
        String Greet = "Привет, мир!";
        int z = 5;
        printXTimes(Greet, z);
        int year = 400;
        isItALeapYear(year);

    }
    //region Task1
    public static boolean tenToTwenty(int a, int b){
        return 10 <= (a + b) && (a + b) >= 20;
    }
    //endregion
    //region Task2
    public static void isItPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //endregion
    //region Task3
    public static boolean isItReallyNegative(int a){
        if (a<0) {
            return true;
        } else return false;
    }
    //endregion
    //region Task4
    public static void printXTimes(String text, int a) {
        for (int i = a; i>0; i--){
            System.out.println(text);
        }
    }
    //endregion
    //region Task5
    public static boolean isItALeapYear(int year){
        if (year%4==0){
            if (year%100!=0 || year%400==0){
                System.out.println("true");
                return true;
            }
            else{
                System.out.println("false");
                return false;
            }
        }else {
            System.out.println("false");
            return false;
        }
    }
    //endregion
}
