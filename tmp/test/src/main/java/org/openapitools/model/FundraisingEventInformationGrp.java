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
 * FundraisingEventInformationGrp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class FundraisingEventInformationGrp {

  @JsonProperty("OtherDirectExpensesEvent1Amt")
  private Integer otherDirectExpensesEvent1Amt;

  @JsonProperty("OtherDirectExpensesEvent2Amt")
  private Integer otherDirectExpensesEvent2Amt;

  @JsonProperty("GrossReceiptsEvent2Amt")
  private Integer grossReceiptsEvent2Amt;

  @JsonProperty("GrossReceiptsEvent1Amt")
  private Integer grossReceiptsEvent1Amt;

  @JsonProperty("GrossRevenueTotalEventsAmt")
  private Integer grossRevenueTotalEventsAmt;

  @JsonProperty("NetIncomeSummaryAmt")
  private Integer netIncomeSummaryAmt;

  @JsonProperty("OthDirectExpnssOtherEventsAmt")
  private Integer othDirectExpnssOtherEventsAmt;

  @JsonProperty("GrossReceiptsTotalAmt")
  private Integer grossReceiptsTotalAmt;

  @JsonProperty("OthDirectExpnssTotalEventsAmt")
  private Integer othDirectExpnssTotalEventsAmt;

  @JsonProperty("DirectExpenseSummaryEventsAmt")
  private Integer directExpenseSummaryEventsAmt;

  @JsonProperty("GrossRevenueOtherEventsAmt")
  private Integer grossRevenueOtherEventsAmt;

  @JsonProperty("GrossRevenueEvent1Amt")
  private Integer grossRevenueEvent1Amt;

  @JsonProperty("GrossRevenueEvent2Amt")
  private Integer grossRevenueEvent2Amt;

  @JsonProperty("Event2Nm")
  private String event2Nm;

  @JsonProperty("Event1Nm")
  private String event1Nm;

  @JsonProperty("GrossReceiptsOtherEventsAmt")
  private Integer grossReceiptsOtherEventsAmt;

  @JsonProperty("OtherEventsTotalCnt")
  private Integer otherEventsTotalCnt;

  public FundraisingEventInformationGrp otherDirectExpensesEvent1Amt(Integer otherDirectExpensesEvent1Amt) {
    this.otherDirectExpensesEvent1Amt = otherDirectExpensesEvent1Amt;
    return this;
  }

  /**
   * Get otherDirectExpensesEvent1Amt
   * @return otherDirectExpensesEvent1Amt
  */
  @NotNull 
  @Schema(name = "OtherDirectExpensesEvent1Amt", required = true)
  public Integer getOtherDirectExpensesEvent1Amt() {
    return otherDirectExpensesEvent1Amt;
  }

  public void setOtherDirectExpensesEvent1Amt(Integer otherDirectExpensesEvent1Amt) {
    this.otherDirectExpensesEvent1Amt = otherDirectExpensesEvent1Amt;
  }

  public FundraisingEventInformationGrp otherDirectExpensesEvent2Amt(Integer otherDirectExpensesEvent2Amt) {
    this.otherDirectExpensesEvent2Amt = otherDirectExpensesEvent2Amt;
    return this;
  }

  /**
   * Get otherDirectExpensesEvent2Amt
   * @return otherDirectExpensesEvent2Amt
  */
  @NotNull 
  @Schema(name = "OtherDirectExpensesEvent2Amt", required = true)
  public Integer getOtherDirectExpensesEvent2Amt() {
    return otherDirectExpensesEvent2Amt;
  }

  public void setOtherDirectExpensesEvent2Amt(Integer otherDirectExpensesEvent2Amt) {
    this.otherDirectExpensesEvent2Amt = otherDirectExpensesEvent2Amt;
  }

  public FundraisingEventInformationGrp grossReceiptsEvent2Amt(Integer grossReceiptsEvent2Amt) {
    this.grossReceiptsEvent2Amt = grossReceiptsEvent2Amt;
    return this;
  }

  /**
   * Get grossReceiptsEvent2Amt
   * @return grossReceiptsEvent2Amt
  */
  @NotNull 
  @Schema(name = "GrossReceiptsEvent2Amt", required = true)
  public Integer getGrossReceiptsEvent2Amt() {
    return grossReceiptsEvent2Amt;
  }

  public void setGrossReceiptsEvent2Amt(Integer grossReceiptsEvent2Amt) {
    this.grossReceiptsEvent2Amt = grossReceiptsEvent2Amt;
  }

  public FundraisingEventInformationGrp grossReceiptsEvent1Amt(Integer grossReceiptsEvent1Amt) {
    this.grossReceiptsEvent1Amt = grossReceiptsEvent1Amt;
    return this;
  }

  /**
   * Get grossReceiptsEvent1Amt
   * @return grossReceiptsEvent1Amt
  */
  @NotNull 
  @Schema(name = "GrossReceiptsEvent1Amt", required = true)
  public Integer getGrossReceiptsEvent1Amt() {
    return grossReceiptsEvent1Amt;
  }

  public void setGrossReceiptsEvent1Amt(Integer grossReceiptsEvent1Amt) {
    this.grossReceiptsEvent1Amt = grossReceiptsEvent1Amt;
  }

  public FundraisingEventInformationGrp grossRevenueTotalEventsAmt(Integer grossRevenueTotalEventsAmt) {
    this.grossRevenueTotalEventsAmt = grossRevenueTotalEventsAmt;
    return this;
  }

  /**
   * Get grossRevenueTotalEventsAmt
   * @return grossRevenueTotalEventsAmt
  */
  @NotNull 
  @Schema(name = "GrossRevenueTotalEventsAmt", required = true)
  public Integer getGrossRevenueTotalEventsAmt() {
    return grossRevenueTotalEventsAmt;
  }

  public void setGrossRevenueTotalEventsAmt(Integer grossRevenueTotalEventsAmt) {
    this.grossRevenueTotalEventsAmt = grossRevenueTotalEventsAmt;
  }

  public FundraisingEventInformationGrp netIncomeSummaryAmt(Integer netIncomeSummaryAmt) {
    this.netIncomeSummaryAmt = netIncomeSummaryAmt;
    return this;
  }

  /**
   * Get netIncomeSummaryAmt
   * @return netIncomeSummaryAmt
  */
  @NotNull 
  @Schema(name = "NetIncomeSummaryAmt", required = true)
  public Integer getNetIncomeSummaryAmt() {
    return netIncomeSummaryAmt;
  }

  public void setNetIncomeSummaryAmt(Integer netIncomeSummaryAmt) {
    this.netIncomeSummaryAmt = netIncomeSummaryAmt;
  }

  public FundraisingEventInformationGrp othDirectExpnssOtherEventsAmt(Integer othDirectExpnssOtherEventsAmt) {
    this.othDirectExpnssOtherEventsAmt = othDirectExpnssOtherEventsAmt;
    return this;
  }

  /**
   * Get othDirectExpnssOtherEventsAmt
   * @return othDirectExpnssOtherEventsAmt
  */
  @NotNull 
  @Schema(name = "OthDirectExpnssOtherEventsAmt", required = true)
  public Integer getOthDirectExpnssOtherEventsAmt() {
    return othDirectExpnssOtherEventsAmt;
  }

  public void setOthDirectExpnssOtherEventsAmt(Integer othDirectExpnssOtherEventsAmt) {
    this.othDirectExpnssOtherEventsAmt = othDirectExpnssOtherEventsAmt;
  }

  public FundraisingEventInformationGrp grossReceiptsTotalAmt(Integer grossReceiptsTotalAmt) {
    this.grossReceiptsTotalAmt = grossReceiptsTotalAmt;
    return this;
  }

  /**
   * Get grossReceiptsTotalAmt
   * @return grossReceiptsTotalAmt
  */
  @NotNull 
  @Schema(name = "GrossReceiptsTotalAmt", required = true)
  public Integer getGrossReceiptsTotalAmt() {
    return grossReceiptsTotalAmt;
  }

  public void setGrossReceiptsTotalAmt(Integer grossReceiptsTotalAmt) {
    this.grossReceiptsTotalAmt = grossReceiptsTotalAmt;
  }

  public FundraisingEventInformationGrp othDirectExpnssTotalEventsAmt(Integer othDirectExpnssTotalEventsAmt) {
    this.othDirectExpnssTotalEventsAmt = othDirectExpnssTotalEventsAmt;
    return this;
  }

  /**
   * Get othDirectExpnssTotalEventsAmt
   * @return othDirectExpnssTotalEventsAmt
  */
  @NotNull 
  @Schema(name = "OthDirectExpnssTotalEventsAmt", required = true)
  public Integer getOthDirectExpnssTotalEventsAmt() {
    return othDirectExpnssTotalEventsAmt;
  }

  public void setOthDirectExpnssTotalEventsAmt(Integer othDirectExpnssTotalEventsAmt) {
    this.othDirectExpnssTotalEventsAmt = othDirectExpnssTotalEventsAmt;
  }

  public FundraisingEventInformationGrp directExpenseSummaryEventsAmt(Integer directExpenseSummaryEventsAmt) {
    this.directExpenseSummaryEventsAmt = directExpenseSummaryEventsAmt;
    return this;
  }

  /**
   * Get directExpenseSummaryEventsAmt
   * @return directExpenseSummaryEventsAmt
  */
  @NotNull 
  @Schema(name = "DirectExpenseSummaryEventsAmt", required = true)
  public Integer getDirectExpenseSummaryEventsAmt() {
    return directExpenseSummaryEventsAmt;
  }

  public void setDirectExpenseSummaryEventsAmt(Integer directExpenseSummaryEventsAmt) {
    this.directExpenseSummaryEventsAmt = directExpenseSummaryEventsAmt;
  }

  public FundraisingEventInformationGrp grossRevenueOtherEventsAmt(Integer grossRevenueOtherEventsAmt) {
    this.grossRevenueOtherEventsAmt = grossRevenueOtherEventsAmt;
    return this;
  }

  /**
   * Get grossRevenueOtherEventsAmt
   * @return grossRevenueOtherEventsAmt
  */
  @NotNull 
  @Schema(name = "GrossRevenueOtherEventsAmt", required = true)
  public Integer getGrossRevenueOtherEventsAmt() {
    return grossRevenueOtherEventsAmt;
  }

  public void setGrossRevenueOtherEventsAmt(Integer grossRevenueOtherEventsAmt) {
    this.grossRevenueOtherEventsAmt = grossRevenueOtherEventsAmt;
  }

  public FundraisingEventInformationGrp grossRevenueEvent1Amt(Integer grossRevenueEvent1Amt) {
    this.grossRevenueEvent1Amt = grossRevenueEvent1Amt;
    return this;
  }

  /**
   * Get grossRevenueEvent1Amt
   * @return grossRevenueEvent1Amt
  */
  @NotNull 
  @Schema(name = "GrossRevenueEvent1Amt", required = true)
  public Integer getGrossRevenueEvent1Amt() {
    return grossRevenueEvent1Amt;
  }

  public void setGrossRevenueEvent1Amt(Integer grossRevenueEvent1Amt) {
    this.grossRevenueEvent1Amt = grossRevenueEvent1Amt;
  }

  public FundraisingEventInformationGrp grossRevenueEvent2Amt(Integer grossRevenueEvent2Amt) {
    this.grossRevenueEvent2Amt = grossRevenueEvent2Amt;
    return this;
  }

  /**
   * Get grossRevenueEvent2Amt
   * @return grossRevenueEvent2Amt
  */
  @NotNull 
  @Schema(name = "GrossRevenueEvent2Amt", required = true)
  public Integer getGrossRevenueEvent2Amt() {
    return grossRevenueEvent2Amt;
  }

  public void setGrossRevenueEvent2Amt(Integer grossRevenueEvent2Amt) {
    this.grossRevenueEvent2Amt = grossRevenueEvent2Amt;
  }

  public FundraisingEventInformationGrp event2Nm(String event2Nm) {
    this.event2Nm = event2Nm;
    return this;
  }

  /**
   * Get event2Nm
   * @return event2Nm
  */
  @NotNull 
  @Schema(name = "Event2Nm", required = true)
  public String getEvent2Nm() {
    return event2Nm;
  }

  public void setEvent2Nm(String event2Nm) {
    this.event2Nm = event2Nm;
  }

  public FundraisingEventInformationGrp event1Nm(String event1Nm) {
    this.event1Nm = event1Nm;
    return this;
  }

  /**
   * Get event1Nm
   * @return event1Nm
  */
  @NotNull 
  @Schema(name = "Event1Nm", required = true)
  public String getEvent1Nm() {
    return event1Nm;
  }

  public void setEvent1Nm(String event1Nm) {
    this.event1Nm = event1Nm;
  }

  public FundraisingEventInformationGrp grossReceiptsOtherEventsAmt(Integer grossReceiptsOtherEventsAmt) {
    this.grossReceiptsOtherEventsAmt = grossReceiptsOtherEventsAmt;
    return this;
  }

  /**
   * Get grossReceiptsOtherEventsAmt
   * @return grossReceiptsOtherEventsAmt
  */
  @NotNull 
  @Schema(name = "GrossReceiptsOtherEventsAmt", required = true)
  public Integer getGrossReceiptsOtherEventsAmt() {
    return grossReceiptsOtherEventsAmt;
  }

  public void setGrossReceiptsOtherEventsAmt(Integer grossReceiptsOtherEventsAmt) {
    this.grossReceiptsOtherEventsAmt = grossReceiptsOtherEventsAmt;
  }

  public FundraisingEventInformationGrp otherEventsTotalCnt(Integer otherEventsTotalCnt) {
    this.otherEventsTotalCnt = otherEventsTotalCnt;
    return this;
  }

  /**
   * Get otherEventsTotalCnt
   * @return otherEventsTotalCnt
  */
  @NotNull 
  @Schema(name = "OtherEventsTotalCnt", required = true)
  public Integer getOtherEventsTotalCnt() {
    return otherEventsTotalCnt;
  }

  public void setOtherEventsTotalCnt(Integer otherEventsTotalCnt) {
    this.otherEventsTotalCnt = otherEventsTotalCnt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundraisingEventInformationGrp fundraisingEventInformationGrp = (FundraisingEventInformationGrp) o;
    return Objects.equals(this.otherDirectExpensesEvent1Amt, fundraisingEventInformationGrp.otherDirectExpensesEvent1Amt) &&
        Objects.equals(this.otherDirectExpensesEvent2Amt, fundraisingEventInformationGrp.otherDirectExpensesEvent2Amt) &&
        Objects.equals(this.grossReceiptsEvent2Amt, fundraisingEventInformationGrp.grossReceiptsEvent2Amt) &&
        Objects.equals(this.grossReceiptsEvent1Amt, fundraisingEventInformationGrp.grossReceiptsEvent1Amt) &&
        Objects.equals(this.grossRevenueTotalEventsAmt, fundraisingEventInformationGrp.grossRevenueTotalEventsAmt) &&
        Objects.equals(this.netIncomeSummaryAmt, fundraisingEventInformationGrp.netIncomeSummaryAmt) &&
        Objects.equals(this.othDirectExpnssOtherEventsAmt, fundraisingEventInformationGrp.othDirectExpnssOtherEventsAmt) &&
        Objects.equals(this.grossReceiptsTotalAmt, fundraisingEventInformationGrp.grossReceiptsTotalAmt) &&
        Objects.equals(this.othDirectExpnssTotalEventsAmt, fundraisingEventInformationGrp.othDirectExpnssTotalEventsAmt) &&
        Objects.equals(this.directExpenseSummaryEventsAmt, fundraisingEventInformationGrp.directExpenseSummaryEventsAmt) &&
        Objects.equals(this.grossRevenueOtherEventsAmt, fundraisingEventInformationGrp.grossRevenueOtherEventsAmt) &&
        Objects.equals(this.grossRevenueEvent1Amt, fundraisingEventInformationGrp.grossRevenueEvent1Amt) &&
        Objects.equals(this.grossRevenueEvent2Amt, fundraisingEventInformationGrp.grossRevenueEvent2Amt) &&
        Objects.equals(this.event2Nm, fundraisingEventInformationGrp.event2Nm) &&
        Objects.equals(this.event1Nm, fundraisingEventInformationGrp.event1Nm) &&
        Objects.equals(this.grossReceiptsOtherEventsAmt, fundraisingEventInformationGrp.grossReceiptsOtherEventsAmt) &&
        Objects.equals(this.otherEventsTotalCnt, fundraisingEventInformationGrp.otherEventsTotalCnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherDirectExpensesEvent1Amt, otherDirectExpensesEvent2Amt, grossReceiptsEvent2Amt, grossReceiptsEvent1Amt, grossRevenueTotalEventsAmt, netIncomeSummaryAmt, othDirectExpnssOtherEventsAmt, grossReceiptsTotalAmt, othDirectExpnssTotalEventsAmt, directExpenseSummaryEventsAmt, grossRevenueOtherEventsAmt, grossRevenueEvent1Amt, grossRevenueEvent2Amt, event2Nm, event1Nm, grossReceiptsOtherEventsAmt, otherEventsTotalCnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundraisingEventInformationGrp {\n");
    sb.append("    otherDirectExpensesEvent1Amt: ").append(toIndentedString(otherDirectExpensesEvent1Amt)).append("\n");
    sb.append("    otherDirectExpensesEvent2Amt: ").append(toIndentedString(otherDirectExpensesEvent2Amt)).append("\n");
    sb.append("    grossReceiptsEvent2Amt: ").append(toIndentedString(grossReceiptsEvent2Amt)).append("\n");
    sb.append("    grossReceiptsEvent1Amt: ").append(toIndentedString(grossReceiptsEvent1Amt)).append("\n");
    sb.append("    grossRevenueTotalEventsAmt: ").append(toIndentedString(grossRevenueTotalEventsAmt)).append("\n");
    sb.append("    netIncomeSummaryAmt: ").append(toIndentedString(netIncomeSummaryAmt)).append("\n");
    sb.append("    othDirectExpnssOtherEventsAmt: ").append(toIndentedString(othDirectExpnssOtherEventsAmt)).append("\n");
    sb.append("    grossReceiptsTotalAmt: ").append(toIndentedString(grossReceiptsTotalAmt)).append("\n");
    sb.append("    othDirectExpnssTotalEventsAmt: ").append(toIndentedString(othDirectExpnssTotalEventsAmt)).append("\n");
    sb.append("    directExpenseSummaryEventsAmt: ").append(toIndentedString(directExpenseSummaryEventsAmt)).append("\n");
    sb.append("    grossRevenueOtherEventsAmt: ").append(toIndentedString(grossRevenueOtherEventsAmt)).append("\n");
    sb.append("    grossRevenueEvent1Amt: ").append(toIndentedString(grossRevenueEvent1Amt)).append("\n");
    sb.append("    grossRevenueEvent2Amt: ").append(toIndentedString(grossRevenueEvent2Amt)).append("\n");
    sb.append("    event2Nm: ").append(toIndentedString(event2Nm)).append("\n");
    sb.append("    event1Nm: ").append(toIndentedString(event1Nm)).append("\n");
    sb.append("    grossReceiptsOtherEventsAmt: ").append(toIndentedString(grossReceiptsOtherEventsAmt)).append("\n");
    sb.append("    otherEventsTotalCnt: ").append(toIndentedString(otherEventsTotalCnt)).append("\n");
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

