
package org.example.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * PaymentTypeInformation
 * <p>
 * ISO20022: Set of elements used to further specify the type of transaction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "categoryPurpose",
    "instructionPriority",
    "localInstrument",
    "serviceLevel"
})
public class PaymentTypeInformation {

    @JsonProperty("categoryPurpose")
    private PaymentTypeInformation.CategoryPurpose categoryPurpose;
    @JsonProperty("instructionPriority")
    private PaymentTypeInformation.InstructionPriority instructionPriority;
    @JsonProperty("localInstrument")
    private PaymentTypeInformation.LocalInstrument localInstrument;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceLevel")
    private PaymentTypeInformation.ServiceLevel serviceLevel;

    @JsonProperty("categoryPurpose")
    public PaymentTypeInformation.CategoryPurpose getCategoryPurpose() {
        return categoryPurpose;
    }

    @JsonProperty("categoryPurpose")
    public void setCategoryPurpose(PaymentTypeInformation.CategoryPurpose categoryPurpose) {
        this.categoryPurpose = categoryPurpose;
    }

    @JsonProperty("instructionPriority")
    public PaymentTypeInformation.InstructionPriority getInstructionPriority() {
        return instructionPriority;
    }

    @JsonProperty("instructionPriority")
    public void setInstructionPriority(PaymentTypeInformation.InstructionPriority instructionPriority) {
        this.instructionPriority = instructionPriority;
    }

    @JsonProperty("localInstrument")
    public PaymentTypeInformation.LocalInstrument getLocalInstrument() {
        return localInstrument;
    }

    @JsonProperty("localInstrument")
    public void setLocalInstrument(PaymentTypeInformation.LocalInstrument localInstrument) {
        this.localInstrument = localInstrument;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceLevel")
    public PaymentTypeInformation.ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceLevel")
    public void setServiceLevel(PaymentTypeInformation.ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public enum CategoryPurpose {

        CASH("CASH"),
        DVPM("DVPM");
        private final String value;
        private final static Map<String, PaymentTypeInformation.CategoryPurpose> CONSTANTS = new HashMap<String, PaymentTypeInformation.CategoryPurpose>();

        static {
            for (PaymentTypeInformation.CategoryPurpose c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CategoryPurpose(String value) {
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
        public static PaymentTypeInformation.CategoryPurpose fromValue(String value) {
            PaymentTypeInformation.CategoryPurpose constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum InstructionPriority {

        HIGH("HIGH"),
        NORM("NORM");
        private final String value;
        private final static Map<String, PaymentTypeInformation.InstructionPriority> CONSTANTS = new HashMap<String, PaymentTypeInformation.InstructionPriority>();

        static {
            for (PaymentTypeInformation.InstructionPriority c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private InstructionPriority(String value) {
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
        public static PaymentTypeInformation.InstructionPriority fromValue(String value) {
            PaymentTypeInformation.InstructionPriority constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum LocalInstrument {

        INST("INST");
        private final String value;
        private final static Map<String, PaymentTypeInformation.LocalInstrument> CONSTANTS = new HashMap<String, PaymentTypeInformation.LocalInstrument>();

        static {
            for (PaymentTypeInformation.LocalInstrument c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private LocalInstrument(String value) {
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
        public static PaymentTypeInformation.LocalInstrument fromValue(String value) {
            PaymentTypeInformation.LocalInstrument constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ServiceLevel {

        NURG("NURG"),
        SEPA("SEPA");
        private final String value;
        private final static Map<String, PaymentTypeInformation.ServiceLevel> CONSTANTS = new HashMap<String, PaymentTypeInformation.ServiceLevel>();

        static {
            for (PaymentTypeInformation.ServiceLevel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ServiceLevel(String value) {
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
        public static PaymentTypeInformation.ServiceLevel fromValue(String value) {
            PaymentTypeInformation.ServiceLevel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
