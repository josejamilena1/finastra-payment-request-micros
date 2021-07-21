
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
 * PaymentRequestResource
 * <p>
 * ISO20022: The PaymentRequestResource message is sent by the Creditor sending party to the Debtor receiving party, directly or through agents. It is used by a Creditor to request movement of funds from the debtor account to a creditor.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chargeBearer",
    "creationDateTime",
    "creditTransferTransaction",
    "creditor",
    "creditorAccount",
    "creditorAgent",
    "debtor",
    "debtorAccount",
    "debtorAgent",
    "initiatingParty",
    "numberOfTransactions",
    "paymentInformationId",
    "paymentInformationStatus",
    "paymentTypeInformation",
    "purpose",
    "resourceId",
    "statusReasonInformation",
    "supplementaryData",
    "ultimateCreditor"
})
public class PaymentRequestResource {

    /**
     * - ISO2002: Specifies which party/parties will bear the charges associated with the processing of the payment transaction. - API: Set to "SLEV" or omitted
     * 
     */
    @JsonProperty("chargeBearer")
    @JsonPropertyDescription("- ISO2002: Specifies which party/parties will bear the charges associated with the processing of the payment transaction. - API: Set to \"SLEV\" or omitted")
    private PaymentRequestResource.ChargeBearer chargeBearer;
    /**
     * ISO20022: Date and time at which a (group of) payment instruction(s) was created by the instructing party.
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "UTC")
    @JsonProperty("creationDateTime")
    @JsonPropertyDescription("ISO20022: Date and time at which a (group of) payment instruction(s) was created by the instructing party.")
    private Date creationDateTime;
    /**
     * ISO20022: Payment processes required to transfer cash from the debtor to the creditor.
     * (Required)
     * 
     */
    @JsonProperty("creditTransferTransaction")
    @JsonPropertyDescription("ISO20022: Payment processes required to transfer cash from the debtor to the creditor.")
    private List<CreditTransferTransaction> creditTransferTransaction = new ArrayList<CreditTransferTransaction>();
    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * (Required)
     * 
     */
    @JsonProperty("creditor")
    @JsonPropertyDescription("API : Description of a Party which can be either a person or an organization.")
    private org.example.beans.PartyIdentification creditor;
    /**
     * AccountIdentification
     * <p>
     * Unique and unambiguous identification for the account between the account owner and the account servicer.
     * (Required)
     * 
     */
    @JsonProperty("creditorAccount")
    @JsonPropertyDescription("Unique and unambiguous identification for the account between the account owner and the account servicer.")
    private org.example.beans.AccountIdentification creditorAccount;
    /**
     * FinancialInstitutionIdentification
     * <p>
     * ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only <Bicfi> element is allowed 
     * 
     */
    @JsonProperty("creditorAgent")
    @JsonPropertyDescription("ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only <Bicfi> element is allowed ")
    private org.example.beans.FinancialInstitutionIdentification creditorAgent;
    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * 
     */
    @JsonProperty("debtor")
    @JsonPropertyDescription("API : Description of a Party which can be either a person or an organization.")
    private org.example.beans.PartyIdentification debtor;
    /**
     * AccountIdentification
     * <p>
     * Unique and unambiguous identification for the account between the account owner and the account servicer.
     * 
     */
    @JsonProperty("debtorAccount")
    @JsonPropertyDescription("Unique and unambiguous identification for the account between the account owner and the account servicer.")
    private org.example.beans.AccountIdentification debtorAccount;
    /**
     * FinancialInstitutionIdentification
     * <p>
     * ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only <Bicfi> element is allowed 
     * 
     */
    @JsonProperty("debtorAgent")
    @JsonPropertyDescription("ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only <Bicfi> element is allowed ")
    private org.example.beans.FinancialInstitutionIdentification debtorAgent;
    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * (Required)
     * 
     */
    @JsonProperty("initiatingParty")
    @JsonPropertyDescription("API : Description of a Party which can be either a person or an organization.")
    private org.example.beans.PartyIdentification initiatingParty;
    /**
     * ISO20022: Number of individual transactions contained in the message. 
     * (Required)
     * 
     */
    @JsonProperty("numberOfTransactions")
    @JsonPropertyDescription("ISO20022: Number of individual transactions contained in the message. ")
    private Integer numberOfTransactions;
    /**
     * ISO20022 : Reference assigned by a sending party to unambiguously identify the payment information block within the message. 
     * (Required)
     * 
     */
    @JsonProperty("paymentInformationId")
    @JsonPropertyDescription("ISO20022 : Reference assigned by a sending party to unambiguously identify the payment information block within the message. ")
    private String paymentInformationId;
    @JsonProperty("paymentInformationStatus")
    private PaymentRequestResource.PaymentInformationStatus paymentInformationStatus;
    /**
     * PaymentTypeInformation
     * <p>
     * ISO20022: Set of elements used to further specify the type of transaction.
     * (Required)
     * 
     */
    @JsonProperty("paymentTypeInformation")
    @JsonPropertyDescription("ISO20022: Set of elements used to further specify the type of transaction.")
    private PaymentTypeInformation paymentTypeInformation;
    @JsonProperty("purpose")
    private PaymentRequestResource.Purpose purpose;
    /**
     * API: Identifier assigned by the ASPSP for further use of the created resource through API calls 
     * 
     */
    @JsonProperty("resourceId")
    @JsonPropertyDescription("API: Identifier assigned by the ASPSP for further use of the created resource through API calls ")
    private String resourceId;
    @JsonProperty("statusReasonInformation")
    private PaymentRequestResource.StatusReasonInformation statusReasonInformation;
    /**
     * SupplementaryData
     * <p>
     * ISO20022: Additional information that cannot be captured in the structured elements and/or any other specific block.  API: This structure is used to embed the relevant URLs for returning the status report to the PISP and to specify which SCA approaches are accepted by the PISP and which has been chosen by the ASPSP
     * (Required)
     * 
     */
    @JsonProperty("supplementaryData")
    @JsonPropertyDescription("ISO20022: Additional information that cannot be captured in the structured elements and/or any other specific block.  API: This structure is used to embed the relevant URLs for returning the status report to the PISP and to specify which SCA approaches are accepted by the PISP and which has been chosen by the ASPSP")
    private SupplementaryData supplementaryData;
    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * 
     */
    @JsonProperty("ultimateCreditor")
    @JsonPropertyDescription("API : Description of a Party which can be either a person or an organization.")
    private org.example.beans.PartyIdentification ultimateCreditor;

