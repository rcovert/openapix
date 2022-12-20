package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EvaluatePost200Response
 */

@JsonTypeName("_evaluate_post_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class EvaluatePost200Response {

  @JsonProperty("filter_name")
  private String filterName;

  @JsonProperty("filter_type")
  private String filterType;

  @JsonProperty("filter_score")
  private Integer filterScore;

  public EvaluatePost200Response filterName(String filterName) {
    this.filterName = filterName;
    return this;
  }

  /**
   * Get filterName
   * @return filterName
  */
  
  @Schema(name = "filter_name", required = false)
  public String getFilterName() {
    return filterName;
  }

  public void setFilterName(String filterName) {
    this.filterName = filterName;
  }

  public EvaluatePost200Response filterType(String filterType) {
    this.filterType = filterType;
    return this;
  }

  /**
   * Get filterType
   * @return filterType
  */
  
  @Schema(name = "filter_type", required = false)
  public String getFilterType() {
    return filterType;
  }

  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }

  public EvaluatePost200Response filterScore(Integer filterScore) {
    this.filterScore = filterScore;
    return this;
  }

  /**
   * Get filterScore
   * @return filterScore
  */
  
  @Schema(name = "filter_score", required = false)
  public Integer getFilterScore() {
    return filterScore;
  }

  public void setFilterScore(Integer filterScore) {
    this.filterScore = filterScore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluatePost200Response evaluatePost200Response = (EvaluatePost200Response) o;
    return Objects.equals(this.filterName, evaluatePost200Response.filterName) &&
        Objects.equals(this.filterType, evaluatePost200Response.filterType) &&
        Objects.equals(this.filterScore, evaluatePost200Response.filterScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterName, filterType, filterScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatePost200Response {\n");
    sb.append("    filterName: ").append(toIndentedString(filterName)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    filterScore: ").append(toIndentedString(filterScore)).append("\n");
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

