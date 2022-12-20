package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ContributorBusinessName;
import org.openapitools.model.ContributorUSAddress;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ContributorInformationGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class ContributorInformationGrp {

  @JsonProperty("TotalContributionsAmt")
  private String totalContributionsAmt;

  @JsonProperty("ContributorNum")
  private String contributorNum;

  @JsonProperty("ContributorBusinessName")
  private ContributorBusinessName contributorBusinessName;

  @JsonProperty("ContributorUSAddress")
  private ContributorUSAddress contributorUSAddress;

  public ContributorInformationGrp totalContributionsAmt(String totalContributionsAmt) {
    this.totalContributionsAmt = totalContributionsAmt;
    return this;
  }

  /**
   * Get totalContributionsAmt
   * @return totalContributionsAmt
  */
  @NotNull 
  @Schema(name = "TotalContributionsAmt", required = true)
  public String getTotalContributionsAmt() {
    return totalContributionsAmt;
  }

  public void setTotalContributionsAmt(String totalContributionsAmt) {
    this.totalContributionsAmt = totalContributionsAmt;
  }

  public ContributorInformationGrp contributorNum(String contributorNum) {
    this.contributorNum = contributorNum;
    return this;
  }

  /**
   * Get contributorNum
   * @return contributorNum
  */
  @NotNull 
  @Schema(name = "ContributorNum", required = true)
  public String getContributorNum() {
    return contributorNum;
  }

  public void setContributorNum(String contributorNum) {
    this.contributorNum = contributorNum;
  }

  public ContributorInformationGrp contributorBusinessName(ContributorBusinessName contributorBusinessName) {
    this.contributorBusinessName = contributorBusinessName;
    return this;
  }

  /**
   * Get contributorBusinessName
   * @return contributorBusinessName
  */
  @NotNull @Valid 
  @Schema(name = "ContributorBusinessName", required = true)
  public ContributorBusinessName getContributorBusinessName() {
    return contributorBusinessName;
  }

  public void setContributorBusinessName(ContributorBusinessName contributorBusinessName) {
    this.contributorBusinessName = contributorBusinessName;
  }

  public ContributorInformationGrp contributorUSAddress(ContributorUSAddress contributorUSAddress) {
    this.contributorUSAddress = contributorUSAddress;
    return this;
  }

  /**
   * Get contributorUSAddress
   * @return contributorUSAddress
  */
  @NotNull @Valid 
  @Schema(name = "ContributorUSAddress", required = true)
  public ContributorUSAddress getContributorUSAddress() {
    return contributorUSAddress;
  }

  public void setContributorUSAddress(ContributorUSAddress contributorUSAddress) {
    this.contributorUSAddress = contributorUSAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContributorInformationGrp contributorInformationGrp = (ContributorInformationGrp) o;
    return Objects.equals(this.totalContributionsAmt, contributorInformationGrp.totalContributionsAmt) &&
        Objects.equals(this.contributorNum, contributorInformationGrp.contributorNum) &&
        Objects.equals(this.contributorBusinessName, contributorInformationGrp.contributorBusinessName) &&
        Objects.equals(this.contributorUSAddress, contributorInformationGrp.contributorUSAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalContributionsAmt, contributorNum, contributorBusinessName, contributorUSAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributorInformationGrp {\n");
    sb.append("    totalContributionsAmt: ").append(toIndentedString(totalContributionsAmt)).append("\n");
    sb.append("    contributorNum: ").append(toIndentedString(contributorNum)).append("\n");
    sb.append("    contributorBusinessName: ").append(toIndentedString(contributorBusinessName)).append("\n");
    sb.append("    contributorUSAddress: ").append(toIndentedString(contributorUSAddress)).append("\n");
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

