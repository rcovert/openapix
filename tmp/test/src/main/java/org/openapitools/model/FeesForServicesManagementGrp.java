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
 * FeesForServicesManagementGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class FeesForServicesManagementGrp {

  @JsonProperty("TotalAmt")
  private Integer totalAmt;

  @JsonProperty("ManagementAndGeneralAmt")
  private Integer managementAndGeneralAmt;

  public FeesForServicesManagementGrp totalAmt(Integer totalAmt) {
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

  public FeesForServicesManagementGrp managementAndGeneralAmt(Integer managementAndGeneralAmt) {
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
    FeesForServicesManagementGrp feesForServicesManagementGrp = (FeesForServicesManagementGrp) o;
    return Objects.equals(this.totalAmt, feesForServicesManagementGrp.totalAmt) &&
        Objects.equals(this.managementAndGeneralAmt, feesForServicesManagementGrp.managementAndGeneralAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmt, managementAndGeneralAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeesForServicesManagementGrp {\n");
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

