package Assignment_01;

public class Month30Days extends Date{

    Month30Days(int day, int month, int year){
        super(day, month, year);
        this.setLastDayofMonth(30);
    }
}