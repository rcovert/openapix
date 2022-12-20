package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AcctCompileOrReviewBasisGrp;
import org.openapitools.model.AllOtherExpensesGrpClass;
import org.openapitools.model.BooksInCareOfDetail;
import org.openapitools.model.CapStkTrPrinCurrentFundsGrpClass;
import org.openapitools.model.DescribedInSection501C3IndClass;
import org.openapitools.model.EGrp;
import org.openapitools.model.FeesForServicesManagementGrp;
import org.openapitools.model.Form990PartVIISectionAGrpUnion;
import org.openapitools.model.FundraisingActivitiesIndUnion;
import org.openapitools.model.Name;
import org.openapitools.model.NetIncmFromFundraisingEvtGrp;
import org.openapitools.model.OtherExpensesGrp;
import org.openapitools.model.ProgSrvcAccomActyGrp;
import org.openapitools.model.TotalFunctionalExpensesGrp;
import org.openapitools.model.UsAddress;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Irs990
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
public class Irs990 {

  @JsonProperty("ChangeToOrgDocumentsInd")
  private Boolean changeToOrgDocumentsInd;

  @JsonProperty("ExpenseAmt")
  private Integer expenseAmt;

  @JsonProperty("FundraisingAmt")
  private Integer fundraisingAmt;

  @JsonProperty("TotalAssetsGrp")
  private CapStkTrPrinCurrentFundsGrpClass totalAssetsGrp;

  @JsonProperty("TotalGrossUBIAmt")
  private Integer totalGrossUBIAmt;

  @JsonProperty("ReportLandBuildingEquipmentInd")
  private Boolean reportLandBuildingEquipmentInd;

  @JsonProperty("RelatedEntityInd")
  private Boolean relatedEntityInd;

  @JsonProperty("RelatedOrganizationCtrlEntInd")
  private Boolean relatedOrganizationCtrlEntInd;

  @JsonProperty("MoreThan5000KToIndividualsInd")
  private Boolean moreThan5000KToIndividualsInd;

  @JsonProperty("GrantsToOrganizationsInd")
  private FundraisingActivitiesIndUnion grantsToOrganizationsInd;

  @JsonProperty("WhistleblowerPolicyInd")
  private Boolean whistleblowerPolicyInd;

  @JsonProperty("InvestmentInJointVentureInd")
  private Boolean investmentInJointVentureInd;

  @JsonProperty("UnrelatedBusIncmOverLimitInd")
  private Boolean unrelatedBusIncmOverLimitInd;

  @JsonProperty("PYRevenuesLessExpensesAmt")
  private Integer pyRevenuesLessExpensesAmt;

  @JsonProperty("CashNonInterestBearingGrp")
  private CapStkTrPrinCurrentFundsGrpClass cashNonInterestBearingGrp;

  @JsonProperty("referenceDocumentId")
  private String referenceDocumentId;

  @JsonProperty("VotingMembersGoverningBodyCnt")
  private Integer votingMembersGoverningBodyCnt;

  @JsonProperty("ReportOtherAssetsInd")
  private Boolean reportOtherAssetsInd;

  @JsonProperty("FeesForServicesAccountingGrp")
  private AllOtherExpensesGrpClass feesForServicesAccountingGrp;

  @JsonProperty("CompensationProcessCEOInd")
  private Boolean compensationProcessCEOInd;

  @JsonProperty("SignificantNewProgramSrvcInd")
  private Boolean significantNewProgramSrvcInd;

  @JsonProperty("ScheduleORequiredInd")
  private Boolean scheduleORequiredInd;

  @JsonProperty("OrgDoesNotFollowFASB117Ind")
  private String orgDoesNotFollowFASB117Ind;

  @JsonProperty("ProfessionalFundraisingInd")
  private FundraisingActivitiesIndUnion professionalFundraisingInd;

  @JsonProperty("TotalAssetsBOYAmt")
  private Integer totalAssetsBOYAmt;

  @JsonProperty("OperateHospitalInd")
  private Boolean operateHospitalInd;

  @JsonProperty("NetIncmFromFundraisingEvtGrp")
  private NetIncmFromFundraisingEvtGrp netIncmFromFundraisingEvtGrp;

  @JsonProperty("CYProgramServiceRevenueAmt")
  private Integer cyProgramServiceRevenueAmt;

  @JsonProperty("PYGrantsAndSimilarPaidAmt")
  private Integer pyGrantsAndSimilarPaidAmt;

  @JsonProperty("DisregardedEntityInd")
  private Boolean disregardedEntityInd;

  @JsonProperty("TotalFunctionalExpensesGrp")
  private TotalFunctionalExpensesGrp totalFunctionalExpensesGrp;

  @JsonProperty("TaxablePartyNotificationInd")
  private Boolean taxablePartyNotificationInd;

  @JsonProperty("NondeductibleContributionsInd")
  private Boolean nondeductibleContributionsInd;

  @JsonProperty("ForeignActivitiesInd")
  private Boolean foreignActivitiesInd;

  @JsonProperty("OfficeExpensesGrp")
  private AllOtherExpensesGrpClass officeExpensesGrp;

  @JsonProperty("TotalNetAssetsFundBalanceGrp")
  private CapStkTrPrinCurrentFundsGrpClass totalNetAssetsFundBalanceGrp;

  @JsonProperty("AuditCommitteeInd")
  private Boolean auditCommitteeInd;

  @JsonProperty("softwareVersionNum")
  private String softwareVersionNum;

  @JsonProperty("ForeignFinancialAccountInd")
  private Boolean foreignFinancialAccountInd;

  @JsonProperty("TotalContributionsAmt")
  private Integer totalContributionsAmt;

  @JsonProperty("CYTotalExpensesAmt")
  private Integer cyTotalExpensesAmt;

  @JsonProperty("CYSalariesCompEmpBnftPaidAmt")
  private Integer cySalariesCompEmpBnftPaidAmt;

  @JsonProperty("BusinessRlnWith35CtrlEntInd")
  private Boolean businessRlnWith35CtrlEntInd;

  @JsonProperty("GroupReturnForAffiliatesInd")
  private Boolean groupReturnForAffiliatesInd;

  @JsonProperty("CYOtherExpensesAmt")
  private Integer cyOtherExpensesAmt;

  @JsonProperty("TotalCompGreaterThan150KInd")
  private Boolean totalCompGreaterThan150KInd;

  @JsonProperty("InvestmentIncomeGrp")
  private EGrp investmentIncomeGrp;

  @JsonProperty("ScheduleBRequiredInd")
  private FundraisingActivitiesIndUnion scheduleBRequiredInd;

  @JsonProperty("CYBenefitsPaidToMembersAmt")
  private Integer cyBenefitsPaidToMembersAmt;

  @JsonProperty("TrnsfrExmptNonChrtblRltdOrgInd")
  private Boolean trnsfrExmptNonChrtblRltdOrgInd;

  @JsonProperty("PYExcessBenefitTransInd")
  private Boolean pyExcessBenefitTransInd;

  @JsonProperty("FederalGrantAuditRequiredInd")
  private Boolean federalGrantAuditRequiredInd;

  @JsonProperty("RevenueAmt")
  private Integer revenueAmt;

  @JsonProperty("ProhibitedTaxShelterTransInd")
  private Boolean prohibitedTaxShelterTransInd;

  @JsonProperty("ConservationEasementsInd")
  private Boolean conservationEasementsInd;

  @JsonProperty("EngagedInExcessBenefitTransInd")
  private Boolean engagedInExcessBenefitTransInd;

  @JsonProperty("ActivityOrMissionDesc")
  private String activityOrMissionDesc;

  @JsonProperty("GrantsToIndividualsInd")
  private FundraisingActivitiesIndUnion grantsToIndividualsInd;

  @JsonProperty("EmployeeCnt")
  private Integer employeeCnt;

  @JsonProperty("GrantsToDomesticOrgsGrp")
  private AllOtherExpensesGrpClass grantsToDomesticOrgsGrp;

  @JsonProperty("ProgSrvcAccomActy2Grp")
  private ProgSrvcAccomActyGrp progSrvcAccomActy2Grp;

  @JsonProperty("BusinessRlnWithFamMemInd")
  private Boolean businessRlnWithFamMemInd;

  @JsonProperty("GrossReceiptsAmt")
  private Integer grossReceiptsAmt;

  @JsonProperty("ForeignOfficeInd")
  private Boolean foreignOfficeInd;

  @JsonProperty("PYOtherExpensesAmt")
  private Integer pyOtherExpensesAmt;

  @JsonProperty("CompensationFromOtherSrcsInd")
  private Boolean compensationFromOtherSrcsInd;

  @JsonProperty("InfoInScheduleOPartIXInd")
  private String infoInScheduleOPartIXInd;

  @JsonProperty("TypeOfOrganizationAssocInd")
  private String typeOfOrganizationAssocInd;

  @JsonProperty("PYContributionsGrantsAmt")
  private Integer pyContributionsGrantsAmt;

  @JsonProperty("FormationYr")
  private Integer formationYr;

  @JsonProperty("MaterialDiversionOrMisuseInd")
  private Boolean materialDiversionOrMisuseInd;

  @JsonProperty("AcctCompileOrReviewBasisGrp")
  private AcctCompileOrReviewBasisGrp acctCompileOrReviewBasisGrp;

  @JsonProperty("PYTotalExpensesAmt")
  private Integer pyTotalExpensesAmt;

  @JsonProperty("softwareId")
  private Integer softwareId;

  @JsonProperty("LoanOutstandingInd")
  private Boolean loanOutstandingInd;

  @JsonProperty("DonorRstrOrQuasiEndowmentsInd")
  private Boolean donorRstrOrQuasiEndowmentsInd;

  @JsonProperty("MembersOrStockholdersInd")
  private Boolean membersOrStockholdersInd;

  @JsonProperty("CollectionsOfArtInd")
  private Boolean collectionsOfArtInd;

  @JsonProperty("DeductibleNonCashContriInd")
  private Boolean deductibleNonCashContriInd;

  @JsonProperty("MethodOfAccountingCashInd")
  private String methodOfAccountingCashInd;

  @JsonProperty("VotingMembersIndependentCnt")
  private Integer votingMembersIndependentCnt;

  @JsonProperty("IRPDocumentW2GCnt")
  private Integer irPDocumentW2GCnt;

  @JsonProperty("DecisionsSubjectToApprovaInd")
  private Boolean decisionsSubjectToApprovaInd;

  @JsonProperty("Form990PartVIISectionAGrp")
  private Form990PartVIISectionAGrpUnion form990PartVIISectionAGrp;

  @JsonProperty("MinutesOfGoverningBodyInd")
  private Boolean minutesOfGoverningBodyInd;

  @JsonProperty("StatesWhereCopyOfReturnIsFldCd")
  private String statesWhereCopyOfReturnIsFldCd;

  @JsonProperty("DescribedInSection501c3Ind")
  private DescribedInSection501C3IndClass describedInSection501c3Ind;

  @JsonProperty("TotalLiabilitiesEOYAmt")
  private Integer totalLiabilitiesEOYAmt;

  @JsonProperty("ReportOtherLiabilitiesInd")
  private Boolean reportOtherLiabilitiesInd;

  @JsonProperty("AllOtherContributionsAmt")
  private Integer allOtherContributionsAmt;

  @JsonProperty("ReportInvestmentsOtherSecInd")
  private Boolean reportInvestmentsOtherSecInd;

  @JsonProperty("MinutesOfCommitteesInd")
  private Boolean minutesOfCommitteesInd;

  @JsonProperty("LobbyingActivitiesInd")
  private Boolean lobbyingActivitiesInd;

  @JsonProperty("BusinessRlnWithOrgMemInd")
  private Boolean businessRlnWithOrgMemInd;

  @JsonProperty("IndoorTanningServicesInd")
  private Boolean indoorTanningServicesInd;

  @JsonProperty("Desc")
  private String desc;

  @JsonProperty("PYInvestmentIncomeAmt")
  private Integer pyInvestmentIncomeAmt;

  @JsonProperty("IndependentVotingMemberCnt")
  private Integer independentVotingMemberCnt;

  @JsonProperty("CYRevenuesLessExpensesAmt")
  private Integer cyRevenuesLessExpensesAmt;

  @JsonProperty("SubjectToProxyTaxInd")
  private Boolean subjectToProxyTaxInd;

  @JsonProperty("TerminateOperationsInd")
  private Boolean terminateOperationsInd;

  @JsonProperty("MoreThan5000KToOrgInd")
  private Boolean moreThan5000KToOrgInd;

  @JsonProperty("ConflictOfInterestPolicyInd")
  private Boolean conflictOfInterestPolicyInd;

  @JsonProperty("CompensationProcessOtherInd")
  private Boolean compensationProcessOtherInd;

  @JsonProperty("TotalAssetsEOYAmt")
  private Integer totalAssetsEOYAmt;

  @JsonProperty("FundraisingActivitiesInd")
  private FundraisingActivitiesIndUnion fundraisingActivitiesInd;

  @JsonProperty("TotalRevenueGrp")
  private EGrp totalRevenueGrp;

  @JsonProperty("SchoolOperatingInd")
  private Boolean schoolOperatingInd;

  @JsonProperty("NetAssetsOrFundBalancesEOYAmt")
  private Integer netAssetsOrFundBalancesEOYAmt;

  @JsonProperty("GrantToRelatedPersonInd")
  private Boolean grantToRelatedPersonInd;

  @JsonProperty("WebsiteAddressTxt")
  private String websiteAddressTxt;

  @JsonProperty("NetAssetsOrFundBalancesBOYAmt")
  private Integer netAssetsOrFundBalancesBOYAmt;

  @JsonProperty("CYContributionsGrantsAmt")
  private Integer cyContributionsGrantsAmt;

  @JsonProperty("AllOtherExpensesGrp")
  private AllOtherExpensesGrpClass allOtherExpensesGrp;

  @JsonProperty("FamilyOrBusinessRlnInd")
  private Boolean familyOrBusinessRlnInd;

  @JsonProperty("PrincipalOfficerNm")
  private String principalOfficerNm;

  @JsonProperty("CapStkTrPrinCurrentFundsGrp")
  private CapStkTrPrinCurrentFundsGrpClass capStkTrPrinCurrentFundsGrp;

  @JsonProperty("CYTotalProfFndrsngExpnsAmt")
  private Integer cyTotalProfFndrsngExpnsAmt;

  @JsonProperty("TotLiabNetAssetsFundBalanceGrp")
  private CapStkTrPrinCurrentFundsGrpClass totLiabNetAssetsFundBalanceGrp;

  @JsonProperty("LegalDomicileStateCd")
  private String legalDomicileStateCd;

  @JsonProperty("GamingActivitiesInd")
  private FundraisingActivitiesIndUnion gamingActivitiesInd;

  @JsonProperty("ReconcilationRevenueExpnssAmt")
  private Integer reconcilationRevenueExpnssAmt;

  @JsonProperty("TotalLiabilitiesGrp")
  private CapStkTrPrinCurrentFundsGrpClass totalLiabilitiesGrp;

  @JsonProperty("CYInvestmentIncomeAmt")
  private Integer cyInvestmentIncomeAmt;

  @JsonProperty("InfoInScheduleOPartVIInd")
  private String infoInScheduleOPartVIInd;

  @JsonProperty("PartialLiquidationInd")
  private Boolean partialLiquidationInd;

  @JsonProperty("GoverningBodyVotingMembersCnt")
  private Integer governingBodyVotingMembersCnt;

  @JsonProperty("PYTotalRevenueAmt")
  private Integer pyTotalRevenueAmt;

  @JsonProperty("SignificantChangeInd")
  private Boolean significantChangeInd;

  @JsonProperty("SubjectToExcsTaxNetInvstIncInd")
  private Boolean subjectToExcsTaxNetInvstIncInd;

  @JsonProperty("FormerOfcrEmployeesListedInd")
  private Boolean formerOfcrEmployeesListedInd;

  @JsonProperty("CYGrantsAndSimilarPaidAmt")
  private Integer cyGrantsAndSimilarPaidAmt;

  @JsonProperty("MissionDesc")
  private String missionDesc;

  @JsonProperty("DonorAdvisedFundInd")
  private Boolean donorAdvisedFundInd;

  @JsonProperty("OfficerMailingAddressInd")
  private Boolean officerMailingAddressInd;

  @JsonProperty("NoListedPersonsCompensatedInd")
  private String noListedPersonsCompensatedInd;

  @JsonProperty("FSAuditedInd")
  private Boolean fsAuditedInd;

  @JsonProperty("Organization501c3Ind")
  private String organization501c3Ind;

  @JsonProperty("Form990TFiledInd")
  private Boolean form990TFiledInd;

  @JsonProperty("IRPDocumentCnt")
  private Integer irPDocumentCnt;

  @JsonProperty("SubjToTaxRmnrtnExPrchtPymtInd")
  private Boolean subjToTaxRmnrtnExPrchtPymtInd;

  @JsonProperty("ScheduleJRequiredInd")
  private Boolean scheduleJRequiredInd;

  @JsonProperty("PoliticalCampaignActyInd")
  private Boolean politicalCampaignActyInd;

  @JsonProperty("DelegationOfMgmtDutiesInd")
  private Boolean delegationOfMgmtDutiesInd;

  @JsonProperty("IncludeFIN48FootnoteInd")
  private Boolean includeFIN48FootnoteInd;

  @JsonProperty("BackupWthldComplianceInd")
  private Boolean backupWthldComplianceInd;

  @JsonProperty("DeductibleArtContributionInd")
  private Boolean deductibleArtContributionInd;

  @JsonProperty("BooksInCareOfDetail")
  private BooksInCareOfDetail booksInCareOfDetail;

  @JsonProperty("CYTotalRevenueAmt")
  private Integer cyTotalRevenueAmt;

  @JsonProperty("CYOtherRevenueAmt")
  private Integer cyOtherRevenueAmt;

  @JsonProperty("ReportProgramRelatedInvstInd")
  private Boolean reportProgramRelatedInvstInd;

  @JsonProperty("CreditCounselingInd")
  private Boolean creditCounselingInd;

  @JsonProperty("IndependentAuditFinclStmtInd")
  private Boolean independentAuditFinclStmtInd;

  @JsonProperty("TotalEmployeeCnt")
  private Integer totalEmployeeCnt;

  @JsonProperty("TaxExemptBondsInd")
  private Boolean taxExemptBondsInd;

  @JsonProperty("ActivitiesConductedPrtshpInd")
  private Boolean activitiesConductedPrtshpInd;

  @JsonProperty("TotalProgramServiceExpensesAmt")
  private Integer totalProgramServiceExpensesAmt;

  @JsonProperty("AccountantCompileOrReviewInd")
  private Boolean accountantCompileOrReviewInd;

  @JsonProperty("Form990ProvidedToGvrnBodyInd")
  private Boolean form990ProvidedToGvrnBodyInd;

  @JsonProperty("DocumentRetentionPolicyInd")
  private Boolean documentRetentionPolicyInd;

  @JsonProperty("LocalChaptersInd")
  private Boolean localChaptersInd;

  @JsonProperty("documentId")
  private String documentId;

  @JsonProperty("CYTotalFundraisingExpenseAmt")
  private Integer cyTotalFundraisingExpenseAmt;

  @JsonProperty("ConsolidatedAuditFinclStmtInd")
  private Boolean consolidatedAuditFinclStmtInd;

  @JsonProperty("USAddress")
  private UsAddress usAddress;

  @JsonProperty("ElectionOfBoardMembersInd")
  private Boolean electionOfBoardMembersInd;

  @JsonProperty("ProgSrvcAccomActy3Grp")
  private ProgSrvcAccomActyGrp progSrvcAccomActy3Grp;

  @JsonProperty("PoliciesReferenceChaptersInd")
  private Boolean policiesReferenceChaptersInd;

  @JsonProperty("InfoInScheduleOPartIIIInd")
  private String infoInScheduleOPartIIIInd;

  @JsonProperty("FeesForServicesManagementGrp")
  private FeesForServicesManagementGrp feesForServicesManagementGrp;

  @JsonProperty("InfoInScheduleOPartXIIInd")
  private String infoInScheduleOPartXIIInd;

  @JsonProperty("InfoInScheduleOPartXIInd")
  private String infoInScheduleOPartXIInd;

  @JsonProperty("NoDonorRestrictionNetAssetsGrp")
  private CapStkTrPrinCurrentFundsGrpClass noDonorRestrictionNetAssetsGrp;

  @JsonProperty("InfoInScheduleOPartVIIIInd")
  private String infoInScheduleOPartVIIIInd;

  @JsonProperty("InfoInScheduleOPartXInd")
  private String infoInScheduleOPartXInd;

  @JsonProperty("AnnualDisclosureCoveredPrsnInd")
  private Boolean annualDisclosureCoveredPrsnInd;

  @JsonProperty("OtherExpensesGrp")
  private OtherExpensesGrp otherExpensesGrp;

  @JsonProperty("TypeOfOrganizationCorpInd")
  private String typeOfOrganizationCorpInd;

  @JsonProperty("RegularMonitoringEnfrcInd")
  private Boolean regularMonitoringEnfrcInd;

  @JsonProperty("OrganizationFollowsFASB117Ind")
  private String organizationFollowsFASB117Ind;

  @JsonProperty("PrincipalOfcrBusinessName")
  private Name principalOfcrBusinessName;

  public Irs990 changeToOrgDocumentsInd(Boolean changeToOrgDocumentsInd) {
    this.changeToOrgDocumentsInd = changeToOrgDocumentsInd;
    return this;
  }

  /**
   * Get changeToOrgDocumentsInd
   * @return changeToOrgDocumentsInd
  */
  @NotNull 
  @Schema(name = "ChangeToOrgDocumentsInd", required = true)
  public Boolean getChangeToOrgDocumentsInd() {
    return changeToOrgDocumentsInd;
  }

  public void setChangeToOrgDocumentsInd(Boolean changeToOrgDocumentsInd) {
    this.changeToOrgDocumentsInd = changeToOrgDocumentsInd;
  }

  public Irs990 expenseAmt(Integer expenseAmt) {
    this.expenseAmt = expenseAmt;
    return this;
  }

  /**
   * Get expenseAmt
   * @return expenseAmt
  */
  @NotNull 
  @Schema(name = "ExpenseAmt", required = true)
  public Integer getExpenseAmt() {
    return expenseAmt;
  }

  public void setExpenseAmt(Integer expenseAmt) {
    this.expenseAmt = expenseAmt;
  }

  public Irs990 fundraisingAmt(Integer fundraisingAmt) {
    this.fundraisingAmt = fundraisingAmt;
    return this;
  }

  /**
   * Get fundraisingAmt
   * @return fundraisingAmt
  */
  
  @Schema(name = "FundraisingAmt", required = false)
  public Integer getFundraisingAmt() {
    return fundraisingAmt;
  }

  public void setFundraisingAmt(Integer fundraisingAmt) {
    this.fundraisingAmt = fundraisingAmt;
  }

  public Irs990 totalAssetsGrp(CapStkTrPrinCurrentFundsGrpClass totalAssetsGrp) {
    this.totalAssetsGrp = totalAssetsGrp;
    return this;
  }

  /**
   * Get totalAssetsGrp
   * @return totalAssetsGrp
  */
  @NotNull @Valid 
  @Schema(name = "TotalAssetsGrp", required = true)
  public CapStkTrPrinCurrentFundsGrpClass getTotalAssetsGrp() {
    return totalAssetsGrp;
  }

  public void setTotalAssetsGrp(CapStkTrPrinCurrentFundsGrpClass totalAssetsGrp) {
    this.totalAssetsGrp = totalAssetsGrp;
  }

  public Irs990 totalGrossUBIAmt(Integer totalGrossUBIAmt) {
    this.totalGrossUBIAmt = totalGrossUBIAmt;
    return this;
  }

