
package org.example.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AcceptedScaApproach {

    REDIRECT("REDIRECT"),
    DECOUPLED("DECOUPLED"),
    EMBEDDED("EMBEDDED");
    private final String value;
    private final static Map<String, AcceptedScaApproach> CONSTANTS = new HashMap<String, AcceptedScaApproach>();

    static {
        for (AcceptedScaApproach c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private AcceptedScaApproach(String value) {
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
    public static AcceptedScaApproach fromValue(String value) {
        AcceptedScaApproach constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
