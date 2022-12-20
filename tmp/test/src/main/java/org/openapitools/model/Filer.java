package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Ein;
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
 * Filer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class Filer {

  @JsonProperty("BusinessName")
  private Name businessName;

  @JsonProperty("PhoneNum")
  private Integer phoneNum;

  @JsonProperty("BusinessNameControlTxt")
  private String businessNameControlTxt;

  @JsonProperty("EIN")
  private Ein EIN;

  @JsonProperty("USAddress")
  private UsAddress usAddress;

  @JsonProperty("InCareOfNm")
  private String inCareOfNm;

  public Filer businessName(Name businessName) {
    this.businessName = businessName;
    return this;
  }

  /**
   * Get businessName
   * @return businessName
  */
  @NotNull @Valid 
  @Schema(name = "BusinessName", required = true)
  public Name getBusinessName() {
    return businessName;
  }

  public void setBusinessName(Name businessName) {
    this.businessName = businessName;
  }

  public Filer phoneNum(Integer phoneNum) {
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

  public Filer businessNameControlTxt(String businessNameControlTxt) {
    this.businessNameControlTxt = businessNameControlTxt;
    return this;
  }

  /**
   * Get businessNameControlTxt
   * @return businessNameControlTxt
  */
  @NotNull 
  @Schema(name = "BusinessNameControlTxt", required = true)
  public String getBusinessNameControlTxt() {
    return businessNameControlTxt;
  }

  public void setBusinessNameControlTxt(String businessNameControlTxt) {
    this.businessNameControlTxt = businessNameControlTxt;
  }

  public Filer EIN(Ein EIN) {
    this.EIN = EIN;
    return this;
  }

  /**
   * Get EIN
   * @return EIN
  */
  @NotNull @Valid 
  @Schema(name = "EIN", required = true)
  public Ein getEIN() {
    return EIN;
  }

  public void setEIN(Ein EIN) {
    this.EIN = EIN;
  }

  public Filer usAddress(UsAddress usAddress) {
    this.usAddress = usAddress;
    return this;
  }

  /**
   * Get usAddress
   * @return usAddress
  */
  @NotNull @Valid 
  @Schema(name = "USAddress", required = true)
  public UsAddress getUsAddress() {
    return usAddress;
  }

  public void setUsAddress(UsAddress usAddress) {
    this.usAddress = usAddress;
  }

  public Filer inCareOfNm(String inCareOfNm) {
    this.inCareOfNm = inCareOfNm;
    return this;
  }

  /**
   * Get inCareOfNm
   * @return inCareOfNm
  */
  @NotNull 
  @Schema(name = "InCareOfNm", required = true)
  public String getInCareOfNm() {
    return inCareOfNm;
  }

  public void setInCareOfNm(String inCareOfNm) {
    this.inCareOfNm = inCareOfNm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filer filer = (Filer) o;
    return Objects.equals(this.businessName, filer.businessName) &&
        Objects.equals(this.phoneNum, filer.phoneNum) &&
        Objects.equals(this.businessNameControlTxt, filer.businessNameControlTxt) &&
        Objects.equals(this.EIN, filer.EIN) &&
        Objects.equals(this.usAddress, filer.usAddress) &&
        Objects.equals(this.inCareOfNm, filer.inCareOfNm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, phoneNum, businessNameControlTxt, EIN, usAddress, inCareOfNm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filer {\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    phoneNum: ").append(toIndentedString(phoneNum)).append("\n");
    sb.append("    businessNameControlTxt: ").append(toIndentedString(businessNameControlTxt)).append("\n");
    sb.append("    EIN: ").append(toIndentedString(EIN)).append("\n");
    sb.append("    usAddress: ").append(toIndentedString(usAddress)).append("\n");
    sb.append("    inCareOfNm: ").append(toIndentedString(inCareOfNm)).append("\n");
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

