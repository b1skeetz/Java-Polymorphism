package Bill_BigDecimal;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        switch (amount.compareTo(BigDecimal.valueOf(100000))){
            case 1: return amount.multiply(BigDecimal.valueOf(0.15));
            default: return amount.multiply(BigDecimal.valueOf(0.1));
        }
    }
}