  /**
   * Get totalGrossUBIAmt
   * @return totalGrossUBIAmt
  */
  @NotNull 
  @Schema(name = "TotalGrossUBIAmt", required = true)
  public Integer getTotalGrossUBIAmt() {
    return totalGrossUBIAmt;
  }

  public void setTotalGrossUBIAmt(Integer totalGrossUBIAmt) {
    this.totalGrossUBIAmt = totalGrossUBIAmt;
  }

  public Irs990 reportLandBuildingEquipmentInd(Boolean reportLandBuildingEquipmentInd) {
    this.reportLandBuildingEquipmentInd = reportLandBuildingEquipmentInd;
    return this;
  }

  /**
   * Get reportLandBuildingEquipmentInd
   * @return reportLandBuildingEquipmentInd
  */
  @NotNull 
  @Schema(name = "ReportLandBuildingEquipmentInd", required = true)
  public Boolean getReportLandBuildingEquipmentInd() {
    return reportLandBuildingEquipmentInd;
  }

  public void setReportLandBuildingEquipmentInd(Boolean reportLandBuildingEquipmentInd) {
    this.reportLandBuildingEquipmentInd = reportLandBuildingEquipmentInd;
  }

  public Irs990 relatedEntityInd(Boolean relatedEntityInd) {
    this.relatedEntityInd = relatedEntityInd;
    return this;
  }

  /**
   * Get relatedEntityInd
   * @return relatedEntityInd
  */
  @NotNull 
  @Schema(name = "RelatedEntityInd", required = true)
  public Boolean getRelatedEntityInd() {
    return relatedEntityInd;
  }

  public void setRelatedEntityInd(Boolean relatedEntityInd) {
    this.relatedEntityInd = relatedEntityInd;
  }

  public Irs990 relatedOrganizationCtrlEntInd(Boolean relatedOrganizationCtrlEntInd) {
    this.relatedOrganizationCtrlEntInd = relatedOrganizationCtrlEntInd;
    return this;
  }

  /**
   * Get relatedOrganizationCtrlEntInd
   * @return relatedOrganizationCtrlEntInd
  */
  @NotNull 
  @Schema(name = "RelatedOrganizationCtrlEntInd", required = true)
  public Boolean getRelatedOrganizationCtrlEntInd() {
    return relatedOrganizationCtrlEntInd;
  }

  public void setRelatedOrganizationCtrlEntInd(Boolean relatedOrganizationCtrlEntInd) {
    this.relatedOrganizationCtrlEntInd = relatedOrganizationCtrlEntInd;
  }

  public Irs990 moreThan5000KToIndividualsInd(Boolean moreThan5000KToIndividualsInd) {
    this.moreThan5000KToIndividualsInd = moreThan5000KToIndividualsInd;
    return this;
  }

  /**
   * Get moreThan5000KToIndividualsInd
   * @return moreThan5000KToIndividualsInd
  */
  @NotNull 
  @Schema(name = "MoreThan5000KToIndividualsInd", required = true)
  public Boolean getMoreThan5000KToIndividualsInd() {
    return moreThan5000KToIndividualsInd;
  }

  public void setMoreThan5000KToIndividualsInd(Boolean moreThan5000KToIndividualsInd) {
    this.moreThan5000KToIndividualsInd = moreThan5000KToIndividualsInd;
  }

  public Irs990 grantsToOrganizationsInd(FundraisingActivitiesIndUnion grantsToOrganizationsInd) {
    this.grantsToOrganizationsInd = grantsToOrganizationsInd;
    return this;
  }

  /**
   * Get grantsToOrganizationsInd
   * @return grantsToOrganizationsInd
  */
  @NotNull @Valid 
  @Schema(name = "GrantsToOrganizationsInd", required = true)
  public FundraisingActivitiesIndUnion getGrantsToOrganizationsInd() {
    return grantsToOrganizationsInd;
  }

  public void setGrantsToOrganizationsInd(FundraisingActivitiesIndUnion grantsToOrganizationsInd) {
    this.grantsToOrganizationsInd = grantsToOrganizationsInd;
  }

  public Irs990 whistleblowerPolicyInd(Boolean whistleblowerPolicyInd) {
    this.whistleblowerPolicyInd = whistleblowerPolicyInd;
    return this;
  }

  /**
   * Get whistleblowerPolicyInd
   * @return whistleblowerPolicyInd
  */
  @NotNull 
  @Schema(name = "WhistleblowerPolicyInd", required = true)
  public Boolean getWhistleblowerPolicyInd() {
    return whistleblowerPolicyInd;
  }

  public void setWhistleblowerPolicyInd(Boolean whistleblowerPolicyInd) {
    this.whistleblowerPolicyInd = whistleblowerPolicyInd;
  }

  public Irs990 investmentInJointVentureInd(Boolean investmentInJointVentureInd) {
    this.investmentInJointVentureInd = investmentInJointVentureInd;
    return this;
  }

  /**
   * Get investmentInJointVentureInd
   * @return investmentInJointVentureInd
  */
  @NotNull 
  @Schema(name = "InvestmentInJointVentureInd", required = true)
  public Boolean getInvestmentInJointVentureInd() {
    return investmentInJointVentureInd;
  }

  public void setInvestmentInJointVentureInd(Boolean investmentInJointVentureInd) {
    this.investmentInJointVentureInd = investmentInJointVentureInd;
  }

  public Irs990 unrelatedBusIncmOverLimitInd(Boolean unrelatedBusIncmOverLimitInd) {
    this.unrelatedBusIncmOverLimitInd = unrelatedBusIncmOverLimitInd;
    return this;
  }

  /**
   * Get unrelatedBusIncmOverLimitInd
   * @return unrelatedBusIncmOverLimitInd
  */
  @NotNull 
  @Schema(name = "UnrelatedBusIncmOverLimitInd", required = true)
  public Boolean getUnrelatedBusIncmOverLimitInd() {
    return unrelatedBusIncmOverLimitInd;
  }

  public void setUnrelatedBusIncmOverLimitInd(Boolean unrelatedBusIncmOverLimitInd) {
    this.unrelatedBusIncmOverLimitInd = unrelatedBusIncmOverLimitInd;
  }

  public Irs990 pyRevenuesLessExpensesAmt(Integer pyRevenuesLessExpensesAmt) {
    this.pyRevenuesLessExpensesAmt = pyRevenuesLessExpensesAmt;
    return this;
  }

  /**
   * Get pyRevenuesLessExpensesAmt
   * @return pyRevenuesLessExpensesAmt
  */
  @NotNull 
  @Schema(name = "PYRevenuesLessExpensesAmt", required = true)
  public Integer getPyRevenuesLessExpensesAmt() {
    return pyRevenuesLessExpensesAmt;
  }

  public void setPyRevenuesLessExpensesAmt(Integer pyRevenuesLessExpensesAmt) {
    this.pyRevenuesLessExpensesAmt = pyRevenuesLessExpensesAmt;
  }

  public Irs990 cashNonInterestBearingGrp(CapStkTrPrinCurrentFundsGrpClass cashNonInterestBearingGrp) {
    this.cashNonInterestBearingGrp = cashNonInterestBearingGrp;
    return this;
  }

  /**
   * Get cashNonInterestBearingGrp
   * @return cashNonInterestBearingGrp
  */
  @NotNull @Valid 
  @Schema(name = "CashNonInterestBearingGrp", required = true)
  public CapStkTrPrinCurrentFundsGrpClass getCashNonInterestBearingGrp() {
    return cashNonInterestBearingGrp;
  }

  public void setCashNonInterestBearingGrp(CapStkTrPrinCurrentFundsGrpClass cashNonInterestBearingGrp) {
    this.cashNonInterestBearingGrp = cashNonInterestBearingGrp;
  }

  public Irs990 referenceDocumentId(String referenceDocumentId) {
    this.referenceDocumentId = referenceDocumentId;
    return this;
  }

  /**
   * Get referenceDocumentId
   * @return referenceDocumentId
  */
  @NotNull 
  @Schema(name = "referenceDocumentId", required = true)
  public String getReferenceDocumentId() {
    return referenceDocumentId;
  }

  public void setReferenceDocumentId(String referenceDocumentId) {
    this.referenceDocumentId = referenceDocumentId;
  }

  public Irs990 votingMembersGoverningBodyCnt(Integer votingMembersGoverningBodyCnt) {
    this.votingMembersGoverningBodyCnt = votingMembersGoverningBodyCnt;
    return this;
  }

  /**
   * Get votingMembersGoverningBodyCnt
   * @return votingMembersGoverningBodyCnt
  */
  @NotNull 
  @Schema(name = "VotingMembersGoverningBodyCnt", required = true)
  public Integer getVotingMembersGoverningBodyCnt() {
    return votingMembersGoverningBodyCnt;
  }

  public void setVotingMembersGoverningBodyCnt(Integer votingMembersGoverningBodyCnt) {
    this.votingMembersGoverningBodyCnt = votingMembersGoverningBodyCnt;
  }

  public Irs990 reportOtherAssetsInd(Boolean reportOtherAssetsInd) {
    this.reportOtherAssetsInd = reportOtherAssetsInd;
    return this;
  }

  /**
   * Get reportOtherAssetsInd
   * @return reportOtherAssetsInd
  */
  @NotNull 
  @Schema(name = "ReportOtherAssetsInd", required = true)
  public Boolean getReportOtherAssetsInd() {
    return reportOtherAssetsInd;
  }

  public void setReportOtherAssetsInd(Boolean reportOtherAssetsInd) {
    this.reportOtherAssetsInd = reportOtherAssetsInd;
  }

  public Irs990 feesForServicesAccountingGrp(AllOtherExpensesGrpClass feesForServicesAccountingGrp) {
    this.feesForServicesAccountingGrp = feesForServicesAccountingGrp;
    return this;
  }

  /**
   * Get feesForServicesAccountingGrp
   * @return feesForServicesAccountingGrp
  */
  @Valid 
  @Schema(name = "FeesForServicesAccountingGrp", required = false)
  public AllOtherExpensesGrpClass getFeesForServicesAccountingGrp() {
    return feesForServicesAccountingGrp;
  }

  public void setFeesForServicesAccountingGrp(AllOtherExpensesGrpClass feesForServicesAccountingGrp) {
    this.feesForServicesAccountingGrp = feesForServicesAccountingGrp;
  }

  public Irs990 compensationProcessCEOInd(Boolean compensationProcessCEOInd) {
    this.compensationProcessCEOInd = compensationProcessCEOInd;
    return this;
  }

  /**
   * Get compensationProcessCEOInd
   * @return compensationProcessCEOInd
  */
  @NotNull 
  @Schema(name = "CompensationProcessCEOInd", required = true)
  public Boolean getCompensationProcessCEOInd() {
    return compensationProcessCEOInd;
  }

  public void setCompensationProcessCEOInd(Boolean compensationProcessCEOInd) {
    this.compensationProcessCEOInd = compensationProcessCEOInd;
  }

  public Irs990 significantNewProgramSrvcInd(Boolean significantNewProgramSrvcInd) {
    this.significantNewProgramSrvcInd = significantNewProgramSrvcInd;
    return this;
  }

  /**
   * Get significantNewProgramSrvcInd
   * @return significantNewProgramSrvcInd
  */
  @NotNull 
  @Schema(name = "SignificantNewProgramSrvcInd", required = true)
  public Boolean getSignificantNewProgramSrvcInd() {
    return significantNewProgramSrvcInd;
  }

  public void setSignificantNewProgramSrvcInd(Boolean significantNewProgramSrvcInd) {
    this.significantNewProgramSrvcInd = significantNewProgramSrvcInd;
  }

  public Irs990 scheduleORequiredInd(Boolean scheduleORequiredInd) {
    this.scheduleORequiredInd = scheduleORequiredInd;
    return this;
  }

  /**
   * Get scheduleORequiredInd
   * @return scheduleORequiredInd
  */
  @NotNull 
  @Schema(name = "ScheduleORequiredInd", required = true)
  public Boolean getScheduleORequiredInd() {
    return scheduleORequiredInd;
  }

  public void setScheduleORequiredInd(Boolean scheduleORequiredInd) {
    this.scheduleORequiredInd = scheduleORequiredInd;
  }

  public Irs990 orgDoesNotFollowFASB117Ind(String orgDoesNotFollowFASB117Ind) {
    this.orgDoesNotFollowFASB117Ind = orgDoesNotFollowFASB117Ind;
    return this;
  }

  /**
   * Get orgDoesNotFollowFASB117Ind
   * @return orgDoesNotFollowFASB117Ind
  */
  
  @Schema(name = "OrgDoesNotFollowFASB117Ind", required = false)
  public String getOrgDoesNotFollowFASB117Ind() {
    return orgDoesNotFollowFASB117Ind;
  }

  public void setOrgDoesNotFollowFASB117Ind(String orgDoesNotFollowFASB117Ind) {
    this.orgDoesNotFollowFASB117Ind = orgDoesNotFollowFASB117Ind;
  }

  public Irs990 professionalFundraisingInd(FundraisingActivitiesIndUnion professionalFundraisingInd) {
    this.professionalFundraisingInd = professionalFundraisingInd;
    return this;
  }

  /**
   * Get professionalFundraisingInd
   * @return professionalFundraisingInd
  */
  @NotNull @Valid 
  @Schema(name = "ProfessionalFundraisingInd", required = true)
  public FundraisingActivitiesIndUnion getProfessionalFundraisingInd() {
    return professionalFundraisingInd;
  }

  public void setProfessionalFundraisingInd(FundraisingActivitiesIndUnion professionalFundraisingInd) {
    this.professionalFundraisingInd = professionalFundraisingInd;
  }

  public Irs990 totalAssetsBOYAmt(Integer totalAssetsBOYAmt) {
    this.totalAssetsBOYAmt = totalAssetsBOYAmt;
    return this;
  }

  /**
   * Get totalAssetsBOYAmt
   * @return totalAssetsBOYAmt
  */
  @NotNull 
  @Schema(name = "TotalAssetsBOYAmt", required = true)
  public Integer getTotalAssetsBOYAmt() {
    return totalAssetsBOYAmt;
  }

  public void setTotalAssetsBOYAmt(Integer totalAssetsBOYAmt) {
    this.totalAssetsBOYAmt = totalAssetsBOYAmt;
  }

  public Irs990 operateHospitalInd(Boolean operateHospitalInd) {
    this.operateHospitalInd = operateHospitalInd;
    return this;
  }

  /**
   * Get operateHospitalInd
   * @return operateHospitalInd
  */
  @NotNull 
  @Schema(name = "OperateHospitalInd", required = true)
  public Boolean getOperateHospitalInd() {
    return operateHospitalInd;
  }

  public void setOperateHospitalInd(Boolean operateHospitalInd) {
    this.operateHospitalInd = operateHospitalInd;
  }

  public Irs990 netIncmFromFundraisingEvtGrp(NetIncmFromFundraisingEvtGrp netIncmFromFundraisingEvtGrp) {
    this.netIncmFromFundraisingEvtGrp = netIncmFromFundraisingEvtGrp;
    return this;
  }

  /**
   * Get netIncmFromFundraisingEvtGrp
   * @return netIncmFromFundraisingEvtGrp
  */
  @NotNull @Valid 
  @Schema(name = "NetIncmFromFundraisingEvtGrp", required = true)
  public NetIncmFromFundraisingEvtGrp getNetIncmFromFundraisingEvtGrp() {
    return netIncmFromFundraisingEvtGrp;
  }

  public void setNetIncmFromFundraisingEvtGrp(NetIncmFromFundraisingEvtGrp netIncmFromFundraisingEvtGrp) {
    this.netIncmFromFundraisingEvtGrp = netIncmFromFundraisingEvtGrp;
  }

  public Irs990 cyProgramServiceRevenueAmt(Integer cyProgramServiceRevenueAmt) {
    this.cyProgramServiceRevenueAmt = cyProgramServiceRevenueAmt;
    return this;
  }

  /**
   * Get cyProgramServiceRevenueAmt
   * @return cyProgramServiceRevenueAmt
  */
  @NotNull 
  @Schema(name = "CYProgramServiceRevenueAmt", required = true)
  public Integer getCyProgramServiceRevenueAmt() {
    return cyProgramServiceRevenueAmt;
  }

  public void setCyProgramServiceRevenueAmt(Integer cyProgramServiceRevenueAmt) {
    this.cyProgramServiceRevenueAmt = cyProgramServiceRevenueAmt;
  }

  public Irs990 pyGrantsAndSimilarPaidAmt(Integer pyGrantsAndSimilarPaidAmt) {
    this.pyGrantsAndSimilarPaidAmt = pyGrantsAndSimilarPaidAmt;
    return this;
  }

  /**
   * Get pyGrantsAndSimilarPaidAmt
   * @return pyGrantsAndSimilarPaidAmt
  */
  
  @Schema(name = "PYGrantsAndSimilarPaidAmt", required = false)
  public Integer getPyGrantsAndSimilarPaidAmt() {
    return pyGrantsAndSimilarPaidAmt;
  }

  public void setPyGrantsAndSimilarPaidAmt(Integer pyGrantsAndSimilarPaidAmt) {
    this.pyGrantsAndSimilarPaidAmt = pyGrantsAndSimilarPaidAmt;
  }

  public Irs990 disregardedEntityInd(Boolean disregardedEntityInd) {
    this.disregardedEntityInd = disregardedEntityInd;
    return this;
  }

  /**
   * Get disregardedEntityInd
   * @return disregardedEntityInd
  */
  @NotNull 
  @Schema(name = "DisregardedEntityInd", required = true)
  public Boolean getDisregardedEntityInd() {
    return disregardedEntityInd;
  }

  public void setDisregardedEntityInd(Boolean disregardedEntityInd) {
    this.disregardedEntityInd = disregardedEntityInd;
  }

  public Irs990 totalFunctionalExpensesGrp(TotalFunctionalExpensesGrp totalFunctionalExpensesGrp) {
    this.totalFunctionalExpensesGrp = totalFunctionalExpensesGrp;
    return this;
  }

  /**
   * Get totalFunctionalExpensesGrp
   * @return totalFunctionalExpensesGrp
  */
  @NotNull @Valid 
  @Schema(name = "TotalFunctionalExpensesGrp", required = true)
  public TotalFunctionalExpensesGrp getTotalFunctionalExpensesGrp() {
    return totalFunctionalExpensesGrp;
  }

  public void setTotalFunctionalExpensesGrp(TotalFunctionalExpensesGrp totalFunctionalExpensesGrp) {
    this.totalFunctionalExpensesGrp = totalFunctionalExpensesGrp;
  }

  public Irs990 taxablePartyNotificationInd(Boolean taxablePartyNotificationInd) {
    this.taxablePartyNotificationInd = taxablePartyNotificationInd;
    return this;
  }

  /**
   * Get taxablePartyNotificationInd
   * @return taxablePartyNotificationInd
  */
  @NotNull 
  @Schema(name = "TaxablePartyNotificationInd", required = true)
  public Boolean getTaxablePartyNotificationInd() {
    return taxablePartyNotificationInd;
  }

  public void setTaxablePartyNotificationInd(Boolean taxablePartyNotificationInd) {
    this.taxablePartyNotificationInd = taxablePartyNotificationInd;
  }

  public Irs990 nondeductibleContributionsInd(Boolean nondeductibleContributionsInd) {
    this.nondeductibleContributionsInd = nondeductibleContributionsInd;
    return this;
  }

  /**
   * Get nondeductibleContributionsInd
   * @return nondeductibleContributionsInd
  */
  @NotNull 
  @Schema(name = "NondeductibleContributionsInd", required = true)
  public Boolean getNondeductibleContributionsInd() {
    return nondeductibleContributionsInd;
  }

  public void setNondeductibleContributionsInd(Boolean nondeductibleContributionsInd) {
    this.nondeductibleContributionsInd = nondeductibleContributionsInd;
  }

  public Irs990 foreignActivitiesInd(Boolean foreignActivitiesInd) {
    this.foreignActivitiesInd = foreignActivitiesInd;
    return this;
  }

  /**
   * Get foreignActivitiesInd
   * @return foreignActivitiesInd
  */
  @NotNull 
  @Schema(name = "ForeignActivitiesInd", required = true)
  public Boolean getForeignActivitiesInd() {
    return foreignActivitiesInd;
  }

  public void setForeignActivitiesInd(Boolean foreignActivitiesInd) {
    this.foreignActivitiesInd = foreignActivitiesInd;
  }

  public Irs990 officeExpensesGrp(AllOtherExpensesGrpClass officeExpensesGrp) {
    this.officeExpensesGrp = officeExpensesGrp;
    return this;
  }

  /**
   * Get officeExpensesGrp
   * @return officeExpensesGrp
  */
  @Valid 
  @Schema(name = "OfficeExpensesGrp", required = false)
  public AllOtherExpensesGrpClass getOfficeExpensesGrp() {
    return officeExpensesGrp;
  }

  public void setOfficeExpensesGrp(AllOtherExpensesGrpClass officeExpensesGrp) {
    this.officeExpensesGrp = officeExpensesGrp;
  }

  public Irs990 totalNetAssetsFundBalanceGrp(CapStkTrPrinCurrentFundsGrpClass totalNetAssetsFundBalanceGrp) {
    this.totalNetAssetsFundBalanceGrp = totalNetAssetsFundBalanceGrp;
    return this;
  }

  /**
   * Get totalNetAssetsFundBalanceGrp
   * @return totalNetAssetsFundBalanceGrp
  */
  @NotNull @Valid 
  @Schema(name = "TotalNetAssetsFundBalanceGrp", required = true)
  public CapStkTrPrinCurrentFundsGrpClass getTotalNetAssetsFundBalanceGrp() {
    return totalNetAssetsFundBalanceGrp;
  }

  public void setTotalNetAssetsFundBalanceGrp(CapStkTrPrinCurrentFundsGrpClass totalNetAssetsFundBalanceGrp) {
    this.totalNetAssetsFundBalanceGrp = totalNetAssetsFundBalanceGrp;
  }

  public Irs990 auditCommitteeInd(Boolean auditCommitteeInd) {
    this.auditCommitteeInd = auditCommitteeInd;
    return this;
  }

  /**
   * Get auditCommitteeInd
   * @return auditCommitteeInd
  */
  
  @Schema(name = "AuditCommitteeInd", required = false)
  public Boolean getAuditCommitteeInd() {
    return auditCommitteeInd;
  }

  public void setAuditCommitteeInd(Boolean auditCommitteeInd) {
    this.auditCommitteeInd = auditCommitteeInd;
  }

  public Irs990 softwareVersionNum(String softwareVersionNum) {
    this.softwareVersionNum = softwareVersionNum;
    return this;
  }

  /**
   * Get softwareVersionNum
   * @return softwareVersionNum
  */
  @NotNull 
  @Schema(name = "softwareVersionNum", required = true)
  public String getSoftwareVersionNum() {
    return softwareVersionNum;
  }

  public void setSoftwareVersionNum(String softwareVersionNum) {
    this.softwareVersionNum = softwareVersionNum;
  }

  public Irs990 foreignFinancialAccountInd(Boolean foreignFinancialAccountInd) {
    this.foreignFinancialAccountInd = foreignFinancialAccountInd;
    return this;
  }

  /**
   * Get foreignFinancialAccountInd
   * @return foreignFinancialAccountInd
  */
  @NotNull 
  @Schema(name = "ForeignFinancialAccountInd", required = true)
  public Boolean getForeignFinancialAccountInd() {
    return foreignFinancialAccountInd;
  }

  public void setForeignFinancialAccountInd(Boolean foreignFinancialAccountInd) {
    this.foreignFinancialAccountInd = foreignFinancialAccountInd;
  }

