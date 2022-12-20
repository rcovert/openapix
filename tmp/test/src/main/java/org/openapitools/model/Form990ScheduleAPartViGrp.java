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
 * Form990ScheduleAPartViGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class Form990ScheduleAPartViGrp {

  @JsonProperty("FormAndLineReferenceDesc")
  private String formAndLineReferenceDesc;

  @JsonProperty("ExplanationTxt")
  private String explanationTxt;

  public Form990ScheduleAPartViGrp formAndLineReferenceDesc(String formAndLineReferenceDesc) {
    this.formAndLineReferenceDesc = formAndLineReferenceDesc;
    return this;
  }

  /**
   * Get formAndLineReferenceDesc
   * @return formAndLineReferenceDesc
  */
  @NotNull 
  @Schema(name = "FormAndLineReferenceDesc", required = true)
  public String getFormAndLineReferenceDesc() {
    return formAndLineReferenceDesc;
  }

  public void setFormAndLineReferenceDesc(String formAndLineReferenceDesc) {
    this.formAndLineReferenceDesc = formAndLineReferenceDesc;
  }

  public Form990ScheduleAPartViGrp explanationTxt(String explanationTxt) {
    this.explanationTxt = explanationTxt;
    return this;
  }

  /**
   * Get explanationTxt
   * @return explanationTxt
  */
  @NotNull 
  @Schema(name = "ExplanationTxt", required = true)
  public String getExplanationTxt() {
    return explanationTxt;
  }

  public void setExplanationTxt(String explanationTxt) {
    this.explanationTxt = explanationTxt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form990ScheduleAPartViGrp form990ScheduleAPartViGrp = (Form990ScheduleAPartViGrp) o;
    return Objects.equals(this.formAndLineReferenceDesc, form990ScheduleAPartViGrp.formAndLineReferenceDesc) &&
        Objects.equals(this.explanationTxt, form990ScheduleAPartViGrp.explanationTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formAndLineReferenceDesc, explanationTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form990ScheduleAPartViGrp {\n");
    sb.append("    formAndLineReferenceDesc: ").append(toIndentedString(formAndLineReferenceDesc)).append("\n");
    sb.append("    explanationTxt: ").append(toIndentedString(explanationTxt)).append("\n");
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

