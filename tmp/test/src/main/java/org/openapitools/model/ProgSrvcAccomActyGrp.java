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
 * ProgSrvcAccomActyGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class ProgSrvcAccomActyGrp {

  @JsonProperty("ExpenseAmt")
  private Integer expenseAmt;

  @JsonProperty("Desc")
  private String desc;

  @JsonProperty("RevenueAmt")
  private Integer revenueAmt;

  public ProgSrvcAccomActyGrp expenseAmt(Integer expenseAmt) {
    this.expenseAmt = expenseAmt;
    return this;
  }

  /**
   * Get expenseAmt
   * @return expenseAmt
  */
  @NotNull 
  @Schema(name = "ExpenseAmt", required = true)
  public Integer getExpenseAmt() {
    return expenseAmt;
  }

  public void setExpenseAmt(Integer expenseAmt) {
    this.expenseAmt = expenseAmt;
  }

  public ProgSrvcAccomActyGrp desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   * @return desc
  */
  @NotNull 
  @Schema(name = "Desc", required = true)
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ProgSrvcAccomActyGrp revenueAmt(Integer revenueAmt) {
    this.revenueAmt = revenueAmt;
    return this;
  }

  /**
   * Get revenueAmt
   * @return revenueAmt
  */
  @NotNull 
  @Schema(name = "RevenueAmt", required = true)
  public Integer getRevenueAmt() {
    return revenueAmt;
  }

  public void setRevenueAmt(Integer revenueAmt) {
    this.revenueAmt = revenueAmt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgSrvcAccomActyGrp progSrvcAccomActyGrp = (ProgSrvcAccomActyGrp) o;
    return Objects.equals(this.expenseAmt, progSrvcAccomActyGrp.expenseAmt) &&
        Objects.equals(this.desc, progSrvcAccomActyGrp.desc) &&
        Objects.equals(this.revenueAmt, progSrvcAccomActyGrp.revenueAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseAmt, desc, revenueAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgSrvcAccomActyGrp {\n");
    sb.append("    expenseAmt: ").append(toIndentedString(expenseAmt)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    revenueAmt: ").append(toIndentedString(revenueAmt)).append("\n");
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

