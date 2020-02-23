package com.practise.demo.api.currency;

import com.practise.demo.api.currency.dto.DtoConvertCurrencyRequest;
import com.practise.demo.api.currency.dto.DtoConvertCurrencyResponse;

public interface CurrencyService {
    DtoConvertCurrencyResponse convert(DtoConvertCurrencyRequest request);
}
