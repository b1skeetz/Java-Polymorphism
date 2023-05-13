package Bill_Double;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(15000, new IncomeTaxType(), new TaxService()),
                new Bill(50000, new VATaxType(), new TaxService()),
                new Bill(85000, new ProgressiveTaxType(), new TaxService()),
                new Bill(140_000, new ProgressiveTaxType(), new TaxService()),
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
