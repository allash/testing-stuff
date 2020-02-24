package com.practise.demo.shared.exceptions;

import java.math.BigDecimal;

public class CurrencyNotFoundException extends EntityNotFoundException {
    public CurrencyNotFoundException(BigDecimal value) {
        super("only_for_testing_reasons: " + value);
    }
}
