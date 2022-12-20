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
 * ContributorUSAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class ContributorUSAddress {

  @JsonProperty("AddressLine2")
  private String addressLine2;

  @JsonProperty("AddressLine1")
  private String addressLine1;

  @JsonProperty("ZIPCode")
  private String ziPCode;

  @JsonProperty("State")
  private String state;

  @JsonProperty("City")
  private String city;

  public ContributorUSAddress addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Get addressLine2
   * @return addressLine2
  */
  @NotNull 
  @Schema(name = "AddressLine2", required = true)
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public ContributorUSAddress addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Get addressLine1
   * @return addressLine1
  */
  @NotNull 
  @Schema(name = "AddressLine1", required = true)
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public ContributorUSAddress ziPCode(String ziPCode) {
    this.ziPCode = ziPCode;
    return this;
  }

  /**
   * Get ziPCode
   * @return ziPCode
  */
  @NotNull 
  @Schema(name = "ZIPCode", required = true)
  public String getZiPCode() {
    return ziPCode;
  }

  public void setZiPCode(String ziPCode) {
    this.ziPCode = ziPCode;
  }

  public ContributorUSAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @NotNull 
  @Schema(name = "State", required = true)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ContributorUSAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @NotNull 
  @Schema(name = "City", required = true)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContributorUSAddress contributorUSAddress = (ContributorUSAddress) o;
    return Objects.equals(this.addressLine2, contributorUSAddress.addressLine2) &&
        Objects.equals(this.addressLine1, contributorUSAddress.addressLine1) &&
        Objects.equals(this.ziPCode, contributorUSAddress.ziPCode) &&
        Objects.equals(this.state, contributorUSAddress.state) &&
        Objects.equals(this.city, contributorUSAddress.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine2, addressLine1, ziPCode, state, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributorUSAddress {\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    ziPCode: ").append(toIndentedString(ziPCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

