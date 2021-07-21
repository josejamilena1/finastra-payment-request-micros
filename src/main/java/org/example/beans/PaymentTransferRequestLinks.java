
package org.example.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PaymentTransferRequestLinks
 * <p>
 * links that can be used for further navigation when having post a Payment Request in order to get the relevant status report.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "confirmation",
    "self"
})
public class PaymentTransferRequestLinks {

    /**
     * GenericLink
     * <p>
     * hypertext reference
     * 
     */
    @JsonProperty("confirmation")
    @JsonPropertyDescription("hypertext reference")
    private org.example.beans.GenericLink confirmation;
    /**
     * GenericLink
     * <p>
     * hypertext reference
     * 
     */
    @JsonProperty("self")
    @JsonPropertyDescription("hypertext reference")
    private org.example.beans.GenericLink self;

    /**
     * GenericLink
     * <p>
     * hypertext reference
     * 
     */
    @JsonProperty("confirmation")
    public org.example.beans.GenericLink getConfirmation() {
        return confirmation;
    }

    /**
     * GenericLink
     * <p>
     * hypertext reference
     * 
     */
    @JsonProperty("confirmation")
    public void setConfirmation(org.example.beans.GenericLink confirmation) {
        this.confirmation = confirmation;
    }

    /**
     * GenericLink
     * <p>
     * hypertext reference
     * 
     */
    @JsonProperty("self")
    public org.example.beans.GenericLink getSelf() {
        return self;
    }

    /**
     * GenericLink
     * <p>
     * hypertext reference
     * 
     */
    @JsonProperty("self")
    public void setSelf(org.example.beans.GenericLink self) {
        this.self = self;
    }

}
