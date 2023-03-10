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
 * AcctCompileOrReviewBasisGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class AcctCompileOrReviewBasisGrp {

  @JsonProperty("SeparateBasisFinclStmtInd")
  private String separateBasisFinclStmtInd;

  public AcctCompileOrReviewBasisGrp separateBasisFinclStmtInd(String separateBasisFinclStmtInd) {
    this.separateBasisFinclStmtInd = separateBasisFinclStmtInd;
    return this;
  }

  /**
   * Get separateBasisFinclStmtInd
   * @return separateBasisFinclStmtInd
  */
  @NotNull 
  @Schema(name = "SeparateBasisFinclStmtInd", required = true)
  public String getSeparateBasisFinclStmtInd() {
    return separateBasisFinclStmtInd;
  }

  public void setSeparateBasisFinclStmtInd(String separateBasisFinclStmtInd) {
    this.separateBasisFinclStmtInd = separateBasisFinclStmtInd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcctCompileOrReviewBasisGrp acctCompileOrReviewBasisGrp = (AcctCompileOrReviewBasisGrp) o;
    return Objects.equals(this.separateBasisFinclStmtInd, acctCompileOrReviewBasisGrp.separateBasisFinclStmtInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(separateBasisFinclStmtInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcctCompileOrReviewBasisGrp {\n");
    sb.append("    separateBasisFinclStmtInd: ").append(toIndentedString(separateBasisFinclStmtInd)).append("\n");
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

