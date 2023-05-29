package Bill_BigDecimal;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.valueOf(100000)) >= 0) {
            return amount.multiply(BigDecimal.valueOf(0.15));
        }
        return amount.multiply(BigDecimal.valueOf(0.1));
    }
}