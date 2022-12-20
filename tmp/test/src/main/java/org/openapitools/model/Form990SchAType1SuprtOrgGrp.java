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
 * Form990SchAType1SuprtOrgGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class Form990SchAType1SuprtOrgGrp {

  @JsonProperty("OperateBenefitNonSuprtOrgInd")
  private Boolean operateBenefitNonSuprtOrgInd;

  @JsonProperty("PowerAppointMajorityDirTrstInd")
  private Boolean powerAppointMajorityDirTrstInd;

  public Form990SchAType1SuprtOrgGrp operateBenefitNonSuprtOrgInd(Boolean operateBenefitNonSuprtOrgInd) {
    this.operateBenefitNonSuprtOrgInd = operateBenefitNonSuprtOrgInd;
    return this;
  }

  /**
   * Get operateBenefitNonSuprtOrgInd
   * @return operateBenefitNonSuprtOrgInd
  */
  @NotNull 
  @Schema(name = "OperateBenefitNonSuprtOrgInd", required = true)
  public Boolean getOperateBenefitNonSuprtOrgInd() {
    return operateBenefitNonSuprtOrgInd;
  }

  public void setOperateBenefitNonSuprtOrgInd(Boolean operateBenefitNonSuprtOrgInd) {
    this.operateBenefitNonSuprtOrgInd = operateBenefitNonSuprtOrgInd;
  }

  public Form990SchAType1SuprtOrgGrp powerAppointMajorityDirTrstInd(Boolean powerAppointMajorityDirTrstInd) {
    this.powerAppointMajorityDirTrstInd = powerAppointMajorityDirTrstInd;
    return this;
  }

  /**
   * Get powerAppointMajorityDirTrstInd
   * @return powerAppointMajorityDirTrstInd
  */
  @NotNull 
  @Schema(name = "PowerAppointMajorityDirTrstInd", required = true)
  public Boolean getPowerAppointMajorityDirTrstInd() {
    return powerAppointMajorityDirTrstInd;
  }

  public void setPowerAppointMajorityDirTrstInd(Boolean powerAppointMajorityDirTrstInd) {
    this.powerAppointMajorityDirTrstInd = powerAppointMajorityDirTrstInd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form990SchAType1SuprtOrgGrp form990SchAType1SuprtOrgGrp = (Form990SchAType1SuprtOrgGrp) o;
    return Objects.equals(this.operateBenefitNonSuprtOrgInd, form990SchAType1SuprtOrgGrp.operateBenefitNonSuprtOrgInd) &&
        Objects.equals(this.powerAppointMajorityDirTrstInd, form990SchAType1SuprtOrgGrp.powerAppointMajorityDirTrstInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operateBenefitNonSuprtOrgInd, powerAppointMajorityDirTrstInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form990SchAType1SuprtOrgGrp {\n");
    sb.append("    operateBenefitNonSuprtOrgInd: ").append(toIndentedString(operateBenefitNonSuprtOrgInd)).append("\n");
    sb.append("    powerAppointMajorityDirTrstInd: ").append(toIndentedString(powerAppointMajorityDirTrstInd)).append("\n");
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

