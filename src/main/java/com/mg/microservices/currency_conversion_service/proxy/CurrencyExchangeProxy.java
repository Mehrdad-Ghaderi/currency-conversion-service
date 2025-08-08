package com.mg.microservices.currency_conversion_service.proxy;

import com.mg.microservices.currency_conversion_service.bean.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 8/8/2025
 * Time: 2:48 PM
 */

@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
public interface CurrencyExchangeProxy {

    @GetMapping("api/v1/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion getCurrencyExchangePair(@PathVariable("from") String from,
                                                      @PathVariable("to") String to);
}
