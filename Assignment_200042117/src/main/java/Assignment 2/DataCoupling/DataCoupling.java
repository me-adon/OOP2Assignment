package Assignment02.DataCoupling;

public class DataCoupling {
     Engine engine  = new Engine();
     Tire tire = new Tire();
     public void BMW_Speed(int BMW_velocity)
     {
          System.out.print(engine.speed(BMW_velocity));
     }

     public void BMW_tire(int BMW_tires){
          System.out.println(tire.total_tire(BMW_tires));
     }
}