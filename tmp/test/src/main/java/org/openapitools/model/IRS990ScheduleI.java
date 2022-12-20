package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Form990ScheduleAPartViGrp;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * IRS990ScheduleI
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class IRS990ScheduleI {

  @JsonProperty("GrantRecordsMaintainedInd")
  private Boolean grantRecordsMaintainedInd;

  @JsonProperty("TotalOtherOrgCnt")
  private Integer totalOtherOrgCnt;

  @JsonProperty("Total501c3OrgCnt")
  private Integer total501c3OrgCnt;

  @JsonProperty("softwareId")
  private Integer softwareId;

  @JsonProperty("documentId")
  private String documentId;

  @JsonProperty("SupplementalInformationDetail")
  private Form990ScheduleAPartViGrp supplementalInformationDetail;

  @JsonProperty("softwareVersionNum")
  private String softwareVersionNum;

  public IRS990ScheduleI grantRecordsMaintainedInd(Boolean grantRecordsMaintainedInd) {
    this.grantRecordsMaintainedInd = grantRecordsMaintainedInd;
    return this;
  }

  /**
   * Get grantRecordsMaintainedInd
   * @return grantRecordsMaintainedInd
  */
  @NotNull 
  @Schema(name = "GrantRecordsMaintainedInd", required = true)
  public Boolean getGrantRecordsMaintainedInd() {
    return grantRecordsMaintainedInd;
  }

  public void setGrantRecordsMaintainedInd(Boolean grantRecordsMaintainedInd) {
    this.grantRecordsMaintainedInd = grantRecordsMaintainedInd;
  }

  public IRS990ScheduleI totalOtherOrgCnt(Integer totalOtherOrgCnt) {
    this.totalOtherOrgCnt = totalOtherOrgCnt;
    return this;
  }

  /**
   * Get totalOtherOrgCnt
   * @return totalOtherOrgCnt
  */
  @NotNull 
  @Schema(name = "TotalOtherOrgCnt", required = true)
  public Integer getTotalOtherOrgCnt() {
    return totalOtherOrgCnt;
  }

  public void setTotalOtherOrgCnt(Integer totalOtherOrgCnt) {
    this.totalOtherOrgCnt = totalOtherOrgCnt;
  }

  public IRS990ScheduleI total501c3OrgCnt(Integer total501c3OrgCnt) {
    this.total501c3OrgCnt = total501c3OrgCnt;
    return this;
  }

  /**
   * Get total501c3OrgCnt
   * @return total501c3OrgCnt
  */
  @NotNull 
  @Schema(name = "Total501c3OrgCnt", required = true)
  public Integer getTotal501c3OrgCnt() {
    return total501c3OrgCnt;
  }

  public void setTotal501c3OrgCnt(Integer total501c3OrgCnt) {
    this.total501c3OrgCnt = total501c3OrgCnt;
  }

  public IRS990ScheduleI softwareId(Integer softwareId) {
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

  public IRS990ScheduleI documentId(String documentId) {
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

  public IRS990ScheduleI supplementalInformationDetail(Form990ScheduleAPartViGrp supplementalInformationDetail) {
    this.supplementalInformationDetail = supplementalInformationDetail;
    return this;
  }

  /**
   * Get supplementalInformationDetail
   * @return supplementalInformationDetail
  */
  @NotNull @Valid 
  @Schema(name = "SupplementalInformationDetail", required = true)
  public Form990ScheduleAPartViGrp getSupplementalInformationDetail() {
    return supplementalInformationDetail;
  }

  public void setSupplementalInformationDetail(Form990ScheduleAPartViGrp supplementalInformationDetail) {
    this.supplementalInformationDetail = supplementalInformationDetail;
  }

  public IRS990ScheduleI softwareVersionNum(String softwareVersionNum) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IRS990ScheduleI irS990ScheduleI = (IRS990ScheduleI) o;
    return Objects.equals(this.grantRecordsMaintainedInd, irS990ScheduleI.grantRecordsMaintainedInd) &&
        Objects.equals(this.totalOtherOrgCnt, irS990ScheduleI.totalOtherOrgCnt) &&
        Objects.equals(this.total501c3OrgCnt, irS990ScheduleI.total501c3OrgCnt) &&
        Objects.equals(this.softwareId, irS990ScheduleI.softwareId) &&
        Objects.equals(this.documentId, irS990ScheduleI.documentId) &&
        Objects.equals(this.supplementalInformationDetail, irS990ScheduleI.supplementalInformationDetail) &&
        Objects.equals(this.softwareVersionNum, irS990ScheduleI.softwareVersionNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantRecordsMaintainedInd, totalOtherOrgCnt, total501c3OrgCnt, softwareId, documentId, supplementalInformationDetail, softwareVersionNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IRS990ScheduleI {\n");
    sb.append("    grantRecordsMaintainedInd: ").append(toIndentedString(grantRecordsMaintainedInd)).append("\n");
    sb.append("    totalOtherOrgCnt: ").append(toIndentedString(totalOtherOrgCnt)).append("\n");
    sb.append("    total501c3OrgCnt: ").append(toIndentedString(total501c3OrgCnt)).append("\n");
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    supplementalInformationDetail: ").append(toIndentedString(supplementalInformationDetail)).append("\n");
    sb.append("    softwareVersionNum: ").append(toIndentedString(softwareVersionNum)).append("\n");
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

