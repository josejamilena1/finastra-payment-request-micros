
package org.example.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HalPaymentRequest
 * <p>
 * HYPERMEDIA structure used for returning the original Payment Request to the PISP
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_links",
    "paymentRequest"
})
public class HalPaymentRequest {

    /**
     * PaymentTransferRequestLinks
     * <p>
     * links that can be used for further navigation when having post a Payment Request in order to get the relevant status report.
     * (Required)
     * 
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("links that can be used for further navigation when having post a Payment Request in order to get the relevant status report.")
    private PaymentTransferRequestLinks links;
    /**
     * PaymentRequestResource
     * <p>
     * ISO20022: The PaymentRequestResource message is sent by the Creditor sending party to the Debtor receiving party, directly or through agents. It is used by a Creditor to request movement of funds from the debtor account to a creditor.
     * (Required)
     * 
     */
    @JsonProperty("paymentRequest")
    @JsonPropertyDescription("ISO20022: The PaymentRequestResource message is sent by the Creditor sending party to the Debtor receiving party, directly or through agents. It is used by a Creditor to request movement of funds from the debtor account to a creditor.")
    private PaymentRequestResource paymentRequest;

    /**
     * PaymentTransferRequestLinks
     * <p>
     * links that can be used for further navigation when having post a Payment Request in order to get the relevant status report.
     * (Required)
     * 
     */
    @JsonProperty("_links")
    public PaymentTransferRequestLinks getLinks() {
        return links;
    }

    /**
     * PaymentTransferRequestLinks
     * <p>
     * links that can be used for further navigation when having post a Payment Request in order to get the relevant status report.
     * (Required)
     * 
     */
    @JsonProperty("_links")
    public void setLinks(PaymentTransferRequestLinks links) {
        this.links = links;
    }

    /**
     * PaymentRequestResource
     * <p>
     * ISO20022: The PaymentRequestResource message is sent by the Creditor sending party to the Debtor receiving party, directly or through agents. It is used by a Creditor to request movement of funds from the debtor account to a creditor.
     * (Required)
     * 
     */
    @JsonProperty("paymentRequest")
    public PaymentRequestResource getPaymentRequest() {
        return paymentRequest;
    }

    /**
     * PaymentRequestResource
     * <p>
     * ISO20022: The PaymentRequestResource message is sent by the Creditor sending party to the Debtor receiving party, directly or through agents. It is used by a Creditor to request movement of funds from the debtor account to a creditor.
     * (Required)
     * 
     */
    @JsonProperty("paymentRequest")
    public void setPaymentRequest(PaymentRequestResource paymentRequest) {
        this.paymentRequest = paymentRequest;
    }

}
