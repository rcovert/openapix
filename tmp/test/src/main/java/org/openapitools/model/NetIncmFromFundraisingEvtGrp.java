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
 * NetIncmFromFundraisingEvtGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class NetIncmFromFundraisingEvtGrp {

  @JsonProperty("TotalRevenueColumnAmt")
  private Integer totalRevenueColumnAmt;

  public NetIncmFromFundraisingEvtGrp totalRevenueColumnAmt(Integer totalRevenueColumnAmt) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetIncmFromFundraisingEvtGrp netIncmFromFundraisingEvtGrp = (NetIncmFromFundraisingEvtGrp) o;
    return Objects.equals(this.totalRevenueColumnAmt, netIncmFromFundraisingEvtGrp.totalRevenueColumnAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRevenueColumnAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetIncmFromFundraisingEvtGrp {\n");
    sb.append("    totalRevenueColumnAmt: ").append(toIndentedString(totalRevenueColumnAmt)).append("\n");
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

