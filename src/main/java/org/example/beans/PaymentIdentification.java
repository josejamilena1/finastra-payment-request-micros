
package org.example.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PaymentIdentification
 * <p>
 * ISO20022: Set of elements used to reference a payment instruction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResourceId",
    "endToEndId",
    "instructionId"
})
public class PaymentIdentification {

    /**
     * API: Identifier assigned by the ASPSP for further use of the created resource through API calls 
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("API: Identifier assigned by the ASPSP for further use of the created resource through API calls ")
    private String resourceId;
    /**
     * ISO20022: Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.  API: Unique identification shared between the merchant and the PSU 
     * (Required)
     * 
     */
    @JsonProperty("endToEndId")
    @JsonPropertyDescription("ISO20022: Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.  API: Unique identification shared between the merchant and the PSU ")
    private String endToEndId;
    /**
     * ISO20022: Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction.  API: Unique identification shared between the PISP and the ASPSP  
     * (Required)
     * 
     */
    @JsonProperty("instructionId")
    @JsonPropertyDescription("ISO20022: Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction.  API: Unique identification shared between the PISP and the ASPSP  ")
    private String instructionId;

    /**
     * API: Identifier assigned by the ASPSP for further use of the created resource through API calls 
     * 
     */
    @JsonProperty("ResourceId")
    public String getResourceId() {
        return resourceId;
    }

    /**
     * API: Identifier assigned by the ASPSP for further use of the created resource through API calls 
     * 
     */
    @JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * ISO20022: Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.  API: Unique identification shared between the merchant and the PSU 
     * (Required)
     * 
     */
    @JsonProperty("endToEndId")
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * ISO20022: Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.  API: Unique identification shared between the merchant and the PSU 
     * (Required)
     * 
     */
    @JsonProperty("endToEndId")
    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

    /**
     * ISO20022: Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction.  API: Unique identification shared between the PISP and the ASPSP  
     * (Required)
     * 
     */
    @JsonProperty("instructionId")
    public String getInstructionId() {
        return instructionId;
    }

    /**
     * ISO20022: Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction.  API: Unique identification shared between the PISP and the ASPSP  
     * (Required)
     * 
     */
    @JsonProperty("instructionId")
    public void setInstructionId(String instructionId) {
        this.instructionId = instructionId;
    }

}
