package ShooterGame;
import ShooterGame.Weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                new Pistol(),
                new Riffle(),
                new RPG(),
                new Slingshot(),
                new WaterPistol(),
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO если значение slot больше значения последнего элемента массива, то
        // выйти из метода написав об этом в консоль
        if(slot > getSlotsCount() - 1){
            System.out.println("Ваше значение больше положенного: " + slot);
            return;
        }
        if(slot == -1){
            System.out.println("Завершение работы");
            return;
        }
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}