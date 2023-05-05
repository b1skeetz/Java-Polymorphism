package ShooterGame.Weapon;

public class WaterPistol extends Weapon {
    @Override
    public void shot(){
        System.out.println("--------------------");
        System.out.println("*Водяной пистолет стреляет*");
        System.out.println("*Бульк-Бульк-Бульк*");
        System.out.println("--------------------");
    }
}