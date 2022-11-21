package Assignment_01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    public void TestNormalDate() throws DateException{
        FactoryDate factoryDate = new FactoryDate(5,12,2022);
        String expected = "6/12/2022";
        assertEquals(expected,factoryDate.getNextDate());
    }

    @Test
    public void TestLastDateofYear() throws DateException{
        FactoryDate factoryDate = new FactoryDate(31,12,2022);
        String expected = "1/1/2023";
        assertEquals(expected,factoryDate.getNextDate());
    }

    @Test
    public void Test30DaysMonth() throws DateException{
        FactoryDate factoryDate = new FactoryDate(30,4,2022);
        String expected = "1/5/2022";
        assertEquals(expected,factoryDate.getNextDate());
    }

    @Test
    public void Test31DaysMonth() throws DateException{
        FactoryDate factoryDate = new FactoryDate(31,5,2022);
        String expected = "1/6/2022";
        assertEquals(expected,factoryDate.getNextDate());
    }

    @Test
    public void TestLeapYear() throws DateException{
        FactoryDate factoryDate = new FactoryDate(28,2,2020);
        String expected = "29/2/2020";
        assertEquals(expected,factoryDate.getNextDate());
    }

    @Test
    public void TestNotLeapYear() throws DateException{
        FactoryDate factoryDate = new FactoryDate(28,2,2022);
        String expected = "1/3/2022";
        assertEquals(expected,factoryDate.getNextDate());
    }

    @Test
    public void TestInvalidDate() throws DateException{
        try{
            FactoryDate factoryDate = new FactoryDate(31, 06, 2022);
            factoryDate.getNextDate();
        }
        catch (DateException e){
            System.out.println("Invalid Date");
        }
    }

    @Test
    public void TestInvalidMonth() throws DateException{
        try{
            FactoryDate factoryDate = new FactoryDate(31, 13, 2022);
            factoryDate.getNextDate();
        }
        catch (DateException e){
            System.out.println("Invalid Month");
        }
    }




}



