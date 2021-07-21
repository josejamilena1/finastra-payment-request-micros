
package org.example.beans;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ErrorModel
 * <p>
 * Generic error report structure
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "error",
    "message",
    "path",
    "status",
    "timestamp"
})
public class ErrorModel {

    /**
     * HTTP error text
     * 
     */
    @JsonProperty("error")
    @JsonPropertyDescription("HTTP error text")
    private String error;
    /**
     * HTTP textual reason phrase
     * (Required)
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("HTTP textual reason phrase")
    private String message;
    /**
     * Relevant path that was used
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Relevant path that was used")
    private String path;
    /**
     * HTTP error code
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("HTTP error code")
    private Integer status;
    /**
     * current timestamp
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "UTC")
    @JsonProperty("timestamp")
    @JsonPropertyDescription("current timestamp")
    private Date timestamp;

    /**
     * HTTP error text
     * 
     */
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    /**
     * HTTP error text
     * 
     */
    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    /**
     * HTTP textual reason phrase
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * HTTP textual reason phrase
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Relevant path that was used
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Relevant path that was used
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * HTTP error code
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    /**
     * HTTP error code
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * current timestamp
     * 
     */
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * current timestamp
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}
