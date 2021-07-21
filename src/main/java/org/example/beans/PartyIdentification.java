
package org.example.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PartyIdentification
 * <p>
 * API : Description of a Party which can be either a person or an organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "organisationId",
    "postalAddress",
    "privateId"
})
public class PartyIdentification {

    /**
     * ISO20022: Name by which a party is known and which is usually used to identify that party. 
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("ISO20022: Name by which a party is known and which is usually used to identify that party. ")
    private String name;
    /**
     * GenericIdentification
     * <p>
     * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.
     * 
     */
    @JsonProperty("organisationId")
    @JsonPropertyDescription("ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.")
    private org.example.beans.GenericIdentification organisationId;
    /**
     * PostalAddress
     * <p>
     * ISO20022 : Information that locates and identifies a specific address, as defined by postal services.
     * 
     */
    @JsonProperty("postalAddress")
    @JsonPropertyDescription("ISO20022 : Information that locates and identifies a specific address, as defined by postal services.")
    private PostalAddress postalAddress;
    /**
     * GenericIdentification
     * <p>
     * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.
     * 
     */
    @JsonProperty("privateId")
    @JsonPropertyDescription("ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.")
    private org.example.beans.GenericIdentification privateId;

    /**
     * ISO20022: Name by which a party is known and which is usually used to identify that party. 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * ISO20022: Name by which a party is known and which is usually used to identify that party. 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * GenericIdentification
     * <p>
     * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.
     * 
     */
    @JsonProperty("organisationId")
    public org.example.beans.GenericIdentification getOrganisationId() {
        return organisationId;
    }

    /**
     * GenericIdentification
     * <p>
     * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.
     * 
     */
    @JsonProperty("organisationId")
    public void setOrganisationId(org.example.beans.GenericIdentification organisationId) {
        this.organisationId = organisationId;
    }

    /**
     * PostalAddress
     * <p>
     * ISO20022 : Information that locates and identifies a specific address, as defined by postal services.
     * 
     */
    @JsonProperty("postalAddress")
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * PostalAddress
     * <p>
     * ISO20022 : Information that locates and identifies a specific address, as defined by postal services.
     * 
     */
    @JsonProperty("postalAddress")
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    /**
     * GenericIdentification
     * <p>
     * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.
     * 
     */
    @JsonProperty("privateId")
    public org.example.beans.GenericIdentification getPrivateId() {
        return privateId;
    }

    /**
     * GenericIdentification
     * <p>
     * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.
     * 
     */
    @JsonProperty("privateId")
    public void setPrivateId(org.example.beans.GenericIdentification privateId) {
        this.privateId = privateId;
    }

}
