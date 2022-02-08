package HW2;

public class HomeWork2 {
    public static void main(String[] args) {

    }
    //region Task1
    public static boolean tenToTwenty(int a, int b){
        if (10 <= (a + b) && (a+b) >= 20) {
           return true;
        } else return false;
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
}
