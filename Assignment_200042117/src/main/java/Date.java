package Assignment_01;

abstract public class Date {
     int day;
     int month;
     int year;
     int last_day_of_month;
    final int last_month_of_year = 12;

    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setLastDayofMonth(int day_of_month){
        this.last_day_of_month = day_of_month;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public void nextDate(){
        if(day == last_day_of_month){
            day = 0;
            if(month == last_month_of_year){
                month = 1;
                year++;
            }
            else {
                month++;
            }
        }
        day++;
    }

    boolean leapYear(){
        if (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)){
            return true;
        }
        else {
            return false;
        }
    }
}