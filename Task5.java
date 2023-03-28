package Second_HW;
// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
public class Task5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a = b");
        int index = sb.indexOf("=");
        sb.deleteCharAt(index);
        sb.insert(index, "равно");
        System.out.println(sb.toString());
    }
}
