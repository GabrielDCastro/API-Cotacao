package org.br.mineradora.entity;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

import java.math.BigDecimal;
import java.util.Date;

public class QuotationEntity extends PanacheMongoEntity {
    /*Nao precisa definir um id, pois o mongo já faz isso pra gente */
    private Date date;
    private BigDecimal currencyPrice;
    private String pctChange;
    private String pair;

    public QuotationEntity() {
    }

    public Date getDate() {
        return date;
    }

    public BigDecimal getCurrencyPrice() {
        return currencyPrice;
    }

    public String getPctChange() {
        return pctChange;
    }

    public String getPair() {
        return pair;
    }
}
