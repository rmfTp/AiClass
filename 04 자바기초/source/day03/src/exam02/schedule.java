package exam02;

public class schedule {
    private int year;
    private int month;
    private int day;
    public void setYear(int _year){
        year = _year;
    }
    public void setMonth(int _month){
        if(_month  >12)_month= _month%12;
        month = _month;
    }
    public void setDay(int _day){
        if(month == 2 && _day >28)_day=28;
        if (((month%2==1&&month>7)||(month%2==0&&month<=7))&& _day>30) _day=30;
        //  (      9,11                     2,4,6         )
            //  2월의 경우에는 위에서 이미 실행되서 28이하지만 포함이 되서 실행은 됨
        else if (_day>31)_day=31;
        else day = _day;
    }
    void showDate(){
        System.out.printf("year=%d,month=%d,day=%d%n",year,month,day);
    }
}
