package com.practise.demo.api.currency.dto;

import java.math.BigDecimal;

public class DtoConvertCurrencyResponse {
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
