
package org.example.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AccountIdentification
 * <p>
 * Unique and unambiguous identification for the account between the account owner and the account servicer.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "iban",
    "other"
})
public class AccountIdentification {

    /**
     * ISO20022: International Bank Account Number (IBAN) - identification used internationally by financial institutions to uniquely identify the account of a customer.   Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 "Banking and related financial services - International Bank Account Number (IBAN)" version 1997-10-01, or later revisions. 
     * 
     */
    @JsonProperty("iban")
    @JsonPropertyDescription("ISO20022: International Bank Account Number (IBAN) - identification used internationally by financial institutions to uniquely identify the account of a customer.   Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions. ")
    private String iban;
    /**
     * GenericIdentification
     * <p>
     * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.
     * 
     */
    @JsonProperty("other")
    @JsonPropertyDescription("ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.")
    private GenericIdentification other;

    /**
     * ISO20022: International Bank Account Number (IBAN) - identification used internationally by financial institutions to uniquely identify the account of a customer.   Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 "Banking and related financial services - International Bank Account Number (IBAN)" version 1997-10-01, or later revisions. 
     * 
     */
    @JsonProperty("iban")
    public String getIban() {
        return iban;
    }

    /**
     * ISO20022: International Bank Account Number (IBAN) - identification used internationally by financial institutions to uniquely identify the account of a customer.   Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 "Banking and related financial services - International Bank Account Number (IBAN)" version 1997-10-01, or later revisions. 
     * 
     */
    @JsonProperty("iban")
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * GenericIdentification
     * <p>
     * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.
     * 
     */
    @JsonProperty("other")
    public GenericIdentification getOther() {
        return other;
    }

    /**
     * GenericIdentification
     * <p>
     * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.
     * 
     */
    @JsonProperty("other")
    public void setOther(GenericIdentification other) {
        this.other = other;
    }

}
