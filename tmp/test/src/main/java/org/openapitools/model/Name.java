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
 * Name
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class Name {

  @JsonProperty("BusinessNameLine1Txt")
  private String businessNameLine1Txt;

  public Name businessNameLine1Txt(String businessNameLine1Txt) {
    this.businessNameLine1Txt = businessNameLine1Txt;
    return this;
  }

  /**
   * Get businessNameLine1Txt
   * @return businessNameLine1Txt
  */
  @NotNull 
  @Schema(name = "BusinessNameLine1Txt", required = true)
  public String getBusinessNameLine1Txt() {
    return businessNameLine1Txt;
  }

  public void setBusinessNameLine1Txt(String businessNameLine1Txt) {
    this.businessNameLine1Txt = businessNameLine1Txt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.businessNameLine1Txt, name.businessNameLine1Txt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessNameLine1Txt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    sb.append("    businessNameLine1Txt: ").append(toIndentedString(businessNameLine1Txt)).append("\n");
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

