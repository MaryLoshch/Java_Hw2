package Second_HW;
// *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
public class Task3 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
