package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Form990PartVIISectionAGrpElement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Form990PartVIISectionAGrpUnion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class Form990PartVIISectionAGrpUnion {

  @JsonProperty("PersonNm")
  private String personNm;

  @JsonProperty("OfficerInd")
  private String officerInd;

  @JsonProperty("AverageHoursPerWeekRt")
  private Integer averageHoursPerWeekRt;

  @JsonProperty("ReportableCompFromOrgAmt")
  private Integer reportableCompFromOrgAmt;

  @JsonProperty("ReportableCompFromRltdOrgAmt")
  private Integer reportableCompFromRltdOrgAmt;

  @JsonProperty("TitleTxt")
  private String titleTxt;

  @JsonProperty("OtherCompensationAmt")
  private Integer otherCompensationAmt;

  public Form990PartVIISectionAGrpUnion personNm(String personNm) {
    this.personNm = personNm;
    return this;
  }

  /**
   * Get personNm
   * @return personNm
  */
  @NotNull 
  @Schema(name = "PersonNm", required = true)
  public String getPersonNm() {
    return personNm;
  }

  public void setPersonNm(String personNm) {
    this.personNm = personNm;
  }

  public Form990PartVIISectionAGrpUnion officerInd(String officerInd) {
    this.officerInd = officerInd;
    return this;
  }

  /**
   * Get officerInd
   * @return officerInd
  */
  @NotNull 
  @Schema(name = "OfficerInd", required = true)
  public String getOfficerInd() {
    return officerInd;
  }

  public void setOfficerInd(String officerInd) {
    this.officerInd = officerInd;
  }

  public Form990PartVIISectionAGrpUnion averageHoursPerWeekRt(Integer averageHoursPerWeekRt) {
    this.averageHoursPerWeekRt = averageHoursPerWeekRt;
    return this;
  }

  /**
   * Get averageHoursPerWeekRt
   * @return averageHoursPerWeekRt
  */
  @NotNull 
  @Schema(name = "AverageHoursPerWeekRt", required = true)
  public Integer getAverageHoursPerWeekRt() {
    return averageHoursPerWeekRt;
  }

  public void setAverageHoursPerWeekRt(Integer averageHoursPerWeekRt) {
    this.averageHoursPerWeekRt = averageHoursPerWeekRt;
  }

  public Form990PartVIISectionAGrpUnion reportableCompFromOrgAmt(Integer reportableCompFromOrgAmt) {
    this.reportableCompFromOrgAmt = reportableCompFromOrgAmt;
    return this;
  }

  /**
   * Get reportableCompFromOrgAmt
   * @return reportableCompFromOrgAmt
  */
  @NotNull 
  @Schema(name = "ReportableCompFromOrgAmt", required = true)
  public Integer getReportableCompFromOrgAmt() {
    return reportableCompFromOrgAmt;
  }

  public void setReportableCompFromOrgAmt(Integer reportableCompFromOrgAmt) {
    this.reportableCompFromOrgAmt = reportableCompFromOrgAmt;
  }

  public Form990PartVIISectionAGrpUnion reportableCompFromRltdOrgAmt(Integer reportableCompFromRltdOrgAmt) {
    this.reportableCompFromRltdOrgAmt = reportableCompFromRltdOrgAmt;
    return this;
  }

  /**
   * Get reportableCompFromRltdOrgAmt
   * @return reportableCompFromRltdOrgAmt
  */
  @NotNull 
  @Schema(name = "ReportableCompFromRltdOrgAmt", required = true)
  public Integer getReportableCompFromRltdOrgAmt() {
    return reportableCompFromRltdOrgAmt;
  }

  public void setReportableCompFromRltdOrgAmt(Integer reportableCompFromRltdOrgAmt) {
    this.reportableCompFromRltdOrgAmt = reportableCompFromRltdOrgAmt;
  }

  public Form990PartVIISectionAGrpUnion titleTxt(String titleTxt) {
    this.titleTxt = titleTxt;
    return this;
  }

  /**
   * Get titleTxt
   * @return titleTxt
  */
  @NotNull 
  @Schema(name = "TitleTxt", required = true)
  public String getTitleTxt() {
    return titleTxt;
  }

  public void setTitleTxt(String titleTxt) {
    this.titleTxt = titleTxt;
  }

  public Form990PartVIISectionAGrpUnion otherCompensationAmt(Integer otherCompensationAmt) {
    this.otherCompensationAmt = otherCompensationAmt;
    return this;
  }

  /**
   * Get otherCompensationAmt
   * @return otherCompensationAmt
  */
  @NotNull 
  @Schema(name = "OtherCompensationAmt", required = true)
  public Integer getOtherCompensationAmt() {
    return otherCompensationAmt;
  }

  public void setOtherCompensationAmt(Integer otherCompensationAmt) {
    this.otherCompensationAmt = otherCompensationAmt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form990PartVIISectionAGrpUnion form990PartVIISectionAGrpUnion = (Form990PartVIISectionAGrpUnion) o;
    return Objects.equals(this.personNm, form990PartVIISectionAGrpUnion.personNm) &&
        Objects.equals(this.officerInd, form990PartVIISectionAGrpUnion.officerInd) &&
        Objects.equals(this.averageHoursPerWeekRt, form990PartVIISectionAGrpUnion.averageHoursPerWeekRt) &&
        Objects.equals(this.reportableCompFromOrgAmt, form990PartVIISectionAGrpUnion.reportableCompFromOrgAmt) &&
        Objects.equals(this.reportableCompFromRltdOrgAmt, form990PartVIISectionAGrpUnion.reportableCompFromRltdOrgAmt) &&
        Objects.equals(this.titleTxt, form990PartVIISectionAGrpUnion.titleTxt) &&
        Objects.equals(this.otherCompensationAmt, form990PartVIISectionAGrpUnion.otherCompensationAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personNm, officerInd, averageHoursPerWeekRt, reportableCompFromOrgAmt, reportableCompFromRltdOrgAmt, titleTxt, otherCompensationAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form990PartVIISectionAGrpUnion {\n");
    sb.append("    personNm: ").append(toIndentedString(personNm)).append("\n");
    sb.append("    officerInd: ").append(toIndentedString(officerInd)).append("\n");
    sb.append("    averageHoursPerWeekRt: ").append(toIndentedString(averageHoursPerWeekRt)).append("\n");
    sb.append("    reportableCompFromOrgAmt: ").append(toIndentedString(reportableCompFromOrgAmt)).append("\n");
    sb.append("    reportableCompFromRltdOrgAmt: ").append(toIndentedString(reportableCompFromRltdOrgAmt)).append("\n");
    sb.append("    titleTxt: ").append(toIndentedString(titleTxt)).append("\n");
    sb.append("    otherCompensationAmt: ").append(toIndentedString(otherCompensationAmt)).append("\n");
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

