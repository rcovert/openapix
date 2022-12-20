package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Ein;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UsAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class UsAddress {

  @JsonProperty("ZIPCd")
  private Ein ziPCd;

  @JsonProperty("CityNm")
  private String cityNm;

  @JsonProperty("StateAbbreviationCd")
  private String stateAbbreviationCd;

  @JsonProperty("AddressLine1Txt")
  private String addressLine1Txt;

  public UsAddress ziPCd(Ein ziPCd) {
    this.ziPCd = ziPCd;
    return this;
  }

  /**
   * Get ziPCd
   * @return ziPCd
  */
  @NotNull @Valid 
  @Schema(name = "ZIPCd", required = true)
  public Ein getZiPCd() {
    return ziPCd;
  }

  public void setZiPCd(Ein ziPCd) {
    this.ziPCd = ziPCd;
  }

  public UsAddress cityNm(String cityNm) {
    this.cityNm = cityNm;
    return this;
  }

  /**
   * Get cityNm
   * @return cityNm
  */
  @NotNull 
  @Schema(name = "CityNm", required = true)
  public String getCityNm() {
    return cityNm;
  }

  public void setCityNm(String cityNm) {
    this.cityNm = cityNm;
  }

  public UsAddress stateAbbreviationCd(String stateAbbreviationCd) {
    this.stateAbbreviationCd = stateAbbreviationCd;
    return this;
  }

  /**
   * Get stateAbbreviationCd
   * @return stateAbbreviationCd
  */
  @NotNull 
  @Schema(name = "StateAbbreviationCd", required = true)
  public String getStateAbbreviationCd() {
    return stateAbbreviationCd;
  }

  public void setStateAbbreviationCd(String stateAbbreviationCd) {
    this.stateAbbreviationCd = stateAbbreviationCd;
  }

  public UsAddress addressLine1Txt(String addressLine1Txt) {
    this.addressLine1Txt = addressLine1Txt;
    return this;
  }

  /**
   * Get addressLine1Txt
   * @return addressLine1Txt
  */
  @NotNull 
  @Schema(name = "AddressLine1Txt", required = true)
  public String getAddressLine1Txt() {
    return addressLine1Txt;
  }

  public void setAddressLine1Txt(String addressLine1Txt) {
    this.addressLine1Txt = addressLine1Txt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsAddress usAddress = (UsAddress) o;
    return Objects.equals(this.ziPCd, usAddress.ziPCd) &&
        Objects.equals(this.cityNm, usAddress.cityNm) &&
        Objects.equals(this.stateAbbreviationCd, usAddress.stateAbbreviationCd) &&
        Objects.equals(this.addressLine1Txt, usAddress.addressLine1Txt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ziPCd, cityNm, stateAbbreviationCd, addressLine1Txt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsAddress {\n");
    sb.append("    ziPCd: ").append(toIndentedString(ziPCd)).append("\n");
    sb.append("    cityNm: ").append(toIndentedString(cityNm)).append("\n");
    sb.append("    stateAbbreviationCd: ").append(toIndentedString(stateAbbreviationCd)).append("\n");
    sb.append("    addressLine1Txt: ").append(toIndentedString(addressLine1Txt)).append("\n");
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

