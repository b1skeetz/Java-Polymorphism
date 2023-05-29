package ShooterGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot = 0;

        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1
        do {
            System.out.print("Введите слот оружия [0;4]. Чтобы выйти введите -1: ");
            slot = scanner.nextInt();
            player.shotWithWeapon(slot);
        } while (slot != -1);
        System.out.println("Game over!");
    }
}