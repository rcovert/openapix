package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.model.BusinessOfficerGrp;
import org.openapitools.model.Filer;
import org.openapitools.model.FilingSecurityInformation;
import org.openapitools.model.PreparerFirmGrp;
import org.openapitools.model.PreparerPersonGrp;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReturnHeader
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class ReturnHeader {

  @JsonProperty("TaxPeriodEndDt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate taxPeriodEndDt;

  @JsonProperty("ReturnTs")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime returnTs;

  @JsonProperty("BuildTS")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime buildTS;

  @JsonProperty("TaxPeriodBeginDt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate taxPeriodBeginDt;

  @JsonProperty("PreparerFirmGrp")
  private PreparerFirmGrp preparerFirmGrp;

  @JsonProperty("TaxYr")
  private Integer taxYr;

  @JsonProperty("PreparerPersonGrp")
  private PreparerPersonGrp preparerPersonGrp;

  @JsonProperty("BusinessOfficerGrp")
  private BusinessOfficerGrp businessOfficerGrp;

  @JsonProperty("binaryAttachmentCnt")
  private Integer binaryAttachmentCnt;

  @JsonProperty("ReturnTypeCd")
  private Integer returnTypeCd;

  @JsonProperty("FilingSecurityInformation")
  private FilingSecurityInformation filingSecurityInformation;

  @JsonProperty("Filer")
  private Filer filer;

  public ReturnHeader taxPeriodEndDt(LocalDate taxPeriodEndDt) {
    this.taxPeriodEndDt = taxPeriodEndDt;
    return this;
  }

  /**
   * Get taxPeriodEndDt
   * @return taxPeriodEndDt
  */
  @NotNull @Valid 
  @Schema(name = "TaxPeriodEndDt", required = true)
  public LocalDate getTaxPeriodEndDt() {
    return taxPeriodEndDt;
  }

  public void setTaxPeriodEndDt(LocalDate taxPeriodEndDt) {
    this.taxPeriodEndDt = taxPeriodEndDt;
  }

  public ReturnHeader returnTs(OffsetDateTime returnTs) {
    this.returnTs = returnTs;
    return this;
  }

  /**
   * Get returnTs
   * @return returnTs
  */
  @NotNull @Valid 
  @Schema(name = "ReturnTs", required = true)
  public OffsetDateTime getReturnTs() {
    return returnTs;
  }

  public void setReturnTs(OffsetDateTime returnTs) {
    this.returnTs = returnTs;
  }

  public ReturnHeader buildTS(OffsetDateTime buildTS) {
    this.buildTS = buildTS;
    return this;
  }

  /**
   * Get buildTS
   * @return buildTS
  */
  @NotNull @Valid 
  @Schema(name = "BuildTS", required = true)
  public OffsetDateTime getBuildTS() {
    return buildTS;
  }

  public void setBuildTS(OffsetDateTime buildTS) {
    this.buildTS = buildTS;
  }

  public ReturnHeader taxPeriodBeginDt(LocalDate taxPeriodBeginDt) {
    this.taxPeriodBeginDt = taxPeriodBeginDt;
    return this;
  }

  /**
   * Get taxPeriodBeginDt
   * @return taxPeriodBeginDt
  */
  @NotNull @Valid 
  @Schema(name = "TaxPeriodBeginDt", required = true)
  public LocalDate getTaxPeriodBeginDt() {
    return taxPeriodBeginDt;
  }

  public void setTaxPeriodBeginDt(LocalDate taxPeriodBeginDt) {
    this.taxPeriodBeginDt = taxPeriodBeginDt;
  }

  public ReturnHeader preparerFirmGrp(PreparerFirmGrp preparerFirmGrp) {
    this.preparerFirmGrp = preparerFirmGrp;
    return this;
  }

  /**
   * Get preparerFirmGrp
   * @return preparerFirmGrp
  */
  @NotNull @Valid 
  @Schema(name = "PreparerFirmGrp", required = true)
  public PreparerFirmGrp getPreparerFirmGrp() {
    return preparerFirmGrp;
  }

  public void setPreparerFirmGrp(PreparerFirmGrp preparerFirmGrp) {
    this.preparerFirmGrp = preparerFirmGrp;
  }

  public ReturnHeader taxYr(Integer taxYr) {
    this.taxYr = taxYr;
    return this;
  }

  /**
   * Get taxYr
   * @return taxYr
  */
  @NotNull 
  @Schema(name = "TaxYr", required = true)
  public Integer getTaxYr() {
    return taxYr;
  }

  public void setTaxYr(Integer taxYr) {
    this.taxYr = taxYr;
  }

  public ReturnHeader preparerPersonGrp(PreparerPersonGrp preparerPersonGrp) {
    this.preparerPersonGrp = preparerPersonGrp;
    return this;
  }

  /**
   * Get preparerPersonGrp
   * @return preparerPersonGrp
  */
  @NotNull @Valid 
  @Schema(name = "PreparerPersonGrp", required = true)
  public PreparerPersonGrp getPreparerPersonGrp() {
    return preparerPersonGrp;
  }

  public void setPreparerPersonGrp(PreparerPersonGrp preparerPersonGrp) {
    this.preparerPersonGrp = preparerPersonGrp;
  }

  public ReturnHeader businessOfficerGrp(BusinessOfficerGrp businessOfficerGrp) {
    this.businessOfficerGrp = businessOfficerGrp;
    return this;
  }

  /**
   * Get businessOfficerGrp
   * @return businessOfficerGrp
  */
  @NotNull @Valid 
  @Schema(name = "BusinessOfficerGrp", required = true)
  public BusinessOfficerGrp getBusinessOfficerGrp() {
    return businessOfficerGrp;
  }

  public void setBusinessOfficerGrp(BusinessOfficerGrp businessOfficerGrp) {
    this.businessOfficerGrp = businessOfficerGrp;
  }

  public ReturnHeader binaryAttachmentCnt(Integer binaryAttachmentCnt) {
    this.binaryAttachmentCnt = binaryAttachmentCnt;
    return this;
  }

  /**
   * Get binaryAttachmentCnt
   * @return binaryAttachmentCnt
  */
  @NotNull 
  @Schema(name = "binaryAttachmentCnt", required = true)
  public Integer getBinaryAttachmentCnt() {
    return binaryAttachmentCnt;
  }

  public void setBinaryAttachmentCnt(Integer binaryAttachmentCnt) {
    this.binaryAttachmentCnt = binaryAttachmentCnt;
  }

  public ReturnHeader returnTypeCd(Integer returnTypeCd) {
    this.returnTypeCd = returnTypeCd;
    return this;
  }

  /**
   * Get returnTypeCd
   * @return returnTypeCd
  */
  @NotNull 
  @Schema(name = "ReturnTypeCd", required = true)
  public Integer getReturnTypeCd() {
    return returnTypeCd;
  }

  public void setReturnTypeCd(Integer returnTypeCd) {
    this.returnTypeCd = returnTypeCd;
  }

  public ReturnHeader filingSecurityInformation(FilingSecurityInformation filingSecurityInformation) {
    this.filingSecurityInformation = filingSecurityInformation;
    return this;
  }

  /**
   * Get filingSecurityInformation
   * @return filingSecurityInformation
  */
  @NotNull @Valid 
  @Schema(name = "FilingSecurityInformation", required = true)
  public FilingSecurityInformation getFilingSecurityInformation() {
    return filingSecurityInformation;
  }

  public void setFilingSecurityInformation(FilingSecurityInformation filingSecurityInformation) {
    this.filingSecurityInformation = filingSecurityInformation;
  }

  public ReturnHeader filer(Filer filer) {
    this.filer = filer;
    return this;
  }

  /**
   * Get filer
   * @return filer
  */
  @NotNull @Valid 
  @Schema(name = "Filer", required = true)
  public Filer getFiler() {
    return filer;
  }

  public void setFiler(Filer filer) {
    this.filer = filer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnHeader returnHeader = (ReturnHeader) o;
    return Objects.equals(this.taxPeriodEndDt, returnHeader.taxPeriodEndDt) &&
        Objects.equals(this.returnTs, returnHeader.returnTs) &&
        Objects.equals(this.buildTS, returnHeader.buildTS) &&
        Objects.equals(this.taxPeriodBeginDt, returnHeader.taxPeriodBeginDt) &&
        Objects.equals(this.preparerFirmGrp, returnHeader.preparerFirmGrp) &&
        Objects.equals(this.taxYr, returnHeader.taxYr) &&
        Objects.equals(this.preparerPersonGrp, returnHeader.preparerPersonGrp) &&
        Objects.equals(this.businessOfficerGrp, returnHeader.businessOfficerGrp) &&
        Objects.equals(this.binaryAttachmentCnt, returnHeader.binaryAttachmentCnt) &&
        Objects.equals(this.returnTypeCd, returnHeader.returnTypeCd) &&
        Objects.equals(this.filingSecurityInformation, returnHeader.filingSecurityInformation) &&
        Objects.equals(this.filer, returnHeader.filer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxPeriodEndDt, returnTs, buildTS, taxPeriodBeginDt, preparerFirmGrp, taxYr, preparerPersonGrp, businessOfficerGrp, binaryAttachmentCnt, returnTypeCd, filingSecurityInformation, filer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnHeader {\n");
    sb.append("    taxPeriodEndDt: ").append(toIndentedString(taxPeriodEndDt)).append("\n");
    sb.append("    returnTs: ").append(toIndentedString(returnTs)).append("\n");
    sb.append("    buildTS: ").append(toIndentedString(buildTS)).append("\n");
    sb.append("    taxPeriodBeginDt: ").append(toIndentedString(taxPeriodBeginDt)).append("\n");
    sb.append("    preparerFirmGrp: ").append(toIndentedString(preparerFirmGrp)).append("\n");
    sb.append("    taxYr: ").append(toIndentedString(taxYr)).append("\n");
    sb.append("    preparerPersonGrp: ").append(toIndentedString(preparerPersonGrp)).append("\n");
    sb.append("    businessOfficerGrp: ").append(toIndentedString(businessOfficerGrp)).append("\n");
    sb.append("    binaryAttachmentCnt: ").append(toIndentedString(binaryAttachmentCnt)).append("\n");
    sb.append("    returnTypeCd: ").append(toIndentedString(returnTypeCd)).append("\n");
    sb.append("    filingSecurityInformation: ").append(toIndentedString(filingSecurityInformation)).append("\n");
    sb.append("    filer: ").append(toIndentedString(filer)).append("\n");
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

