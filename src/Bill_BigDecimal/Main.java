package Bill_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(BigDecimal.valueOf(15000), new IncomeTaxType(), new TaxService()),
                new Bill(BigDecimal.valueOf(50000), new VATaxType(), new TaxService()),
                new Bill(BigDecimal.valueOf(85000), new ProgressiveTaxType(), new TaxService()),
                new Bill(BigDecimal.valueOf(140_000), new ProgressiveTaxType(), new TaxService()),
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }


        BigDecimal first = new BigDecimal(0.2);
        BigDecimal second = BigDecimal.valueOf(0.2);
        System.out.println("first = " + first.setScale(50, RoundingMode.HALF_UP)); // first = 0.20000000000000001110223024625156540423631668090820
        System.out.println("second = " + second.setScale(50, RoundingMode.HALF_UP)); // second = 0.20000000000000000000000000000000000000000000000000
        // new или valueOf?
        // При использовании оператора new для получения точных значений (без погрешности) нужно обязательно передавать строку в ковычках, а не значение double
        // При использовании valueOf нужно аргументом обязательно передавать double значение, которое будет преобразовано в BigDecimal без погрешности. Строку передавать невозможно!
    }
}
