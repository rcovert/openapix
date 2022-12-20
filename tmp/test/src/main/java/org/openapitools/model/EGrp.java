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
 * EGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class EGrp {

  @JsonProperty("TotalRevenueColumnAmt")
  private Integer totalRevenueColumnAmt;

  @JsonProperty("RelatedOrExemptFuncIncomeAmt")
  private Integer relatedOrExemptFuncIncomeAmt;

  public EGrp totalRevenueColumnAmt(Integer totalRevenueColumnAmt) {
    this.totalRevenueColumnAmt = totalRevenueColumnAmt;
    return this;
  }

  /**
   * Get totalRevenueColumnAmt
   * @return totalRevenueColumnAmt
  */
  @NotNull 
  @Schema(name = "TotalRevenueColumnAmt", required = true)
  public Integer getTotalRevenueColumnAmt() {
    return totalRevenueColumnAmt;
  }

  public void setTotalRevenueColumnAmt(Integer totalRevenueColumnAmt) {
    this.totalRevenueColumnAmt = totalRevenueColumnAmt;
  }

  public EGrp relatedOrExemptFuncIncomeAmt(Integer relatedOrExemptFuncIncomeAmt) {
    this.relatedOrExemptFuncIncomeAmt = relatedOrExemptFuncIncomeAmt;
    return this;
  }

  /**
   * Get relatedOrExemptFuncIncomeAmt
   * @return relatedOrExemptFuncIncomeAmt
  */
  
  @Schema(name = "RelatedOrExemptFuncIncomeAmt", required = false)
  public Integer getRelatedOrExemptFuncIncomeAmt() {
    return relatedOrExemptFuncIncomeAmt;
  }

  public void setRelatedOrExemptFuncIncomeAmt(Integer relatedOrExemptFuncIncomeAmt) {
    this.relatedOrExemptFuncIncomeAmt = relatedOrExemptFuncIncomeAmt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EGrp egrp = (EGrp) o;
    return Objects.equals(this.totalRevenueColumnAmt, egrp.totalRevenueColumnAmt) &&
        Objects.equals(this.relatedOrExemptFuncIncomeAmt, egrp.relatedOrExemptFuncIncomeAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRevenueColumnAmt, relatedOrExemptFuncIncomeAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EGrp {\n");
    sb.append("    totalRevenueColumnAmt: ").append(toIndentedString(totalRevenueColumnAmt)).append("\n");
    sb.append("    relatedOrExemptFuncIncomeAmt: ").append(toIndentedString(relatedOrExemptFuncIncomeAmt)).append("\n");
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

