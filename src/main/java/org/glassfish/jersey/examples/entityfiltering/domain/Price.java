package org.glassfish.jersey.examples.entityfiltering.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.time.LocalDate;

@SuppressWarnings({"JavaDoc", "UnusedDeclaration"})
@XmlRootElement
public class Price implements Comparable<Price>{
    private String productName;
    private BigDecimal productPrice;
    private LocalDate validFrom;
    private LocalDate validTo;

    public Price(){

    }

    public Price(String productName, BigDecimal productPrice, LocalDate dateFrom, LocalDate dateTo){
        this.productName = productName;
        this.productPrice = productPrice;
        this.validFrom = dateFrom;
        this.validTo = dateTo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }


    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public int compareTo(Price o1) {
        return this.validTo.compareTo(o1.validTo);
    }
}
