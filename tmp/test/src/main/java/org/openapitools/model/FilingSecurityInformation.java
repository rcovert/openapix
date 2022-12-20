package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.openapitools.model.Ein;
import org.openapitools.model.IPAddress;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FilingSecurityInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class FilingSecurityInformation {

  @JsonProperty("FederalOriginalSubmissionId")
  private Ein federalOriginalSubmissionId;

  @JsonProperty("AtSubmissionCreationDeviceId")
  private String atSubmissionCreationDeviceId;

  @JsonProperty("FederalOriginalSubmissionIdDt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate federalOriginalSubmissionIdDt;

  @JsonProperty("FilingLicenseTypeCd")
  private String filingLicenseTypeCd;

  @JsonProperty("IPAddress")
  private IPAddress ipAddress;

  @JsonProperty("AtSubmissionFilingDeviceId")
  private String atSubmissionFilingDeviceId;

  public FilingSecurityInformation federalOriginalSubmissionId(Ein federalOriginalSubmissionId) {
    this.federalOriginalSubmissionId = federalOriginalSubmissionId;
    return this;
  }

  /**
   * Get federalOriginalSubmissionId
   * @return federalOriginalSubmissionId
  */
  @NotNull @Valid 
  @Schema(name = "FederalOriginalSubmissionId", required = true)
  public Ein getFederalOriginalSubmissionId() {
    return federalOriginalSubmissionId;
  }

  public void setFederalOriginalSubmissionId(Ein federalOriginalSubmissionId) {
    this.federalOriginalSubmissionId = federalOriginalSubmissionId;
  }

  public FilingSecurityInformation atSubmissionCreationDeviceId(String atSubmissionCreationDeviceId) {
    this.atSubmissionCreationDeviceId = atSubmissionCreationDeviceId;
    return this;
  }

  /**
   * Get atSubmissionCreationDeviceId
   * @return atSubmissionCreationDeviceId
  */
  @NotNull 
  @Schema(name = "AtSubmissionCreationDeviceId", required = true)
  public String getAtSubmissionCreationDeviceId() {
    return atSubmissionCreationDeviceId;
  }

  public void setAtSubmissionCreationDeviceId(String atSubmissionCreationDeviceId) {
    this.atSubmissionCreationDeviceId = atSubmissionCreationDeviceId;
  }

  public FilingSecurityInformation federalOriginalSubmissionIdDt(LocalDate federalOriginalSubmissionIdDt) {
    this.federalOriginalSubmissionIdDt = federalOriginalSubmissionIdDt;
    return this;
  }

  /**
   * Get federalOriginalSubmissionIdDt
   * @return federalOriginalSubmissionIdDt
  */
  @NotNull @Valid 
  @Schema(name = "FederalOriginalSubmissionIdDt", required = true)
  public LocalDate getFederalOriginalSubmissionIdDt() {
    return federalOriginalSubmissionIdDt;
  }

  public void setFederalOriginalSubmissionIdDt(LocalDate federalOriginalSubmissionIdDt) {
    this.federalOriginalSubmissionIdDt = federalOriginalSubmissionIdDt;
  }

  public FilingSecurityInformation filingLicenseTypeCd(String filingLicenseTypeCd) {
    this.filingLicenseTypeCd = filingLicenseTypeCd;
    return this;
  }

  /**
   * Get filingLicenseTypeCd
   * @return filingLicenseTypeCd
  */
  @NotNull 
  @Schema(name = "FilingLicenseTypeCd", required = true)
  public String getFilingLicenseTypeCd() {
    return filingLicenseTypeCd;
  }

  public void setFilingLicenseTypeCd(String filingLicenseTypeCd) {
    this.filingLicenseTypeCd = filingLicenseTypeCd;
  }

  public FilingSecurityInformation ipAddress(IPAddress ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * @return ipAddress
  */
  @NotNull @Valid 
  @Schema(name = "IPAddress", required = true)
  public IPAddress getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(IPAddress ipAddress) {
    this.ipAddress = ipAddress;
  }

  public FilingSecurityInformation atSubmissionFilingDeviceId(String atSubmissionFilingDeviceId) {
    this.atSubmissionFilingDeviceId = atSubmissionFilingDeviceId;
    return this;
  }

  /**
   * Get atSubmissionFilingDeviceId
   * @return atSubmissionFilingDeviceId
  */
  @NotNull 
  @Schema(name = "AtSubmissionFilingDeviceId", required = true)
  public String getAtSubmissionFilingDeviceId() {
    return atSubmissionFilingDeviceId;
  }

  public void setAtSubmissionFilingDeviceId(String atSubmissionFilingDeviceId) {
    this.atSubmissionFilingDeviceId = atSubmissionFilingDeviceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilingSecurityInformation filingSecurityInformation = (FilingSecurityInformation) o;
    return Objects.equals(this.federalOriginalSubmissionId, filingSecurityInformation.federalOriginalSubmissionId) &&
        Objects.equals(this.atSubmissionCreationDeviceId, filingSecurityInformation.atSubmissionCreationDeviceId) &&
        Objects.equals(this.federalOriginalSubmissionIdDt, filingSecurityInformation.federalOriginalSubmissionIdDt) &&
        Objects.equals(this.filingLicenseTypeCd, filingSecurityInformation.filingLicenseTypeCd) &&
        Objects.equals(this.ipAddress, filingSecurityInformation.ipAddress) &&
        Objects.equals(this.atSubmissionFilingDeviceId, filingSecurityInformation.atSubmissionFilingDeviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(federalOriginalSubmissionId, atSubmissionCreationDeviceId, federalOriginalSubmissionIdDt, filingLicenseTypeCd, ipAddress, atSubmissionFilingDeviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilingSecurityInformation {\n");
    sb.append("    federalOriginalSubmissionId: ").append(toIndentedString(federalOriginalSubmissionId)).append("\n");
    sb.append("    atSubmissionCreationDeviceId: ").append(toIndentedString(atSubmissionCreationDeviceId)).append("\n");
    sb.append("    federalOriginalSubmissionIdDt: ").append(toIndentedString(federalOriginalSubmissionIdDt)).append("\n");
    sb.append("    filingLicenseTypeCd: ").append(toIndentedString(filingLicenseTypeCd)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    atSubmissionFilingDeviceId: ").append(toIndentedString(atSubmissionFilingDeviceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