  public Irs990 totalContributionsAmt(Integer totalContributionsAmt) {
    this.totalContributionsAmt = totalContributionsAmt;
    return this;
  }

  /**
   * Get totalContributionsAmt
   * @return totalContributionsAmt
  */
  @NotNull 
  @Schema(name = "TotalContributionsAmt", required = true)
  public Integer getTotalContributionsAmt() {
    return totalContributionsAmt;
  }

  public void setTotalContributionsAmt(Integer totalContributionsAmt) {
    this.totalContributionsAmt = totalContributionsAmt;
  }

  public Irs990 cyTotalExpensesAmt(Integer cyTotalExpensesAmt) {
    this.cyTotalExpensesAmt = cyTotalExpensesAmt;
    return this;
  }

  /**
   * Get cyTotalExpensesAmt
   * @return cyTotalExpensesAmt
  */
  @NotNull 
  @Schema(name = "CYTotalExpensesAmt", required = true)
  public Integer getCyTotalExpensesAmt() {
    return cyTotalExpensesAmt;
  }

  public void setCyTotalExpensesAmt(Integer cyTotalExpensesAmt) {
    this.cyTotalExpensesAmt = cyTotalExpensesAmt;
  }

  public Irs990 cySalariesCompEmpBnftPaidAmt(Integer cySalariesCompEmpBnftPaidAmt) {
    this.cySalariesCompEmpBnftPaidAmt = cySalariesCompEmpBnftPaidAmt;
    return this;
  }

  /**
   * Get cySalariesCompEmpBnftPaidAmt
   * @return cySalariesCompEmpBnftPaidAmt
  */
  @NotNull 
  @Schema(name = "CYSalariesCompEmpBnftPaidAmt", required = true)
  public Integer getCySalariesCompEmpBnftPaidAmt() {
    return cySalariesCompEmpBnftPaidAmt;
  }

  public void setCySalariesCompEmpBnftPaidAmt(Integer cySalariesCompEmpBnftPaidAmt) {
    this.cySalariesCompEmpBnftPaidAmt = cySalariesCompEmpBnftPaidAmt;
  }

  public Irs990 businessRlnWith35CtrlEntInd(Boolean businessRlnWith35CtrlEntInd) {
    this.businessRlnWith35CtrlEntInd = businessRlnWith35CtrlEntInd;
    return this;
  }

  /**
   * Get businessRlnWith35CtrlEntInd
   * @return businessRlnWith35CtrlEntInd
  */
  @NotNull 
  @Schema(name = "BusinessRlnWith35CtrlEntInd", required = true)
  public Boolean getBusinessRlnWith35CtrlEntInd() {
    return businessRlnWith35CtrlEntInd;
  }

  public void setBusinessRlnWith35CtrlEntInd(Boolean businessRlnWith35CtrlEntInd) {
    this.businessRlnWith35CtrlEntInd = businessRlnWith35CtrlEntInd;
  }

  public Irs990 groupReturnForAffiliatesInd(Boolean groupReturnForAffiliatesInd) {
    this.groupReturnForAffiliatesInd = groupReturnForAffiliatesInd;
    return this;
  }

  /**
   * Get groupReturnForAffiliatesInd
   * @return groupReturnForAffiliatesInd
  */
  @NotNull 
  @Schema(name = "GroupReturnForAffiliatesInd", required = true)
  public Boolean getGroupReturnForAffiliatesInd() {
    return groupReturnForAffiliatesInd;
  }

  public void setGroupReturnForAffiliatesInd(Boolean groupReturnForAffiliatesInd) {
    this.groupReturnForAffiliatesInd = groupReturnForAffiliatesInd;
  }

  public Irs990 cyOtherExpensesAmt(Integer cyOtherExpensesAmt) {
    this.cyOtherExpensesAmt = cyOtherExpensesAmt;
    return this;
  }

  /**
   * Get cyOtherExpensesAmt
   * @return cyOtherExpensesAmt
  */
  @NotNull 
  @Schema(name = "CYOtherExpensesAmt", required = true)
  public Integer getCyOtherExpensesAmt() {
    return cyOtherExpensesAmt;
  }

  public void setCyOtherExpensesAmt(Integer cyOtherExpensesAmt) {
    this.cyOtherExpensesAmt = cyOtherExpensesAmt;
  }

  public Irs990 totalCompGreaterThan150KInd(Boolean totalCompGreaterThan150KInd) {
    this.totalCompGreaterThan150KInd = totalCompGreaterThan150KInd;
    return this;
  }

  /**
   * Get totalCompGreaterThan150KInd
   * @return totalCompGreaterThan150KInd
  */
  @NotNull 
  @Schema(name = "TotalCompGreaterThan150KInd", required = true)
  public Boolean getTotalCompGreaterThan150KInd() {
    return totalCompGreaterThan150KInd;
  }

  public void setTotalCompGreaterThan150KInd(Boolean totalCompGreaterThan150KInd) {
    this.totalCompGreaterThan150KInd = totalCompGreaterThan150KInd;
  }

  public Irs990 investmentIncomeGrp(EGrp investmentIncomeGrp) {
    this.investmentIncomeGrp = investmentIncomeGrp;
    return this;
  }

  /**
   * Get investmentIncomeGrp
   * @return investmentIncomeGrp
  */
  @Valid 
  @Schema(name = "InvestmentIncomeGrp", required = false)
  public EGrp getInvestmentIncomeGrp() {
    return investmentIncomeGrp;
  }

  public void setInvestmentIncomeGrp(EGrp investmentIncomeGrp) {
    this.investmentIncomeGrp = investmentIncomeGrp;
  }

  public Irs990 scheduleBRequiredInd(FundraisingActivitiesIndUnion scheduleBRequiredInd) {
    this.scheduleBRequiredInd = scheduleBRequiredInd;
    return this;
  }

  /**
   * Get scheduleBRequiredInd
   * @return scheduleBRequiredInd
  */
  @NotNull @Valid 
  @Schema(name = "ScheduleBRequiredInd", required = true)
  public FundraisingActivitiesIndUnion getScheduleBRequiredInd() {
    return scheduleBRequiredInd;
  }

  public void setScheduleBRequiredInd(FundraisingActivitiesIndUnion scheduleBRequiredInd) {
    this.scheduleBRequiredInd = scheduleBRequiredInd;
  }

  public Irs990 cyBenefitsPaidToMembersAmt(Integer cyBenefitsPaidToMembersAmt) {
    this.cyBenefitsPaidToMembersAmt = cyBenefitsPaidToMembersAmt;
    return this;
  }

  /**
   * Get cyBenefitsPaidToMembersAmt
   * @return cyBenefitsPaidToMembersAmt
  */
  @NotNull 
  @Schema(name = "CYBenefitsPaidToMembersAmt", required = true)
  public Integer getCyBenefitsPaidToMembersAmt() {
    return cyBenefitsPaidToMembersAmt;
  }

  public void setCyBenefitsPaidToMembersAmt(Integer cyBenefitsPaidToMembersAmt) {
    this.cyBenefitsPaidToMembersAmt = cyBenefitsPaidToMembersAmt;
  }

  public Irs990 trnsfrExmptNonChrtblRltdOrgInd(Boolean trnsfrExmptNonChrtblRltdOrgInd) {
    this.trnsfrExmptNonChrtblRltdOrgInd = trnsfrExmptNonChrtblRltdOrgInd;
    return this;
  }

  /**
   * Get trnsfrExmptNonChrtblRltdOrgInd
   * @return trnsfrExmptNonChrtblRltdOrgInd
  */
  @NotNull 
  @Schema(name = "TrnsfrExmptNonChrtblRltdOrgInd", required = true)
  public Boolean getTrnsfrExmptNonChrtblRltdOrgInd() {
    return trnsfrExmptNonChrtblRltdOrgInd;
  }

  public void setTrnsfrExmptNonChrtblRltdOrgInd(Boolean trnsfrExmptNonChrtblRltdOrgInd) {
    this.trnsfrExmptNonChrtblRltdOrgInd = trnsfrExmptNonChrtblRltdOrgInd;
  }

  public Irs990 pyExcessBenefitTransInd(Boolean pyExcessBenefitTransInd) {
    this.pyExcessBenefitTransInd = pyExcessBenefitTransInd;
    return this;
  }

  /**
   * Get pyExcessBenefitTransInd
   * @return pyExcessBenefitTransInd
  */
  @NotNull 
  @Schema(name = "PYExcessBenefitTransInd", required = true)
  public Boolean getPyExcessBenefitTransInd() {
    return pyExcessBenefitTransInd;
  }

  public void setPyExcessBenefitTransInd(Boolean pyExcessBenefitTransInd) {
    this.pyExcessBenefitTransInd = pyExcessBenefitTransInd;
  }

  public Irs990 federalGrantAuditRequiredInd(Boolean federalGrantAuditRequiredInd) {
    this.federalGrantAuditRequiredInd = federalGrantAuditRequiredInd;
    return this;
  }

  /**
   * Get federalGrantAuditRequiredInd
   * @return federalGrantAuditRequiredInd
  */
  @NotNull 
  @Schema(name = "FederalGrantAuditRequiredInd", required = true)
  public Boolean getFederalGrantAuditRequiredInd() {
    return federalGrantAuditRequiredInd;
  }

  public void setFederalGrantAuditRequiredInd(Boolean federalGrantAuditRequiredInd) {
    this.federalGrantAuditRequiredInd = federalGrantAuditRequiredInd;
  }

  public Irs990 revenueAmt(Integer revenueAmt) {
    this.revenueAmt = revenueAmt;
    return this;
  }

  /**
   * Get revenueAmt
   * @return revenueAmt
  */
  
  @Schema(name = "RevenueAmt", required = false)
  public Integer getRevenueAmt() {
    return revenueAmt;
  }

  public void setRevenueAmt(Integer revenueAmt) {
    this.revenueAmt = revenueAmt;
  }

  public Irs990 prohibitedTaxShelterTransInd(Boolean prohibitedTaxShelterTransInd) {
    this.prohibitedTaxShelterTransInd = prohibitedTaxShelterTransInd;
    return this;
  }

  /**
   * Get prohibitedTaxShelterTransInd
   * @return prohibitedTaxShelterTransInd
  */
  @NotNull 
  @Schema(name = "ProhibitedTaxShelterTransInd", required = true)
  public Boolean getProhibitedTaxShelterTransInd() {
    return prohibitedTaxShelterTransInd;
  }

  public void setProhibitedTaxShelterTransInd(Boolean prohibitedTaxShelterTransInd) {
    this.prohibitedTaxShelterTransInd = prohibitedTaxShelterTransInd;
  }

  public Irs990 conservationEasementsInd(Boolean conservationEasementsInd) {
    this.conservationEasementsInd = conservationEasementsInd;
    return this;
  }

  /**
   * Get conservationEasementsInd
   * @return conservationEasementsInd
  */
  @NotNull 
  @Schema(name = "ConservationEasementsInd", required = true)
  public Boolean getConservationEasementsInd() {
    return conservationEasementsInd;
  }

  public void setConservationEasementsInd(Boolean conservationEasementsInd) {
    this.conservationEasementsInd = conservationEasementsInd;
  }

  public Irs990 engagedInExcessBenefitTransInd(Boolean engagedInExcessBenefitTransInd) {
    this.engagedInExcessBenefitTransInd = engagedInExcessBenefitTransInd;
    return this;
  }

  /**
   * Get engagedInExcessBenefitTransInd
   * @return engagedInExcessBenefitTransInd
  */
  @NotNull 
  @Schema(name = "EngagedInExcessBenefitTransInd", required = true)
  public Boolean getEngagedInExcessBenefitTransInd() {
    return engagedInExcessBenefitTransInd;
  }

  public void setEngagedInExcessBenefitTransInd(Boolean engagedInExcessBenefitTransInd) {
    this.engagedInExcessBenefitTransInd = engagedInExcessBenefitTransInd;
  }

  public Irs990 activityOrMissionDesc(String activityOrMissionDesc) {
    this.activityOrMissionDesc = activityOrMissionDesc;
    return this;
  }

  /**
   * Get activityOrMissionDesc
   * @return activityOrMissionDesc
  */
  @NotNull 
  @Schema(name = "ActivityOrMissionDesc", required = true)
  public String getActivityOrMissionDesc() {
    return activityOrMissionDesc;
  }

  public void setActivityOrMissionDesc(String activityOrMissionDesc) {
    this.activityOrMissionDesc = activityOrMissionDesc;
  }

  public Irs990 grantsToIndividualsInd(FundraisingActivitiesIndUnion grantsToIndividualsInd) {
    this.grantsToIndividualsInd = grantsToIndividualsInd;
    return this;
  }

  /**
   * Get grantsToIndividualsInd
   * @return grantsToIndividualsInd
  */
  @NotNull @Valid 
  @Schema(name = "GrantsToIndividualsInd", required = true)
  public FundraisingActivitiesIndUnion getGrantsToIndividualsInd() {
    return grantsToIndividualsInd;
  }

  public void setGrantsToIndividualsInd(FundraisingActivitiesIndUnion grantsToIndividualsInd) {
    this.grantsToIndividualsInd = grantsToIndividualsInd;
  }

  public Irs990 employeeCnt(Integer employeeCnt) {
    this.employeeCnt = employeeCnt;
    return this;
  }

  /**
   * Get employeeCnt
   * @return employeeCnt
  */
  @NotNull 
  @Schema(name = "EmployeeCnt", required = true)
  public Integer getEmployeeCnt() {
    return employeeCnt;
  }

  public void setEmployeeCnt(Integer employeeCnt) {
    this.employeeCnt = employeeCnt;
  }

  public Irs990 grantsToDomesticOrgsGrp(AllOtherExpensesGrpClass grantsToDomesticOrgsGrp) {
    this.grantsToDomesticOrgsGrp = grantsToDomesticOrgsGrp;
    return this;
  }

  /**
   * Get grantsToDomesticOrgsGrp
   * @return grantsToDomesticOrgsGrp
  */
  @Valid 
  @Schema(name = "GrantsToDomesticOrgsGrp", required = false)
  public AllOtherExpensesGrpClass getGrantsToDomesticOrgsGrp() {
    return grantsToDomesticOrgsGrp;
  }

  public void setGrantsToDomesticOrgsGrp(AllOtherExpensesGrpClass grantsToDomesticOrgsGrp) {
    this.grantsToDomesticOrgsGrp = grantsToDomesticOrgsGrp;
  }

  public Irs990 progSrvcAccomActy2Grp(ProgSrvcAccomActyGrp progSrvcAccomActy2Grp) {
    this.progSrvcAccomActy2Grp = progSrvcAccomActy2Grp;
    return this;
  }

  /**
   * Get progSrvcAccomActy2Grp
   * @return progSrvcAccomActy2Grp
  */
  @Valid 
  @Schema(name = "ProgSrvcAccomActy2Grp", required = false)
  public ProgSrvcAccomActyGrp getProgSrvcAccomActy2Grp() {
    return progSrvcAccomActy2Grp;
  }

  public void setProgSrvcAccomActy2Grp(ProgSrvcAccomActyGrp progSrvcAccomActy2Grp) {
    this.progSrvcAccomActy2Grp = progSrvcAccomActy2Grp;
  }

  public Irs990 businessRlnWithFamMemInd(Boolean businessRlnWithFamMemInd) {
    this.businessRlnWithFamMemInd = businessRlnWithFamMemInd;
    return this;
  }

  /**
   * Get businessRlnWithFamMemInd
   * @return businessRlnWithFamMemInd
  */
  @NotNull 
  @Schema(name = "BusinessRlnWithFamMemInd", required = true)
  public Boolean getBusinessRlnWithFamMemInd() {
    return businessRlnWithFamMemInd;
  }

  public void setBusinessRlnWithFamMemInd(Boolean businessRlnWithFamMemInd) {
    this.businessRlnWithFamMemInd = businessRlnWithFamMemInd;
  }

  public Irs990 grossReceiptsAmt(Integer grossReceiptsAmt) {
    this.grossReceiptsAmt = grossReceiptsAmt;
    return this;
  }

  /**
   * Get grossReceiptsAmt
   * @return grossReceiptsAmt
  */
  @NotNull 
  @Schema(name = "GrossReceiptsAmt", required = true)
  public Integer getGrossReceiptsAmt() {
    return grossReceiptsAmt;
  }

  public void setGrossReceiptsAmt(Integer grossReceiptsAmt) {
    this.grossReceiptsAmt = grossReceiptsAmt;
  }

  public Irs990 foreignOfficeInd(Boolean foreignOfficeInd) {
    this.foreignOfficeInd = foreignOfficeInd;
    return this;
  }

  /**
   * Get foreignOfficeInd
   * @return foreignOfficeInd
  */
  @NotNull 
  @Schema(name = "ForeignOfficeInd", required = true)
  public Boolean getForeignOfficeInd() {
    return foreignOfficeInd;
  }

  public void setForeignOfficeInd(Boolean foreignOfficeInd) {
    this.foreignOfficeInd = foreignOfficeInd;
  }

  public Irs990 pyOtherExpensesAmt(Integer pyOtherExpensesAmt) {
    this.pyOtherExpensesAmt = pyOtherExpensesAmt;
    return this;
  }

  /**
   * Get pyOtherExpensesAmt
   * @return pyOtherExpensesAmt
  */
  @NotNull 
  @Schema(name = "PYOtherExpensesAmt", required = true)
  public Integer getPyOtherExpensesAmt() {
    return pyOtherExpensesAmt;
  }

  public void setPyOtherExpensesAmt(Integer pyOtherExpensesAmt) {
    this.pyOtherExpensesAmt = pyOtherExpensesAmt;
  }

  public Irs990 compensationFromOtherSrcsInd(Boolean compensationFromOtherSrcsInd) {
    this.compensationFromOtherSrcsInd = compensationFromOtherSrcsInd;
    return this;
  }

  /**
   * Get compensationFromOtherSrcsInd
   * @return compensationFromOtherSrcsInd
  */
  @NotNull 
  @Schema(name = "CompensationFromOtherSrcsInd", required = true)
  public Boolean getCompensationFromOtherSrcsInd() {
    return compensationFromOtherSrcsInd;
  }

  public void setCompensationFromOtherSrcsInd(Boolean compensationFromOtherSrcsInd) {
    this.compensationFromOtherSrcsInd = compensationFromOtherSrcsInd;
  }

  public Irs990 infoInScheduleOPartIXInd(String infoInScheduleOPartIXInd) {
    this.infoInScheduleOPartIXInd = infoInScheduleOPartIXInd;
    return this;
  }

  /**
   * Get infoInScheduleOPartIXInd
   * @return infoInScheduleOPartIXInd
  */
  @NotNull 
  @Schema(name = "InfoInScheduleOPartIXInd", required = true)
  public String getInfoInScheduleOPartIXInd() {
    return infoInScheduleOPartIXInd;
  }

  public void setInfoInScheduleOPartIXInd(String infoInScheduleOPartIXInd) {
    this.infoInScheduleOPartIXInd = infoInScheduleOPartIXInd;
  }

  public Irs990 typeOfOrganizationAssocInd(String typeOfOrganizationAssocInd) {
    this.typeOfOrganizationAssocInd = typeOfOrganizationAssocInd;
    return this;
  }

  /**
   * Get typeOfOrganizationAssocInd
   * @return typeOfOrganizationAssocInd
  */
  
  @Schema(name = "TypeOfOrganizationAssocInd", required = false)
  public String getTypeOfOrganizationAssocInd() {
    return typeOfOrganizationAssocInd;
  }

  public void setTypeOfOrganizationAssocInd(String typeOfOrganizationAssocInd) {
    this.typeOfOrganizationAssocInd = typeOfOrganizationAssocInd;
  }

  public Irs990 pyContributionsGrantsAmt(Integer pyContributionsGrantsAmt) {
    this.pyContributionsGrantsAmt = pyContributionsGrantsAmt;
    return this;
  }

  /**
   * Get pyContributionsGrantsAmt
   * @return pyContributionsGrantsAmt
  */
  @NotNull 
  @Schema(name = "PYContributionsGrantsAmt", required = true)
  public Integer getPyContributionsGrantsAmt() {
    return pyContributionsGrantsAmt;
  }

  public void setPyContributionsGrantsAmt(Integer pyContributionsGrantsAmt) {
    this.pyContributionsGrantsAmt = pyContributionsGrantsAmt;
  }

  public Irs990 formationYr(Integer formationYr) {
    this.formationYr = formationYr;
    return this;
  }

  /**
   * Get formationYr
   * @return formationYr
  */
  @NotNull 
  @Schema(name = "FormationYr", required = true)
  public Integer getFormationYr() {
    return formationYr;
  }

  public void setFormationYr(Integer formationYr) {
    this.formationYr = formationYr;
  }

  public Irs990 materialDiversionOrMisuseInd(Boolean materialDiversionOrMisuseInd) {
    this.materialDiversionOrMisuseInd = materialDiversionOrMisuseInd;
    return this;
  }

  /**
   * Get materialDiversionOrMisuseInd
   * @return materialDiversionOrMisuseInd
  */
  @NotNull 
  @Schema(name = "MaterialDiversionOrMisuseInd", required = true)
  public Boolean getMaterialDiversionOrMisuseInd() {
    return materialDiversionOrMisuseInd;
  }

  public void setMaterialDiversionOrMisuseInd(Boolean materialDiversionOrMisuseInd) {
    this.materialDiversionOrMisuseInd = materialDiversionOrMisuseInd;
  }

  public Irs990 acctCompileOrReviewBasisGrp(AcctCompileOrReviewBasisGrp acctCompileOrReviewBasisGrp) {
    this.acctCompileOrReviewBasisGrp = acctCompileOrReviewBasisGrp;
    return this;
  }

  /**
   * Get acctCompileOrReviewBasisGrp
   * @return acctCompileOrReviewBasisGrp
  */
  @Valid 
  @Schema(name = "AcctCompileOrReviewBasisGrp", required = false)
  public AcctCompileOrReviewBasisGrp getAcctCompileOrReviewBasisGrp() {
    return acctCompileOrReviewBasisGrp;
  }

  public void setAcctCompileOrReviewBasisGrp(AcctCompileOrReviewBasisGrp acctCompileOrReviewBasisGrp) {
    this.acctCompileOrReviewBasisGrp = acctCompileOrReviewBasisGrp;
  }

  public Irs990 pyTotalExpensesAmt(Integer pyTotalExpensesAmt) {
    this.pyTotalExpensesAmt = pyTotalExpensesAmt;
    return this;
  }

  /**
   * Get pyTotalExpensesAmt
   * @return pyTotalExpensesAmt
  */
  @NotNull 
  @Schema(name = "PYTotalExpensesAmt", required = true)
  public Integer getPyTotalExpensesAmt() {
    return pyTotalExpensesAmt;
  }

  public void setPyTotalExpensesAmt(Integer pyTotalExpensesAmt) {
    this.pyTotalExpensesAmt = pyTotalExpensesAmt;
  }

  public Irs990 softwareId(Integer softwareId) {
    this.softwareId = softwareId;
    return this;
  }

  /**
   * Get softwareId
   * @return softwareId
  */
  @NotNull 
  @Schema(name = "softwareId", required = true)
  public Integer getSoftwareId() {
    return softwareId;
  }

  public void setSoftwareId(Integer softwareId) {
    this.softwareId = softwareId;
  }

  public Irs990 loanOutstandingInd(Boolean loanOutstandingInd) {
    this.loanOutstandingInd = loanOutstandingInd;
    return this;
  }

  /**
   * Get loanOutstandingInd
   * @return loanOutstandingInd
  */
  @NotNull 
  @Schema(name = "LoanOutstandingInd", required = true)
  public Boolean getLoanOutstandingInd() {
    return loanOutstandingInd;
  }

