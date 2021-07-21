
package org.example.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * HalPaymentTransferRequestCreation
 * <p>
 * data forwarded by the ASPSP top the PISP after creation of the Payment or Transfer Request resource creation 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_links",
    "appliedScaApproach"
})
public class HalPaymentTransferRequestCreation {

    /**
     * PaymentTransferRequestResourceCreationLinks
     * <p>
     * links that can be used for further navigation, especially in REDIRECT approach
     * 
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("links that can be used for further navigation, especially in REDIRECT approach")
    private PaymentTransferRequestResourceCreationLinks links;
    @JsonProperty("appliedScaApproach")
    private HalPaymentTransferRequestCreation.AppliedScaApproach appliedScaApproach;

    /**
     * PaymentTransferRequestResourceCreationLinks
     * <p>
     * links that can be used for further navigation, especially in REDIRECT approach
     * 
     */
    @JsonProperty("_links")
    public PaymentTransferRequestResourceCreationLinks getLinks() {
        return links;
    }

    /**
     * PaymentTransferRequestResourceCreationLinks
     * <p>
     * links that can be used for further navigation, especially in REDIRECT approach
     * 
     */
    @JsonProperty("_links")
    public void setLinks(PaymentTransferRequestResourceCreationLinks links) {
        this.links = links;
    }

    @JsonProperty("appliedScaApproach")
    public HalPaymentTransferRequestCreation.AppliedScaApproach getAppliedScaApproach() {
        return appliedScaApproach;
    }

    @JsonProperty("appliedScaApproach")
    public void setAppliedScaApproach(HalPaymentTransferRequestCreation.AppliedScaApproach appliedScaApproach) {
        this.appliedScaApproach = appliedScaApproach;
    }

    public enum AppliedScaApproach {

        REDIRECT("REDIRECT"),
        DECOUPLED("DECOUPLED"),
        EMBEDDED("EMBEDDED");
        private final String value;
        private final static Map<String, HalPaymentTransferRequestCreation.AppliedScaApproach> CONSTANTS = new HashMap<String, HalPaymentTransferRequestCreation.AppliedScaApproach>();

        static {
            for (HalPaymentTransferRequestCreation.AppliedScaApproach c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AppliedScaApproach(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static HalPaymentTransferRequestCreation.AppliedScaApproach fromValue(String value) {
            HalPaymentTransferRequestCreation.AppliedScaApproach constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
