package Assignment02.ControlCoupling;

public class Manager {

    Product product = new Product();

    public  void Status(){
        int price = 650;
        product.CheckStatus(price);
    }
}