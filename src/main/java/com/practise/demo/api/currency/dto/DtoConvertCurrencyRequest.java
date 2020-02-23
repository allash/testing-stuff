package com.practise.demo.api.currency.dto;

import com.practise.demo.api.currency.Currency;

import javax.validation.constraints.Min;
import java.math.BigDecimal;

public class DtoConvertCurrencyRequest {
    private Currency from;
    private Currency to;

    @Min(0)
    private BigDecimal amount;

    public Currency getFrom() {
        return from;
    }

    public void setFrom(Currency from) {
        this.from = from;
    }

    public Currency getTo() {
        return to;
    }

    public void setTo(Currency to) {
        this.to = to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
