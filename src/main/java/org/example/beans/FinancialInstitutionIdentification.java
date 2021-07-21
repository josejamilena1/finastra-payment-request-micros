
package org.example.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FinancialInstitutionIdentification
 * <p>
 * ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only <Bicfi> element is allowed 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bicFi"
})
public class FinancialInstitutionIdentification {

    /**
     * ISO20022: Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 "Banking - Banking telecommunication messages - Business identification code (BIC)". 
     * (Required)
     * 
     */
    @JsonProperty("bicFi")
    @JsonPropertyDescription("ISO20022: Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identification code (BIC)\". ")
    private String bicFi;

    /**
     * ISO20022: Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 "Banking - Banking telecommunication messages - Business identification code (BIC)". 
     * (Required)
     * 
     */
    @JsonProperty("bicFi")
    public String getBicFi() {
        return bicFi;
    }

    /**
     * ISO20022: Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 "Banking - Banking telecommunication messages - Business identification code (BIC)". 
     * (Required)
     * 
     */
    @JsonProperty("bicFi")
    public void setBicFi(String bicFi) {
        this.bicFi = bicFi;
    }

}
