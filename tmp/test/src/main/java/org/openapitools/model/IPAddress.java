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
 * IPAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class IPAddress {

  @JsonProperty("IPv4AddressTxt")
  private String ipv4AddressTxt;

  public IPAddress ipv4AddressTxt(String ipv4AddressTxt) {
    this.ipv4AddressTxt = ipv4AddressTxt;
    return this;
  }

  /**
   * Get ipv4AddressTxt
   * @return ipv4AddressTxt
  */
  @NotNull 
  @Schema(name = "IPv4AddressTxt", required = true)
  public String getIpv4AddressTxt() {
    return ipv4AddressTxt;
  }

  public void setIpv4AddressTxt(String ipv4AddressTxt) {
    this.ipv4AddressTxt = ipv4AddressTxt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddress ipAddress = (IPAddress) o;
    return Objects.equals(this.ipv4AddressTxt, ipAddress.ipv4AddressTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4AddressTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddress {\n");
    sb.append("    ipv4AddressTxt: ").append(toIndentedString(ipv4AddressTxt)).append("\n");
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

