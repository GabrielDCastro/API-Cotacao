package org.br.mineradora.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="quotation")
@Data
@NoArgsConstructor
public class QuotationEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private BigDecimal currencyPrice;
    private String pctChange;
    private String pair;

    public Date getDate() {
        return date;
    }

    //  quando o nome é grande ou estranho é melhor expecificar o nome na mão
    @Column(name="currency_price")
    public BigDecimal getCurrencyPrice() {
        return currencyPrice;
    }

    @Column(name = "pct_change")
    public String getPctChange() {
        return pctChange;
    }

    public String getPair() {
        return pair;
    }
}
