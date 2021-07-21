
package org.example.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GenericLink
 * <p>
 * hypertext reference
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "href",
    "templated"
})
public class GenericLink {

    /**
     * URI to be used
     * (Required)
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI to be used")
    private String href;
    /**
     * specifies "true" if href is a URI template, i.e. with parameters. Otherwise, this property is absent or set to false
     * 
     */
    @JsonProperty("templated")
    @JsonPropertyDescription("specifies \"true\" if href is a URI template, i.e. with parameters. Otherwise, this property is absent or set to false")
    private Boolean templated;

    /**
     * URI to be used
     * (Required)
     * 
     */
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    /**
     * URI to be used
     * (Required)
     * 
     */
    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * specifies "true" if href is a URI template, i.e. with parameters. Otherwise, this property is absent or set to false
     * 
     */
    @JsonProperty("templated")
    public Boolean getTemplated() {
        return templated;
    }

    /**
     * specifies "true" if href is a URI template, i.e. with parameters. Otherwise, this property is absent or set to false
     * 
     */
    @JsonProperty("templated")
    public void setTemplated(Boolean templated) {
        this.templated = templated;
    }

}
