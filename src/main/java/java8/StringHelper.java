package java8;

public class StringHelper {
    public static String multiply(String s){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 5; i++){
            result.append(s);
        }

        return result.toString();
    }
    public static String multiply(String s, int count){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++){
            result.append(s);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("Test"));
        System.out.println(multiply("Test", 10));
    }
}
