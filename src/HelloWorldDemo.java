import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class HelloWorldDemo {
    public static void main(String[] argv) {
        System.out.println("Hello world");
        System.out.println("This task was done by Vladyslav Syzov from PZ-20-1/9 ");

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Поточна дата: " + formattedDate);
    }
}