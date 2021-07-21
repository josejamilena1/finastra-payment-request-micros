
package org.example.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * CreditTransferTransaction
 * <p>
 * ISO20022: Payment processes required to transfer cash from the debtor to the creditor.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instructedAmount",
    "paymentId",
    "regulatoryReportingCode",
    "remittanceInformation",
    "requestedExecutionDate",
    "statusReasonInformation",
    "transactionStatus"
})
public class CreditTransferTransaction {

    /**
     * AmountType
     * <p>
     * ISO20022: structure aiming to carry either an instructed amount or equivalent amount. Both structures embed the amount and the currency to be used.  API: only instructed amount can be used 
     * (Required)
     * 
     */
    @JsonProperty("instructedAmount")
    @JsonPropertyDescription("ISO20022: structure aiming to carry either an instructed amount or equivalent amount. Both structures embed the amount and the currency to be used.  API: only instructed amount can be used ")
    private AmountType instructedAmount;
    /**
     * PaymentIdentification
     * <p>
     * ISO20022: Set of elements used to reference a payment instruction.
     * (Required)
     * 
     */
    @JsonProperty("paymentId")
    @JsonPropertyDescription("ISO20022: Set of elements used to reference a payment instruction.")
    private PaymentIdentification paymentId;
    /**
     * Information needed due to regulatory and statutory requirements.  Economical codes to be used are provided by the National Competent Authority 
     * 
     */
    @JsonProperty("regulatoryReportingCode")
    @JsonPropertyDescription("Information needed due to regulatory and statutory requirements.  Economical codes to be used are provided by the National Competent Authority ")
    private String regulatoryReportingCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remittanceInformation")
    private List<String> remittanceInformation = new ArrayList<String>();
    /**
     * ISO20022: Date at which the initiating party requests the clearing agent to process the payment.  
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "UTC")
    @JsonProperty("requestedExecutionDate")
    @JsonPropertyDescription("ISO20022: Date at which the initiating party requests the clearing agent to process the payment.  ")
    private Date requestedExecutionDate;
    @JsonProperty("statusReasonInformation")
    private CreditTransferTransaction.StatusReasonInformation statusReasonInformation;
    @JsonProperty("transactionStatus")
    private CreditTransferTransaction.TransactionStatus transactionStatus;

    /**
     * AmountType
     * <p>
     * ISO20022: structure aiming to carry either an instructed amount or equivalent amount. Both structures embed the amount and the currency to be used.  API: only instructed amount can be used 
     * (Required)
     * 
     */
    @JsonProperty("instructedAmount")
    public AmountType getInstructedAmount() {
        return instructedAmount;
    }

    /**
     * AmountType
     * <p>
     * ISO20022: structure aiming to carry either an instructed amount or equivalent amount. Both structures embed the amount and the currency to be used.  API: only instructed amount can be used 
     * (Required)
     * 
     */
    @JsonProperty("instructedAmount")
    public void setInstructedAmount(AmountType instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    /**
     * PaymentIdentification
     * <p>
     * ISO20022: Set of elements used to reference a payment instruction.
     * (Required)
     * 
     */
    @JsonProperty("paymentId")
    public PaymentIdentification getPaymentId() {
        return paymentId;
    }

    /**
     * PaymentIdentification
     * <p>
     * ISO20022: Set of elements used to reference a payment instruction.
     * (Required)
     * 
     */
    @JsonProperty("paymentId")
    public void setPaymentId(PaymentIdentification paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Information needed due to regulatory and statutory requirements.  Economical codes to be used are provided by the National Competent Authority 
     * 
     */
    @JsonProperty("regulatoryReportingCode")
    public String getRegulatoryReportingCode() {
        return regulatoryReportingCode;
    }

    /**
     * Information needed due to regulatory and statutory requirements.  Economical codes to be used are provided by the National Competent Authority 
     * 
     */
    @JsonProperty("regulatoryReportingCode")
    public void setRegulatoryReportingCode(String regulatoryReportingCode) {
        this.regulatoryReportingCode = regulatoryReportingCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remittanceInformation")
    public List<String> getRemittanceInformation() {
        return remittanceInformation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remittanceInformation")
    public void setRemittanceInformation(List<String> remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }

    /**
     * ISO20022: Date at which the initiating party requests the clearing agent to process the payment.  
     * (Required)
     * 
     */
    @JsonProperty("requestedExecutionDate")
    public Date getRequestedExecutionDate() {
        return requestedExecutionDate;
    }

    /**
     * ISO20022: Date at which the initiating party requests the clearing agent to process the payment.  
     * (Required)
     * 
     */
    @JsonProperty("requestedExecutionDate")
    public void setRequestedExecutionDate(Date requestedExecutionDate) {
        this.requestedExecutionDate = requestedExecutionDate;
    }

    @JsonProperty("statusReasonInformation")
    public CreditTransferTransaction.StatusReasonInformation getStatusReasonInformation() {
        return statusReasonInformation;
    }

    @JsonProperty("statusReasonInformation")
    public void setStatusReasonInformation(CreditTransferTransaction.StatusReasonInformation statusReasonInformation) {
        this.statusReasonInformation = statusReasonInformation;
    }

    @JsonProperty("transactionStatus")
    public CreditTransferTransaction.TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    @JsonProperty("transactionStatus")
    public void setTransactionStatus(CreditTransferTransaction.TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public enum StatusReasonInformation {

        AC01("AC01"),
        AC04("AC04"),
        AC06("AC06"),
        AG01("AG01"),
        CUST("CUST"),
        FF01("FF01"),
        FRAD("FRAD"),
        MS03("MS03"),
        NOAS("NOAS"),
        RR01("RR01"),
        RR03("RR03"),
        RR04("RR04"),
        RR12("RR12");
        private final String value;
        private final static Map<String, CreditTransferTransaction.StatusReasonInformation> CONSTANTS = new HashMap<String, CreditTransferTransaction.StatusReasonInformation>();

        static {
            for (CreditTransferTransaction.StatusReasonInformation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private StatusReasonInformation(String value) {
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
        public static CreditTransferTransaction.StatusReasonInformation fromValue(String value) {
            CreditTransferTransaction.StatusReasonInformation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TransactionStatus {

        RJCT("RJCT"),
        PDNG("PDNG"),
        ACSP("ACSP"),
        ACSC("ACSC");
        private final String value;
        private final static Map<String, CreditTransferTransaction.TransactionStatus> CONSTANTS = new HashMap<String, CreditTransferTransaction.TransactionStatus>();

        static {
            for (CreditTransferTransaction.TransactionStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TransactionStatus(String value) {
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
        public static CreditTransferTransaction.TransactionStatus fromValue(String value) {
            CreditTransferTransaction.TransactionStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
