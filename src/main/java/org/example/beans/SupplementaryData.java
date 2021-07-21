
package org.example.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SupplementaryData
 * <p>
 * ISO20022: Additional information that cannot be captured in the structured elements and/or any other specific block.  API: This structure is used to embed the relevant URLs for returning the status report to the PISP and to specify which SCA approaches are accepted by the PISP and which has been chosen by the ASPSP
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "acceptedScaApproach",
    "appliedScaApproach",
    "successfulReportUrl",
    "unsuccessfulReportUrl"
})
public class SupplementaryData {

    /**
     * can only be set by the PISP SCA approaches that are supported by the PISP. The PISP can provide several choices separated by commas.  REDIRECT: the PSU is redirected by the TPP to the ASPSP which processes identification and authentication DECOUPLED: the TPP identifies the PSU and forwards the identification to the ASPSP which processes the authentication through a decoupled device EMBEDDED: the TPP identifies the PSU and forwards the identification to the ASPSP which starts the authentication. The TPP forwards one authentication factor of the PSU (e.g. OTP or response to a challenge)
     * 
     */
    @JsonProperty("acceptedScaApproach")
    @JsonPropertyDescription("can only be set by the PISP SCA approaches that are supported by the PISP. The PISP can provide several choices separated by commas.  REDIRECT: the PSU is redirected by the TPP to the ASPSP which processes identification and authentication DECOUPLED: the TPP identifies the PSU and forwards the identification to the ASPSP which processes the authentication through a decoupled device EMBEDDED: the TPP identifies the PSU and forwards the identification to the ASPSP which starts the authentication. The TPP forwards one authentication factor of the PSU (e.g. OTP or response to a challenge)")
    private List<AcceptedScaApproach> acceptedScaApproach = new ArrayList<AcceptedScaApproach>();
    @JsonProperty("appliedScaApproach")
    private SupplementaryData.AppliedScaApproach appliedScaApproach;
    /**
     * URL to be used by the ASPSP in order to notify the PISP of the finalisation of the SCA and consent process in REDIRECT and DECOUPLED approach 
     * 
     */
    @JsonProperty("successfulReportUrl")
    @JsonPropertyDescription("URL to be used by the ASPSP in order to notify the PISP of the finalisation of the SCA and consent process in REDIRECT and DECOUPLED approach ")
    private String successfulReportUrl;
    /**
     * URL to be used by the ASPSP in order to notify the PISP of the failure of the SCA and consent process in REDIRECT and DECOUPLED approach  If this URL is not provided by the PISP, the ASPSP will use the "successfulReportUrl" even in case of failure of the Payment or Transfer Request processing 
     * 
     */
    @JsonProperty("unsuccessfulReportUrl")
    @JsonPropertyDescription("URL to be used by the ASPSP in order to notify the PISP of the failure of the SCA and consent process in REDIRECT and DECOUPLED approach  If this URL is not provided by the PISP, the ASPSP will use the \"successfulReportUrl\" even in case of failure of the Payment or Transfer Request processing ")
    private String unsuccessfulReportUrl;

    /**
     * can only be set by the PISP SCA approaches that are supported by the PISP. The PISP can provide several choices separated by commas.  REDIRECT: the PSU is redirected by the TPP to the ASPSP which processes identification and authentication DECOUPLED: the TPP identifies the PSU and forwards the identification to the ASPSP which processes the authentication through a decoupled device EMBEDDED: the TPP identifies the PSU and forwards the identification to the ASPSP which starts the authentication. The TPP forwards one authentication factor of the PSU (e.g. OTP or response to a challenge)
     * 
     */
    @JsonProperty("acceptedScaApproach")
    public List<AcceptedScaApproach> getAcceptedScaApproach() {
        return acceptedScaApproach;
    }

    /**
     * can only be set by the PISP SCA approaches that are supported by the PISP. The PISP can provide several choices separated by commas.  REDIRECT: the PSU is redirected by the TPP to the ASPSP which processes identification and authentication DECOUPLED: the TPP identifies the PSU and forwards the identification to the ASPSP which processes the authentication through a decoupled device EMBEDDED: the TPP identifies the PSU and forwards the identification to the ASPSP which starts the authentication. The TPP forwards one authentication factor of the PSU (e.g. OTP or response to a challenge)
     * 
     */
    @JsonProperty("acceptedScaApproach")
    public void setAcceptedScaApproach(List<AcceptedScaApproach> acceptedScaApproach) {
        this.acceptedScaApproach = acceptedScaApproach;
    }

    @JsonProperty("appliedScaApproach")
    public SupplementaryData.AppliedScaApproach getAppliedScaApproach() {
        return appliedScaApproach;
    }

    @JsonProperty("appliedScaApproach")
    public void setAppliedScaApproach(SupplementaryData.AppliedScaApproach appliedScaApproach) {
        this.appliedScaApproach = appliedScaApproach;
    }

    /**
     * URL to be used by the ASPSP in order to notify the PISP of the finalisation of the SCA and consent process in REDIRECT and DECOUPLED approach 
     * 
     */
    @JsonProperty("successfulReportUrl")
    public String getSuccessfulReportUrl() {
        return successfulReportUrl;
    }

    /**
     * URL to be used by the ASPSP in order to notify the PISP of the finalisation of the SCA and consent process in REDIRECT and DECOUPLED approach 
     * 
     */
    @JsonProperty("successfulReportUrl")
    public void setSuccessfulReportUrl(String successfulReportUrl) {
        this.successfulReportUrl = successfulReportUrl;
    }

    /**
     * URL to be used by the ASPSP in order to notify the PISP of the failure of the SCA and consent process in REDIRECT and DECOUPLED approach  If this URL is not provided by the PISP, the ASPSP will use the "successfulReportUrl" even in case of failure of the Payment or Transfer Request processing 
     * 
     */
    @JsonProperty("unsuccessfulReportUrl")
    public String getUnsuccessfulReportUrl() {
        return unsuccessfulReportUrl;
    }

    /**
     * URL to be used by the ASPSP in order to notify the PISP of the failure of the SCA and consent process in REDIRECT and DECOUPLED approach  If this URL is not provided by the PISP, the ASPSP will use the "successfulReportUrl" even in case of failure of the Payment or Transfer Request processing 
     * 
     */
    @JsonProperty("unsuccessfulReportUrl")
    public void setUnsuccessfulReportUrl(String unsuccessfulReportUrl) {
        this.unsuccessfulReportUrl = unsuccessfulReportUrl;
    }

    public enum AppliedScaApproach {

        REDIRECT("REDIRECT"),
        DECOUPLED("DECOUPLED"),
        EMBEDDED("EMBEDDED");
        private final String value;
        private final static Map<String, SupplementaryData.AppliedScaApproach> CONSTANTS = new HashMap<String, SupplementaryData.AppliedScaApproach>();

        static {
            for (SupplementaryData.AppliedScaApproach c: values()) {
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
        public static SupplementaryData.AppliedScaApproach fromValue(String value) {
            SupplementaryData.AppliedScaApproach constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
