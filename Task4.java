package Second_HW;
// Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
public class Task4 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;
        StringBuilder sb = new StringBuilder();
        sb.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2).append("\n")
                .append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2).append("\n")
                .append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
        System.out.println(sb.toString());
    }
}
