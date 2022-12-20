package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Form990SchAType1SuprtOrgGrp;
import org.openapitools.model.Form990ScheduleAPartViGrp;
import org.openapitools.model.SupportedOrgInformationGrp;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * IRS990ScheduleA
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class IRS990ScheduleA {

  @JsonProperty("SupportedOrgInformationGrp")
  private SupportedOrgInformationGrp supportedOrgInformationGrp;

  @JsonProperty("MajorityDirTrstSupportedOrgInd")
  private Boolean majorityDirTrstSupportedOrgInd;

  @JsonProperty("SupportingOrgType1Ind")
  private String supportingOrgType1Ind;

  @JsonProperty("SupportedOrganizationsTotalCnt")
  private Integer supportedOrganizationsTotalCnt;

  @JsonProperty("Form990ScheduleAPartVIGrp")
  private Form990ScheduleAPartViGrp form990ScheduleAPartVIGrp;

  @JsonProperty("OtherSupportSumAmt")
  private Integer otherSupportSumAmt;

  @JsonProperty("SupportSumAmt")
  private Integer supportSumAmt;

  @JsonProperty("Form990SchAType1SuprtOrgGrp")
  private Form990SchAType1SuprtOrgGrp form990SchAType1SuprtOrgGrp;

  @JsonProperty("softwareId")
  private Integer softwareId;

  @JsonProperty("SupportedOrganizationsCnt")
  private Integer supportedOrganizationsCnt;

  @JsonProperty("SupportingOrganization509a3Ind")
  private String supportingOrganization509a3Ind;

  @JsonProperty("Form990SchASupportingOrgGrp")
  @Valid
  private Map<String, Boolean> form990SchASupportingOrgGrp = null;

  @JsonProperty("IRSWrittenDeterminationInd")
  private String irSWrittenDeterminationInd;

  @JsonProperty("documentId")
  private String documentId;

  @JsonProperty("softwareVersionNum")
  private String softwareVersionNum;

  @JsonProperty("ChurchInd")
  private String churchInd;

  public IRS990ScheduleA supportedOrgInformationGrp(SupportedOrgInformationGrp supportedOrgInformationGrp) {
    this.supportedOrgInformationGrp = supportedOrgInformationGrp;
    return this;
  }

  /**
   * Get supportedOrgInformationGrp
   * @return supportedOrgInformationGrp
  */
  @Valid 
  @Schema(name = "SupportedOrgInformationGrp", required = false)
  public SupportedOrgInformationGrp getSupportedOrgInformationGrp() {
    return supportedOrgInformationGrp;
  }

  public void setSupportedOrgInformationGrp(SupportedOrgInformationGrp supportedOrgInformationGrp) {
    this.supportedOrgInformationGrp = supportedOrgInformationGrp;
  }

  public IRS990ScheduleA majorityDirTrstSupportedOrgInd(Boolean majorityDirTrstSupportedOrgInd) {
    this.majorityDirTrstSupportedOrgInd = majorityDirTrstSupportedOrgInd;
    return this;
  }

  /**
   * Get majorityDirTrstSupportedOrgInd
   * @return majorityDirTrstSupportedOrgInd
  */
  
  @Schema(name = "MajorityDirTrstSupportedOrgInd", required = false)
  public Boolean getMajorityDirTrstSupportedOrgInd() {
    return majorityDirTrstSupportedOrgInd;
  }

  public void setMajorityDirTrstSupportedOrgInd(Boolean majorityDirTrstSupportedOrgInd) {
    this.majorityDirTrstSupportedOrgInd = majorityDirTrstSupportedOrgInd;
  }

  public IRS990ScheduleA supportingOrgType1Ind(String supportingOrgType1Ind) {
    this.supportingOrgType1Ind = supportingOrgType1Ind;
    return this;
  }

  /**
   * Get supportingOrgType1Ind
   * @return supportingOrgType1Ind
  */
  
  @Schema(name = "SupportingOrgType1Ind", required = false)
  public String getSupportingOrgType1Ind() {
    return supportingOrgType1Ind;
  }

  public void setSupportingOrgType1Ind(String supportingOrgType1Ind) {
    this.supportingOrgType1Ind = supportingOrgType1Ind;
  }

  public IRS990ScheduleA supportedOrganizationsTotalCnt(Integer supportedOrganizationsTotalCnt) {
    this.supportedOrganizationsTotalCnt = supportedOrganizationsTotalCnt;
    return this;
  }

  /**
   * Get supportedOrganizationsTotalCnt
   * @return supportedOrganizationsTotalCnt
  */
  
  @Schema(name = "SupportedOrganizationsTotalCnt", required = false)
  public Integer getSupportedOrganizationsTotalCnt() {
    return supportedOrganizationsTotalCnt;
  }

  public void setSupportedOrganizationsTotalCnt(Integer supportedOrganizationsTotalCnt) {
    this.supportedOrganizationsTotalCnt = supportedOrganizationsTotalCnt;
  }

  public IRS990ScheduleA form990ScheduleAPartVIGrp(Form990ScheduleAPartViGrp form990ScheduleAPartVIGrp) {
    this.form990ScheduleAPartVIGrp = form990ScheduleAPartVIGrp;
    return this;
  }

  /**
   * Get form990ScheduleAPartVIGrp
   * @return form990ScheduleAPartVIGrp
  */
  @Valid 
  @Schema(name = "Form990ScheduleAPartVIGrp", required = false)
  public Form990ScheduleAPartViGrp getForm990ScheduleAPartVIGrp() {
    return form990ScheduleAPartVIGrp;
  }

  public void setForm990ScheduleAPartVIGrp(Form990ScheduleAPartViGrp form990ScheduleAPartVIGrp) {
    this.form990ScheduleAPartVIGrp = form990ScheduleAPartVIGrp;
  }

  public IRS990ScheduleA otherSupportSumAmt(Integer otherSupportSumAmt) {
    this.otherSupportSumAmt = otherSupportSumAmt;
    return this;
  }

  /**
   * Get otherSupportSumAmt
   * @return otherSupportSumAmt
  */
  
  @Schema(name = "OtherSupportSumAmt", required = false)
  public Integer getOtherSupportSumAmt() {
    return otherSupportSumAmt;
  }

  public void setOtherSupportSumAmt(Integer otherSupportSumAmt) {
    this.otherSupportSumAmt = otherSupportSumAmt;
  }

  public IRS990ScheduleA supportSumAmt(Integer supportSumAmt) {
    this.supportSumAmt = supportSumAmt;
    return this;
  }

  /**
   * Get supportSumAmt
   * @return supportSumAmt
  */
  
  @Schema(name = "SupportSumAmt", required = false)
  public Integer getSupportSumAmt() {
    return supportSumAmt;
  }

  public void setSupportSumAmt(Integer supportSumAmt) {
    this.supportSumAmt = supportSumAmt;
  }

  public IRS990ScheduleA form990SchAType1SuprtOrgGrp(Form990SchAType1SuprtOrgGrp form990SchAType1SuprtOrgGrp) {
    this.form990SchAType1SuprtOrgGrp = form990SchAType1SuprtOrgGrp;
    return this;
  }

  /**
   * Get form990SchAType1SuprtOrgGrp
   * @return form990SchAType1SuprtOrgGrp
  */
  @Valid 
  @Schema(name = "Form990SchAType1SuprtOrgGrp", required = false)
  public Form990SchAType1SuprtOrgGrp getForm990SchAType1SuprtOrgGrp() {
    return form990SchAType1SuprtOrgGrp;
  }

  public void setForm990SchAType1SuprtOrgGrp(Form990SchAType1SuprtOrgGrp form990SchAType1SuprtOrgGrp) {
    this.form990SchAType1SuprtOrgGrp = form990SchAType1SuprtOrgGrp;
  }

  public IRS990ScheduleA softwareId(Integer softwareId) {
    this.softwareId = softwareId;
    return this;
  }

  /**
   * Get softwareId
   * @return softwareId
  */
  @NotNull 
  @Schema(name = "softwareId", required = true)
  public Integer getSoftwareId() {
    return softwareId;
  }

  public void setSoftwareId(Integer softwareId) {
    this.softwareId = softwareId;
  }

  public IRS990ScheduleA supportedOrganizationsCnt(Integer supportedOrganizationsCnt) {
    this.supportedOrganizationsCnt = supportedOrganizationsCnt;
    return this;
  }

  /**
   * Get supportedOrganizationsCnt
   * @return supportedOrganizationsCnt
  */
  
  @Schema(name = "SupportedOrganizationsCnt", required = false)
  public Integer getSupportedOrganizationsCnt() {
    return supportedOrganizationsCnt;
  }

  public void setSupportedOrganizationsCnt(Integer supportedOrganizationsCnt) {
    this.supportedOrganizationsCnt = supportedOrganizationsCnt;
  }

  public IRS990ScheduleA supportingOrganization509a3Ind(String supportingOrganization509a3Ind) {
    this.supportingOrganization509a3Ind = supportingOrganization509a3Ind;
    return this;
  }

  /**
   * Get supportingOrganization509a3Ind
   * @return supportingOrganization509a3Ind
  */
  
  @Schema(name = "SupportingOrganization509a3Ind", required = false)
  public String getSupportingOrganization509a3Ind() {
    return supportingOrganization509a3Ind;
  }

  public void setSupportingOrganization509a3Ind(String supportingOrganization509a3Ind) {
    this.supportingOrganization509a3Ind = supportingOrganization509a3Ind;
  }

  public IRS990ScheduleA form990SchASupportingOrgGrp(Map<String, Boolean> form990SchASupportingOrgGrp) {
    this.form990SchASupportingOrgGrp = form990SchASupportingOrgGrp;
    return this;
  }

  public IRS990ScheduleA putForm990SchASupportingOrgGrpItem(String key, Boolean form990SchASupportingOrgGrpItem) {
    if (this.form990SchASupportingOrgGrp == null) {
      this.form990SchASupportingOrgGrp = new HashMap<>();
    }
    this.form990SchASupportingOrgGrp.put(key, form990SchASupportingOrgGrpItem);
    return this;
  }

  /**
   * Get form990SchASupportingOrgGrp
   * @return form990SchASupportingOrgGrp
  */
  
  @Schema(name = "Form990SchASupportingOrgGrp", required = false)
  public Map<String, Boolean> getForm990SchASupportingOrgGrp() {
    return form990SchASupportingOrgGrp;
  }

  public void setForm990SchASupportingOrgGrp(Map<String, Boolean> form990SchASupportingOrgGrp) {
    this.form990SchASupportingOrgGrp = form990SchASupportingOrgGrp;
  }

  public IRS990ScheduleA irSWrittenDeterminationInd(String irSWrittenDeterminationInd) {
    this.irSWrittenDeterminationInd = irSWrittenDeterminationInd;
    return this;
  }

  /**
   * Get irSWrittenDeterminationInd
   * @return irSWrittenDeterminationInd
  */
  
  @Schema(name = "IRSWrittenDeterminationInd", required = false)
  public String getIrSWrittenDeterminationInd() {
    return irSWrittenDeterminationInd;
  }

  public void setIrSWrittenDeterminationInd(String irSWrittenDeterminationInd) {
    this.irSWrittenDeterminationInd = irSWrittenDeterminationInd;
  }

  public IRS990ScheduleA documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId
   * @return documentId
  */
  @NotNull 
  @Schema(name = "documentId", required = true)
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public IRS990ScheduleA softwareVersionNum(String softwareVersionNum) {
    this.softwareVersionNum = softwareVersionNum;
    return this;
  }

  /**
   * Get softwareVersionNum
   * @return softwareVersionNum
  */
  @NotNull 
  @Schema(name = "softwareVersionNum", required = true)
  public String getSoftwareVersionNum() {
    return softwareVersionNum;
  }

  public void setSoftwareVersionNum(String softwareVersionNum) {
    this.softwareVersionNum = softwareVersionNum;
  }

  public IRS990ScheduleA churchInd(String churchInd) {
    this.churchInd = churchInd;
    return this;
  }

  /**
   * Get churchInd
   * @return churchInd
  */
  
  @Schema(name = "ChurchInd", required = false)
  public String getChurchInd() {
    return churchInd;
  }

  public void setChurchInd(String churchInd) {
    this.churchInd = churchInd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IRS990ScheduleA irS990ScheduleA = (IRS990ScheduleA) o;
    return Objects.equals(this.supportedOrgInformationGrp, irS990ScheduleA.supportedOrgInformationGrp) &&
        Objects.equals(this.majorityDirTrstSupportedOrgInd, irS990ScheduleA.majorityDirTrstSupportedOrgInd) &&
        Objects.equals(this.supportingOrgType1Ind, irS990ScheduleA.supportingOrgType1Ind) &&
        Objects.equals(this.supportedOrganizationsTotalCnt, irS990ScheduleA.supportedOrganizationsTotalCnt) &&
        Objects.equals(this.form990ScheduleAPartVIGrp, irS990ScheduleA.form990ScheduleAPartVIGrp) &&
        Objects.equals(this.otherSupportSumAmt, irS990ScheduleA.otherSupportSumAmt) &&
        Objects.equals(this.supportSumAmt, irS990ScheduleA.supportSumAmt) &&
        Objects.equals(this.form990SchAType1SuprtOrgGrp, irS990ScheduleA.form990SchAType1SuprtOrgGrp) &&
        Objects.equals(this.softwareId, irS990ScheduleA.softwareId) &&
        Objects.equals(this.supportedOrganizationsCnt, irS990ScheduleA.supportedOrganizationsCnt) &&
        Objects.equals(this.supportingOrganization509a3Ind, irS990ScheduleA.supportingOrganization509a3Ind) &&
        Objects.equals(this.form990SchASupportingOrgGrp, irS990ScheduleA.form990SchASupportingOrgGrp) &&
        Objects.equals(this.irSWrittenDeterminationInd, irS990ScheduleA.irSWrittenDeterminationInd) &&
        Objects.equals(this.documentId, irS990ScheduleA.documentId) &&
        Objects.equals(this.softwareVersionNum, irS990ScheduleA.softwareVersionNum) &&
        Objects.equals(this.churchInd, irS990ScheduleA.churchInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedOrgInformationGrp, majorityDirTrstSupportedOrgInd, supportingOrgType1Ind, supportedOrganizationsTotalCnt, form990ScheduleAPartVIGrp, otherSupportSumAmt, supportSumAmt, form990SchAType1SuprtOrgGrp, softwareId, supportedOrganizationsCnt, supportingOrganization509a3Ind, form990SchASupportingOrgGrp, irSWrittenDeterminationInd, documentId, softwareVersionNum, churchInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IRS990ScheduleA {\n");
    sb.append("    supportedOrgInformationGrp: ").append(toIndentedString(supportedOrgInformationGrp)).append("\n");
    sb.append("    majorityDirTrstSupportedOrgInd: ").append(toIndentedString(majorityDirTrstSupportedOrgInd)).append("\n");
    sb.append("    supportingOrgType1Ind: ").append(toIndentedString(supportingOrgType1Ind)).append("\n");
    sb.append("    supportedOrganizationsTotalCnt: ").append(toIndentedString(supportedOrganizationsTotalCnt)).append("\n");
    sb.append("    form990ScheduleAPartVIGrp: ").append(toIndentedString(form990ScheduleAPartVIGrp)).append("\n");
    sb.append("    otherSupportSumAmt: ").append(toIndentedString(otherSupportSumAmt)).append("\n");
    sb.append("    supportSumAmt: ").append(toIndentedString(supportSumAmt)).append("\n");
    sb.append("    form990SchAType1SuprtOrgGrp: ").append(toIndentedString(form990SchAType1SuprtOrgGrp)).append("\n");
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
    sb.append("    supportedOrganizationsCnt: ").append(toIndentedString(supportedOrganizationsCnt)).append("\n");
    sb.append("    supportingOrganization509a3Ind: ").append(toIndentedString(supportingOrganization509a3Ind)).append("\n");
    sb.append("    form990SchASupportingOrgGrp: ").append(toIndentedString(form990SchASupportingOrgGrp)).append("\n");
    sb.append("    irSWrittenDeterminationInd: ").append(toIndentedString(irSWrittenDeterminationInd)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    softwareVersionNum: ").append(toIndentedString(softwareVersionNum)).append("\n");
    sb.append("    churchInd: ").append(toIndentedString(churchInd)).append("\n");
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

