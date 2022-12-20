package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ContributorInformationGrp;
import org.openapitools.model.Form990ScheduleAPartViGrp;
import org.openapitools.model.FundraisingEventInformationGrp;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Irs990Schedule
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class Irs990Schedule {

  @JsonProperty("softwareId")
  private Integer softwareId;

  @JsonProperty("documentId")
  private String documentId;

  @JsonProperty("ContributorInformationGrp")
  private ContributorInformationGrp contributorInformationGrp;

  @JsonProperty("softwareVersionNum")
  private String softwareVersionNum;

  @JsonProperty("FundraisingEventInformationGrp")
  private FundraisingEventInformationGrp fundraisingEventInformationGrp;

  @JsonProperty("SupplementalInformationDetail")
  @Valid
  private List<Form990ScheduleAPartViGrp> supplementalInformationDetail = null;

  public Irs990Schedule softwareId(Integer softwareId) {
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

  public Irs990Schedule documentId(String documentId) {
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

  public Irs990Schedule contributorInformationGrp(ContributorInformationGrp contributorInformationGrp) {
    this.contributorInformationGrp = contributorInformationGrp;
    return this;
  }

  /**
   * Get contributorInformationGrp
   * @return contributorInformationGrp
  */
  @Valid 
  @Schema(name = "ContributorInformationGrp", required = false)
  public ContributorInformationGrp getContributorInformationGrp() {
    return contributorInformationGrp;
  }

  public void setContributorInformationGrp(ContributorInformationGrp contributorInformationGrp) {
    this.contributorInformationGrp = contributorInformationGrp;
  }

  public Irs990Schedule softwareVersionNum(String softwareVersionNum) {
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

  public Irs990Schedule fundraisingEventInformationGrp(FundraisingEventInformationGrp fundraisingEventInformationGrp) {
    this.fundraisingEventInformationGrp = fundraisingEventInformationGrp;
    return this;
  }

  /**
   * Get fundraisingEventInformationGrp
   * @return fundraisingEventInformationGrp
  */
  @Valid 
  @Schema(name = "FundraisingEventInformationGrp", required = false)
  public FundraisingEventInformationGrp getFundraisingEventInformationGrp() {
    return fundraisingEventInformationGrp;
  }

  public void setFundraisingEventInformationGrp(FundraisingEventInformationGrp fundraisingEventInformationGrp) {
    this.fundraisingEventInformationGrp = fundraisingEventInformationGrp;
  }

  public Irs990Schedule supplementalInformationDetail(List<Form990ScheduleAPartViGrp> supplementalInformationDetail) {
    this.supplementalInformationDetail = supplementalInformationDetail;
    return this;
  }

  public Irs990Schedule addSupplementalInformationDetailItem(Form990ScheduleAPartViGrp supplementalInformationDetailItem) {
    if (this.supplementalInformationDetail == null) {
      this.supplementalInformationDetail = new ArrayList<>();
    }
    this.supplementalInformationDetail.add(supplementalInformationDetailItem);
    return this;
  }

  /**
   * Get supplementalInformationDetail
   * @return supplementalInformationDetail
  */
  @Valid 
  @Schema(name = "SupplementalInformationDetail", required = false)
  public List<Form990ScheduleAPartViGrp> getSupplementalInformationDetail() {
    return supplementalInformationDetail;
  }

  public void setSupplementalInformationDetail(List<Form990ScheduleAPartViGrp> supplementalInformationDetail) {
    this.supplementalInformationDetail = supplementalInformationDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Irs990Schedule irs990Schedule = (Irs990Schedule) o;
    return Objects.equals(this.softwareId, irs990Schedule.softwareId) &&
        Objects.equals(this.documentId, irs990Schedule.documentId) &&
        Objects.equals(this.contributorInformationGrp, irs990Schedule.contributorInformationGrp) &&
        Objects.equals(this.softwareVersionNum, irs990Schedule.softwareVersionNum) &&
        Objects.equals(this.fundraisingEventInformationGrp, irs990Schedule.fundraisingEventInformationGrp) &&
        Objects.equals(this.supplementalInformationDetail, irs990Schedule.supplementalInformationDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(softwareId, documentId, contributorInformationGrp, softwareVersionNum, fundraisingEventInformationGrp, supplementalInformationDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Irs990Schedule {\n");
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    contributorInformationGrp: ").append(toIndentedString(contributorInformationGrp)).append("\n");
    sb.append("    softwareVersionNum: ").append(toIndentedString(softwareVersionNum)).append("\n");
    sb.append("    fundraisingEventInformationGrp: ").append(toIndentedString(fundraisingEventInformationGrp)).append("\n");
    sb.append("    supplementalInformationDetail: ").append(toIndentedString(supplementalInformationDetail)).append("\n");
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

