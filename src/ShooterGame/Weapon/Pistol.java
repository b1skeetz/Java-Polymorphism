package ShooterGame.Weapon;

public class Pistol extends Weapon {
    @Override
    public void shot(){
        System.out.println("--------------------");
        System.out.println("*Пистолет стреляет*");
        System.out.println("*Дыщ-Дыщ-Дыщ*");
        System.out.println("--------------------");
    }
}