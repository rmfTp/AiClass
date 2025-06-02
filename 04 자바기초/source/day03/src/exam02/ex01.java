package exam02;

public class ex01 {
    public static void main(String[] args) {
        schedule s1 = new schedule();
        /* s1.year = 2025;
        s1.month = 2;
        s1.day = 31;//통제불가 */
        s1.setYear(2025);
        s1.setMonth(16);
        s1.setDay(41);
        s1.showDate();
    }
}
