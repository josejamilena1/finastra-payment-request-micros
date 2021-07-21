
package org.example.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AmountType
 * <p>
 * ISO20022: structure aiming to carry either an instructed amount or equivalent amount. Both structures embed the amount and the currency to be used.  API: only instructed amount can be used 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "currency"
})
public class AmountType {

    /**
     * ISO20022: Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("ISO20022: Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. ")
    private String amount;
    /**
     * ISO20022: Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account. A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 "Codes for the representation of currencies and funds".  
     * (Required)
     * 
     */
    @JsonProperty("currency")
    @JsonPropertyDescription("ISO20022: Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account. A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".  ")
    private String currency;

    /**
     * ISO20022: Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * ISO20022: Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * ISO20022: Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account. A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 "Codes for the representation of currencies and funds".  
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * ISO20022: Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account. A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 "Codes for the representation of currencies and funds".  
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
