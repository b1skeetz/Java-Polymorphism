package Bill_Double;

public class ProgressiveTaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        if(amount < 100_000){
            return amount * 0.1;
        }
        else {
            return amount * 0.15;
        }
    }
}
