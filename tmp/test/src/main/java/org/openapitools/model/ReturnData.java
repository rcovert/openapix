package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.IRS990ScheduleA;
import org.openapitools.model.IRS990ScheduleI;
import org.openapitools.model.Irs990;
import org.openapitools.model.Irs990Schedule;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReturnData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class ReturnData {

  @JsonProperty("IRS990ScheduleO")
  private Irs990Schedule irS990ScheduleO;

  @JsonProperty("IRS990ScheduleA")
  private IRS990ScheduleA irS990ScheduleA;

  @JsonProperty("IRS990ScheduleG")
  private Irs990Schedule irS990ScheduleG;

  @JsonProperty("documentCnt")
  private Integer documentCnt;

  @JsonProperty("IRS990")
  private Irs990 IRS990;

  @JsonProperty("IRS990ScheduleI")
  private IRS990ScheduleI irS990ScheduleI;

  @JsonProperty("IRS990ScheduleB")
  private Irs990Schedule irS990ScheduleB;

  public ReturnData irS990ScheduleO(Irs990Schedule irS990ScheduleO) {
    this.irS990ScheduleO = irS990ScheduleO;
    return this;
  }

  /**
   * Get irS990ScheduleO
   * @return irS990ScheduleO
  */
  @NotNull @Valid 
  @Schema(name = "IRS990ScheduleO", required = true)
  public Irs990Schedule getIrS990ScheduleO() {
    return irS990ScheduleO;
  }

  public void setIrS990ScheduleO(Irs990Schedule irS990ScheduleO) {
    this.irS990ScheduleO = irS990ScheduleO;
  }

  public ReturnData irS990ScheduleA(IRS990ScheduleA irS990ScheduleA) {
    this.irS990ScheduleA = irS990ScheduleA;
    return this;
  }

  /**
   * Get irS990ScheduleA
   * @return irS990ScheduleA
  */
  @NotNull @Valid 
  @Schema(name = "IRS990ScheduleA", required = true)
  public IRS990ScheduleA getIrS990ScheduleA() {
    return irS990ScheduleA;
  }

  public void setIrS990ScheduleA(IRS990ScheduleA irS990ScheduleA) {
    this.irS990ScheduleA = irS990ScheduleA;
  }

  public ReturnData irS990ScheduleG(Irs990Schedule irS990ScheduleG) {
    this.irS990ScheduleG = irS990ScheduleG;
    return this;
  }

  /**
   * Get irS990ScheduleG
   * @return irS990ScheduleG
  */
  @Valid 
  @Schema(name = "IRS990ScheduleG", required = false)
  public Irs990Schedule getIrS990ScheduleG() {
    return irS990ScheduleG;
  }

  public void setIrS990ScheduleG(Irs990Schedule irS990ScheduleG) {
    this.irS990ScheduleG = irS990ScheduleG;
  }

  public ReturnData documentCnt(Integer documentCnt) {
    this.documentCnt = documentCnt;
    return this;
  }

  /**
   * Get documentCnt
   * @return documentCnt
  */
  @NotNull 
  @Schema(name = "documentCnt", required = true)
  public Integer getDocumentCnt() {
    return documentCnt;
  }

  public void setDocumentCnt(Integer documentCnt) {
    this.documentCnt = documentCnt;
  }

  public ReturnData IRS990(Irs990 IRS990) {
    this.IRS990 = IRS990;
    return this;
  }

  /**
   * Get IRS990
   * @return IRS990
  */
  @NotNull @Valid 
  @Schema(name = "IRS990", required = true)
  public Irs990 getIRS990() {
    return IRS990;
  }

  public void setIRS990(Irs990 IRS990) {
    this.IRS990 = IRS990;
  }

  public ReturnData irS990ScheduleI(IRS990ScheduleI irS990ScheduleI) {
    this.irS990ScheduleI = irS990ScheduleI;
    return this;
  }

  /**
   * Get irS990ScheduleI
   * @return irS990ScheduleI
  */
  @Valid 
  @Schema(name = "IRS990ScheduleI", required = false)
  public IRS990ScheduleI getIrS990ScheduleI() {
    return irS990ScheduleI;
  }

  public void setIrS990ScheduleI(IRS990ScheduleI irS990ScheduleI) {
    this.irS990ScheduleI = irS990ScheduleI;
  }

  public ReturnData irS990ScheduleB(Irs990Schedule irS990ScheduleB) {
    this.irS990ScheduleB = irS990ScheduleB;
    return this;
  }

  /**
   * Get irS990ScheduleB
   * @return irS990ScheduleB
  */
  @Valid 
  @Schema(name = "IRS990ScheduleB", required = false)
  public Irs990Schedule getIrS990ScheduleB() {
    return irS990ScheduleB;
  }

  public void setIrS990ScheduleB(Irs990Schedule irS990ScheduleB) {
    this.irS990ScheduleB = irS990ScheduleB;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnData returnData = (ReturnData) o;
    return Objects.equals(this.irS990ScheduleO, returnData.irS990ScheduleO) &&
        Objects.equals(this.irS990ScheduleA, returnData.irS990ScheduleA) &&
        Objects.equals(this.irS990ScheduleG, returnData.irS990ScheduleG) &&
        Objects.equals(this.documentCnt, returnData.documentCnt) &&
        Objects.equals(this.IRS990, returnData.IRS990) &&
        Objects.equals(this.irS990ScheduleI, returnData.irS990ScheduleI) &&
        Objects.equals(this.irS990ScheduleB, returnData.irS990ScheduleB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(irS990ScheduleO, irS990ScheduleA, irS990ScheduleG, documentCnt, IRS990, irS990ScheduleI, irS990ScheduleB);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnData {\n");
    sb.append("    irS990ScheduleO: ").append(toIndentedString(irS990ScheduleO)).append("\n");
    sb.append("    irS990ScheduleA: ").append(toIndentedString(irS990ScheduleA)).append("\n");
    sb.append("    irS990ScheduleG: ").append(toIndentedString(irS990ScheduleG)).append("\n");
    sb.append("    documentCnt: ").append(toIndentedString(documentCnt)).append("\n");
    sb.append("    IRS990: ").append(toIndentedString(IRS990)).append("\n");
    sb.append("    irS990ScheduleI: ").append(toIndentedString(irS990ScheduleI)).append("\n");
    sb.append("    irS990ScheduleB: ").append(toIndentedString(irS990ScheduleB)).append("\n");
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

