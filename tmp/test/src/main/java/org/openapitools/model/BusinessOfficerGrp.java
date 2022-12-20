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
 * BusinessOfficerGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class BusinessOfficerGrp {

  @JsonProperty("PersonNm")
  private String personNm;

  @JsonProperty("PersonTitleTxt")
  private String personTitleTxt;

  @JsonProperty("DiscussWithPaidPreparerInd")
  private Boolean discussWithPaidPreparerInd;

  @JsonProperty("PhoneNum")
  private Integer phoneNum;

  @JsonProperty("SignatureDt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate signatureDt;

  public BusinessOfficerGrp personNm(String personNm) {
    this.personNm = personNm;
    return this;
  }

  /**
   * Get personNm
   * @return personNm
  */
  @NotNull 
  @Schema(name = "PersonNm", required = true)
  public String getPersonNm() {
    return personNm;
  }

  public void setPersonNm(String personNm) {
    this.personNm = personNm;
  }

  public BusinessOfficerGrp personTitleTxt(String personTitleTxt) {
    this.personTitleTxt = personTitleTxt;
    return this;
  }

  /**
   * Get personTitleTxt
   * @return personTitleTxt
  */
  @NotNull 
  @Schema(name = "PersonTitleTxt", required = true)
  public String getPersonTitleTxt() {
    return personTitleTxt;
  }

  public void setPersonTitleTxt(String personTitleTxt) {
    this.personTitleTxt = personTitleTxt;
  }

  public BusinessOfficerGrp discussWithPaidPreparerInd(Boolean discussWithPaidPreparerInd) {
    this.discussWithPaidPreparerInd = discussWithPaidPreparerInd;
    return this;
  }

  /**
   * Get discussWithPaidPreparerInd
   * @return discussWithPaidPreparerInd
  */
  @NotNull 
  @Schema(name = "DiscussWithPaidPreparerInd", required = true)
  public Boolean getDiscussWithPaidPreparerInd() {
    return discussWithPaidPreparerInd;
  }

  public void setDiscussWithPaidPreparerInd(Boolean discussWithPaidPreparerInd) {
    this.discussWithPaidPreparerInd = discussWithPaidPreparerInd;
  }

  public BusinessOfficerGrp phoneNum(Integer phoneNum) {
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

  public BusinessOfficerGrp signatureDt(LocalDate signatureDt) {
    this.signatureDt = signatureDt;
    return this;
  }

  /**
   * Get signatureDt
   * @return signatureDt
  */
  @NotNull @Valid 
  @Schema(name = "SignatureDt", required = true)
  public LocalDate getSignatureDt() {
    return signatureDt;
  }

  public void setSignatureDt(LocalDate signatureDt) {
    this.signatureDt = signatureDt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessOfficerGrp businessOfficerGrp = (BusinessOfficerGrp) o;
    return Objects.equals(this.personNm, businessOfficerGrp.personNm) &&
        Objects.equals(this.personTitleTxt, businessOfficerGrp.personTitleTxt) &&
        Objects.equals(this.discussWithPaidPreparerInd, businessOfficerGrp.discussWithPaidPreparerInd) &&
        Objects.equals(this.phoneNum, businessOfficerGrp.phoneNum) &&
        Objects.equals(this.signatureDt, businessOfficerGrp.signatureDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personNm, personTitleTxt, discussWithPaidPreparerInd, phoneNum, signatureDt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessOfficerGrp {\n");
    sb.append("    personNm: ").append(toIndentedString(personNm)).append("\n");
    sb.append("    personTitleTxt: ").append(toIndentedString(personTitleTxt)).append("\n");
    sb.append("    discussWithPaidPreparerInd: ").append(toIndentedString(discussWithPaidPreparerInd)).append("\n");
    sb.append("    phoneNum: ").append(toIndentedString(phoneNum)).append("\n");
    sb.append("    signatureDt: ").append(toIndentedString(signatureDt)).append("\n");
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

