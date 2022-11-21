package Assignment_01;

public class February extends Date{

    February(int day, int year){
        super(day, 2, year);
        if(this.leapYear()){
            this.setLastDayofMonth(29);
        }
        else{
            this.setLastDayofMonth(28);
        }
    }
}