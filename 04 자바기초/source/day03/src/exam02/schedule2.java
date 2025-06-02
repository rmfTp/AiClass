package exam02;

public class schedule2 {
    private int year;
    private int month;
    private int day;

    public schedule2() {
        this(2025,4,22);//첫줄에만 작성
    }
    public schedule2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;//객체(this)에 year 저장
    }

    public int getMonth() {
        return month;//객체(this)의 month 에 접근
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    void showDate(){
        System.out.printf("year=%d,month=%d,day=%d%n",year,month,day);
    }
    public schedule2 getThis(){
        return this;
    }
}
