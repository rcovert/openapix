package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PreparerPersonGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class PreparerPersonGrp {

  @JsonProperty("SelfEmployedInd")
  private String selfEmployedInd;

  @JsonProperty("PreparerPersonNm")
  private String preparerPersonNm;

  @JsonProperty("PhoneNum")
  private Integer phoneNum;

  @JsonProperty("PTIN")
  private String PTIN;

  @JsonProperty("PreparationDt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate preparationDt;

  public PreparerPersonGrp selfEmployedInd(String selfEmployedInd) {
    this.selfEmployedInd = selfEmployedInd;
    return this;
  }

  /**
   * Get selfEmployedInd
   * @return selfEmployedInd
  */
  @NotNull 
  @Schema(name = "SelfEmployedInd", required = true)
  public String getSelfEmployedInd() {
    return selfEmployedInd;
  }

  public void setSelfEmployedInd(String selfEmployedInd) {
    this.selfEmployedInd = selfEmployedInd;
  }

  public PreparerPersonGrp preparerPersonNm(String preparerPersonNm) {
    this.preparerPersonNm = preparerPersonNm;
    return this;
  }

  /**
   * Get preparerPersonNm
   * @return preparerPersonNm
  */
  @NotNull 
  @Schema(name = "PreparerPersonNm", required = true)
  public String getPreparerPersonNm() {
    return preparerPersonNm;
  }

  public void setPreparerPersonNm(String preparerPersonNm) {
    this.preparerPersonNm = preparerPersonNm;
  }

  public PreparerPersonGrp phoneNum(Integer phoneNum) {
    this.phoneNum = phoneNum;
    return this;
  }

  /**
   * Get phoneNum
   * @return phoneNum
  */
  @NotNull 
  @Schema(name = "PhoneNum", required = true)
  public Integer getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(Integer phoneNum) {
    this.phoneNum = phoneNum;
  }

  public PreparerPersonGrp PTIN(String PTIN) {
    this.PTIN = PTIN;
    return this;
  }

  /**
   * Get PTIN
   * @return PTIN
  */
  @NotNull 
  @Schema(name = "PTIN", required = true)
  public String getPTIN() {
    return PTIN;
  }

  public void setPTIN(String PTIN) {
    this.PTIN = PTIN;
  }

  public PreparerPersonGrp preparationDt(LocalDate preparationDt) {
    this.preparationDt = preparationDt;
    return this;
  }

  /**
   * Get preparationDt
   * @return preparationDt
  */
  @NotNull @Valid 
  @Schema(name = "PreparationDt", required = true)
  public LocalDate getPreparationDt() {
    return preparationDt;
  }

  public void setPreparationDt(LocalDate preparationDt) {
    this.preparationDt = preparationDt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreparerPersonGrp preparerPersonGrp = (PreparerPersonGrp) o;
    return Objects.equals(this.selfEmployedInd, preparerPersonGrp.selfEmployedInd) &&
        Objects.equals(this.preparerPersonNm, preparerPersonGrp.preparerPersonNm) &&
        Objects.equals(this.phoneNum, preparerPersonGrp.phoneNum) &&
        Objects.equals(this.PTIN, preparerPersonGrp.PTIN) &&
        Objects.equals(this.preparationDt, preparerPersonGrp.preparationDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selfEmployedInd, preparerPersonNm, phoneNum, PTIN, preparationDt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreparerPersonGrp {\n");
    sb.append("    selfEmployedInd: ").append(toIndentedString(selfEmployedInd)).append("\n");
    sb.append("    preparerPersonNm: ").append(toIndentedString(preparerPersonNm)).append("\n");
    sb.append("    phoneNum: ").append(toIndentedString(phoneNum)).append("\n");
    sb.append("    PTIN: ").append(toIndentedString(PTIN)).append("\n");
    sb.append("    preparationDt: ").append(toIndentedString(preparationDt)).append("\n");
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

