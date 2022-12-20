package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.model.ReturnData;
import org.openapitools.model.ReturnHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReturnReturn
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class ReturnReturn {

  @JsonProperty("returnVersion")
  private String returnVersion;

  @JsonProperty("ReturnHeader")
  private ReturnHeader returnHeader;

  @JsonProperty("xmlns")
  private URI xmlns;

  @JsonProperty("ReturnData")
  private ReturnData returnData;

  @JsonProperty("xsi:schemaLocation")
  private URI xsiColonSchemaLocation;

  @JsonProperty("xmlns:xsi")
  private URI xmlnsColonXsi;

  public ReturnReturn returnVersion(String returnVersion) {
    this.returnVersion = returnVersion;
    return this;
  }

  /**
   * Get returnVersion
   * @return returnVersion
  */
  @NotNull 
  @Schema(name = "returnVersion", required = true)
  public String getReturnVersion() {
    return returnVersion;
  }

  public void setReturnVersion(String returnVersion) {
    this.returnVersion = returnVersion;
  }

  public ReturnReturn returnHeader(ReturnHeader returnHeader) {
    this.returnHeader = returnHeader;
    return this;
  }

  /**
   * Get returnHeader
   * @return returnHeader
  */
  @NotNull @Valid 
  @Schema(name = "ReturnHeader", required = true)
  public ReturnHeader getReturnHeader() {
    return returnHeader;
  }

  public void setReturnHeader(ReturnHeader returnHeader) {
    this.returnHeader = returnHeader;
  }

  public ReturnReturn xmlns(URI xmlns) {
    this.xmlns = xmlns;
    return this;
  }

  /**
   * Get xmlns
   * @return xmlns
  */
  @NotNull @Valid 
  @Schema(name = "xmlns", required = true)
  public URI getXmlns() {
    return xmlns;
  }

  public void setXmlns(URI xmlns) {
    this.xmlns = xmlns;
  }

  public ReturnReturn returnData(ReturnData returnData) {
    this.returnData = returnData;
    return this;
  }

  /**
   * Get returnData
   * @return returnData
  */
  @NotNull @Valid 
  @Schema(name = "ReturnData", required = true)
  public ReturnData getReturnData() {
    return returnData;
  }

  public void setReturnData(ReturnData returnData) {
    this.returnData = returnData;
  }

  public ReturnReturn xsiColonSchemaLocation(URI xsiColonSchemaLocation) {
    this.xsiColonSchemaLocation = xsiColonSchemaLocation;
    return this;
  }

  /**
   * Get xsiColonSchemaLocation
   * @return xsiColonSchemaLocation
  */
  @NotNull @Valid 
  @Schema(name = "xsi:schemaLocation", required = true)
  public URI getXsiColonSchemaLocation() {
    return xsiColonSchemaLocation;
  }

  public void setXsiColonSchemaLocation(URI xsiColonSchemaLocation) {
    this.xsiColonSchemaLocation = xsiColonSchemaLocation;
  }

  public ReturnReturn xmlnsColonXsi(URI xmlnsColonXsi) {
    this.xmlnsColonXsi = xmlnsColonXsi;
    return this;
  }

  /**
   * Get xmlnsColonXsi
   * @return xmlnsColonXsi
  */
  @NotNull @Valid 
  @Schema(name = "xmlns:xsi", required = true)
  public URI getXmlnsColonXsi() {
    return xmlnsColonXsi;
  }

  public void setXmlnsColonXsi(URI xmlnsColonXsi) {
    this.xmlnsColonXsi = xmlnsColonXsi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnReturn returnReturn = (ReturnReturn) o;
    return Objects.equals(this.returnVersion, returnReturn.returnVersion) &&
        Objects.equals(this.returnHeader, returnReturn.returnHeader) &&
        Objects.equals(this.xmlns, returnReturn.xmlns) &&
        Objects.equals(this.returnData, returnReturn.returnData) &&
        Objects.equals(this.xsiColonSchemaLocation, returnReturn.xsiColonSchemaLocation) &&
        Objects.equals(this.xmlnsColonXsi, returnReturn.xmlnsColonXsi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnVersion, returnHeader, xmlns, returnData, xsiColonSchemaLocation, xmlnsColonXsi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnReturn {\n");
    sb.append("    returnVersion: ").append(toIndentedString(returnVersion)).append("\n");
    sb.append("    returnHeader: ").append(toIndentedString(returnHeader)).append("\n");
    sb.append("    xmlns: ").append(toIndentedString(xmlns)).append("\n");
    sb.append("    returnData: ").append(toIndentedString(returnData)).append("\n");
    sb.append("    xsiColonSchemaLocation: ").append(toIndentedString(xsiColonSchemaLocation)).append("\n");
    sb.append("    xmlnsColonXsi: ").append(toIndentedString(xmlnsColonXsi)).append("\n");
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

