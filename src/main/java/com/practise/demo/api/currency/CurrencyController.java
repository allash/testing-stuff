package com.practise.demo.api.currency;

import com.practise.demo.api.currency.dto.DtoConvertCurrencyRequest;
import com.practise.demo.api.currency.dto.DtoConvertCurrencyResponse;
import com.practise.demo.api.task.dto.DtoCreateTaskRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/currencies")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    private static final String CURRENCY_MAIN_PAGE = "currency_main";

    @GetMapping
    public String getForm() {
        return CURRENCY_MAIN_PAGE;
    }

    @ResponseBody
    @PostMapping
    public DtoConvertCurrencyResponse convert(@Valid @RequestBody DtoConvertCurrencyRequest body) {
        return currencyService.convert(body);
        //modelMap.put("result", response.getAmount());
        //return CURRENCY_MAIN_PAGE;
    }

//    @GetMapping
//    public ModelAndView getForm() {
//        ModelAndView modelAndView =  new ModelAndView("currency_main", "currency", new DtoConvertCurrencyRequest());
//        return modelAndView;
//    }

}
