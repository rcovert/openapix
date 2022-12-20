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
 * AllOtherExpensesGrpClass
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class AllOtherExpensesGrpClass {

  @JsonProperty("ProgramServicesAmt")
  private Integer programServicesAmt;

  @JsonProperty("TotalAmt")
  private Integer totalAmt;

  public AllOtherExpensesGrpClass programServicesAmt(Integer programServicesAmt) {
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

  public AllOtherExpensesGrpClass totalAmt(Integer totalAmt) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOtherExpensesGrpClass allOtherExpensesGrpClass = (AllOtherExpensesGrpClass) o;
    return Objects.equals(this.programServicesAmt, allOtherExpensesGrpClass.programServicesAmt) &&
        Objects.equals(this.totalAmt, allOtherExpensesGrpClass.totalAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programServicesAmt, totalAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOtherExpensesGrpClass {\n");
    sb.append("    programServicesAmt: ").append(toIndentedString(programServicesAmt)).append("\n");
    sb.append("    totalAmt: ").append(toIndentedString(totalAmt)).append("\n");
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