  public void setLoanOutstandingInd(Boolean loanOutstandingInd) {
    this.loanOutstandingInd = loanOutstandingInd;
  }

  public Irs990 donorRstrOrQuasiEndowmentsInd(Boolean donorRstrOrQuasiEndowmentsInd) {
    this.donorRstrOrQuasiEndowmentsInd = donorRstrOrQuasiEndowmentsInd;
    return this;
  }

  /**
   * Get donorRstrOrQuasiEndowmentsInd
   * @return donorRstrOrQuasiEndowmentsInd
  */
  @NotNull 
  @Schema(name = "DonorRstrOrQuasiEndowmentsInd", required = true)
  public Boolean getDonorRstrOrQuasiEndowmentsInd() {
    return donorRstrOrQuasiEndowmentsInd;
  }

  public void setDonorRstrOrQuasiEndowmentsInd(Boolean donorRstrOrQuasiEndowmentsInd) {
    this.donorRstrOrQuasiEndowmentsInd = donorRstrOrQuasiEndowmentsInd;
  }

  public Irs990 membersOrStockholdersInd(Boolean membersOrStockholdersInd) {
    this.membersOrStockholdersInd = membersOrStockholdersInd;
    return this;
  }

  /**
   * Get membersOrStockholdersInd
   * @return membersOrStockholdersInd
  */
  @NotNull 
  @Schema(name = "MembersOrStockholdersInd", required = true)
  public Boolean getMembersOrStockholdersInd() {
    return membersOrStockholdersInd;
  }

  public void setMembersOrStockholdersInd(Boolean membersOrStockholdersInd) {
    this.membersOrStockholdersInd = membersOrStockholdersInd;
  }

  public Irs990 collectionsOfArtInd(Boolean collectionsOfArtInd) {
    this.collectionsOfArtInd = collectionsOfArtInd;
    return this;
  }

  /**
   * Get collectionsOfArtInd
   * @return collectionsOfArtInd
  */
  @NotNull 
  @Schema(name = "CollectionsOfArtInd", required = true)
  public Boolean getCollectionsOfArtInd() {
    return collectionsOfArtInd;
  }

  public void setCollectionsOfArtInd(Boolean collectionsOfArtInd) {
    this.collectionsOfArtInd = collectionsOfArtInd;
  }

  public Irs990 deductibleNonCashContriInd(Boolean deductibleNonCashContriInd) {
    this.deductibleNonCashContriInd = deductibleNonCashContriInd;
    return this;
  }

  /**
   * Get deductibleNonCashContriInd
   * @return deductibleNonCashContriInd
  */
  @NotNull 
  @Schema(name = "DeductibleNonCashContriInd", required = true)
  public Boolean getDeductibleNonCashContriInd() {
    return deductibleNonCashContriInd;
  }

  public void setDeductibleNonCashContriInd(Boolean deductibleNonCashContriInd) {
    this.deductibleNonCashContriInd = deductibleNonCashContriInd;
  }

  public Irs990 methodOfAccountingCashInd(String methodOfAccountingCashInd) {
    this.methodOfAccountingCashInd = methodOfAccountingCashInd;
    return this;
  }

  /**
   * Get methodOfAccountingCashInd
   * @return methodOfAccountingCashInd
  */
  @NotNull 
  @Schema(name = "MethodOfAccountingCashInd", required = true)
  public String getMethodOfAccountingCashInd() {
    return methodOfAccountingCashInd;
  }

  public void setMethodOfAccountingCashInd(String methodOfAccountingCashInd) {
    this.methodOfAccountingCashInd = methodOfAccountingCashInd;
  }

  public Irs990 votingMembersIndependentCnt(Integer votingMembersIndependentCnt) {
    this.votingMembersIndependentCnt = votingMembersIndependentCnt;
    return this;
  }

  /**
   * Get votingMembersIndependentCnt
   * @return votingMembersIndependentCnt
  */
  @NotNull 
  @Schema(name = "VotingMembersIndependentCnt", required = true)
  public Integer getVotingMembersIndependentCnt() {
    return votingMembersIndependentCnt;
  }

  public void setVotingMembersIndependentCnt(Integer votingMembersIndependentCnt) {
    this.votingMembersIndependentCnt = votingMembersIndependentCnt;
  }

  public Irs990 irPDocumentW2GCnt(Integer irPDocumentW2GCnt) {
    this.irPDocumentW2GCnt = irPDocumentW2GCnt;
    return this;
  }

  /**
   * Get irPDocumentW2GCnt
   * @return irPDocumentW2GCnt
  */
  @NotNull 
  @Schema(name = "IRPDocumentW2GCnt", required = true)
  public Integer getIrPDocumentW2GCnt() {
    return irPDocumentW2GCnt;
  }

  public void setIrPDocumentW2GCnt(Integer irPDocumentW2GCnt) {
    this.irPDocumentW2GCnt = irPDocumentW2GCnt;
  }

  public Irs990 decisionsSubjectToApprovaInd(Boolean decisionsSubjectToApprovaInd) {
    this.decisionsSubjectToApprovaInd = decisionsSubjectToApprovaInd;
    return this;
  }

  /**
   * Get decisionsSubjectToApprovaInd
   * @return decisionsSubjectToApprovaInd
  */
  @NotNull 
  @Schema(name = "DecisionsSubjectToApprovaInd", required = true)
  public Boolean getDecisionsSubjectToApprovaInd() {
    return decisionsSubjectToApprovaInd;
  }

  public void setDecisionsSubjectToApprovaInd(Boolean decisionsSubjectToApprovaInd) {
    this.decisionsSubjectToApprovaInd = decisionsSubjectToApprovaInd;
  }

  public Irs990 form990PartVIISectionAGrp(Form990PartVIISectionAGrpUnion form990PartVIISectionAGrp) {
    this.form990PartVIISectionAGrp = form990PartVIISectionAGrp;
    return this;
  }

  /**
   * Get form990PartVIISectionAGrp
   * @return form990PartVIISectionAGrp
  */
  @NotNull @Valid 
  @Schema(name = "Form990PartVIISectionAGrp", required = true)
  public Form990PartVIISectionAGrpUnion getForm990PartVIISectionAGrp() {
    return form990PartVIISectionAGrp;
  }

  public void setForm990PartVIISectionAGrp(Form990PartVIISectionAGrpUnion form990PartVIISectionAGrp) {
    this.form990PartVIISectionAGrp = form990PartVIISectionAGrp;
  }

  public Irs990 minutesOfGoverningBodyInd(Boolean minutesOfGoverningBodyInd) {
    this.minutesOfGoverningBodyInd = minutesOfGoverningBodyInd;
    return this;
  }

  /**
   * Get minutesOfGoverningBodyInd
   * @return minutesOfGoverningBodyInd
  */
  @NotNull 
  @Schema(name = "MinutesOfGoverningBodyInd", required = true)
  public Boolean getMinutesOfGoverningBodyInd() {
    return minutesOfGoverningBodyInd;
  }

  public void setMinutesOfGoverningBodyInd(Boolean minutesOfGoverningBodyInd) {
    this.minutesOfGoverningBodyInd = minutesOfGoverningBodyInd;
  }

  public Irs990 statesWhereCopyOfReturnIsFldCd(String statesWhereCopyOfReturnIsFldCd) {
    this.statesWhereCopyOfReturnIsFldCd = statesWhereCopyOfReturnIsFldCd;
    return this;
  }

  /**
   * Get statesWhereCopyOfReturnIsFldCd
   * @return statesWhereCopyOfReturnIsFldCd
  */
  @NotNull 
  @Schema(name = "StatesWhereCopyOfReturnIsFldCd", required = true)
  public String getStatesWhereCopyOfReturnIsFldCd() {
    return statesWhereCopyOfReturnIsFldCd;
  }

  public void setStatesWhereCopyOfReturnIsFldCd(String statesWhereCopyOfReturnIsFldCd) {
    this.statesWhereCopyOfReturnIsFldCd = statesWhereCopyOfReturnIsFldCd;
  }

  public Irs990 describedInSection501c3Ind(DescribedInSection501C3IndClass describedInSection501c3Ind) {
    this.describedInSection501c3Ind = describedInSection501c3Ind;
    return this;
  }

  /**
   * Get describedInSection501c3Ind
   * @return describedInSection501c3Ind
  */
  @NotNull @Valid 
  @Schema(name = "DescribedInSection501c3Ind", required = true)
  public DescribedInSection501C3IndClass getDescribedInSection501c3Ind() {
    return describedInSection501c3Ind;
  }

  public void setDescribedInSection501c3Ind(DescribedInSection501C3IndClass describedInSection501c3Ind) {
    this.describedInSection501c3Ind = describedInSection501c3Ind;
  }

  public Irs990 totalLiabilitiesEOYAmt(Integer totalLiabilitiesEOYAmt) {
    this.totalLiabilitiesEOYAmt = totalLiabilitiesEOYAmt;
    return this;
  }

  /**
   * Get totalLiabilitiesEOYAmt
   * @return totalLiabilitiesEOYAmt
  */
  @NotNull 
  @Schema(name = "TotalLiabilitiesEOYAmt", required = true)
  public Integer getTotalLiabilitiesEOYAmt() {
    return totalLiabilitiesEOYAmt;
  }

  public void setTotalLiabilitiesEOYAmt(Integer totalLiabilitiesEOYAmt) {
    this.totalLiabilitiesEOYAmt = totalLiabilitiesEOYAmt;
  }

  public Irs990 reportOtherLiabilitiesInd(Boolean reportOtherLiabilitiesInd) {
    this.reportOtherLiabilitiesInd = reportOtherLiabilitiesInd;
    return this;
  }

  /**
   * Get reportOtherLiabilitiesInd
   * @return reportOtherLiabilitiesInd
  */
  @NotNull 
  @Schema(name = "ReportOtherLiabilitiesInd", required = true)
  public Boolean getReportOtherLiabilitiesInd() {
    return reportOtherLiabilitiesInd;
  }

  public void setReportOtherLiabilitiesInd(Boolean reportOtherLiabilitiesInd) {
    this.reportOtherLiabilitiesInd = reportOtherLiabilitiesInd;
  }

  public Irs990 allOtherContributionsAmt(Integer allOtherContributionsAmt) {
    this.allOtherContributionsAmt = allOtherContributionsAmt;
    return this;
  }

  /**
   * Get allOtherContributionsAmt
   * @return allOtherContributionsAmt
  */
  @NotNull 
  @Schema(name = "AllOtherContributionsAmt", required = true)
  public Integer getAllOtherContributionsAmt() {
    return allOtherContributionsAmt;
  }

  public void setAllOtherContributionsAmt(Integer allOtherContributionsAmt) {
    this.allOtherContributionsAmt = allOtherContributionsAmt;
  }

  public Irs990 reportInvestmentsOtherSecInd(Boolean reportInvestmentsOtherSecInd) {
    this.reportInvestmentsOtherSecInd = reportInvestmentsOtherSecInd;
    return this;
  }

  /**
   * Get reportInvestmentsOtherSecInd
   * @return reportInvestmentsOtherSecInd
  */
  @NotNull 
  @Schema(name = "ReportInvestmentsOtherSecInd", required = true)
  public Boolean getReportInvestmentsOtherSecInd() {
    return reportInvestmentsOtherSecInd;
  }

  public void setReportInvestmentsOtherSecInd(Boolean reportInvestmentsOtherSecInd) {
    this.reportInvestmentsOtherSecInd = reportInvestmentsOtherSecInd;
  }

  public Irs990 minutesOfCommitteesInd(Boolean minutesOfCommitteesInd) {
    this.minutesOfCommitteesInd = minutesOfCommitteesInd;
    return this;
  }

  /**
   * Get minutesOfCommitteesInd
   * @return minutesOfCommitteesInd
  */
  @NotNull 
  @Schema(name = "MinutesOfCommitteesInd", required = true)
  public Boolean getMinutesOfCommitteesInd() {
    return minutesOfCommitteesInd;
  }

  public void setMinutesOfCommitteesInd(Boolean minutesOfCommitteesInd) {
    this.minutesOfCommitteesInd = minutesOfCommitteesInd;
  }

  public Irs990 lobbyingActivitiesInd(Boolean lobbyingActivitiesInd) {
    this.lobbyingActivitiesInd = lobbyingActivitiesInd;
    return this;
  }

  /**
   * Get lobbyingActivitiesInd
   * @return lobbyingActivitiesInd
  */
  @NotNull 
  @Schema(name = "LobbyingActivitiesInd", required = true)
  public Boolean getLobbyingActivitiesInd() {
    return lobbyingActivitiesInd;
  }

  public void setLobbyingActivitiesInd(Boolean lobbyingActivitiesInd) {
    this.lobbyingActivitiesInd = lobbyingActivitiesInd;
  }

  public Irs990 businessRlnWithOrgMemInd(Boolean businessRlnWithOrgMemInd) {
    this.businessRlnWithOrgMemInd = businessRlnWithOrgMemInd;
    return this;
  }

  /**
   * Get businessRlnWithOrgMemInd
   * @return businessRlnWithOrgMemInd
  */
  @NotNull 
  @Schema(name = "BusinessRlnWithOrgMemInd", required = true)
  public Boolean getBusinessRlnWithOrgMemInd() {
    return businessRlnWithOrgMemInd;
  }

  public void setBusinessRlnWithOrgMemInd(Boolean businessRlnWithOrgMemInd) {
    this.businessRlnWithOrgMemInd = businessRlnWithOrgMemInd;
  }

  public Irs990 indoorTanningServicesInd(Boolean indoorTanningServicesInd) {
    this.indoorTanningServicesInd = indoorTanningServicesInd;
    return this;
  }

  /**
   * Get indoorTanningServicesInd
   * @return indoorTanningServicesInd
  */
  @NotNull 
  @Schema(name = "IndoorTanningServicesInd", required = true)
  public Boolean getIndoorTanningServicesInd() {
    return indoorTanningServicesInd;
  }

  public void setIndoorTanningServicesInd(Boolean indoorTanningServicesInd) {
    this.indoorTanningServicesInd = indoorTanningServicesInd;
  }

  public Irs990 desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   * @return desc
  */
  @NotNull 
  @Schema(name = "Desc", required = true)
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Irs990 pyInvestmentIncomeAmt(Integer pyInvestmentIncomeAmt) {
    this.pyInvestmentIncomeAmt = pyInvestmentIncomeAmt;
    return this;
  }

  /**
   * Get pyInvestmentIncomeAmt
   * @return pyInvestmentIncomeAmt
  */
  
  @Schema(name = "PYInvestmentIncomeAmt", required = false)
  public Integer getPyInvestmentIncomeAmt() {
    return pyInvestmentIncomeAmt;
  }

  public void setPyInvestmentIncomeAmt(Integer pyInvestmentIncomeAmt) {
    this.pyInvestmentIncomeAmt = pyInvestmentIncomeAmt;
  }

  public Irs990 independentVotingMemberCnt(Integer independentVotingMemberCnt) {
    this.independentVotingMemberCnt = independentVotingMemberCnt;
    return this;
  }

  /**
   * Get independentVotingMemberCnt
   * @return independentVotingMemberCnt
  */
  @NotNull 
  @Schema(name = "IndependentVotingMemberCnt", required = true)
  public Integer getIndependentVotingMemberCnt() {
    return independentVotingMemberCnt;
  }

  public void setIndependentVotingMemberCnt(Integer independentVotingMemberCnt) {
    this.independentVotingMemberCnt = independentVotingMemberCnt;
  }

  public Irs990 cyRevenuesLessExpensesAmt(Integer cyRevenuesLessExpensesAmt) {
    this.cyRevenuesLessExpensesAmt = cyRevenuesLessExpensesAmt;
    return this;
  }

  /**
   * Get cyRevenuesLessExpensesAmt
   * @return cyRevenuesLessExpensesAmt
  */
  @NotNull 
  @Schema(name = "CYRevenuesLessExpensesAmt", required = true)
  public Integer getCyRevenuesLessExpensesAmt() {
    return cyRevenuesLessExpensesAmt;
  }

  public void setCyRevenuesLessExpensesAmt(Integer cyRevenuesLessExpensesAmt) {
    this.cyRevenuesLessExpensesAmt = cyRevenuesLessExpensesAmt;
  }

  public Irs990 subjectToProxyTaxInd(Boolean subjectToProxyTaxInd) {
    this.subjectToProxyTaxInd = subjectToProxyTaxInd;
    return this;
  }

  /**
   * Get subjectToProxyTaxInd
   * @return subjectToProxyTaxInd
  */
  @NotNull 
  @Schema(name = "SubjectToProxyTaxInd", required = true)
  public Boolean getSubjectToProxyTaxInd() {
    return subjectToProxyTaxInd;
  }

  public void setSubjectToProxyTaxInd(Boolean subjectToProxyTaxInd) {
    this.subjectToProxyTaxInd = subjectToProxyTaxInd;
  }

  public Irs990 terminateOperationsInd(Boolean terminateOperationsInd) {
    this.terminateOperationsInd = terminateOperationsInd;
    return this;
  }

  /**
   * Get terminateOperationsInd
   * @return terminateOperationsInd
  */
  @NotNull 
  @Schema(name = "TerminateOperationsInd", required = true)
  public Boolean getTerminateOperationsInd() {
    return terminateOperationsInd;
  }

  public void setTerminateOperationsInd(Boolean terminateOperationsInd) {
    this.terminateOperationsInd = terminateOperationsInd;
  }

  public Irs990 moreThan5000KToOrgInd(Boolean moreThan5000KToOrgInd) {
    this.moreThan5000KToOrgInd = moreThan5000KToOrgInd;
    return this;
  }

  /**
   * Get moreThan5000KToOrgInd
   * @return moreThan5000KToOrgInd
  */
  @NotNull 
  @Schema(name = "MoreThan5000KToOrgInd", required = true)
  public Boolean getMoreThan5000KToOrgInd() {
    return moreThan5000KToOrgInd;
  }

  public void setMoreThan5000KToOrgInd(Boolean moreThan5000KToOrgInd) {
    this.moreThan5000KToOrgInd = moreThan5000KToOrgInd;
  }

  public Irs990 conflictOfInterestPolicyInd(Boolean conflictOfInterestPolicyInd) {
    this.conflictOfInterestPolicyInd = conflictOfInterestPolicyInd;
    return this;
  }

  /**
   * Get conflictOfInterestPolicyInd
   * @return conflictOfInterestPolicyInd
  */
  @NotNull 
  @Schema(name = "ConflictOfInterestPolicyInd", required = true)
  public Boolean getConflictOfInterestPolicyInd() {
    return conflictOfInterestPolicyInd;
  }

  public void setConflictOfInterestPolicyInd(Boolean conflictOfInterestPolicyInd) {
    this.conflictOfInterestPolicyInd = conflictOfInterestPolicyInd;
  }

  public Irs990 compensationProcessOtherInd(Boolean compensationProcessOtherInd) {
    this.compensationProcessOtherInd = compensationProcessOtherInd;
    return this;
  }

  /**
   * Get compensationProcessOtherInd
   * @return compensationProcessOtherInd
  */
  @NotNull 
  @Schema(name = "CompensationProcessOtherInd", required = true)
  public Boolean getCompensationProcessOtherInd() {
    return compensationProcessOtherInd;
  }

  public void setCompensationProcessOtherInd(Boolean compensationProcessOtherInd) {
    this.compensationProcessOtherInd = compensationProcessOtherInd;
  }

  public Irs990 totalAssetsEOYAmt(Integer totalAssetsEOYAmt) {
    this.totalAssetsEOYAmt = totalAssetsEOYAmt;
    return this;
  }

  /**
   * Get totalAssetsEOYAmt
   * @return totalAssetsEOYAmt
  */
  @NotNull 
  @Schema(name = "TotalAssetsEOYAmt", required = true)
  public Integer getTotalAssetsEOYAmt() {
    return totalAssetsEOYAmt;
  }

  public void setTotalAssetsEOYAmt(Integer totalAssetsEOYAmt) {
    this.totalAssetsEOYAmt = totalAssetsEOYAmt;
  }

  public Irs990 fundraisingActivitiesInd(FundraisingActivitiesIndUnion fundraisingActivitiesInd) {
    this.fundraisingActivitiesInd = fundraisingActivitiesInd;
    return this;
  }

  /**
   * Get fundraisingActivitiesInd
   * @return fundraisingActivitiesInd
  */
  @NotNull @Valid 
  @Schema(name = "FundraisingActivitiesInd", required = true)
  public FundraisingActivitiesIndUnion getFundraisingActivitiesInd() {
    return fundraisingActivitiesInd;
  }

  public void setFundraisingActivitiesInd(FundraisingActivitiesIndUnion fundraisingActivitiesInd) {
    this.fundraisingActivitiesInd = fundraisingActivitiesInd;
  }

  public Irs990 totalRevenueGrp(EGrp totalRevenueGrp) {
    this.totalRevenueGrp = totalRevenueGrp;
    return this;
  }

  /**
   * Get totalRevenueGrp
   * @return totalRevenueGrp
  */
  @NotNull @Valid 
  @Schema(name = "TotalRevenueGrp", required = true)
  public EGrp getTotalRevenueGrp() {
    return totalRevenueGrp;
  }

  public void setTotalRevenueGrp(EGrp totalRevenueGrp) {
    this.totalRevenueGrp = totalRevenueGrp;
  }

  public Irs990 schoolOperatingInd(Boolean schoolOperatingInd) {
    this.schoolOperatingInd = schoolOperatingInd;
    return this;
  }

  /**
   * Get schoolOperatingInd
   * @return schoolOperatingInd
  */
  @NotNull 
  @Schema(name = "SchoolOperatingInd", required = true)
  public Boolean getSchoolOperatingInd() {
    return schoolOperatingInd;
  }

  public void setSchoolOperatingInd(Boolean schoolOperatingInd) {
    this.schoolOperatingInd = schoolOperatingInd;
  }

  public Irs990 netAssetsOrFundBalancesEOYAmt(Integer netAssetsOrFundBalancesEOYAmt) {
    this.netAssetsOrFundBalancesEOYAmt = netAssetsOrFundBalancesEOYAmt;
    return this;
  }

  /**
   * Get netAssetsOrFundBalancesEOYAmt
   * @return netAssetsOrFundBalancesEOYAmt
  */
  @NotNull 
  @Schema(name = "NetAssetsOrFundBalancesEOYAmt", required = true)
  public Integer getNetAssetsOrFundBalancesEOYAmt() {
    return netAssetsOrFundBalancesEOYAmt;
  }

  public void setNetAssetsOrFundBalancesEOYAmt(Integer netAssetsOrFundBalancesEOYAmt) {
    this.netAssetsOrFundBalancesEOYAmt = netAssetsOrFundBalancesEOYAmt;
  }

  public Irs990 grantToRelatedPersonInd(Boolean grantToRelatedPersonInd) {
    this.grantToRelatedPersonInd = grantToRelatedPersonInd;
    return this;
  }

  /**
   * Get grantToRelatedPersonInd
   * @return grantToRelatedPersonInd
  */
  @NotNull 
  @Schema(name = "GrantToRelatedPersonInd", required = true)
  public Boolean getGrantToRelatedPersonInd() {
    return grantToRelatedPersonInd;
  }

  public void setGrantToRelatedPersonInd(Boolean grantToRelatedPersonInd) {
    this.grantToRelatedPersonInd = grantToRelatedPersonInd;
  }

  public Irs990 websiteAddressTxt(String websiteAddressTxt) {
    this.websiteAddressTxt = websiteAddressTxt;
    return this;
  }

  /**
   * Get websiteAddressTxt
   * @return websiteAddressTxt
  */
  @NotNull 
  @Schema(name = "WebsiteAddressTxt", required = true)
  public String getWebsiteAddressTxt() {
    return websiteAddressTxt;
  }

