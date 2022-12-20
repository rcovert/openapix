package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Name;
import org.openapitools.model.UsAddress;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PreparerFirmGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class PreparerFirmGrp {

  @JsonProperty("PreparerFirmName")
  private Name preparerFirmName;

  @JsonProperty("PreparerUSAddress")
  private UsAddress preparerUSAddress;

  @JsonProperty("PreparerFirmEIN")
  private Integer preparerFirmEIN;

  public PreparerFirmGrp preparerFirmName(Name preparerFirmName) {
    this.preparerFirmName = preparerFirmName;
    return this;
  }

  /**
   * Get preparerFirmName
   * @return preparerFirmName
  */
  @NotNull @Valid 
  @Schema(name = "PreparerFirmName", required = true)
  public Name getPreparerFirmName() {
    return preparerFirmName;
  }

  public void setPreparerFirmName(Name preparerFirmName) {
    this.preparerFirmName = preparerFirmName;
  }

  public PreparerFirmGrp preparerUSAddress(UsAddress preparerUSAddress) {
    this.preparerUSAddress = preparerUSAddress;
    return this;
  }

  /**
   * Get preparerUSAddress
   * @return preparerUSAddress
  */
  @NotNull @Valid 
  @Schema(name = "PreparerUSAddress", required = true)
  public UsAddress getPreparerUSAddress() {
    return preparerUSAddress;
  }

  public void setPreparerUSAddress(UsAddress preparerUSAddress) {
    this.preparerUSAddress = preparerUSAddress;
  }

  public PreparerFirmGrp preparerFirmEIN(Integer preparerFirmEIN) {
    this.preparerFirmEIN = preparerFirmEIN;
    return this;
  }

  /**
   * Get preparerFirmEIN
   * @return preparerFirmEIN
  */
  @NotNull 
  @Schema(name = "PreparerFirmEIN", required = true)
  public Integer getPreparerFirmEIN() {
    return preparerFirmEIN;
  }

  public void setPreparerFirmEIN(Integer preparerFirmEIN) {
    this.preparerFirmEIN = preparerFirmEIN;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreparerFirmGrp preparerFirmGrp = (PreparerFirmGrp) o;
    return Objects.equals(this.preparerFirmName, preparerFirmGrp.preparerFirmName) &&
        Objects.equals(this.preparerUSAddress, preparerFirmGrp.preparerUSAddress) &&
        Objects.equals(this.preparerFirmEIN, preparerFirmGrp.preparerFirmEIN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preparerFirmName, preparerUSAddress, preparerFirmEIN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreparerFirmGrp {\n");
    sb.append("    preparerFirmName: ").append(toIndentedString(preparerFirmName)).append("\n");
    sb.append("    preparerUSAddress: ").append(toIndentedString(preparerUSAddress)).append("\n");
    sb.append("    preparerFirmEIN: ").append(toIndentedString(preparerFirmEIN)).append("\n");
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

