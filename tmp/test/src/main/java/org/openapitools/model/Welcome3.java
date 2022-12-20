package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ReturnElement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Welcome3
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class Welcome3 {

  @JsonProperty("Returns")
  @Valid
  private List<ReturnElement> returns = new ArrayList<>();

  public Welcome3 returns(List<ReturnElement> returns) {
    this.returns = returns;
    return this;
  }

  public Welcome3 addReturnsItem(ReturnElement returnsItem) {
    this.returns.add(returnsItem);
    return this;
  }

  /**
   * Get returns
   * @return returns
  */
  @NotNull @Valid 
  @Schema(name = "Returns", required = true)
  public List<ReturnElement> getReturns() {
    return returns;
  }

  public void setReturns(List<ReturnElement> returns) {
    this.returns = returns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Welcome3 welcome3 = (Welcome3) o;
    return Objects.equals(this.returns, welcome3.returns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Welcome3 {\n");
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
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

