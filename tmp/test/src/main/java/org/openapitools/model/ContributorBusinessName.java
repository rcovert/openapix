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
 * ContributorBusinessName
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class ContributorBusinessName {

  @JsonProperty("BusinessNameLine1")
  private String businessNameLine1;

  public ContributorBusinessName businessNameLine1(String businessNameLine1) {
    this.businessNameLine1 = businessNameLine1;
    return this;
  }

  /**
   * Get businessNameLine1
   * @return businessNameLine1
  */
  @NotNull 
  @Schema(name = "BusinessNameLine1", required = true)
  public String getBusinessNameLine1() {
    return businessNameLine1;
  }

  public void setBusinessNameLine1(String businessNameLine1) {
    this.businessNameLine1 = businessNameLine1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContributorBusinessName contributorBusinessName = (ContributorBusinessName) o;
    return Objects.equals(this.businessNameLine1, contributorBusinessName.businessNameLine1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessNameLine1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributorBusinessName {\n");
    sb.append("    businessNameLine1: ").append(toIndentedString(businessNameLine1)).append("\n");
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

