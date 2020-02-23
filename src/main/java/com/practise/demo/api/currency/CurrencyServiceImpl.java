package com.practise.demo.api.currency;

import com.practise.demo.api.currency.dto.DtoConvertCurrencyRequest;
import com.practise.demo.api.currency.dto.DtoConvertCurrencyResponse;
import org.springframework.stereotype.Service;

import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.MonetaryConversions;
import java.math.BigDecimal;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Override
    public DtoConvertCurrencyResponse convert(DtoConvertCurrencyRequest request) {

        MonetaryAmount monetaryAmount = Monetary
                .getDefaultAmountFactory()
                .setCurrency(request.getFrom().name())
                .setNumber(request.getAmount())
                .create();

        CurrencyConversion conversion = MonetaryConversions.getConversion(request.getTo().name());

        MonetaryAmount convertedAmount = monetaryAmount.with(conversion);
        DtoConvertCurrencyResponse response = new DtoConvertCurrencyResponse();
        response.setAmount(new BigDecimal(convertedAmount.getNumber().doubleValueExact()));

        return response;
    }
}
