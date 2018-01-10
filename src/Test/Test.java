package Test;


/**
 *  This class is for testing and running random lines of code into it for exams
 */
public class Test {
    public static void main(String[] args) {
        String[] strings = { "Hamlet", "Bacon" ,"Programming", "Science" };
        int length = someMethod(strings);
        System.out.println(length);
    }

    public static int someMethod(String[] s) {
        int max_length = 0;
        for(String a : s) {
            if(a.length() > max_length)
                max_length = a.length();
        }
        return max_length;
    }
}
