package Assignment_01;
import java.util.*;

public class FactoryDate {

    List<Integer> MonthsWith30Days = Arrays.asList(4,6,9,11);
    List<Integer> MonthsWith31Days = Arrays.asList(1,3,5,7,8,10,12);

    Date date;
    public FactoryDate(int day, int month, int year) throws DateException{
        if(MonthsWith30Days.contains(month)){
            if(day>30 || day<1)
            {
                throw new DateException("Date is invalid");
            }
            this.date = new Month30Days(day,month,year);
        }
        else if(MonthsWith31Days.contains(month)){
            if(day>31 || day<1)
            {
                throw new DateException("Date is invalid");
            }
            this.date = new Month31Days(day,month,year);
        }
        else if(month == 2){
            if(day>29 || day<1)
            {
                throw new DateException("Date is invalid");
            }
            this.date = new February(day, year);
        }
        else{
            throw new DateException("Month is invalid");
        }
    }

    public String getNextDate(){
        date.nextDate();
        String str = date.getDay() + "/" + date.getMonth() + "/" + date.getYear();
        return str;
    }

}