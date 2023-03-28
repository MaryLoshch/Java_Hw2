package Second_HW;
// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
public class Task6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a = b");
        sb.replace(sb.indexOf("="), sb.indexOf("=") + 1, "равно");
        System.out.println(sb.toString()); // выводит "a равно b"
    }
}
