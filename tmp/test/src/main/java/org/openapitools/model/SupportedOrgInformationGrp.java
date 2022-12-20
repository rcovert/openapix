package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Name;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SupportedOrgInformationGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class SupportedOrgInformationGrp {

  @JsonProperty("GoverningDocumentListedInd")
  private Boolean governingDocumentListedInd;

  @JsonProperty("SupportAmt")
  private Integer supportAmt;

  @JsonProperty("EIN")
  private String EIN;

  @JsonProperty("OrganizationTypeCd")
  private Integer organizationTypeCd;

  @JsonProperty("OtherSupportAmt")
  private Integer otherSupportAmt;

  @JsonProperty("SupportedOrganizationName")
  private Name supportedOrganizationName;

  public SupportedOrgInformationGrp governingDocumentListedInd(Boolean governingDocumentListedInd) {
    this.governingDocumentListedInd = governingDocumentListedInd;
    return this;
  }

  /**
   * Get governingDocumentListedInd
   * @return governingDocumentListedInd
  */
  @NotNull 
  @Schema(name = "GoverningDocumentListedInd", required = true)
  public Boolean getGoverningDocumentListedInd() {
    return governingDocumentListedInd;
  }

  public void setGoverningDocumentListedInd(Boolean governingDocumentListedInd) {
    this.governingDocumentListedInd = governingDocumentListedInd;
  }

  public SupportedOrgInformationGrp supportAmt(Integer supportAmt) {
    this.supportAmt = supportAmt;
    return this;
  }

  /**
   * Get supportAmt
   * @return supportAmt
  */
  @NotNull 
  @Schema(name = "SupportAmt", required = true)
  public Integer getSupportAmt() {
    return supportAmt;
  }

  public void setSupportAmt(Integer supportAmt) {
    this.supportAmt = supportAmt;
  }

  public SupportedOrgInformationGrp EIN(String EIN) {
    this.EIN = EIN;
    return this;
  }

  /**
   * Get EIN
   * @return EIN
  */
  @NotNull 
  @Schema(name = "EIN", required = true)
  public String getEIN() {
    return EIN;
  }

  public void setEIN(String EIN) {
    this.EIN = EIN;
  }

  public SupportedOrgInformationGrp organizationTypeCd(Integer organizationTypeCd) {
    this.organizationTypeCd = organizationTypeCd;
    return this;
  }

  /**
   * Get organizationTypeCd
   * @return organizationTypeCd
  */
  @NotNull 
  @Schema(name = "OrganizationTypeCd", required = true)
  public Integer getOrganizationTypeCd() {
    return organizationTypeCd;
  }

  public void setOrganizationTypeCd(Integer organizationTypeCd) {
    this.organizationTypeCd = organizationTypeCd;
  }

  public SupportedOrgInformationGrp otherSupportAmt(Integer otherSupportAmt) {
    this.otherSupportAmt = otherSupportAmt;
    return this;
  }

  /**
   * Get otherSupportAmt
   * @return otherSupportAmt
  */
  @NotNull 
  @Schema(name = "OtherSupportAmt", required = true)
  public Integer getOtherSupportAmt() {
    return otherSupportAmt;
  }

  public void setOtherSupportAmt(Integer otherSupportAmt) {
    this.otherSupportAmt = otherSupportAmt;
  }

  public SupportedOrgInformationGrp supportedOrganizationName(Name supportedOrganizationName) {
    this.supportedOrganizationName = supportedOrganizationName;
    return this;
  }

  /**
   * Get supportedOrganizationName
   * @return supportedOrganizationName
  */
  @NotNull @Valid 
  @Schema(name = "SupportedOrganizationName", required = true)
  public Name getSupportedOrganizationName() {
    return supportedOrganizationName;
  }

  public void setSupportedOrganizationName(Name supportedOrganizationName) {
    this.supportedOrganizationName = supportedOrganizationName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedOrgInformationGrp supportedOrgInformationGrp = (SupportedOrgInformationGrp) o;
    return Objects.equals(this.governingDocumentListedInd, supportedOrgInformationGrp.governingDocumentListedInd) &&
        Objects.equals(this.supportAmt, supportedOrgInformationGrp.supportAmt) &&
        Objects.equals(this.EIN, supportedOrgInformationGrp.EIN) &&
        Objects.equals(this.organizationTypeCd, supportedOrgInformationGrp.organizationTypeCd) &&
        Objects.equals(this.otherSupportAmt, supportedOrgInformationGrp.otherSupportAmt) &&
        Objects.equals(this.supportedOrganizationName, supportedOrgInformationGrp.supportedOrganizationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(governingDocumentListedInd, supportAmt, EIN, organizationTypeCd, otherSupportAmt, supportedOrganizationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedOrgInformationGrp {\n");
    sb.append("    governingDocumentListedInd: ").append(toIndentedString(governingDocumentListedInd)).append("\n");
    sb.append("    supportAmt: ").append(toIndentedString(supportAmt)).append("\n");
    sb.append("    EIN: ").append(toIndentedString(EIN)).append("\n");
    sb.append("    organizationTypeCd: ").append(toIndentedString(organizationTypeCd)).append("\n");
    sb.append("    otherSupportAmt: ").append(toIndentedString(otherSupportAmt)).append("\n");
    sb.append("    supportedOrganizationName: ").append(toIndentedString(supportedOrganizationName)).append("\n");
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