  public void setWebsiteAddressTxt(String websiteAddressTxt) {
    this.websiteAddressTxt = websiteAddressTxt;
  }

  public Irs990 netAssetsOrFundBalancesBOYAmt(Integer netAssetsOrFundBalancesBOYAmt) {
    this.netAssetsOrFundBalancesBOYAmt = netAssetsOrFundBalancesBOYAmt;
    return this;
  }

  /**
   * Get netAssetsOrFundBalancesBOYAmt
   * @return netAssetsOrFundBalancesBOYAmt
  */
  @NotNull 
  @Schema(name = "NetAssetsOrFundBalancesBOYAmt", required = true)
  public Integer getNetAssetsOrFundBalancesBOYAmt() {
    return netAssetsOrFundBalancesBOYAmt;
  }

  public void setNetAssetsOrFundBalancesBOYAmt(Integer netAssetsOrFundBalancesBOYAmt) {
    this.netAssetsOrFundBalancesBOYAmt = netAssetsOrFundBalancesBOYAmt;
  }

  public Irs990 cyContributionsGrantsAmt(Integer cyContributionsGrantsAmt) {
    this.cyContributionsGrantsAmt = cyContributionsGrantsAmt;
    return this;
  }

  /**
   * Get cyContributionsGrantsAmt
   * @return cyContributionsGrantsAmt
  */
  @NotNull 
  @Schema(name = "CYContributionsGrantsAmt", required = true)
  public Integer getCyContributionsGrantsAmt() {
    return cyContributionsGrantsAmt;
  }

  public void setCyContributionsGrantsAmt(Integer cyContributionsGrantsAmt) {
    this.cyContributionsGrantsAmt = cyContributionsGrantsAmt;
  }

  public Irs990 allOtherExpensesGrp(AllOtherExpensesGrpClass allOtherExpensesGrp) {
    this.allOtherExpensesGrp = allOtherExpensesGrp;
    return this;
  }

  /**
   * Get allOtherExpensesGrp
   * @return allOtherExpensesGrp
  */
  @Valid 
  @Schema(name = "AllOtherExpensesGrp", required = false)
  public AllOtherExpensesGrpClass getAllOtherExpensesGrp() {
    return allOtherExpensesGrp;
  }

  public void setAllOtherExpensesGrp(AllOtherExpensesGrpClass allOtherExpensesGrp) {
    this.allOtherExpensesGrp = allOtherExpensesGrp;
  }

  public Irs990 familyOrBusinessRlnInd(Boolean familyOrBusinessRlnInd) {
    this.familyOrBusinessRlnInd = familyOrBusinessRlnInd;
    return this;
  }

  /**
   * Get familyOrBusinessRlnInd
   * @return familyOrBusinessRlnInd
  */
  @NotNull 
  @Schema(name = "FamilyOrBusinessRlnInd", required = true)
  public Boolean getFamilyOrBusinessRlnInd() {
    return familyOrBusinessRlnInd;
  }

  public void setFamilyOrBusinessRlnInd(Boolean familyOrBusinessRlnInd) {
    this.familyOrBusinessRlnInd = familyOrBusinessRlnInd;
  }

  public Irs990 principalOfficerNm(String principalOfficerNm) {
    this.principalOfficerNm = principalOfficerNm;
    return this;
  }

  /**
   * Get principalOfficerNm
   * @return principalOfficerNm
  */
  
  @Schema(name = "PrincipalOfficerNm", required = false)
  public String getPrincipalOfficerNm() {
    return principalOfficerNm;
  }

  public void setPrincipalOfficerNm(String principalOfficerNm) {
    this.principalOfficerNm = principalOfficerNm;
  }

  public Irs990 capStkTrPrinCurrentFundsGrp(CapStkTrPrinCurrentFundsGrpClass capStkTrPrinCurrentFundsGrp) {
    this.capStkTrPrinCurrentFundsGrp = capStkTrPrinCurrentFundsGrp;
    return this;
  }

  /**
   * Get capStkTrPrinCurrentFundsGrp
   * @return capStkTrPrinCurrentFundsGrp
  */
  @Valid 
  @Schema(name = "CapStkTrPrinCurrentFundsGrp", required = false)
  public CapStkTrPrinCurrentFundsGrpClass getCapStkTrPrinCurrentFundsGrp() {
    return capStkTrPrinCurrentFundsGrp;
  }

  public void setCapStkTrPrinCurrentFundsGrp(CapStkTrPrinCurrentFundsGrpClass capStkTrPrinCurrentFundsGrp) {
    this.capStkTrPrinCurrentFundsGrp = capStkTrPrinCurrentFundsGrp;
  }

  public Irs990 cyTotalProfFndrsngExpnsAmt(Integer cyTotalProfFndrsngExpnsAmt) {
    this.cyTotalProfFndrsngExpnsAmt = cyTotalProfFndrsngExpnsAmt;
    return this;
  }

  /**
   * Get cyTotalProfFndrsngExpnsAmt
   * @return cyTotalProfFndrsngExpnsAmt
  */
  @NotNull 
  @Schema(name = "CYTotalProfFndrsngExpnsAmt", required = true)
  public Integer getCyTotalProfFndrsngExpnsAmt() {
    return cyTotalProfFndrsngExpnsAmt;
  }

  public void setCyTotalProfFndrsngExpnsAmt(Integer cyTotalProfFndrsngExpnsAmt) {
    this.cyTotalProfFndrsngExpnsAmt = cyTotalProfFndrsngExpnsAmt;
  }

  public Irs990 totLiabNetAssetsFundBalanceGrp(CapStkTrPrinCurrentFundsGrpClass totLiabNetAssetsFundBalanceGrp) {
    this.totLiabNetAssetsFundBalanceGrp = totLiabNetAssetsFundBalanceGrp;
    return this;
  }

  /**
   * Get totLiabNetAssetsFundBalanceGrp
   * @return totLiabNetAssetsFundBalanceGrp
  */
  @NotNull @Valid 
  @Schema(name = "TotLiabNetAssetsFundBalanceGrp", required = true)
  public CapStkTrPrinCurrentFundsGrpClass getTotLiabNetAssetsFundBalanceGrp() {
    return totLiabNetAssetsFundBalanceGrp;
  }

  public void setTotLiabNetAssetsFundBalanceGrp(CapStkTrPrinCurrentFundsGrpClass totLiabNetAssetsFundBalanceGrp) {
    this.totLiabNetAssetsFundBalanceGrp = totLiabNetAssetsFundBalanceGrp;
  }

  public Irs990 legalDomicileStateCd(String legalDomicileStateCd) {
    this.legalDomicileStateCd = legalDomicileStateCd;
    return this;
  }

  /**
   * Get legalDomicileStateCd
   * @return legalDomicileStateCd
  */
  @NotNull 
  @Schema(name = "LegalDomicileStateCd", required = true)
  public String getLegalDomicileStateCd() {
    return legalDomicileStateCd;
  }

  public void setLegalDomicileStateCd(String legalDomicileStateCd) {
    this.legalDomicileStateCd = legalDomicileStateCd;
  }

  public Irs990 gamingActivitiesInd(FundraisingActivitiesIndUnion gamingActivitiesInd) {
    this.gamingActivitiesInd = gamingActivitiesInd;
    return this;
  }

  /**
   * Get gamingActivitiesInd
   * @return gamingActivitiesInd
  */
  @NotNull @Valid 
  @Schema(name = "GamingActivitiesInd", required = true)
  public FundraisingActivitiesIndUnion getGamingActivitiesInd() {
    return gamingActivitiesInd;
  }

  public void setGamingActivitiesInd(FundraisingActivitiesIndUnion gamingActivitiesInd) {
    this.gamingActivitiesInd = gamingActivitiesInd;
  }

  public Irs990 reconcilationRevenueExpnssAmt(Integer reconcilationRevenueExpnssAmt) {
    this.reconcilationRevenueExpnssAmt = reconcilationRevenueExpnssAmt;
    return this;
  }

  /**
   * Get reconcilationRevenueExpnssAmt
   * @return reconcilationRevenueExpnssAmt
  */
  @NotNull 
  @Schema(name = "ReconcilationRevenueExpnssAmt", required = true)
  public Integer getReconcilationRevenueExpnssAmt() {
    return reconcilationRevenueExpnssAmt;
  }

  public void setReconcilationRevenueExpnssAmt(Integer reconcilationRevenueExpnssAmt) {
    this.reconcilationRevenueExpnssAmt = reconcilationRevenueExpnssAmt;
  }

  public Irs990 totalLiabilitiesGrp(CapStkTrPrinCurrentFundsGrpClass totalLiabilitiesGrp) {
    this.totalLiabilitiesGrp = totalLiabilitiesGrp;
    return this;
  }

  /**
   * Get totalLiabilitiesGrp
   * @return totalLiabilitiesGrp
  */
  @NotNull @Valid 
  @Schema(name = "TotalLiabilitiesGrp", required = true)
  public CapStkTrPrinCurrentFundsGrpClass getTotalLiabilitiesGrp() {
    return totalLiabilitiesGrp;
  }

  public void setTotalLiabilitiesGrp(CapStkTrPrinCurrentFundsGrpClass totalLiabilitiesGrp) {
    this.totalLiabilitiesGrp = totalLiabilitiesGrp;
  }

  public Irs990 cyInvestmentIncomeAmt(Integer cyInvestmentIncomeAmt) {
    this.cyInvestmentIncomeAmt = cyInvestmentIncomeAmt;
    return this;
  }

  /**
   * Get cyInvestmentIncomeAmt
   * @return cyInvestmentIncomeAmt
  */
  @NotNull 
  @Schema(name = "CYInvestmentIncomeAmt", required = true)
  public Integer getCyInvestmentIncomeAmt() {
    return cyInvestmentIncomeAmt;
  }

  public void setCyInvestmentIncomeAmt(Integer cyInvestmentIncomeAmt) {
    this.cyInvestmentIncomeAmt = cyInvestmentIncomeAmt;
  }

  public Irs990 infoInScheduleOPartVIInd(String infoInScheduleOPartVIInd) {
    this.infoInScheduleOPartVIInd = infoInScheduleOPartVIInd;
    return this;
  }

  /**
   * Get infoInScheduleOPartVIInd
   * @return infoInScheduleOPartVIInd
  */
  @NotNull 
  @Schema(name = "InfoInScheduleOPartVIInd", required = true)
  public String getInfoInScheduleOPartVIInd() {
    return infoInScheduleOPartVIInd;
  }

  public void setInfoInScheduleOPartVIInd(String infoInScheduleOPartVIInd) {
    this.infoInScheduleOPartVIInd = infoInScheduleOPartVIInd;
  }

  public Irs990 partialLiquidationInd(Boolean partialLiquidationInd) {
    this.partialLiquidationInd = partialLiquidationInd;
    return this;
  }

  /**
   * Get partialLiquidationInd
   * @return partialLiquidationInd
  */
  @NotNull 
  @Schema(name = "PartialLiquidationInd", required = true)
  public Boolean getPartialLiquidationInd() {
    return partialLiquidationInd;
  }

  public void setPartialLiquidationInd(Boolean partialLiquidationInd) {
    this.partialLiquidationInd = partialLiquidationInd;
  }

  public Irs990 governingBodyVotingMembersCnt(Integer governingBodyVotingMembersCnt) {
    this.governingBodyVotingMembersCnt = governingBodyVotingMembersCnt;
    return this;
  }

  /**
   * Get governingBodyVotingMembersCnt
   * @return governingBodyVotingMembersCnt
  */
  @NotNull 
  @Schema(name = "GoverningBodyVotingMembersCnt", required = true)
  public Integer getGoverningBodyVotingMembersCnt() {
    return governingBodyVotingMembersCnt;
  }

  public void setGoverningBodyVotingMembersCnt(Integer governingBodyVotingMembersCnt) {
    this.governingBodyVotingMembersCnt = governingBodyVotingMembersCnt;
  }

  public Irs990 pyTotalRevenueAmt(Integer pyTotalRevenueAmt) {
    this.pyTotalRevenueAmt = pyTotalRevenueAmt;
    return this;
  }

  /**
   * Get pyTotalRevenueAmt
   * @return pyTotalRevenueAmt
  */
  @NotNull 
  @Schema(name = "PYTotalRevenueAmt", required = true)
  public Integer getPyTotalRevenueAmt() {
    return pyTotalRevenueAmt;
  }

  public void setPyTotalRevenueAmt(Integer pyTotalRevenueAmt) {
    this.pyTotalRevenueAmt = pyTotalRevenueAmt;
  }

  public Irs990 significantChangeInd(Boolean significantChangeInd) {
    this.significantChangeInd = significantChangeInd;
    return this;
  }

  /**
   * Get significantChangeInd
   * @return significantChangeInd
  */
  @NotNull 
  @Schema(name = "SignificantChangeInd", required = true)
  public Boolean getSignificantChangeInd() {
    return significantChangeInd;
  }

  public void setSignificantChangeInd(Boolean significantChangeInd) {
    this.significantChangeInd = significantChangeInd;
  }

  public Irs990 subjectToExcsTaxNetInvstIncInd(Boolean subjectToExcsTaxNetInvstIncInd) {
    this.subjectToExcsTaxNetInvstIncInd = subjectToExcsTaxNetInvstIncInd;
    return this;
  }

  /**
   * Get subjectToExcsTaxNetInvstIncInd
   * @return subjectToExcsTaxNetInvstIncInd
  */
  @NotNull 
  @Schema(name = "SubjectToExcsTaxNetInvstIncInd", required = true)
  public Boolean getSubjectToExcsTaxNetInvstIncInd() {
    return subjectToExcsTaxNetInvstIncInd;
  }

  public void setSubjectToExcsTaxNetInvstIncInd(Boolean subjectToExcsTaxNetInvstIncInd) {
    this.subjectToExcsTaxNetInvstIncInd = subjectToExcsTaxNetInvstIncInd;
  }

  public Irs990 formerOfcrEmployeesListedInd(Boolean formerOfcrEmployeesListedInd) {
    this.formerOfcrEmployeesListedInd = formerOfcrEmployeesListedInd;
    return this;
  }

  /**
   * Get formerOfcrEmployeesListedInd
   * @return formerOfcrEmployeesListedInd
  */
  @NotNull 
  @Schema(name = "FormerOfcrEmployeesListedInd", required = true)
  public Boolean getFormerOfcrEmployeesListedInd() {
    return formerOfcrEmployeesListedInd;
  }

  public void setFormerOfcrEmployeesListedInd(Boolean formerOfcrEmployeesListedInd) {
    this.formerOfcrEmployeesListedInd = formerOfcrEmployeesListedInd;
  }

  public Irs990 cyGrantsAndSimilarPaidAmt(Integer cyGrantsAndSimilarPaidAmt) {
    this.cyGrantsAndSimilarPaidAmt = cyGrantsAndSimilarPaidAmt;
    return this;
  }

  /**
   * Get cyGrantsAndSimilarPaidAmt
   * @return cyGrantsAndSimilarPaidAmt
  */
  @NotNull 
  @Schema(name = "CYGrantsAndSimilarPaidAmt", required = true)
  public Integer getCyGrantsAndSimilarPaidAmt() {
    return cyGrantsAndSimilarPaidAmt;
  }

  public void setCyGrantsAndSimilarPaidAmt(Integer cyGrantsAndSimilarPaidAmt) {
    this.cyGrantsAndSimilarPaidAmt = cyGrantsAndSimilarPaidAmt;
  }

  public Irs990 missionDesc(String missionDesc) {
    this.missionDesc = missionDesc;
    return this;
  }

  /**
   * Get missionDesc
   * @return missionDesc
  */
  @NotNull 
  @Schema(name = "MissionDesc", required = true)
  public String getMissionDesc() {
    return missionDesc;
  }

  public void setMissionDesc(String missionDesc) {
    this.missionDesc = missionDesc;
  }

  public Irs990 donorAdvisedFundInd(Boolean donorAdvisedFundInd) {
    this.donorAdvisedFundInd = donorAdvisedFundInd;
    return this;
  }

  /**
   * Get donorAdvisedFundInd
   * @return donorAdvisedFundInd
  */
  @NotNull 
  @Schema(name = "DonorAdvisedFundInd", required = true)
  public Boolean getDonorAdvisedFundInd() {
    return donorAdvisedFundInd;
  }

  public void setDonorAdvisedFundInd(Boolean donorAdvisedFundInd) {
    this.donorAdvisedFundInd = donorAdvisedFundInd;
  }

  public Irs990 officerMailingAddressInd(Boolean officerMailingAddressInd) {
    this.officerMailingAddressInd = officerMailingAddressInd;
    return this;
  }

  /**
   * Get officerMailingAddressInd
   * @return officerMailingAddressInd
  */
  @NotNull 
  @Schema(name = "OfficerMailingAddressInd", required = true)
  public Boolean getOfficerMailingAddressInd() {
    return officerMailingAddressInd;
  }

  public void setOfficerMailingAddressInd(Boolean officerMailingAddressInd) {
    this.officerMailingAddressInd = officerMailingAddressInd;
  }

  public Irs990 noListedPersonsCompensatedInd(String noListedPersonsCompensatedInd) {
    this.noListedPersonsCompensatedInd = noListedPersonsCompensatedInd;
    return this;
  }

  /**
   * Get noListedPersonsCompensatedInd
   * @return noListedPersonsCompensatedInd
  */
  @NotNull 
  @Schema(name = "NoListedPersonsCompensatedInd", required = true)
  public String getNoListedPersonsCompensatedInd() {
    return noListedPersonsCompensatedInd;
  }

  public void setNoListedPersonsCompensatedInd(String noListedPersonsCompensatedInd) {
    this.noListedPersonsCompensatedInd = noListedPersonsCompensatedInd;
  }

  public Irs990 fsAuditedInd(Boolean fsAuditedInd) {
    this.fsAuditedInd = fsAuditedInd;
    return this;
  }

  /**
   * Get fsAuditedInd
   * @return fsAuditedInd
  */
  @NotNull 
  @Schema(name = "FSAuditedInd", required = true)
  public Boolean getFsAuditedInd() {
    return fsAuditedInd;
  }

  public void setFsAuditedInd(Boolean fsAuditedInd) {
    this.fsAuditedInd = fsAuditedInd;
  }

  public Irs990 organization501c3Ind(String organization501c3Ind) {
    this.organization501c3Ind = organization501c3Ind;
    return this;
  }

  /**
   * Get organization501c3Ind
   * @return organization501c3Ind
  */
  @NotNull 
  @Schema(name = "Organization501c3Ind", required = true)
  public String getOrganization501c3Ind() {
    return organization501c3Ind;
  }

  public void setOrganization501c3Ind(String organization501c3Ind) {
    this.organization501c3Ind = organization501c3Ind;
  }

  public Irs990 form990TFiledInd(Boolean form990TFiledInd) {
    this.form990TFiledInd = form990TFiledInd;
    return this;
  }

  /**
   * Get form990TFiledInd
   * @return form990TFiledInd
  */
  @NotNull 
  @Schema(name = "Form990TFiledInd", required = true)
  public Boolean getForm990TFiledInd() {
    return form990TFiledInd;
  }

  public void setForm990TFiledInd(Boolean form990TFiledInd) {
    this.form990TFiledInd = form990TFiledInd;
  }

  public Irs990 irPDocumentCnt(Integer irPDocumentCnt) {
    this.irPDocumentCnt = irPDocumentCnt;
    return this;
  }

  /**
   * Get irPDocumentCnt
   * @return irPDocumentCnt
  */
  @NotNull 
  @Schema(name = "IRPDocumentCnt", required = true)
  public Integer getIrPDocumentCnt() {
    return irPDocumentCnt;
  }

  public void setIrPDocumentCnt(Integer irPDocumentCnt) {
    this.irPDocumentCnt = irPDocumentCnt;
  }

  public Irs990 subjToTaxRmnrtnExPrchtPymtInd(Boolean subjToTaxRmnrtnExPrchtPymtInd) {
    this.subjToTaxRmnrtnExPrchtPymtInd = subjToTaxRmnrtnExPrchtPymtInd;
    return this;
  }

  /**
   * Get subjToTaxRmnrtnExPrchtPymtInd
   * @return subjToTaxRmnrtnExPrchtPymtInd
  */
  @NotNull 
  @Schema(name = "SubjToTaxRmnrtnExPrchtPymtInd", required = true)
  public Boolean getSubjToTaxRmnrtnExPrchtPymtInd() {
    return subjToTaxRmnrtnExPrchtPymtInd;
  }

  public void setSubjToTaxRmnrtnExPrchtPymtInd(Boolean subjToTaxRmnrtnExPrchtPymtInd) {
    this.subjToTaxRmnrtnExPrchtPymtInd = subjToTaxRmnrtnExPrchtPymtInd;
  }

  public Irs990 scheduleJRequiredInd(Boolean scheduleJRequiredInd) {
    this.scheduleJRequiredInd = scheduleJRequiredInd;
    return this;
  }

  /**
   * Get scheduleJRequiredInd
   * @return scheduleJRequiredInd
  */
  @NotNull 
  @Schema(name = "ScheduleJRequiredInd", required = true)
  public Boolean getScheduleJRequiredInd() {
    return scheduleJRequiredInd;
  }

  public void setScheduleJRequiredInd(Boolean scheduleJRequiredInd) {
    this.scheduleJRequiredInd = scheduleJRequiredInd;
  }

  public Irs990 politicalCampaignActyInd(Boolean politicalCampaignActyInd) {
    this.politicalCampaignActyInd = politicalCampaignActyInd;
    return this;
  }

  /**
   * Get politicalCampaignActyInd
   * @return politicalCampaignActyInd
  */
  @NotNull 
  @Schema(name = "PoliticalCampaignActyInd", required = true)
  public Boolean getPoliticalCampaignActyInd() {
    return politicalCampaignActyInd;
  }

  public void setPoliticalCampaignActyInd(Boolean politicalCampaignActyInd) {
    this.politicalCampaignActyInd = politicalCampaignActyInd;
  }

  public Irs990 delegationOfMgmtDutiesInd(Boolean delegationOfMgmtDutiesInd) {
    this.delegationOfMgmtDutiesInd = delegationOfMgmtDutiesInd;
    return this;
  }

  /**
   * Get delegationOfMgmtDutiesInd
   * @return delegationOfMgmtDutiesInd
  */
  @NotNull 
  @Schema(name = "DelegationOfMgmtDutiesInd", required = true)
  public Boolean getDelegationOfMgmtDutiesInd() {
    return delegationOfMgmtDutiesInd;
  }

  public void setDelegationOfMgmtDutiesInd(Boolean delegationOfMgmtDutiesInd) {
    this.delegationOfMgmtDutiesInd = delegationOfMgmtDutiesInd;
  }

  public Irs990 includeFIN48FootnoteInd(Boolean includeFIN48FootnoteInd) {
    this.includeFIN48FootnoteInd = includeFIN48FootnoteInd;
    return this;
  }

  /**
   * Get includeFIN48FootnoteInd
   * @return includeFIN48FootnoteInd
  */
  @NotNull 
  @Schema(name = "IncludeFIN48FootnoteInd", required = true)
  public Boolean getIncludeFIN48FootnoteInd() {
    return includeFIN48FootnoteInd;
  }

  public void setIncludeFIN48FootnoteInd(Boolean includeFIN48FootnoteInd) {
    this.includeFIN48FootnoteInd = includeFIN48FootnoteInd;
  }

  public Irs990 backupWthldComplianceInd(Boolean backupWthldComplianceInd) {
    this.backupWthldComplianceInd = backupWthldComplianceInd;
    return this;
  }

