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
 * CapStkTrPrinCurrentFundsGrpClass
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class CapStkTrPrinCurrentFundsGrpClass {

  @JsonProperty("EOYAmt")
  private Integer eoYAmt;

  @JsonProperty("BOYAmt")
  private Integer boYAmt;

  public CapStkTrPrinCurrentFundsGrpClass eoYAmt(Integer eoYAmt) {
    this.eoYAmt = eoYAmt;
    return this;
  }

  /**
   * Get eoYAmt
   * @return eoYAmt
  */
  @NotNull 
  @Schema(name = "EOYAmt", required = true)
  public Integer getEoYAmt() {
    return eoYAmt;
  }

  public void setEoYAmt(Integer eoYAmt) {
    this.eoYAmt = eoYAmt;
  }

  public CapStkTrPrinCurrentFundsGrpClass boYAmt(Integer boYAmt) {
    this.boYAmt = boYAmt;
    return this;
  }

  /**
   * Get boYAmt
   * @return boYAmt
  */
  @NotNull 
  @Schema(name = "BOYAmt", required = true)
  public Integer getBoYAmt() {
    return boYAmt;
  }

  public void setBoYAmt(Integer boYAmt) {
    this.boYAmt = boYAmt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapStkTrPrinCurrentFundsGrpClass capStkTrPrinCurrentFundsGrpClass = (CapStkTrPrinCurrentFundsGrpClass) o;
    return Objects.equals(this.eoYAmt, capStkTrPrinCurrentFundsGrpClass.eoYAmt) &&
        Objects.equals(this.boYAmt, capStkTrPrinCurrentFundsGrpClass.boYAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eoYAmt, boYAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapStkTrPrinCurrentFundsGrpClass {\n");
    sb.append("    eoYAmt: ").append(toIndentedString(eoYAmt)).append("\n");
    sb.append("    boYAmt: ").append(toIndentedString(boYAmt)).append("\n");
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

