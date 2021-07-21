
package org.example.beans;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PostalAddress
 * <p>
 * ISO20022 : Information that locates and identifies a specific address, as defined by postal services.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressLine",
    "country"
})
public class PostalAddress {

    /**
     * Unstructured address. The two lines must embed zip code and town name
     * (Required)
     * 
     */
    @JsonProperty("addressLine")
    @JsonPropertyDescription("Unstructured address. The two lines must embed zip code and town name")
    private List<String> addressLine = new ArrayList<String>();
    /**
     * ISO20022: Country in which a person resides (the place of a person's home). In the case of a company, it is the country from which the affairs of that company are directed. 
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("ISO20022: Country in which a person resides (the place of a person's home). In the case of a company, it is the country from which the affairs of that company are directed. ")
    private String country;

    /**
     * Unstructured address. The two lines must embed zip code and town name
     * (Required)
     * 
     */
    @JsonProperty("addressLine")
    public List<String> getAddressLine() {
        return addressLine;
    }

    /**
     * Unstructured address. The two lines must embed zip code and town name
     * (Required)
     * 
     */
    @JsonProperty("addressLine")
    public void setAddressLine(List<String> addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * ISO20022: Country in which a person resides (the place of a person's home). In the case of a company, it is the country from which the affairs of that company are directed. 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * ISO20022: Country in which a person resides (the place of a person's home). In the case of a company, it is the country from which the affairs of that company are directed. 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

}
