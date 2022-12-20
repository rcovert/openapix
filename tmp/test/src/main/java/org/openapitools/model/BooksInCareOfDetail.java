package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * BooksInCareOfDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class BooksInCareOfDetail {

  @JsonProperty("PersonNm")
  private String personNm;

  @JsonProperty("PhoneNum")
  private Integer phoneNum;

  @JsonProperty("USAddress")
  private UsAddress usAddress;

  @JsonProperty("BusinessName")
  private Name businessName;

  public BooksInCareOfDetail personNm(String personNm) {
    this.personNm = personNm;
    return this;
  }

  /**
   * Get personNm
   * @return personNm
  */
  
  @Schema(name = "PersonNm", required = false)
  public String getPersonNm() {
    return personNm;
  }

  public void setPersonNm(String personNm) {
    this.personNm = personNm;
  }

  public BooksInCareOfDetail phoneNum(Integer phoneNum) {
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

  public BooksInCareOfDetail usAddress(UsAddress usAddress) {
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

  public BooksInCareOfDetail businessName(Name businessName) {
    this.businessName = businessName;
    return this;
  }

  /**
   * Get businessName
   * @return businessName
  */
  @Valid 
  @Schema(name = "BusinessName", required = false)
  public Name getBusinessName() {
    return businessName;
  }

  public void setBusinessName(Name businessName) {
    this.businessName = businessName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BooksInCareOfDetail booksInCareOfDetail = (BooksInCareOfDetail) o;
    return Objects.equals(this.personNm, booksInCareOfDetail.personNm) &&
        Objects.equals(this.phoneNum, booksInCareOfDetail.phoneNum) &&
        Objects.equals(this.usAddress, booksInCareOfDetail.usAddress) &&
        Objects.equals(this.businessName, booksInCareOfDetail.businessName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personNm, phoneNum, usAddress, businessName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BooksInCareOfDetail {\n");
    sb.append("    personNm: ").append(toIndentedString(personNm)).append("\n");
    sb.append("    phoneNum: ").append(toIndentedString(phoneNum)).append("\n");
    sb.append("    usAddress: ").append(toIndentedString(usAddress)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
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

