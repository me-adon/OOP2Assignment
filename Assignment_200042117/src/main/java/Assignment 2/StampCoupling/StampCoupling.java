package Assignment02.StampCoupling;

public class StampCoupling {
    int player;
    String Owner;
    int Player_number;
    String Inventor;

    public StampCoupling(Cricket cricket, Football football )
                          {
        this.player = football.player;
        this.Owner = football.Owner;
        this.Player_number = cricket.Player_number;
        this.Inventor = cricket.Inventor;
    }
}