package com.mg.microservices.currency_conversion_service.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 8/8/2025
 * Time: 11:18 AM
 */
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class CurrencyConversion {

    //@Id
    private Long id;

//    @Column(name = "currency_from")
    private String from;

//    @Column(name = "currency_to")
    private String to;
    private BigDecimal quantity;
    private BigDecimal rate;
    private BigDecimal calculatedAmount;


    private String serverEnvironment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal rate, BigDecimal calculatedAmount, String serverEnvironment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.rate = rate;
        this.calculatedAmount = calculatedAmount;
        this.serverEnvironment = serverEnvironment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(BigDecimal calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }

    public String getServerEnvironment() {
        return serverEnvironment;
    }

    public void setServerEnvironment(String serverEnvironment) {
        this.serverEnvironment = serverEnvironment;
    }
}
