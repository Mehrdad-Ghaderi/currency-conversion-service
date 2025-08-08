package com.mg.microservices.currency_conversion_service.controller;

import com.mg.microservices.currency_conversion_service.bean.CurrencyConversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 8/7/2025
 * Time: 10:28 PM
 */
@RestController
@RequestMapping("/api/v1")
public class CurrencyConversionController {

    @GetMapping("currency-conversion/from/{fromCurrency}/to/{toCurrency}/quantity/{quantity}")
    public CurrencyConversion convert(@PathVariable("fromCurrency") String fromCurrency,
                                      @PathVariable("toCurrency") String toCurrency,
                                      @PathVariable("quantity") BigDecimal quantity) {

        return new CurrencyConversion(10001L, fromCurrency, toCurrency, quantity, BigDecimal.ONE, BigDecimal.ONE, "");
    }

}