    /**
     * - ISO2002: Specifies which party/parties will bear the charges associated with the processing of the payment transaction. - API: Set to "SLEV" or omitted
     * 
     */
    @JsonProperty("chargeBearer")
    public PaymentRequestResource.ChargeBearer getChargeBearer() {
        return chargeBearer;
    }

    /**
     * - ISO2002: Specifies which party/parties will bear the charges associated with the processing of the payment transaction. - API: Set to "SLEV" or omitted
     * 
     */
    @JsonProperty("chargeBearer")
    public void setChargeBearer(PaymentRequestResource.ChargeBearer chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    /**
     * ISO20022: Date and time at which a (group of) payment instruction(s) was created by the instructing party.
     * (Required)
     * 
     */
    @JsonProperty("creationDateTime")
    public Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * ISO20022: Date and time at which a (group of) payment instruction(s) was created by the instructing party.
     * (Required)
     * 
     */
    @JsonProperty("creationDateTime")
    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * ISO20022: Payment processes required to transfer cash from the debtor to the creditor.
     * (Required)
     * 
     */
    @JsonProperty("creditTransferTransaction")
    public List<CreditTransferTransaction> getCreditTransferTransaction() {
        return creditTransferTransaction;
    }

    /**
     * ISO20022: Payment processes required to transfer cash from the debtor to the creditor.
     * (Required)
     * 
     */
    @JsonProperty("creditTransferTransaction")
    public void setCreditTransferTransaction(List<CreditTransferTransaction> creditTransferTransaction) {
        this.creditTransferTransaction = creditTransferTransaction;
    }

    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * (Required)
     * 
     */
    @JsonProperty("creditor")
    public org.example.beans.PartyIdentification getCreditor() {
        return creditor;
    }

    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * (Required)
     * 
     */
    @JsonProperty("creditor")
    public void setCreditor(org.example.beans.PartyIdentification creditor) {
        this.creditor = creditor;
    }

    /**
     * AccountIdentification
     * <p>
     * Unique and unambiguous identification for the account between the account owner and the account servicer.
     * (Required)
     * 
     */
    @JsonProperty("creditorAccount")
    public org.example.beans.AccountIdentification getCreditorAccount() {
        return creditorAccount;
    }

    /**
     * AccountIdentification
     * <p>
     * Unique and unambiguous identification for the account between the account owner and the account servicer.
     * (Required)
     * 
     */
    @JsonProperty("creditorAccount")
    public void setCreditorAccount(org.example.beans.AccountIdentification creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    /**
     * FinancialInstitutionIdentification
     * <p>
     * ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only <Bicfi> element is allowed 
     * 
     */
    @JsonProperty("creditorAgent")
    public org.example.beans.FinancialInstitutionIdentification getCreditorAgent() {
        return creditorAgent;
    }

    /**
     * FinancialInstitutionIdentification
     * <p>
     * ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only <Bicfi> element is allowed 
     * 
     */
    @JsonProperty("creditorAgent")
    public void setCreditorAgent(org.example.beans.FinancialInstitutionIdentification creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * 
     */
    @JsonProperty("debtor")
    public org.example.beans.PartyIdentification getDebtor() {
        return debtor;
    }

    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * 
     */
    @JsonProperty("debtor")
    public void setDebtor(org.example.beans.PartyIdentification debtor) {
        this.debtor = debtor;
    }

    /**
     * AccountIdentification
     * <p>
     * Unique and unambiguous identification for the account between the account owner and the account servicer.
     * 
     */
    @JsonProperty("debtorAccount")
    public org.example.beans.AccountIdentification getDebtorAccount() {
        return debtorAccount;
    }

    /**
     * AccountIdentification
     * <p>
     * Unique and unambiguous identification for the account between the account owner and the account servicer.
     * 
     */
    @JsonProperty("debtorAccount")
    public void setDebtorAccount(org.example.beans.AccountIdentification debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    /**
     * FinancialInstitutionIdentification
     * <p>
     * ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only <Bicfi> element is allowed 
     * 
     */
    @JsonProperty("debtorAgent")
    public org.example.beans.FinancialInstitutionIdentification getDebtorAgent() {
        return debtorAgent;
    }

    /**
     * FinancialInstitutionIdentification
     * <p>
     * ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only <Bicfi> element is allowed 
     * 
     */
    @JsonProperty("debtorAgent")
    public void setDebtorAgent(org.example.beans.FinancialInstitutionIdentification debtorAgent) {
        this.debtorAgent = debtorAgent;
    }

    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * (Required)
     * 
     */
    @JsonProperty("initiatingParty")
    public org.example.beans.PartyIdentification getInitiatingParty() {
        return initiatingParty;
    }

    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * (Required)
     * 
     */
    @JsonProperty("initiatingParty")
    public void setInitiatingParty(org.example.beans.PartyIdentification initiatingParty) {
        this.initiatingParty = initiatingParty;
    }

    /**
     * ISO20022: Number of individual transactions contained in the message. 
     * (Required)
     * 
     */
    @JsonProperty("numberOfTransactions")
    public Integer getNumberOfTransactions() {
        return numberOfTransactions;
    }

    /**
     * ISO20022: Number of individual transactions contained in the message. 
     * (Required)
     * 
     */
    @JsonProperty("numberOfTransactions")
    public void setNumberOfTransactions(Integer numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    /**
     * ISO20022 : Reference assigned by a sending party to unambiguously identify the payment information block within the message. 
     * (Required)
     * 
     */
    @JsonProperty("paymentInformationId")
    public String getPaymentInformationId() {
        return paymentInformationId;
    }

    /**
     * ISO20022 : Reference assigned by a sending party to unambiguously identify the payment information block within the message. 
     * (Required)
     * 
     */
    @JsonProperty("paymentInformationId")
    public void setPaymentInformationId(String paymentInformationId) {
        this.paymentInformationId = paymentInformationId;
    }

    @JsonProperty("paymentInformationStatus")
    public PaymentRequestResource.PaymentInformationStatus getPaymentInformationStatus() {
        return paymentInformationStatus;
    }

    @JsonProperty("paymentInformationStatus")
    public void setPaymentInformationStatus(PaymentRequestResource.PaymentInformationStatus paymentInformationStatus) {
        this.paymentInformationStatus = paymentInformationStatus;
    }

    /**
     * PaymentTypeInformation
     * <p>
     * ISO20022: Set of elements used to further specify the type of transaction.
     * (Required)
     * 
     */
    @JsonProperty("paymentTypeInformation")
    public PaymentTypeInformation getPaymentTypeInformation() {
        return paymentTypeInformation;
    }

    /**
     * PaymentTypeInformation
     * <p>
     * ISO20022: Set of elements used to further specify the type of transaction.
     * (Required)
     * 
     */
    @JsonProperty("paymentTypeInformation")
    public void setPaymentTypeInformation(PaymentTypeInformation paymentTypeInformation) {
        this.paymentTypeInformation = paymentTypeInformation;
    }

    @JsonProperty("purpose")
    public PaymentRequestResource.Purpose getPurpose() {
        return purpose;
    }

    @JsonProperty("purpose")
    public void setPurpose(PaymentRequestResource.Purpose purpose) {
        this.purpose = purpose;
    }

    /**
     * API: Identifier assigned by the ASPSP for further use of the created resource through API calls 
     * 
     */
    @JsonProperty("resourceId")
    public String getResourceId() {
        return resourceId;
    }

    /**
     * API: Identifier assigned by the ASPSP for further use of the created resource through API calls 
     * 
     */
    @JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @JsonProperty("statusReasonInformation")
    public PaymentRequestResource.StatusReasonInformation getStatusReasonInformation() {
        return statusReasonInformation;
    }

    @JsonProperty("statusReasonInformation")
    public void setStatusReasonInformation(PaymentRequestResource.StatusReasonInformation statusReasonInformation) {
        this.statusReasonInformation = statusReasonInformation;
    }

    /**
     * SupplementaryData
     * <p>
     * ISO20022: Additional information that cannot be captured in the structured elements and/or any other specific block.  API: This structure is used to embed the relevant URLs for returning the status report to the PISP and to specify which SCA approaches are accepted by the PISP and which has been chosen by the ASPSP
     * (Required)
     * 
     */
    @JsonProperty("supplementaryData")
    public SupplementaryData getSupplementaryData() {
        return supplementaryData;
    }

    /**
     * SupplementaryData
     * <p>
     * ISO20022: Additional information that cannot be captured in the structured elements and/or any other specific block.  API: This structure is used to embed the relevant URLs for returning the status report to the PISP and to specify which SCA approaches are accepted by the PISP and which has been chosen by the ASPSP
     * (Required)
     * 
     */
    @JsonProperty("supplementaryData")
    public void setSupplementaryData(SupplementaryData supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * 
     */
    @JsonProperty("ultimateCreditor")
    public org.example.beans.PartyIdentification getUltimateCreditor() {
        return ultimateCreditor;
    }

    /**
     * PartyIdentification
     * <p>
     * API : Description of a Party which can be either a person or an organization.
     * 
     */
    @JsonProperty("ultimateCreditor")
    public void setUltimateCreditor(org.example.beans.PartyIdentification ultimateCreditor) {
        this.ultimateCreditor = ultimateCreditor;
    }

    public enum ChargeBearer {

        SLEV("SLEV");
        private final String value;
        private final static Map<String, PaymentRequestResource.ChargeBearer> CONSTANTS = new HashMap<String, PaymentRequestResource.ChargeBearer>();

        static {
            for (PaymentRequestResource.ChargeBearer c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ChargeBearer(String value) {
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
        public static PaymentRequestResource.ChargeBearer fromValue(String value) {
            PaymentRequestResource.ChargeBearer constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum PaymentInformationStatus {

        ACCP("ACCP"),
        ACSC("ACSC"),
        ACSP("ACSP"),
        ACTC("ACTC"),
        ACWC("ACWC"),
        ACWP("ACWP"),
        RCVD("RCVD"),
        PNDG("PNDG"),
        RJCT("RJCT");
        private final String value;
        private final static Map<String, PaymentRequestResource.PaymentInformationStatus> CONSTANTS = new HashMap<String, PaymentRequestResource.PaymentInformationStatus>();

        static {
            for (PaymentRequestResource.PaymentInformationStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private PaymentInformationStatus(String value) {
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
        public static PaymentRequestResource.PaymentInformationStatus fromValue(String value) {
            PaymentRequestResource.PaymentInformationStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Purpose {

        ACCT("ACCT"),
        CASH("CASH"),
        COMC("COMC"),
        CPKC("CPKC"),
        TRPT("TRPT");
        private final String value;
        private final static Map<String, PaymentRequestResource.Purpose> CONSTANTS = new HashMap<String, PaymentRequestResource.Purpose>();

        static {
            for (PaymentRequestResource.Purpose c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Purpose(String value) {
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
        public static PaymentRequestResource.Purpose fromValue(String value) {
            PaymentRequestResource.Purpose constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

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
        private final static Map<String, PaymentRequestResource.StatusReasonInformation> CONSTANTS = new HashMap<String, PaymentRequestResource.StatusReasonInformation>();

        static {
            for (PaymentRequestResource.StatusReasonInformation c: values()) {
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
        public static PaymentRequestResource.StatusReasonInformation fromValue(String value) {
            PaymentRequestResource.StatusReasonInformation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
