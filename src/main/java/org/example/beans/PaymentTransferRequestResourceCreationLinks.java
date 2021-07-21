
package org.example.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PaymentTransferRequestResourceCreationLinks
 * <p>
 * links that can be used for further navigation, especially in REDIRECT approach
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "consentApproval"
})
public class PaymentTransferRequestResourceCreationLinks {

    /**
     * GenericLink
     * <p>
     * hypertext reference
     * 
     */
    @JsonProperty("consentApproval")
    @JsonPropertyDescription("hypertext reference")
    private GenericLink consentApproval;

    /**
     * GenericLink
     * <p>
     * hypertext reference
     * 
     */
    @JsonProperty("consentApproval")
    public GenericLink getConsentApproval() {
        return consentApproval;
    }

    /**
     * GenericLink
     * <p>
     * hypertext reference
     * 
     */
    @JsonProperty("consentApproval")
    public void setConsentApproval(GenericLink consentApproval) {
        this.consentApproval = consentApproval;
    }

}