  /**
   * Get backupWthldComplianceInd
   * @return backupWthldComplianceInd
  */
  @NotNull 
  @Schema(name = "BackupWthldComplianceInd", required = true)
  public Boolean getBackupWthldComplianceInd() {
    return backupWthldComplianceInd;
  }

  public void setBackupWthldComplianceInd(Boolean backupWthldComplianceInd) {
    this.backupWthldComplianceInd = backupWthldComplianceInd;
  }

  public Irs990 deductibleArtContributionInd(Boolean deductibleArtContributionInd) {
    this.deductibleArtContributionInd = deductibleArtContributionInd;
    return this;
  }

  /**
   * Get deductibleArtContributionInd
   * @return deductibleArtContributionInd
  */
  @NotNull 
  @Schema(name = "DeductibleArtContributionInd", required = true)
  public Boolean getDeductibleArtContributionInd() {
    return deductibleArtContributionInd;
  }

  public void setDeductibleArtContributionInd(Boolean deductibleArtContributionInd) {
    this.deductibleArtContributionInd = deductibleArtContributionInd;
  }

  public Irs990 booksInCareOfDetail(BooksInCareOfDetail booksInCareOfDetail) {
    this.booksInCareOfDetail = booksInCareOfDetail;
    return this;
  }

  /**
   * Get booksInCareOfDetail
   * @return booksInCareOfDetail
  */
  @NotNull @Valid 
  @Schema(name = "BooksInCareOfDetail", required = true)
  public BooksInCareOfDetail getBooksInCareOfDetail() {
    return booksInCareOfDetail;
  }

  public void setBooksInCareOfDetail(BooksInCareOfDetail booksInCareOfDetail) {
    this.booksInCareOfDetail = booksInCareOfDetail;
  }

  public Irs990 cyTotalRevenueAmt(Integer cyTotalRevenueAmt) {
    this.cyTotalRevenueAmt = cyTotalRevenueAmt;
    return this;
  }

  /**
   * Get cyTotalRevenueAmt
   * @return cyTotalRevenueAmt
  */
  @NotNull 
  @Schema(name = "CYTotalRevenueAmt", required = true)
  public Integer getCyTotalRevenueAmt() {
    return cyTotalRevenueAmt;
  }

  public void setCyTotalRevenueAmt(Integer cyTotalRevenueAmt) {
    this.cyTotalRevenueAmt = cyTotalRevenueAmt;
  }

  public Irs990 cyOtherRevenueAmt(Integer cyOtherRevenueAmt) {
    this.cyOtherRevenueAmt = cyOtherRevenueAmt;
    return this;
  }

  /**
   * Get cyOtherRevenueAmt
   * @return cyOtherRevenueAmt
  */
  @NotNull 
  @Schema(name = "CYOtherRevenueAmt", required = true)
  public Integer getCyOtherRevenueAmt() {
    return cyOtherRevenueAmt;
  }

  public void setCyOtherRevenueAmt(Integer cyOtherRevenueAmt) {
    this.cyOtherRevenueAmt = cyOtherRevenueAmt;
  }

  public Irs990 reportProgramRelatedInvstInd(Boolean reportProgramRelatedInvstInd) {
    this.reportProgramRelatedInvstInd = reportProgramRelatedInvstInd;
    return this;
  }

  /**
   * Get reportProgramRelatedInvstInd
   * @return reportProgramRelatedInvstInd
  */
  @NotNull 
  @Schema(name = "ReportProgramRelatedInvstInd", required = true)
  public Boolean getReportProgramRelatedInvstInd() {
    return reportProgramRelatedInvstInd;
  }

  public void setReportProgramRelatedInvstInd(Boolean reportProgramRelatedInvstInd) {
    this.reportProgramRelatedInvstInd = reportProgramRelatedInvstInd;
  }

  public Irs990 creditCounselingInd(Boolean creditCounselingInd) {
    this.creditCounselingInd = creditCounselingInd;
    return this;
  }

  /**
   * Get creditCounselingInd
   * @return creditCounselingInd
  */
  @NotNull 
  @Schema(name = "CreditCounselingInd", required = true)
  public Boolean getCreditCounselingInd() {
    return creditCounselingInd;
  }

  public void setCreditCounselingInd(Boolean creditCounselingInd) {
    this.creditCounselingInd = creditCounselingInd;
  }

  public Irs990 independentAuditFinclStmtInd(Boolean independentAuditFinclStmtInd) {
    this.independentAuditFinclStmtInd = independentAuditFinclStmtInd;
    return this;
  }

  /**
   * Get independentAuditFinclStmtInd
   * @return independentAuditFinclStmtInd
  */
  @NotNull 
  @Schema(name = "IndependentAuditFinclStmtInd", required = true)
  public Boolean getIndependentAuditFinclStmtInd() {
    return independentAuditFinclStmtInd;
  }

  public void setIndependentAuditFinclStmtInd(Boolean independentAuditFinclStmtInd) {
    this.independentAuditFinclStmtInd = independentAuditFinclStmtInd;
  }

  public Irs990 totalEmployeeCnt(Integer totalEmployeeCnt) {
    this.totalEmployeeCnt = totalEmployeeCnt;
    return this;
  }

  /**
   * Get totalEmployeeCnt
   * @return totalEmployeeCnt
  */
  @NotNull 
  @Schema(name = "TotalEmployeeCnt", required = true)
  public Integer getTotalEmployeeCnt() {
    return totalEmployeeCnt;
  }

  public void setTotalEmployeeCnt(Integer totalEmployeeCnt) {
    this.totalEmployeeCnt = totalEmployeeCnt;
  }

  public Irs990 taxExemptBondsInd(Boolean taxExemptBondsInd) {
    this.taxExemptBondsInd = taxExemptBondsInd;
    return this;
  }

  /**
   * Get taxExemptBondsInd
   * @return taxExemptBondsInd
  */
  @NotNull 
  @Schema(name = "TaxExemptBondsInd", required = true)
  public Boolean getTaxExemptBondsInd() {
    return taxExemptBondsInd;
  }

  public void setTaxExemptBondsInd(Boolean taxExemptBondsInd) {
    this.taxExemptBondsInd = taxExemptBondsInd;
  }

  public Irs990 activitiesConductedPrtshpInd(Boolean activitiesConductedPrtshpInd) {
    this.activitiesConductedPrtshpInd = activitiesConductedPrtshpInd;
    return this;
  }

  /**
   * Get activitiesConductedPrtshpInd
   * @return activitiesConductedPrtshpInd
  */
  @NotNull 
  @Schema(name = "ActivitiesConductedPrtshpInd", required = true)
  public Boolean getActivitiesConductedPrtshpInd() {
    return activitiesConductedPrtshpInd;
  }

  public void setActivitiesConductedPrtshpInd(Boolean activitiesConductedPrtshpInd) {
    this.activitiesConductedPrtshpInd = activitiesConductedPrtshpInd;
  }

  public Irs990 totalProgramServiceExpensesAmt(Integer totalProgramServiceExpensesAmt) {
    this.totalProgramServiceExpensesAmt = totalProgramServiceExpensesAmt;
    return this;
  }

  /**
   * Get totalProgramServiceExpensesAmt
   * @return totalProgramServiceExpensesAmt
  */
  @NotNull 
  @Schema(name = "TotalProgramServiceExpensesAmt", required = true)
  public Integer getTotalProgramServiceExpensesAmt() {
    return totalProgramServiceExpensesAmt;
  }

  public void setTotalProgramServiceExpensesAmt(Integer totalProgramServiceExpensesAmt) {
    this.totalProgramServiceExpensesAmt = totalProgramServiceExpensesAmt;
  }

  public Irs990 accountantCompileOrReviewInd(Boolean accountantCompileOrReviewInd) {
    this.accountantCompileOrReviewInd = accountantCompileOrReviewInd;
    return this;
  }

  /**
   * Get accountantCompileOrReviewInd
   * @return accountantCompileOrReviewInd
  */
  @NotNull 
  @Schema(name = "AccountantCompileOrReviewInd", required = true)
  public Boolean getAccountantCompileOrReviewInd() {
    return accountantCompileOrReviewInd;
  }

  public void setAccountantCompileOrReviewInd(Boolean accountantCompileOrReviewInd) {
    this.accountantCompileOrReviewInd = accountantCompileOrReviewInd;
  }

  public Irs990 form990ProvidedToGvrnBodyInd(Boolean form990ProvidedToGvrnBodyInd) {
    this.form990ProvidedToGvrnBodyInd = form990ProvidedToGvrnBodyInd;
    return this;
  }

  /**
   * Get form990ProvidedToGvrnBodyInd
   * @return form990ProvidedToGvrnBodyInd
  */
  @NotNull 
  @Schema(name = "Form990ProvidedToGvrnBodyInd", required = true)
  public Boolean getForm990ProvidedToGvrnBodyInd() {
    return form990ProvidedToGvrnBodyInd;
  }

  public void setForm990ProvidedToGvrnBodyInd(Boolean form990ProvidedToGvrnBodyInd) {
    this.form990ProvidedToGvrnBodyInd = form990ProvidedToGvrnBodyInd;
  }

  public Irs990 documentRetentionPolicyInd(Boolean documentRetentionPolicyInd) {
    this.documentRetentionPolicyInd = documentRetentionPolicyInd;
    return this;
  }

  /**
   * Get documentRetentionPolicyInd
   * @return documentRetentionPolicyInd
  */
  @NotNull 
  @Schema(name = "DocumentRetentionPolicyInd", required = true)
  public Boolean getDocumentRetentionPolicyInd() {
    return documentRetentionPolicyInd;
  }

  public void setDocumentRetentionPolicyInd(Boolean documentRetentionPolicyInd) {
    this.documentRetentionPolicyInd = documentRetentionPolicyInd;
  }

  public Irs990 localChaptersInd(Boolean localChaptersInd) {
    this.localChaptersInd = localChaptersInd;
    return this;
  }

  /**
   * Get localChaptersInd
   * @return localChaptersInd
  */
  @NotNull 
  @Schema(name = "LocalChaptersInd", required = true)
  public Boolean getLocalChaptersInd() {
    return localChaptersInd;
  }

  public void setLocalChaptersInd(Boolean localChaptersInd) {
    this.localChaptersInd = localChaptersInd;
  }

  public Irs990 documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId
   * @return documentId
  */
  @NotNull 
  @Schema(name = "documentId", required = true)
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Irs990 cyTotalFundraisingExpenseAmt(Integer cyTotalFundraisingExpenseAmt) {
    this.cyTotalFundraisingExpenseAmt = cyTotalFundraisingExpenseAmt;
    return this;
  }

  /**
   * Get cyTotalFundraisingExpenseAmt
   * @return cyTotalFundraisingExpenseAmt
  */
  @NotNull 
  @Schema(name = "CYTotalFundraisingExpenseAmt", required = true)
  public Integer getCyTotalFundraisingExpenseAmt() {
    return cyTotalFundraisingExpenseAmt;
  }

  public void setCyTotalFundraisingExpenseAmt(Integer cyTotalFundraisingExpenseAmt) {
    this.cyTotalFundraisingExpenseAmt = cyTotalFundraisingExpenseAmt;
  }

  public Irs990 consolidatedAuditFinclStmtInd(Boolean consolidatedAuditFinclStmtInd) {
    this.consolidatedAuditFinclStmtInd = consolidatedAuditFinclStmtInd;
    return this;
  }

  /**
   * Get consolidatedAuditFinclStmtInd
   * @return consolidatedAuditFinclStmtInd
  */
  @NotNull 
  @Schema(name = "ConsolidatedAuditFinclStmtInd", required = true)
  public Boolean getConsolidatedAuditFinclStmtInd() {
    return consolidatedAuditFinclStmtInd;
  }

  public void setConsolidatedAuditFinclStmtInd(Boolean consolidatedAuditFinclStmtInd) {
    this.consolidatedAuditFinclStmtInd = consolidatedAuditFinclStmtInd;
  }

