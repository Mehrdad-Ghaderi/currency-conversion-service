package com.mg.microservices.currency_conversion_service.controller;

import com.mg.microservices.currency_conversion_service.bean.CurrencyConversion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 8/7/2025
 * Time: 10:28 PM
 */
@RestController
@RequestMapping("/api/v1")
public class CurrencyConversionController {

    @GetMapping("currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion convert(@PathVariable("from") String from,
                                      @PathVariable("to") String to,
                                      @PathVariable("quantity") BigDecimal quantity) {

        HashMap<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8000/api/v1/currency-exchange/from/USD/to/CAD",
                CurrencyConversion.class,
                uriVariables
        );

        CurrencyConversion currencyConversion = responseEntity.getBody();

        return new CurrencyConversion(currencyConversion.getId(),
                from,
                to,
                quantity,
                currencyConversion.getRate(),
                quantity.multiply(currencyConversion.getRate()),
                currencyConversion.getServerEnvironment());
    }

}
