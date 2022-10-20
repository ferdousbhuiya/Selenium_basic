package UnitTesting;

public class CourseJava {
    public int division(int numOne, int numTwo) {
        int result = numOne / numTwo;
        return result;
    }
    public static boolean isEmpty(String word) {
        if (word == null || word.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static String isEmpty1(String word) {
        if (word == null || word.length() == 0) {
            return null;
        } else {
            return word;
        }
    }
}



