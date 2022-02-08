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
}
