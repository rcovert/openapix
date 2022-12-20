package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DescribedInSection501C3IndClass;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FundraisingActivitiesIndUnion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class FundraisingActivitiesIndUnion {

  @JsonProperty("referenceDocumentId")
  private String referenceDocumentId;

  @JsonProperty("content")
  private Boolean content;

  public FundraisingActivitiesIndUnion referenceDocumentId(String referenceDocumentId) {
    this.referenceDocumentId = referenceDocumentId;
    return this;
  }

  /**
   * Get referenceDocumentId
   * @return referenceDocumentId
  */
  @NotNull 
  @Schema(name = "referenceDocumentId", required = true)
  public String getReferenceDocumentId() {
    return referenceDocumentId;
  }

  public void setReferenceDocumentId(String referenceDocumentId) {
    this.referenceDocumentId = referenceDocumentId;
  }

  public FundraisingActivitiesIndUnion content(Boolean content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull 
  @Schema(name = "content", required = true)
  public Boolean getContent() {
    return content;
  }

  public void setContent(Boolean content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundraisingActivitiesIndUnion fundraisingActivitiesIndUnion = (FundraisingActivitiesIndUnion) o;
    return Objects.equals(this.referenceDocumentId, fundraisingActivitiesIndUnion.referenceDocumentId) &&
        Objects.equals(this.content, fundraisingActivitiesIndUnion.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceDocumentId, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundraisingActivitiesIndUnion {\n");
    sb.append("    referenceDocumentId: ").append(toIndentedString(referenceDocumentId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

