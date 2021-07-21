
package org.example.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GenericIdentification
 * <p>
 * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "identification",
    "issuer",
    "schemeName"
})
public class GenericIdentification {

    /**
     * API: alias of an account 
     * (Required)
     * 
     */
    @JsonProperty("identification")
    @JsonPropertyDescription("API: alias of an account ")
    private String identification;
    /**
     * ISO20022: Entity that assigns the identification. this could a country code or any organisation name or identifier that can be recognized by both parties 
     * (Required)
     * 
     */
    @JsonProperty("issuer")
    @JsonPropertyDescription("ISO20022: Entity that assigns the identification. this could a country code or any organisation name or identifier that can be recognized by both parties ")
    private String issuer;
    /**
     * Name of the identification scheme. Possible values for the scheme name, partially based on ISO20022 external code list, are the following: - BANK (BankPartyIdentification): Unique and unambiguous assignment made by a specific bank or similar financial institution to identify a relationship as defined between the bank and its client.  - COID (CountryIdentificationCode) : Country authority given organisation identification (e.g., corporate registration number) - SREN (SIREN): The SIREN number is a 9 digit code assigned by INSEE, the French National Institute for Statistics and Economic Studies, to identify an organisation in France. - SRET (SIRET): The SIRET number is a 14 digit code assigned by INSEE, the French National Institute for Statistics and Economic Studies, to identify an organisation unit in France. It consists of the SIREN number, followed by a five digit classification number, to identify the local geographical unit of that entity. - NIDN (NationalIdentityNumber): Number assigned by an authority to identify the national identity number of a person. Other values are also permitted, for instance: - OAUT (OAUTH2): OAUTH2 access token that is owned by the PISP being also an AISP and that can be used in order to identify the PSU - CPAN (CardPan): Card PAN 
     * (Required)
     * 
     */
    @JsonProperty("schemeName")
    @JsonPropertyDescription("Name of the identification scheme. Possible values for the scheme name, partially based on ISO20022 external code list, are the following: - BANK (BankPartyIdentification): Unique and unambiguous assignment made by a specific bank or similar financial institution to identify a relationship as defined between the bank and its client.  - COID (CountryIdentificationCode) : Country authority given organisation identification (e.g., corporate registration number) - SREN (SIREN): The SIREN number is a 9 digit code assigned by INSEE, the French National Institute for Statistics and Economic Studies, to identify an organisation in France. - SRET (SIRET): The SIRET number is a 14 digit code assigned by INSEE, the French National Institute for Statistics and Economic Studies, to identify an organisation unit in France. It consists of the SIREN number, followed by a five digit classification number, to identify the local geographical unit of that entity. - NIDN (NationalIdentityNumber): Number assigned by an authority to identify the national identity number of a person. Other values are also permitted, for instance: - OAUT (OAUTH2): OAUTH2 access token that is owned by the PISP being also an AISP and that can be used in order to identify the PSU - CPAN (CardPan): Card PAN ")
    private String schemeName;

    /**
     * API: alias of an account 
     * (Required)
     * 
     */
    @JsonProperty("identification")
    public String getIdentification() {
        return identification;
    }

    /**
     * API: alias of an account 
     * (Required)
     * 
     */
    @JsonProperty("identification")
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * ISO20022: Entity that assigns the identification. this could a country code or any organisation name or identifier that can be recognized by both parties 
     * (Required)
     * 
     */
    @JsonProperty("issuer")
    public String getIssuer() {
        return issuer;
    }

    /**
     * ISO20022: Entity that assigns the identification. this could a country code or any organisation name or identifier that can be recognized by both parties 
     * (Required)
     * 
     */
    @JsonProperty("issuer")
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * Name of the identification scheme. Possible values for the scheme name, partially based on ISO20022 external code list, are the following: - BANK (BankPartyIdentification): Unique and unambiguous assignment made by a specific bank or similar financial institution to identify a relationship as defined between the bank and its client.  - COID (CountryIdentificationCode) : Country authority given organisation identification (e.g., corporate registration number) - SREN (SIREN): The SIREN number is a 9 digit code assigned by INSEE, the French National Institute for Statistics and Economic Studies, to identify an organisation in France. - SRET (SIRET): The SIRET number is a 14 digit code assigned by INSEE, the French National Institute for Statistics and Economic Studies, to identify an organisation unit in France. It consists of the SIREN number, followed by a five digit classification number, to identify the local geographical unit of that entity. - NIDN (NationalIdentityNumber): Number assigned by an authority to identify the national identity number of a person. Other values are also permitted, for instance: - OAUT (OAUTH2): OAUTH2 access token that is owned by the PISP being also an AISP and that can be used in order to identify the PSU - CPAN (CardPan): Card PAN 
     * (Required)
     * 
     */
    @JsonProperty("schemeName")
    public String getSchemeName() {
        return schemeName;
    }

    /**
     * Name of the identification scheme. Possible values for the scheme name, partially based on ISO20022 external code list, are the following: - BANK (BankPartyIdentification): Unique and unambiguous assignment made by a specific bank or similar financial institution to identify a relationship as defined between the bank and its client.  - COID (CountryIdentificationCode) : Country authority given organisation identification (e.g., corporate registration number) - SREN (SIREN): The SIREN number is a 9 digit code assigned by INSEE, the French National Institute for Statistics and Economic Studies, to identify an organisation in France. - SRET (SIRET): The SIRET number is a 14 digit code assigned by INSEE, the French National Institute for Statistics and Economic Studies, to identify an organisation unit in France. It consists of the SIREN number, followed by a five digit classification number, to identify the local geographical unit of that entity. - NIDN (NationalIdentityNumber): Number assigned by an authority to identify the national identity number of a person. Other values are also permitted, for instance: - OAUT (OAUTH2): OAUTH2 access token that is owned by the PISP being also an AISP and that can be used in order to identify the PSU - CPAN (CardPan): Card PAN 
     * (Required)
     * 
     */
    @JsonProperty("schemeName")
    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

}
