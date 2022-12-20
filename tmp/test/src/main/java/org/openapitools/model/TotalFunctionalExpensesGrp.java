package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TotalFunctionalExpensesGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class TotalFunctionalExpensesGrp {

  @JsonProperty("ProgramServicesAmt")
  private Integer programServicesAmt;

  @JsonProperty("FundraisingAmt")
  private Integer fundraisingAmt;

  @JsonProperty("TotalAmt")
  private Integer totalAmt;

  @JsonProperty("ManagementAndGeneralAmt")
  private Integer managementAndGeneralAmt;

  public TotalFunctionalExpensesGrp programServicesAmt(Integer programServicesAmt) {
    this.programServicesAmt = programServicesAmt;
    return this;
  }

  /**
   * Get programServicesAmt
   * @return programServicesAmt
  */
  @NotNull 
  @Schema(name = "ProgramServicesAmt", required = true)
  public Integer getProgramServicesAmt() {
    return programServicesAmt;
  }

  public void setProgramServicesAmt(Integer programServicesAmt) {
    this.programServicesAmt = programServicesAmt;
  }

  public TotalFunctionalExpensesGrp fundraisingAmt(Integer fundraisingAmt) {
    this.fundraisingAmt = fundraisingAmt;
    return this;
  }

  /**
   * Get fundraisingAmt
   * @return fundraisingAmt
  */
  @NotNull 
  @Schema(name = "FundraisingAmt", required = true)
  public Integer getFundraisingAmt() {
    return fundraisingAmt;
  }

  public void setFundraisingAmt(Integer fundraisingAmt) {
    this.fundraisingAmt = fundraisingAmt;
  }

  public TotalFunctionalExpensesGrp totalAmt(Integer totalAmt) {
    this.totalAmt = totalAmt;
    return this;
  }

  /**
   * Get totalAmt
   * @return totalAmt
  */
  @NotNull 
  @Schema(name = "TotalAmt", required = true)
  public Integer getTotalAmt() {
    return totalAmt;
  }

  public void setTotalAmt(Integer totalAmt) {
    this.totalAmt = totalAmt;
  }

  public TotalFunctionalExpensesGrp managementAndGeneralAmt(Integer managementAndGeneralAmt) {
    this.managementAndGeneralAmt = managementAndGeneralAmt;
    return this;
  }

  /**
   * Get managementAndGeneralAmt
   * @return managementAndGeneralAmt
  */
  @NotNull 
  @Schema(name = "ManagementAndGeneralAmt", required = true)
  public Integer getManagementAndGeneralAmt() {
    return managementAndGeneralAmt;
  }

  public void setManagementAndGeneralAmt(Integer managementAndGeneralAmt) {
    this.managementAndGeneralAmt = managementAndGeneralAmt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalFunctionalExpensesGrp totalFunctionalExpensesGrp = (TotalFunctionalExpensesGrp) o;
    return Objects.equals(this.programServicesAmt, totalFunctionalExpensesGrp.programServicesAmt) &&
        Objects.equals(this.fundraisingAmt, totalFunctionalExpensesGrp.fundraisingAmt) &&
        Objects.equals(this.totalAmt, totalFunctionalExpensesGrp.totalAmt) &&
        Objects.equals(this.managementAndGeneralAmt, totalFunctionalExpensesGrp.managementAndGeneralAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programServicesAmt, fundraisingAmt, totalAmt, managementAndGeneralAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalFunctionalExpensesGrp {\n");
    sb.append("    programServicesAmt: ").append(toIndentedString(programServicesAmt)).append("\n");
    sb.append("    fundraisingAmt: ").append(toIndentedString(fundraisingAmt)).append("\n");
    sb.append("    totalAmt: ").append(toIndentedString(totalAmt)).append("\n");
    sb.append("    managementAndGeneralAmt: ").append(toIndentedString(managementAndGeneralAmt)).append("\n");
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

