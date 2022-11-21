package Assignment02.ControlCoupling;

public class Product {
    int price;

    public void CheckStatus(int price){
        if (price > 1000){
            System.out.println("Expensive");
        }
        else{
            System.out.println("Cheap");
        }
    }
}