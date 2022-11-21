package Assignment_01;

public class Month31Days extends Date{

    Month31Days(int day, int month, int year){
        super(day, month, year);
        this.setLastDayofMonth(31);
    }
}