  public Irs990 usAddress(UsAddress usAddress) {
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

  public Irs990 electionOfBoardMembersInd(Boolean electionOfBoardMembersInd) {
    this.electionOfBoardMembersInd = electionOfBoardMembersInd;
    return this;
  }

  /**
   * Get electionOfBoardMembersInd
   * @return electionOfBoardMembersInd
  */
  @NotNull 
  @Schema(name = "ElectionOfBoardMembersInd", required = true)
  public Boolean getElectionOfBoardMembersInd() {
    return electionOfBoardMembersInd;
  }

  public void setElectionOfBoardMembersInd(Boolean electionOfBoardMembersInd) {
    this.electionOfBoardMembersInd = electionOfBoardMembersInd;
  }

  public Irs990 progSrvcAccomActy3Grp(ProgSrvcAccomActyGrp progSrvcAccomActy3Grp) {
    this.progSrvcAccomActy3Grp = progSrvcAccomActy3Grp;
    return this;
  }

  /**
   * Get progSrvcAccomActy3Grp
   * @return progSrvcAccomActy3Grp
  */
  @Valid 
  @Schema(name = "ProgSrvcAccomActy3Grp", required = false)
  public ProgSrvcAccomActyGrp getProgSrvcAccomActy3Grp() {
    return progSrvcAccomActy3Grp;
  }

  public void setProgSrvcAccomActy3Grp(ProgSrvcAccomActyGrp progSrvcAccomActy3Grp) {
    this.progSrvcAccomActy3Grp = progSrvcAccomActy3Grp;
  }

  public Irs990 policiesReferenceChaptersInd(Boolean policiesReferenceChaptersInd) {
    this.policiesReferenceChaptersInd = policiesReferenceChaptersInd;
    return this;
  }

  /**
   * Get policiesReferenceChaptersInd
   * @return policiesReferenceChaptersInd
  */
  
  @Schema(name = "PoliciesReferenceChaptersInd", required = false)
  public Boolean getPoliciesReferenceChaptersInd() {
    return policiesReferenceChaptersInd;
  }

  public void setPoliciesReferenceChaptersInd(Boolean policiesReferenceChaptersInd) {
    this.policiesReferenceChaptersInd = policiesReferenceChaptersInd;
  }

  public Irs990 infoInScheduleOPartIIIInd(String infoInScheduleOPartIIIInd) {
    this.infoInScheduleOPartIIIInd = infoInScheduleOPartIIIInd;
    return this;
  }

  /**
   * Get infoInScheduleOPartIIIInd
   * @return infoInScheduleOPartIIIInd
  */
  
  @Schema(name = "InfoInScheduleOPartIIIInd", required = false)
  public String getInfoInScheduleOPartIIIInd() {
    return infoInScheduleOPartIIIInd;
  }

  public void setInfoInScheduleOPartIIIInd(String infoInScheduleOPartIIIInd) {
    this.infoInScheduleOPartIIIInd = infoInScheduleOPartIIIInd;
  }

  public Irs990 feesForServicesManagementGrp(FeesForServicesManagementGrp feesForServicesManagementGrp) {
    this.feesForServicesManagementGrp = feesForServicesManagementGrp;
    return this;
  }

  /**
   * Get feesForServicesManagementGrp
   * @return feesForServicesManagementGrp
  */
  @Valid 
  @Schema(name = "FeesForServicesManagementGrp", required = false)
  public FeesForServicesManagementGrp getFeesForServicesManagementGrp() {
    return feesForServicesManagementGrp;
  }

  public void setFeesForServicesManagementGrp(FeesForServicesManagementGrp feesForServicesManagementGrp) {
    this.feesForServicesManagementGrp = feesForServicesManagementGrp;
  }

  public Irs990 infoInScheduleOPartXIIInd(String infoInScheduleOPartXIIInd) {
    this.infoInScheduleOPartXIIInd = infoInScheduleOPartXIIInd;
    return this;
  }

  /**
   * Get infoInScheduleOPartXIIInd
   * @return infoInScheduleOPartXIIInd
  */
  
  @Schema(name = "InfoInScheduleOPartXIIInd", required = false)
  public String getInfoInScheduleOPartXIIInd() {
    return infoInScheduleOPartXIIInd;
  }

  public void setInfoInScheduleOPartXIIInd(String infoInScheduleOPartXIIInd) {
    this.infoInScheduleOPartXIIInd = infoInScheduleOPartXIIInd;
  }

  public Irs990 infoInScheduleOPartXIInd(String infoInScheduleOPartXIInd) {
    this.infoInScheduleOPartXIInd = infoInScheduleOPartXIInd;
    return this;
  }

  /**
   * Get infoInScheduleOPartXIInd
   * @return infoInScheduleOPartXIInd
  */
  
  @Schema(name = "InfoInScheduleOPartXIInd", required = false)
  public String getInfoInScheduleOPartXIInd() {
    return infoInScheduleOPartXIInd;
  }

  public void setInfoInScheduleOPartXIInd(String infoInScheduleOPartXIInd) {
    this.infoInScheduleOPartXIInd = infoInScheduleOPartXIInd;
  }

  public Irs990 noDonorRestrictionNetAssetsGrp(CapStkTrPrinCurrentFundsGrpClass noDonorRestrictionNetAssetsGrp) {
    this.noDonorRestrictionNetAssetsGrp = noDonorRestrictionNetAssetsGrp;
    return this;
  }

  /**
   * Get noDonorRestrictionNetAssetsGrp
   * @return noDonorRestrictionNetAssetsGrp
  */
  @Valid 
  @Schema(name = "NoDonorRestrictionNetAssetsGrp", required = false)
  public CapStkTrPrinCurrentFundsGrpClass getNoDonorRestrictionNetAssetsGrp() {
    return noDonorRestrictionNetAssetsGrp;
  }

  public void setNoDonorRestrictionNetAssetsGrp(CapStkTrPrinCurrentFundsGrpClass noDonorRestrictionNetAssetsGrp) {
    this.noDonorRestrictionNetAssetsGrp = noDonorRestrictionNetAssetsGrp;
  }

  public Irs990 infoInScheduleOPartVIIIInd(String infoInScheduleOPartVIIIInd) {
    this.infoInScheduleOPartVIIIInd = infoInScheduleOPartVIIIInd;
    return this;
  }

  /**
   * Get infoInScheduleOPartVIIIInd
   * @return infoInScheduleOPartVIIIInd
  */
  
  @Schema(name = "InfoInScheduleOPartVIIIInd", required = false)
  public String getInfoInScheduleOPartVIIIInd() {
    return infoInScheduleOPartVIIIInd;
  }

  public void setInfoInScheduleOPartVIIIInd(String infoInScheduleOPartVIIIInd) {
    this.infoInScheduleOPartVIIIInd = infoInScheduleOPartVIIIInd;
  }

  public Irs990 infoInScheduleOPartXInd(String infoInScheduleOPartXInd) {
    this.infoInScheduleOPartXInd = infoInScheduleOPartXInd;
    return this;
  }

  /**
   * Get infoInScheduleOPartXInd
   * @return infoInScheduleOPartXInd
  */
  
  @Schema(name = "InfoInScheduleOPartXInd", required = false)
  public String getInfoInScheduleOPartXInd() {
    return infoInScheduleOPartXInd;
  }

  public void setInfoInScheduleOPartXInd(String infoInScheduleOPartXInd) {
    this.infoInScheduleOPartXInd = infoInScheduleOPartXInd;
  }

  public Irs990 annualDisclosureCoveredPrsnInd(Boolean annualDisclosureCoveredPrsnInd) {
    this.annualDisclosureCoveredPrsnInd = annualDisclosureCoveredPrsnInd;
    return this;
  }

  /**
   * Get annualDisclosureCoveredPrsnInd
   * @return annualDisclosureCoveredPrsnInd
  */
  
  @Schema(name = "AnnualDisclosureCoveredPrsnInd", required = false)
  public Boolean getAnnualDisclosureCoveredPrsnInd() {
    return annualDisclosureCoveredPrsnInd;
  }

  public void setAnnualDisclosureCoveredPrsnInd(Boolean annualDisclosureCoveredPrsnInd) {
    this.annualDisclosureCoveredPrsnInd = annualDisclosureCoveredPrsnInd;
  }

  public Irs990 otherExpensesGrp(OtherExpensesGrp otherExpensesGrp) {
    this.otherExpensesGrp = otherExpensesGrp;
    return this;
  }

  /**
   * Get otherExpensesGrp
   * @return otherExpensesGrp
  */
  @Valid 
  @Schema(name = "OtherExpensesGrp", required = false)
  public OtherExpensesGrp getOtherExpensesGrp() {
    return otherExpensesGrp;
  }

  public void setOtherExpensesGrp(OtherExpensesGrp otherExpensesGrp) {
    this.otherExpensesGrp = otherExpensesGrp;
  }

  public Irs990 typeOfOrganizationCorpInd(String typeOfOrganizationCorpInd) {
    this.typeOfOrganizationCorpInd = typeOfOrganizationCorpInd;
    return this;
  }

  /**
   * Get typeOfOrganizationCorpInd
   * @return typeOfOrganizationCorpInd
  */
  
  @Schema(name = "TypeOfOrganizationCorpInd", required = false)
  public String getTypeOfOrganizationCorpInd() {
    return typeOfOrganizationCorpInd;
  }

  public void setTypeOfOrganizationCorpInd(String typeOfOrganizationCorpInd) {
    this.typeOfOrganizationCorpInd = typeOfOrganizationCorpInd;
  }

  public Irs990 regularMonitoringEnfrcInd(Boolean regularMonitoringEnfrcInd) {
    this.regularMonitoringEnfrcInd = regularMonitoringEnfrcInd;
    return this;
  }

  /**
   * Get regularMonitoringEnfrcInd
   * @return regularMonitoringEnfrcInd
  */
  
  @Schema(name = "RegularMonitoringEnfrcInd", required = false)
  public Boolean getRegularMonitoringEnfrcInd() {
    return regularMonitoringEnfrcInd;
  }

  public void setRegularMonitoringEnfrcInd(Boolean regularMonitoringEnfrcInd) {
    this.regularMonitoringEnfrcInd = regularMonitoringEnfrcInd;
  }

  public Irs990 organizationFollowsFASB117Ind(String organizationFollowsFASB117Ind) {
    this.organizationFollowsFASB117Ind = organizationFollowsFASB117Ind;
    return this;
  }

  /**
   * Get organizationFollowsFASB117Ind
   * @return organizationFollowsFASB117Ind
  */
  
  @Schema(name = "OrganizationFollowsFASB117Ind", required = false)
  public String getOrganizationFollowsFASB117Ind() {
    return organizationFollowsFASB117Ind;
  }

  public void setOrganizationFollowsFASB117Ind(String organizationFollowsFASB117Ind) {
    this.organizationFollowsFASB117Ind = organizationFollowsFASB117Ind;
  }

  public Irs990 principalOfcrBusinessName(Name principalOfcrBusinessName) {
    this.principalOfcrBusinessName = principalOfcrBusinessName;
    return this;
  }

  /**
   * Get principalOfcrBusinessName
   * @return principalOfcrBusinessName
  */
  @Valid 
  @Schema(name = "PrincipalOfcrBusinessName", required = false)
  public Name getPrincipalOfcrBusinessName() {
    return principalOfcrBusinessName;
  }

  public void setPrincipalOfcrBusinessName(Name principalOfcrBusinessName) {
    this.principalOfcrBusinessName = principalOfcrBusinessName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Irs990 irs990 = (Irs990) o;
    return Objects.equals(this.changeToOrgDocumentsInd, irs990.changeToOrgDocumentsInd) &&
        Objects.equals(this.expenseAmt, irs990.expenseAmt) &&
        Objects.equals(this.fundraisingAmt, irs990.fundraisingAmt) &&
        Objects.equals(this.totalAssetsGrp, irs990.totalAssetsGrp) &&
        Objects.equals(this.totalGrossUBIAmt, irs990.totalGrossUBIAmt) &&
        Objects.equals(this.reportLandBuildingEquipmentInd, irs990.reportLandBuildingEquipmentInd) &&
        Objects.equals(this.relatedEntityInd, irs990.relatedEntityInd) &&
        Objects.equals(this.relatedOrganizationCtrlEntInd, irs990.relatedOrganizationCtrlEntInd) &&
        Objects.equals(this.moreThan5000KToIndividualsInd, irs990.moreThan5000KToIndividualsInd) &&
        Objects.equals(this.grantsToOrganizationsInd, irs990.grantsToOrganizationsInd) &&
        Objects.equals(this.whistleblowerPolicyInd, irs990.whistleblowerPolicyInd) &&
        Objects.equals(this.investmentInJointVentureInd, irs990.investmentInJointVentureInd) &&
        Objects.equals(this.unrelatedBusIncmOverLimitInd, irs990.unrelatedBusIncmOverLimitInd) &&
        Objects.equals(this.pyRevenuesLessExpensesAmt, irs990.pyRevenuesLessExpensesAmt) &&
        Objects.equals(this.cashNonInterestBearingGrp, irs990.cashNonInterestBearingGrp) &&
        Objects.equals(this.referenceDocumentId, irs990.referenceDocumentId) &&
        Objects.equals(this.votingMembersGoverningBodyCnt, irs990.votingMembersGoverningBodyCnt) &&
        Objects.equals(this.reportOtherAssetsInd, irs990.reportOtherAssetsInd) &&
        Objects.equals(this.feesForServicesAccountingGrp, irs990.feesForServicesAccountingGrp) &&
        Objects.equals(this.compensationProcessCEOInd, irs990.compensationProcessCEOInd) &&
        Objects.equals(this.significantNewProgramSrvcInd, irs990.significantNewProgramSrvcInd) &&
        Objects.equals(this.scheduleORequiredInd, irs990.scheduleORequiredInd) &&
        Objects.equals(this.orgDoesNotFollowFASB117Ind, irs990.orgDoesNotFollowFASB117Ind) &&
        Objects.equals(this.professionalFundraisingInd, irs990.professionalFundraisingInd) &&
        Objects.equals(this.totalAssetsBOYAmt, irs990.totalAssetsBOYAmt) &&
        Objects.equals(this.operateHospitalInd, irs990.operateHospitalInd) &&
        Objects.equals(this.netIncmFromFundraisingEvtGrp, irs990.netIncmFromFundraisingEvtGrp) &&
        Objects.equals(this.cyProgramServiceRevenueAmt, irs990.cyProgramServiceRevenueAmt) &&
        Objects.equals(this.pyGrantsAndSimilarPaidAmt, irs990.pyGrantsAndSimilarPaidAmt) &&
        Objects.equals(this.disregardedEntityInd, irs990.disregardedEntityInd) &&
        Objects.equals(this.totalFunctionalExpensesGrp, irs990.totalFunctionalExpensesGrp) &&
        Objects.equals(this.taxablePartyNotificationInd, irs990.taxablePartyNotificationInd) &&
        Objects.equals(this.nondeductibleContributionsInd, irs990.nondeductibleContributionsInd) &&
        Objects.equals(this.foreignActivitiesInd, irs990.foreignActivitiesInd) &&
        Objects.equals(this.officeExpensesGrp, irs990.officeExpensesGrp) &&
        Objects.equals(this.totalNetAssetsFundBalanceGrp, irs990.totalNetAssetsFundBalanceGrp) &&
        Objects.equals(this.auditCommitteeInd, irs990.auditCommitteeInd) &&
        Objects.equals(this.softwareVersionNum, irs990.softwareVersionNum) &&
        Objects.equals(this.foreignFinancialAccountInd, irs990.foreignFinancialAccountInd) &&
        Objects.equals(this.totalContributionsAmt, irs990.totalContributionsAmt) &&
        Objects.equals(this.cyTotalExpensesAmt, irs990.cyTotalExpensesAmt) &&
        Objects.equals(this.cySalariesCompEmpBnftPaidAmt, irs990.cySalariesCompEmpBnftPaidAmt) &&
        Objects.equals(this.businessRlnWith35CtrlEntInd, irs990.businessRlnWith35CtrlEntInd) &&
        Objects.equals(this.groupReturnForAffiliatesInd, irs990.groupReturnForAffiliatesInd) &&
        Objects.equals(this.cyOtherExpensesAmt, irs990.cyOtherExpensesAmt) &&
        Objects.equals(this.totalCompGreaterThan150KInd, irs990.totalCompGreaterThan150KInd) &&
        Objects.equals(this.investmentIncomeGrp, irs990.investmentIncomeGrp) &&
        Objects.equals(this.scheduleBRequiredInd, irs990.scheduleBRequiredInd) &&
        Objects.equals(this.cyBenefitsPaidToMembersAmt, irs990.cyBenefitsPaidToMembersAmt) &&
        Objects.equals(this.trnsfrExmptNonChrtblRltdOrgInd, irs990.trnsfrExmptNonChrtblRltdOrgInd) &&
        Objects.equals(this.pyExcessBenefitTransInd, irs990.pyExcessBenefitTransInd) &&
        Objects.equals(this.federalGrantAuditRequiredInd, irs990.federalGrantAuditRequiredInd) &&
        Objects.equals(this.revenueAmt, irs990.revenueAmt) &&
        Objects.equals(this.prohibitedTaxShelterTransInd, irs990.prohibitedTaxShelterTransInd) &&
        Objects.equals(this.conservationEasementsInd, irs990.conservationEasementsInd) &&
        Objects.equals(this.engagedInExcessBenefitTransInd, irs990.engagedInExcessBenefitTransInd) &&
        Objects.equals(this.activityOrMissionDesc, irs990.activityOrMissionDesc) &&
        Objects.equals(this.grantsToIndividualsInd, irs990.grantsToIndividualsInd) &&
        Objects.equals(this.employeeCnt, irs990.employeeCnt) &&
        Objects.equals(this.grantsToDomesticOrgsGrp, irs990.grantsToDomesticOrgsGrp) &&
        Objects.equals(this.progSrvcAccomActy2Grp, irs990.progSrvcAccomActy2Grp) &&
        Objects.equals(this.businessRlnWithFamMemInd, irs990.businessRlnWithFamMemInd) &&
        Objects.equals(this.grossReceiptsAmt, irs990.grossReceiptsAmt) &&
        Objects.equals(this.foreignOfficeInd, irs990.foreignOfficeInd) &&
        Objects.equals(this.pyOtherExpensesAmt, irs990.pyOtherExpensesAmt) &&
        Objects.equals(this.compensationFromOtherSrcsInd, irs990.compensationFromOtherSrcsInd) &&
        Objects.equals(this.infoInScheduleOPartIXInd, irs990.infoInScheduleOPartIXInd) &&
        Objects.equals(this.typeOfOrganizationAssocInd, irs990.typeOfOrganizationAssocInd) &&
        Objects.equals(this.pyContributionsGrantsAmt, irs990.pyContributionsGrantsAmt) &&
        Objects.equals(this.formationYr, irs990.formationYr) &&
        Objects.equals(this.materialDiversionOrMisuseInd, irs990.materialDiversionOrMisuseInd) &&
        Objects.equals(this.acctCompileOrReviewBasisGrp, irs990.acctCompileOrReviewBasisGrp) &&
        Objects.equals(this.pyTotalExpensesAmt, irs990.pyTotalExpensesAmt) &&
        Objects.equals(this.softwareId, irs990.softwareId) &&
        Objects.equals(this.loanOutstandingInd, irs990.loanOutstandingInd) &&
        Objects.equals(this.donorRstrOrQuasiEndowmentsInd, irs990.donorRstrOrQuasiEndowmentsInd) &&
        Objects.equals(this.membersOrStockholdersInd, irs990.membersOrStockholdersInd) &&
        Objects.equals(this.collectionsOfArtInd, irs990.collectionsOfArtInd) &&
        Objects.equals(this.deductibleNonCashContriInd, irs990.deductibleNonCashContriInd) &&
        Objects.equals(this.methodOfAccountingCashInd, irs990.methodOfAccountingCashInd) &&
        Objects.equals(this.votingMembersIndependentCnt, irs990.votingMembersIndependentCnt) &&
        Objects.equals(this.irPDocumentW2GCnt, irs990.irPDocumentW2GCnt) &&
        Objects.equals(this.decisionsSubjectToApprovaInd, irs990.decisionsSubjectToApprovaInd) &&
        Objects.equals(this.form990PartVIISectionAGrp, irs990.form990PartVIISectionAGrp) &&
        Objects.equals(this.minutesOfGoverningBodyInd, irs990.minutesOfGoverningBodyInd) &&
        Objects.equals(this.statesWhereCopyOfReturnIsFldCd, irs990.statesWhereCopyOfReturnIsFldCd) &&
        Objects.equals(this.describedInSection501c3Ind, irs990.describedInSection501c3Ind) &&
        Objects.equals(this.totalLiabilitiesEOYAmt, irs990.totalLiabilitiesEOYAmt) &&
        Objects.equals(this.reportOtherLiabilitiesInd, irs990.reportOtherLiabilitiesInd) &&
        Objects.equals(this.allOtherContributionsAmt, irs990.allOtherContributionsAmt) &&
        Objects.equals(this.reportInvestmentsOtherSecInd, irs990.reportInvestmentsOtherSecInd) &&
        Objects.equals(this.minutesOfCommitteesInd, irs990.minutesOfCommitteesInd) &&
        Objects.equals(this.lobbyingActivitiesInd, irs990.lobbyingActivitiesInd) &&
        Objects.equals(this.businessRlnWithOrgMemInd, irs990.businessRlnWithOrgMemInd) &&
        Objects.equals(this.indoorTanningServicesInd, irs990.indoorTanningServicesInd) &&
        Objects.equals(this.desc, irs990.desc) &&
        Objects.equals(this.pyInvestmentIncomeAmt, irs990.pyInvestmentIncomeAmt) &&
        Objects.equals(this.independentVotingMemberCnt, irs990.independentVotingMemberCnt) &&
        Objects.equals(this.cyRevenuesLessExpensesAmt, irs990.cyRevenuesLessExpensesAmt) &&
        Objects.equals(this.subjectToProxyTaxInd, irs990.subjectToProxyTaxInd) &&
        Objects.equals(this.terminateOperationsInd, irs990.terminateOperationsInd) &&
        Objects.equals(this.moreThan5000KToOrgInd, irs990.moreThan5000KToOrgInd) &&
        Objects.equals(this.conflictOfInterestPolicyInd, irs990.conflictOfInterestPolicyInd) &&
        Objects.equals(this.compensationProcessOtherInd, irs990.compensationProcessOtherInd) &&
        Objects.equals(this.totalAssetsEOYAmt, irs990.totalAssetsEOYAmt) &&
        Objects.equals(this.fundraisingActivitiesInd, irs990.fundraisingActivitiesInd) &&
        Objects.equals(this.totalRevenueGrp, irs990.totalRevenueGrp) &&
        Objects.equals(this.schoolOperatingInd, irs990.schoolOperatingInd) &&
        Objects.equals(this.netAssetsOrFundBalancesEOYAmt, irs990.netAssetsOrFundBalancesEOYAmt) &&
        Objects.equals(this.grantToRelatedPersonInd, irs990.grantToRelatedPersonInd) &&
        Objects.equals(this.websiteAddressTxt, irs990.websiteAddressTxt) &&
        Objects.equals(this.netAssetsOrFundBalancesBOYAmt, irs990.netAssetsOrFundBalancesBOYAmt) &&
        Objects.equals(this.cyContributionsGrantsAmt, irs990.cyContributionsGrantsAmt) &&
        Objects.equals(this.allOtherExpensesGrp, irs990.allOtherExpensesGrp) &&
        Objects.equals(this.familyOrBusinessRlnInd, irs990.familyOrBusinessRlnInd) &&
        Objects.equals(this.principalOfficerNm, irs990.principalOfficerNm) &&
        Objects.equals(this.capStkTrPrinCurrentFundsGrp, irs990.capStkTrPrinCurrentFundsGrp) &&
        Objects.equals(this.cyTotalProfFndrsngExpnsAmt, irs990.cyTotalProfFndrsngExpnsAmt) &&
        Objects.equals(this.totLiabNetAssetsFundBalanceGrp, irs990.totLiabNetAssetsFundBalanceGrp) &&
        Objects.equals(this.legalDomicileStateCd, irs990.legalDomicileStateCd) &&
        Objects.equals(this.gamingActivitiesInd, irs990.gamingActivitiesInd) &&
        Objects.equals(this.reconcilationRevenueExpnssAmt, irs990.reconcilationRevenueExpnssAmt) &&
        Objects.equals(this.totalLiabilitiesGrp, irs990.totalLiabilitiesGrp) &&
        Objects.equals(this.cyInvestmentIncomeAmt, irs990.cyInvestmentIncomeAmt) &&
        Objects.equals(this.infoInScheduleOPartVIInd, irs990.infoInScheduleOPartVIInd) &&
        Objects.equals(this.partialLiquidationInd, irs990.partialLiquidationInd) &&
        Objects.equals(this.governingBodyVotingMembersCnt, irs990.governingBodyVotingMembersCnt) &&
        Objects.equals(this.pyTotalRevenueAmt, irs990.pyTotalRevenueAmt) &&
        Objects.equals(this.significantChangeInd, irs990.significantChangeInd) &&
        Objects.equals(this.subjectToExcsTaxNetInvstIncInd, irs990.subjectToExcsTaxNetInvstIncInd) &&
        Objects.equals(this.formerOfcrEmployeesListedInd, irs990.formerOfcrEmployeesListedInd) &&
        Objects.equals(this.cyGrantsAndSimilarPaidAmt, irs990.cyGrantsAndSimilarPaidAmt) &&
        Objects.equals(this.missionDesc, irs990.missionDesc) &&
        Objects.equals(this.donorAdvisedFundInd, irs990.donorAdvisedFundInd) &&
        Objects.equals(this.officerMailingAddressInd, irs990.officerMailingAddressInd) &&
        Objects.equals(this.noListedPersonsCompensatedInd, irs990.noListedPersonsCompensatedInd) &&
        Objects.equals(this.fsAuditedInd, irs990.fsAuditedInd) &&
        Objects.equals(this.organization501c3Ind, irs990.organization501c3Ind) &&
        Objects.equals(this.form990TFiledInd, irs990.form990TFiledInd) &&
        Objects.equals(this.irPDocumentCnt, irs990.irPDocumentCnt) &&
        Objects.equals(this.subjToTaxRmnrtnExPrchtPymtInd, irs990.subjToTaxRmnrtnExPrchtPymtInd) &&
        Objects.equals(this.scheduleJRequiredInd, irs990.scheduleJRequiredInd) &&
        Objects.equals(this.politicalCampaignActyInd, irs990.politicalCampaignActyInd) &&
        Objects.equals(this.delegationOfMgmtDutiesInd, irs990.delegationOfMgmtDutiesInd) &&
        Objects.equals(this.includeFIN48FootnoteInd, irs990.includeFIN48FootnoteInd) &&
        Objects.equals(this.backupWthldComplianceInd, irs990.backupWthldComplianceInd) &&
        Objects.equals(this.deductibleArtContributionInd, irs990.deductibleArtContributionInd) &&
        Objects.equals(this.booksInCareOfDetail, irs990.booksInCareOfDetail) &&
        Objects.equals(this.cyTotalRevenueAmt, irs990.cyTotalRevenueAmt) &&
        Objects.equals(this.cyOtherRevenueAmt, irs990.cyOtherRevenueAmt) &&
        Objects.equals(this.reportProgramRelatedInvstInd, irs990.reportProgramRelatedInvstInd) &&
        Objects.equals(this.creditCounselingInd, irs990.creditCounselingInd) &&
        Objects.equals(this.independentAuditFinclStmtInd, irs990.independentAuditFinclStmtInd) &&
        Objects.equals(this.totalEmployeeCnt, irs990.totalEmployeeCnt) &&
        Objects.equals(this.taxExemptBondsInd, irs990.taxExemptBondsInd) &&
        Objects.equals(this.activitiesConductedPrtshpInd, irs990.activitiesConductedPrtshpInd) &&
        Objects.equals(this.totalProgramServiceExpensesAmt, irs990.totalProgramServiceExpensesAmt) &&
        Objects.equals(this.accountantCompileOrReviewInd, irs990.accountantCompileOrReviewInd) &&
        Objects.equals(this.form990ProvidedToGvrnBodyInd, irs990.form990ProvidedToGvrnBodyInd) &&
        Objects.equals(this.documentRetentionPolicyInd, irs990.documentRetentionPolicyInd) &&
        Objects.equals(this.localChaptersInd, irs990.localChaptersInd) &&
        Objects.equals(this.documentId, irs990.documentId) &&
        Objects.equals(this.cyTotalFundraisingExpenseAmt, irs990.cyTotalFundraisingExpenseAmt) &&
        Objects.equals(this.consolidatedAuditFinclStmtInd, irs990.consolidatedAuditFinclStmtInd) &&
        Objects.equals(this.usAddress, irs990.usAddress) &&
        Objects.equals(this.electionOfBoardMembersInd, irs990.electionOfBoardMembersInd) &&
        Objects.equals(this.progSrvcAccomActy3Grp, irs990.progSrvcAccomActy3Grp) &&
        Objects.equals(this.policiesReferenceChaptersInd, irs990.policiesReferenceChaptersInd) &&
        Objects.equals(this.infoInScheduleOPartIIIInd, irs990.infoInScheduleOPartIIIInd) &&
        Objects.equals(this.feesForServicesManagementGrp, irs990.feesForServicesManagementGrp) &&
        Objects.equals(this.infoInScheduleOPartXIIInd, irs990.infoInScheduleOPartXIIInd) &&
        Objects.equals(this.infoInScheduleOPartXIInd, irs990.infoInScheduleOPartXIInd) &&
        Objects.equals(this.noDonorRestrictionNetAssetsGrp, irs990.noDonorRestrictionNetAssetsGrp) &&
        Objects.equals(this.infoInScheduleOPartVIIIInd, irs990.infoInScheduleOPartVIIIInd) &&
        Objects.equals(this.infoInScheduleOPartXInd, irs990.infoInScheduleOPartXInd) &&
        Objects.equals(this.annualDisclosureCoveredPrsnInd, irs990.annualDisclosureCoveredPrsnInd) &&
        Objects.equals(this.otherExpensesGrp, irs990.otherExpensesGrp) &&
        Objects.equals(this.typeOfOrganizationCorpInd, irs990.typeOfOrganizationCorpInd) &&
        Objects.equals(this.regularMonitoringEnfrcInd, irs990.regularMonitoringEnfrcInd) &&
        Objects.equals(this.organizationFollowsFASB117Ind, irs990.organizationFollowsFASB117Ind) &&
        Objects.equals(this.principalOfcrBusinessName, irs990.principalOfcrBusinessName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeToOrgDocumentsInd, expenseAmt, fundraisingAmt, totalAssetsGrp, totalGrossUBIAmt, reportLandBuildingEquipmentInd, relatedEntityInd, relatedOrganizationCtrlEntInd, moreThan5000KToIndividualsInd, grantsToOrganizationsInd, whistleblowerPolicyInd, investmentInJointVentureInd, unrelatedBusIncmOverLimitInd, pyRevenuesLessExpensesAmt, cashNonInterestBearingGrp, referenceDocumentId, votingMembersGoverningBodyCnt, reportOtherAssetsInd, feesForServicesAccountingGrp, compensationProcessCEOInd, significantNewProgramSrvcInd, scheduleORequiredInd, orgDoesNotFollowFASB117Ind, professionalFundraisingInd, totalAssetsBOYAmt, operateHospitalInd, netIncmFromFundraisingEvtGrp, cyProgramServiceRevenueAmt, pyGrantsAndSimilarPaidAmt, disregardedEntityInd, totalFunctionalExpensesGrp, taxablePartyNotificationInd, nondeductibleContributionsInd, foreignActivitiesInd, officeExpensesGrp, totalNetAssetsFundBalanceGrp, auditCommitteeInd, softwareVersionNum, foreignFinancialAccountInd, totalContributionsAmt, cyTotalExpensesAmt, cySalariesCompEmpBnftPaidAmt, businessRlnWith35CtrlEntInd, groupReturnForAffiliatesInd, cyOtherExpensesAmt, totalCompGreaterThan150KInd, investmentIncomeGrp, scheduleBRequiredInd, cyBenefitsPaidToMembersAmt, trnsfrExmptNonChrtblRltdOrgInd, pyExcessBenefitTransInd, federalGrantAuditRequiredInd, revenueAmt, prohibitedTaxShelterTransInd, conservationEasementsInd, engagedInExcessBenefitTransInd, activityOrMissionDesc, grantsToIndividualsInd, employeeCnt, grantsToDomesticOrgsGrp, progSrvcAccomActy2Grp, businessRlnWithFamMemInd, grossReceiptsAmt, foreignOfficeInd, pyOtherExpensesAmt, compensationFromOtherSrcsInd, infoInScheduleOPartIXInd, typeOfOrganizationAssocInd, pyContributionsGrantsAmt, formationYr, materialDiversionOrMisuseInd, acctCompileOrReviewBasisGrp, pyTotalExpensesAmt, softwareId, loanOutstandingInd, donorRstrOrQuasiEndowmentsInd, membersOrStockholdersInd, collectionsOfArtInd, deductibleNonCashContriInd, methodOfAccountingCashInd, votingMembersIndependentCnt, irPDocumentW2GCnt, decisionsSubjectToApprovaInd, form990PartVIISectionAGrp, minutesOfGoverningBodyInd, statesWhereCopyOfReturnIsFldCd, describedInSection501c3Ind, totalLiabilitiesEOYAmt, reportOtherLiabilitiesInd, allOtherContributionsAmt, reportInvestmentsOtherSecInd, minutesOfCommitteesInd, lobbyingActivitiesInd, businessRlnWithOrgMemInd, indoorTanningServicesInd, desc, pyInvestmentIncomeAmt, independentVotingMemberCnt, cyRevenuesLessExpensesAmt, subjectToProxyTaxInd, terminateOperationsInd, moreThan5000KToOrgInd, conflictOfInterestPolicyInd, compensationProcessOtherInd, totalAssetsEOYAmt, fundraisingActivitiesInd, totalRevenueGrp, schoolOperatingInd, netAssetsOrFundBalancesEOYAmt, grantToRelatedPersonInd, websiteAddressTxt, netAssetsOrFundBalancesBOYAmt, cyContributionsGrantsAmt, allOtherExpensesGrp, familyOrBusinessRlnInd, principalOfficerNm, capStkTrPrinCurrentFundsGrp, cyTotalProfFndrsngExpnsAmt, totLiabNetAssetsFundBalanceGrp, legalDomicileStateCd, gamingActivitiesInd, reconcilationRevenueExpnssAmt, totalLiabilitiesGrp, cyInvestmentIncomeAmt, infoInScheduleOPartVIInd, partialLiquidationInd, governingBodyVotingMembersCnt, pyTotalRevenueAmt, significantChangeInd, subjectToExcsTaxNetInvstIncInd, formerOfcrEmployeesListedInd, cyGrantsAndSimilarPaidAmt, missionDesc, donorAdvisedFundInd, officerMailingAddressInd, noListedPersonsCompensatedInd, fsAuditedInd, organization501c3Ind, form990TFiledInd, irPDocumentCnt, subjToTaxRmnrtnExPrchtPymtInd, scheduleJRequiredInd, politicalCampaignActyInd, delegationOfMgmtDutiesInd, includeFIN48FootnoteInd, backupWthldComplianceInd, deductibleArtContributionInd, booksInCareOfDetail, cyTotalRevenueAmt, cyOtherRevenueAmt, reportProgramRelatedInvstInd, creditCounselingInd, independentAuditFinclStmtInd, totalEmployeeCnt, taxExemptBondsInd, activitiesConductedPrtshpInd, totalProgramServiceExpensesAmt, accountantCompileOrReviewInd, form990ProvidedToGvrnBodyInd, documentRetentionPolicyInd, localChaptersInd, documentId, cyTotalFundraisingExpenseAmt, consolidatedAuditFinclStmtInd, usAddress, electionOfBoardMembersInd, progSrvcAccomActy3Grp, policiesReferenceChaptersInd, infoInScheduleOPartIIIInd, feesForServicesManagementGrp, infoInScheduleOPartXIIInd, infoInScheduleOPartXIInd, noDonorRestrictionNetAssetsGrp, infoInScheduleOPartVIIIInd, infoInScheduleOPartXInd, annualDisclosureCoveredPrsnInd, otherExpensesGrp, typeOfOrganizationCorpInd, regularMonitoringEnfrcInd, organizationFollowsFASB117Ind, principalOfcrBusinessName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Irs990 {\n");
    sb.append("    changeToOrgDocumentsInd: ").append(toIndentedString(changeToOrgDocumentsInd)).append("\n");
    sb.append("    expenseAmt: ").append(toIndentedString(expenseAmt)).append("\n");
    sb.append("    fundraisingAmt: ").append(toIndentedString(fundraisingAmt)).append("\n");
    sb.append("    totalAssetsGrp: ").append(toIndentedString(totalAssetsGrp)).append("\n");
    sb.append("    totalGrossUBIAmt: ").append(toIndentedString(totalGrossUBIAmt)).append("\n");
    sb.append("    reportLandBuildingEquipmentInd: ").append(toIndentedString(reportLandBuildingEquipmentInd)).append("\n");
    sb.append("    relatedEntityInd: ").append(toIndentedString(relatedEntityInd)).append("\n");
    sb.append("    relatedOrganizationCtrlEntInd: ").append(toIndentedString(relatedOrganizationCtrlEntInd)).append("\n");
    sb.append("    moreThan5000KToIndividualsInd: ").append(toIndentedString(moreThan5000KToIndividualsInd)).append("\n");
    sb.append("    grantsToOrganizationsInd: ").append(toIndentedString(grantsToOrganizationsInd)).append("\n");
    sb.append("    whistleblowerPolicyInd: ").append(toIndentedString(whistleblowerPolicyInd)).append("\n");
    sb.append("    investmentInJointVentureInd: ").append(toIndentedString(investmentInJointVentureInd)).append("\n");
    sb.append("    unrelatedBusIncmOverLimitInd: ").append(toIndentedString(unrelatedBusIncmOverLimitInd)).append("\n");
    sb.append("    pyRevenuesLessExpensesAmt: ").append(toIndentedString(pyRevenuesLessExpensesAmt)).append("\n");
    sb.append("    cashNonInterestBearingGrp: ").append(toIndentedString(cashNonInterestBearingGrp)).append("\n");
    sb.append("    referenceDocumentId: ").append(toIndentedString(referenceDocumentId)).append("\n");
    sb.append("    votingMembersGoverningBodyCnt: ").append(toIndentedString(votingMembersGoverningBodyCnt)).append("\n");
    sb.append("    reportOtherAssetsInd: ").append(toIndentedString(reportOtherAssetsInd)).append("\n");
    sb.append("    feesForServicesAccountingGrp: ").append(toIndentedString(feesForServicesAccountingGrp)).append("\n");
    sb.append("    compensationProcessCEOInd: ").append(toIndentedString(compensationProcessCEOInd)).append("\n");
    sb.append("    significantNewProgramSrvcInd: ").append(toIndentedString(significantNewProgramSrvcInd)).append("\n");
    sb.append("    scheduleORequiredInd: ").append(toIndentedString(scheduleORequiredInd)).append("\n");
    sb.append("    orgDoesNotFollowFASB117Ind: ").append(toIndentedString(orgDoesNotFollowFASB117Ind)).append("\n");
    sb.append("    professionalFundraisingInd: ").append(toIndentedString(professionalFundraisingInd)).append("\n");
    sb.append("    totalAssetsBOYAmt: ").append(toIndentedString(totalAssetsBOYAmt)).append("\n");
    sb.append("    operateHospitalInd: ").append(toIndentedString(operateHospitalInd)).append("\n");
    sb.append("    netIncmFromFundraisingEvtGrp: ").append(toIndentedString(netIncmFromFundraisingEvtGrp)).append("\n");
    sb.append("    cyProgramServiceRevenueAmt: ").append(toIndentedString(cyProgramServiceRevenueAmt)).append("\n");
    sb.append("    pyGrantsAndSimilarPaidAmt: ").append(toIndentedString(pyGrantsAndSimilarPaidAmt)).append("\n");
    sb.append("    disregardedEntityInd: ").append(toIndentedString(disregardedEntityInd)).append("\n");
    sb.append("    totalFunctionalExpensesGrp: ").append(toIndentedString(totalFunctionalExpensesGrp)).append("\n");
    sb.append("    taxablePartyNotificationInd: ").append(toIndentedString(taxablePartyNotificationInd)).append("\n");
    sb.append("    nondeductibleContributionsInd: ").append(toIndentedString(nondeductibleContributionsInd)).append("\n");
    sb.append("    foreignActivitiesInd: ").append(toIndentedString(foreignActivitiesInd)).append("\n");
    sb.append("    officeExpensesGrp: ").append(toIndentedString(officeExpensesGrp)).append("\n");
    sb.append("    totalNetAssetsFundBalanceGrp: ").append(toIndentedString(totalNetAssetsFundBalanceGrp)).append("\n");
    sb.append("    auditCommitteeInd: ").append(toIndentedString(auditCommitteeInd)).append("\n");
    sb.append("    softwareVersionNum: ").append(toIndentedString(softwareVersionNum)).append("\n");
    sb.append("    foreignFinancialAccountInd: ").append(toIndentedString(foreignFinancialAccountInd)).append("\n");
    sb.append("    totalContributionsAmt: ").append(toIndentedString(totalContributionsAmt)).append("\n");
    sb.append("    cyTotalExpensesAmt: ").append(toIndentedString(cyTotalExpensesAmt)).append("\n");
    sb.append("    cySalariesCompEmpBnftPaidAmt: ").append(toIndentedString(cySalariesCompEmpBnftPaidAmt)).append("\n");
    sb.append("    businessRlnWith35CtrlEntInd: ").append(toIndentedString(businessRlnWith35CtrlEntInd)).append("\n");
    sb.append("    groupReturnForAffiliatesInd: ").append(toIndentedString(groupReturnForAffiliatesInd)).append("\n");
    sb.append("    cyOtherExpensesAmt: ").append(toIndentedString(cyOtherExpensesAmt)).append("\n");
    sb.append("    totalCompGreaterThan150KInd: ").append(toIndentedString(totalCompGreaterThan150KInd)).append("\n");
    sb.append("    investmentIncomeGrp: ").append(toIndentedString(investmentIncomeGrp)).append("\n");
    sb.append("    scheduleBRequiredInd: ").append(toIndentedString(scheduleBRequiredInd)).append("\n");
    sb.append("    cyBenefitsPaidToMembersAmt: ").append(toIndentedString(cyBenefitsPaidToMembersAmt)).append("\n");
    sb.append("    trnsfrExmptNonChrtblRltdOrgInd: ").append(toIndentedString(trnsfrExmptNonChrtblRltdOrgInd)).append("\n");
    sb.append("    pyExcessBenefitTransInd: ").append(toIndentedString(pyExcessBenefitTransInd)).append("\n");
    sb.append("    federalGrantAuditRequiredInd: ").append(toIndentedString(federalGrantAuditRequiredInd)).append("\n");
    sb.append("    revenueAmt: ").append(toIndentedString(revenueAmt)).append("\n");
    sb.append("    prohibitedTaxShelterTransInd: ").append(toIndentedString(prohibitedTaxShelterTransInd)).append("\n");
    sb.append("    conservationEasementsInd: ").append(toIndentedString(conservationEasementsInd)).append("\n");
    sb.append("    engagedInExcessBenefitTransInd: ").append(toIndentedString(engagedInExcessBenefitTransInd)).append("\n");
    sb.append("    activityOrMissionDesc: ").append(toIndentedString(activityOrMissionDesc)).append("\n");
    sb.append("    grantsToIndividualsInd: ").append(toIndentedString(grantsToIndividualsInd)).append("\n");
    sb.append("    employeeCnt: ").append(toIndentedString(employeeCnt)).append("\n");
    sb.append("    grantsToDomesticOrgsGrp: ").append(toIndentedString(grantsToDomesticOrgsGrp)).append("\n");
    sb.append("    progSrvcAccomActy2Grp: ").append(toIndentedString(progSrvcAccomActy2Grp)).append("\n");
    sb.append("    businessRlnWithFamMemInd: ").append(toIndentedString(businessRlnWithFamMemInd)).append("\n");
    sb.append("    grossReceiptsAmt: ").append(toIndentedString(grossReceiptsAmt)).append("\n");
    sb.append("    foreignOfficeInd: ").append(toIndentedString(foreignOfficeInd)).append("\n");
    sb.append("    pyOtherExpensesAmt: ").append(toIndentedString(pyOtherExpensesAmt)).append("\n");
    sb.append("    compensationFromOtherSrcsInd: ").append(toIndentedString(compensationFromOtherSrcsInd)).append("\n");
    sb.append("    infoInScheduleOPartIXInd: ").append(toIndentedString(infoInScheduleOPartIXInd)).append("\n");
    sb.append("    typeOfOrganizationAssocInd: ").append(toIndentedString(typeOfOrganizationAssocInd)).append("\n");
    sb.append("    pyContributionsGrantsAmt: ").append(toIndentedString(pyContributionsGrantsAmt)).append("\n");
    sb.append("    formationYr: ").append(toIndentedString(formationYr)).append("\n");
    sb.append("    materialDiversionOrMisuseInd: ").append(toIndentedString(materialDiversionOrMisuseInd)).append("\n");
    sb.append("    acctCompileOrReviewBasisGrp: ").append(toIndentedString(acctCompileOrReviewBasisGrp)).append("\n");
    sb.append("    pyTotalExpensesAmt: ").append(toIndentedString(pyTotalExpensesAmt)).append("\n");
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
    sb.append("    loanOutstandingInd: ").append(toIndentedString(loanOutstandingInd)).append("\n");
    sb.append("    donorRstrOrQuasiEndowmentsInd: ").append(toIndentedString(donorRstrOrQuasiEndowmentsInd)).append("\n");
    sb.append("    membersOrStockholdersInd: ").append(toIndentedString(membersOrStockholdersInd)).append("\n");
    sb.append("    collectionsOfArtInd: ").append(toIndentedString(collectionsOfArtInd)).append("\n");
    sb.append("    deductibleNonCashContriInd: ").append(toIndentedString(deductibleNonCashContriInd)).append("\n");
    sb.append("    methodOfAccountingCashInd: ").append(toIndentedString(methodOfAccountingCashInd)).append("\n");
    sb.append("    votingMembersIndependentCnt: ").append(toIndentedString(votingMembersIndependentCnt)).append("\n");
    sb.append("    irPDocumentW2GCnt: ").append(toIndentedString(irPDocumentW2GCnt)).append("\n");
    sb.append("    decisionsSubjectToApprovaInd: ").append(toIndentedString(decisionsSubjectToApprovaInd)).append("\n");
    sb.append("    form990PartVIISectionAGrp: ").append(toIndentedString(form990PartVIISectionAGrp)).append("\n");
    sb.append("    minutesOfGoverningBodyInd: ").append(toIndentedString(minutesOfGoverningBodyInd)).append("\n");
    sb.append("    statesWhereCopyOfReturnIsFldCd: ").append(toIndentedString(statesWhereCopyOfReturnIsFldCd)).append("\n");
    sb.append("    describedInSection501c3Ind: ").append(toIndentedString(describedInSection501c3Ind)).append("\n");
    sb.append("    totalLiabilitiesEOYAmt: ").append(toIndentedString(totalLiabilitiesEOYAmt)).append("\n");
    sb.append("    reportOtherLiabilitiesInd: ").append(toIndentedString(reportOtherLiabilitiesInd)).append("\n");
    sb.append("    allOtherContributionsAmt: ").append(toIndentedString(allOtherContributionsAmt)).append("\n");
    sb.append("    reportInvestmentsOtherSecInd: ").append(toIndentedString(reportInvestmentsOtherSecInd)).append("\n");
    sb.append("    minutesOfCommitteesInd: ").append(toIndentedString(minutesOfCommitteesInd)).append("\n");
    sb.append("    lobbyingActivitiesInd: ").append(toIndentedString(lobbyingActivitiesInd)).append("\n");
    sb.append("    businessRlnWithOrgMemInd: ").append(toIndentedString(businessRlnWithOrgMemInd)).append("\n");
    sb.append("    indoorTanningServicesInd: ").append(toIndentedString(indoorTanningServicesInd)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    pyInvestmentIncomeAmt: ").append(toIndentedString(pyInvestmentIncomeAmt)).append("\n");
    sb.append("    independentVotingMemberCnt: ").append(toIndentedString(independentVotingMemberCnt)).append("\n");
    sb.append("    cyRevenuesLessExpensesAmt: ").append(toIndentedString(cyRevenuesLessExpensesAmt)).append("\n");
    sb.append("    subjectToProxyTaxInd: ").append(toIndentedString(subjectToProxyTaxInd)).append("\n");
    sb.append("    terminateOperationsInd: ").append(toIndentedString(terminateOperationsInd)).append("\n");
    sb.append("    moreThan5000KToOrgInd: ").append(toIndentedString(moreThan5000KToOrgInd)).append("\n");
    sb.append("    conflictOfInterestPolicyInd: ").append(toIndentedString(conflictOfInterestPolicyInd)).append("\n");
    sb.append("    compensationProcessOtherInd: ").append(toIndentedString(compensationProcessOtherInd)).append("\n");
    sb.append("    totalAssetsEOYAmt: ").append(toIndentedString(totalAssetsEOYAmt)).append("\n");
    sb.append("    fundraisingActivitiesInd: ").append(toIndentedString(fundraisingActivitiesInd)).append("\n");
    sb.append("    totalRevenueGrp: ").append(toIndentedString(totalRevenueGrp)).append("\n");
    sb.append("    schoolOperatingInd: ").append(toIndentedString(schoolOperatingInd)).append("\n");
    sb.append("    netAssetsOrFundBalancesEOYAmt: ").append(toIndentedString(netAssetsOrFundBalancesEOYAmt)).append("\n");
    sb.append("    grantToRelatedPersonInd: ").append(toIndentedString(grantToRelatedPersonInd)).append("\n");
    sb.append("    websiteAddressTxt: ").append(toIndentedString(websiteAddressTxt)).append("\n");
    sb.append("    netAssetsOrFundBalancesBOYAmt: ").append(toIndentedString(netAssetsOrFundBalancesBOYAmt)).append("\n");
    sb.append("    cyContributionsGrantsAmt: ").append(toIndentedString(cyContributionsGrantsAmt)).append("\n");
    sb.append("    allOtherExpensesGrp: ").append(toIndentedString(allOtherExpensesGrp)).append("\n");
    sb.append("    familyOrBusinessRlnInd: ").append(toIndentedString(familyOrBusinessRlnInd)).append("\n");
    sb.append("    principalOfficerNm: ").append(toIndentedString(principalOfficerNm)).append("\n");
    sb.append("    capStkTrPrinCurrentFundsGrp: ").append(toIndentedString(capStkTrPrinCurrentFundsGrp)).append("\n");
    sb.append("    cyTotalProfFndrsngExpnsAmt: ").append(toIndentedString(cyTotalProfFndrsngExpnsAmt)).append("\n");
    sb.append("    totLiabNetAssetsFundBalanceGrp: ").append(toIndentedString(totLiabNetAssetsFundBalanceGrp)).append("\n");
    sb.append("    legalDomicileStateCd: ").append(toIndentedString(legalDomicileStateCd)).append("\n");
    sb.append("    gamingActivitiesInd: ").append(toIndentedString(gamingActivitiesInd)).append("\n");
    sb.append("    reconcilationRevenueExpnssAmt: ").append(toIndentedString(reconcilationRevenueExpnssAmt)).append("\n");
    sb.append("    totalLiabilitiesGrp: ").append(toIndentedString(totalLiabilitiesGrp)).append("\n");
    sb.append("    cyInvestmentIncomeAmt: ").append(toIndentedString(cyInvestmentIncomeAmt)).append("\n");
    sb.append("    infoInScheduleOPartVIInd: ").append(toIndentedString(infoInScheduleOPartVIInd)).append("\n");
    sb.append("    partialLiquidationInd: ").append(toIndentedString(partialLiquidationInd)).append("\n");
    sb.append("    governingBodyVotingMembersCnt: ").append(toIndentedString(governingBodyVotingMembersCnt)).append("\n");
    sb.append("    pyTotalRevenueAmt: ").append(toIndentedString(pyTotalRevenueAmt)).append("\n");
    sb.append("    significantChangeInd: ").append(toIndentedString(significantChangeInd)).append("\n");
    sb.append("    subjectToExcsTaxNetInvstIncInd: ").append(toIndentedString(subjectToExcsTaxNetInvstIncInd)).append("\n");
    sb.append("    formerOfcrEmployeesListedInd: ").append(toIndentedString(formerOfcrEmployeesListedInd)).append("\n");
    sb.append("    cyGrantsAndSimilarPaidAmt: ").append(toIndentedString(cyGrantsAndSimilarPaidAmt)).append("\n");
    sb.append("    missionDesc: ").append(toIndentedString(missionDesc)).append("\n");
    sb.append("    donorAdvisedFundInd: ").append(toIndentedString(donorAdvisedFundInd)).append("\n");
    sb.append("    officerMailingAddressInd: ").append(toIndentedString(officerMailingAddressInd)).append("\n");
    sb.append("    noListedPersonsCompensatedInd: ").append(toIndentedString(noListedPersonsCompensatedInd)).append("\n");
    sb.append("    fsAuditedInd: ").append(toIndentedString(fsAuditedInd)).append("\n");
    sb.append("    organization501c3Ind: ").append(toIndentedString(organization501c3Ind)).append("\n");
    sb.append("    form990TFiledInd: ").append(toIndentedString(form990TFiledInd)).append("\n");
    sb.append("    irPDocumentCnt: ").append(toIndentedString(irPDocumentCnt)).append("\n");
    sb.append("    subjToTaxRmnrtnExPrchtPymtInd: ").append(toIndentedString(subjToTaxRmnrtnExPrchtPymtInd)).append("\n");
    sb.append("    scheduleJRequiredInd: ").append(toIndentedString(scheduleJRequiredInd)).append("\n");
    sb.append("    politicalCampaignActyInd: ").append(toIndentedString(politicalCampaignActyInd)).append("\n");
    sb.append("    delegationOfMgmtDutiesInd: ").append(toIndentedString(delegationOfMgmtDutiesInd)).append("\n");
    sb.append("    includeFIN48FootnoteInd: ").append(toIndentedString(includeFIN48FootnoteInd)).append("\n");
    sb.append("    backupWthldComplianceInd: ").append(toIndentedString(backupWthldComplianceInd)).append("\n");
    sb.append("    deductibleArtContributionInd: ").append(toIndentedString(deductibleArtContributionInd)).append("\n");
    sb.append("    booksInCareOfDetail: ").append(toIndentedString(booksInCareOfDetail)).append("\n");
    sb.append("    cyTotalRevenueAmt: ").append(toIndentedString(cyTotalRevenueAmt)).append("\n");
    sb.append("    cyOtherRevenueAmt: ").append(toIndentedString(cyOtherRevenueAmt)).append("\n");
    sb.append("    reportProgramRelatedInvstInd: ").append(toIndentedString(reportProgramRelatedInvstInd)).append("\n");
    sb.append("    creditCounselingInd: ").append(toIndentedString(creditCounselingInd)).append("\n");
    sb.append("    independentAuditFinclStmtInd: ").append(toIndentedString(independentAuditFinclStmtInd)).append("\n");
    sb.append("    totalEmployeeCnt: ").append(toIndentedString(totalEmployeeCnt)).append("\n");
    sb.append("    taxExemptBondsInd: ").append(toIndentedString(taxExemptBondsInd)).append("\n");
    sb.append("    activitiesConductedPrtshpInd: ").append(toIndentedString(activitiesConductedPrtshpInd)).append("\n");
    sb.append("    totalProgramServiceExpensesAmt: ").append(toIndentedString(totalProgramServiceExpensesAmt)).append("\n");
    sb.append("    accountantCompileOrReviewInd: ").append(toIndentedString(accountantCompileOrReviewInd)).append("\n");
    sb.append("    form990ProvidedToGvrnBodyInd: ").append(toIndentedString(form990ProvidedToGvrnBodyInd)).append("\n");
    sb.append("    documentRetentionPolicyInd: ").append(toIndentedString(documentRetentionPolicyInd)).append("\n");
    sb.append("    localChaptersInd: ").append(toIndentedString(localChaptersInd)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    cyTotalFundraisingExpenseAmt: ").append(toIndentedString(cyTotalFundraisingExpenseAmt)).append("\n");
    sb.append("    consolidatedAuditFinclStmtInd: ").append(toIndentedString(consolidatedAuditFinclStmtInd)).append("\n");
    sb.append("    usAddress: ").append(toIndentedString(usAddress)).append("\n");
    sb.append("    electionOfBoardMembersInd: ").append(toIndentedString(electionOfBoardMembersInd)).append("\n");
    sb.append("    progSrvcAccomActy3Grp: ").append(toIndentedString(progSrvcAccomActy3Grp)).append("\n");
    sb.append("    policiesReferenceChaptersInd: ").append(toIndentedString(policiesReferenceChaptersInd)).append("\n");
    sb.append("    infoInScheduleOPartIIIInd: ").append(toIndentedString(infoInScheduleOPartIIIInd)).append("\n");
    sb.append("    feesForServicesManagementGrp: ").append(toIndentedString(feesForServicesManagementGrp)).append("\n");
    sb.append("    infoInScheduleOPartXIIInd: ").append(toIndentedString(infoInScheduleOPartXIIInd)).append("\n");
    sb.append("    infoInScheduleOPartXIInd: ").append(toIndentedString(infoInScheduleOPartXIInd)).append("\n");
    sb.append("    noDonorRestrictionNetAssetsGrp: ").append(toIndentedString(noDonorRestrictionNetAssetsGrp)).append("\n");
    sb.append("    infoInScheduleOPartVIIIInd: ").append(toIndentedString(infoInScheduleOPartVIIIInd)).append("\n");
    sb.append("    infoInScheduleOPartXInd: ").append(toIndentedString(infoInScheduleOPartXInd)).append("\n");
    sb.append("    annualDisclosureCoveredPrsnInd: ").append(toIndentedString(annualDisclosureCoveredPrsnInd)).append("\n");
    sb.append("    otherExpensesGrp: ").append(toIndentedString(otherExpensesGrp)).append("\n");
    sb.append("    typeOfOrganizationCorpInd: ").append(toIndentedString(typeOfOrganizationCorpInd)).append("\n");
    sb.append("    regularMonitoringEnfrcInd: ").append(toIndentedString(regularMonitoringEnfrcInd)).append("\n");
    sb.append("    organizationFollowsFASB117Ind: ").append(toIndentedString(organizationFollowsFASB117Ind)).append("\n");
    sb.append("    principalOfcrBusinessName: ").append(toIndentedString(principalOfcrBusinessName)).append("\n");
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

