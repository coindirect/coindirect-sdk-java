/*
 * Coindirect
 * The Coindirect API is offered to all users to make use of our P2P Marketplace, Exchange and Wallets.
 *
 * OpenAPI spec version: 1
 * Contact: support@coindirect.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.coindirect.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.coindirect.api.model.AccountMethod;
import org.coindirect.api.model.Fees;
import org.coindirect.api.model.PayInInstruction;
import org.coindirect.api.model.PayInMethod;
import org.coindirect.api.model.PayOutInstruction;
import org.coindirect.api.model.PayOutMethod;
/**
 * Quote
 */


public class Quote {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("to")
  private String to = null;

  @JsonProperty("amountIn")
  private BigDecimal amountIn = null;

  @JsonProperty("amountOut")
  private BigDecimal amountOut = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  /**
   * Gets or Sets quoteStatus
   */
  public enum QuoteStatusEnum {
    ESTIMATE("ESTIMATE"),
    TEMPLATE("TEMPLATE"),
    PENDING("PENDING"),
    ACCEPTED("ACCEPTED"),
    PAYMENT_IN_RECEIVED("PAYMENT_IN_RECEIVED"),
    FRAUD_CHECK_PENDING("FRAUD_CHECK_PENDING"),
    FRAUD_CHECK_FAILED("FRAUD_CHECK_FAILED"),
    PAYMENT_OUT_PENDING("PAYMENT_OUT_PENDING"),
    PAYMENT_OUT_PROCESSED("PAYMENT_OUT_PROCESSED"),
    PAYMENT_OUT_USED("PAYMENT_OUT_USED"),
    COMPLETED("COMPLETED"),
    CONVERSION_FAILED("CONVERSION_FAILED"),
    PAYMENT_OUT_FAILED("PAYMENT_OUT_FAILED"),
    LOCKED("LOCKED");

    private String value;

    QuoteStatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static QuoteStatusEnum fromValue(String text) {
      for (QuoteStatusEnum b : QuoteStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("quoteStatus")
  private QuoteStatusEnum quoteStatus = null;

  /**
   * Gets or Sets paymentStatus
   */
  public enum PaymentStatusEnum {
    PENDING("PENDING"),
    SEEN("SEEN"),
    SUCCESS("SUCCESS"),
    CANCELLED("CANCELLED"),
    FAILED("FAILED"),
    FRAUD_PENDING("FRAUD_PENDING"),
    FRAUD_PENDING_MANUAL_REVIEW("FRAUD_PENDING_MANUAL_REVIEW"),
    FRAUD_FAILED("FRAUD_FAILED"),
    REFUND_PENDING("REFUND_PENDING"),
    REFUNDED("REFUNDED"),
    MANUAL_SUCCESS("MANUAL_SUCCESS"),
    REFUND_FAILED("REFUND_FAILED");

    private String value;

    PaymentStatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static PaymentStatusEnum fromValue(String text) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("paymentStatus")
  private PaymentStatusEnum paymentStatus = null;

  @JsonProperty("acceptanceExpiryDate")
  private OffsetDateTime acceptanceExpiryDate = null;

  @JsonProperty("paymentExpiryDate")
  private OffsetDateTime paymentExpiryDate = null;

  @JsonProperty("paymentReceiptDate")
  private OffsetDateTime paymentReceiptDate = null;

  @JsonProperty("payInMethod")
  private PayInMethod payInMethod = null;

  @JsonProperty("payOutMethod")
  private PayOutMethod payOutMethod = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("payOutInstruction")
  private PayOutInstruction payOutInstruction = null;

  @JsonProperty("payInInstruction")
  private PayInInstruction payInInstruction = null;

  @JsonProperty("usePayInMethod")
  private AccountMethod usePayInMethod = null;

  @JsonProperty("usePayOutMethod")
  private AccountMethod usePayOutMethod = null;

  @JsonProperty("fee")
  private BigDecimal fee = null;

  @JsonProperty("processingFee")
  private BigDecimal processingFee = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FIXED("FIXED"),
    MARKET("MARKET");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("netPrice")
  private BigDecimal netPrice = null;

  @JsonProperty("grossPrice")
  private BigDecimal grossPrice = null;

  @JsonProperty("amountInGross")
  private BigDecimal amountInGross = null;

  @JsonProperty("amountInNet")
  private BigDecimal amountInNet = null;

  @JsonProperty("fees")
  private Fees fees = null;

  @JsonProperty("dateCreated")
  private OffsetDateTime dateCreated = null;

  @JsonProperty("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  public Quote id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Quote from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @Schema(description = "")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Quote to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @Schema(description = "")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Quote amountIn(BigDecimal amountIn) {
    this.amountIn = amountIn;
    return this;
  }

   /**
   * Get amountIn
   * @return amountIn
  **/
  @Schema(description = "")
  public BigDecimal getAmountIn() {
    return amountIn;
  }

  public void setAmountIn(BigDecimal amountIn) {
    this.amountIn = amountIn;
  }

  public Quote amountOut(BigDecimal amountOut) {
    this.amountOut = amountOut;
    return this;
  }

   /**
   * Get amountOut
   * @return amountOut
  **/
  @Schema(description = "")
  public BigDecimal getAmountOut() {
    return amountOut;
  }

  public void setAmountOut(BigDecimal amountOut) {
    this.amountOut = amountOut;
  }

  public Quote price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Quote quoteStatus(QuoteStatusEnum quoteStatus) {
    this.quoteStatus = quoteStatus;
    return this;
  }

   /**
   * Get quoteStatus
   * @return quoteStatus
  **/
  @Schema(description = "")
  public QuoteStatusEnum getQuoteStatus() {
    return quoteStatus;
  }

  public void setQuoteStatus(QuoteStatusEnum quoteStatus) {
    this.quoteStatus = quoteStatus;
  }

  public Quote paymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @Schema(description = "")
  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public Quote acceptanceExpiryDate(OffsetDateTime acceptanceExpiryDate) {
    this.acceptanceExpiryDate = acceptanceExpiryDate;
    return this;
  }

   /**
   * Get acceptanceExpiryDate
   * @return acceptanceExpiryDate
  **/
  @Schema(description = "")
  public OffsetDateTime getAcceptanceExpiryDate() {
    return acceptanceExpiryDate;
  }

  public void setAcceptanceExpiryDate(OffsetDateTime acceptanceExpiryDate) {
    this.acceptanceExpiryDate = acceptanceExpiryDate;
  }

  public Quote paymentExpiryDate(OffsetDateTime paymentExpiryDate) {
    this.paymentExpiryDate = paymentExpiryDate;
    return this;
  }

   /**
   * Get paymentExpiryDate
   * @return paymentExpiryDate
  **/
  @Schema(description = "")
  public OffsetDateTime getPaymentExpiryDate() {
    return paymentExpiryDate;
  }

  public void setPaymentExpiryDate(OffsetDateTime paymentExpiryDate) {
    this.paymentExpiryDate = paymentExpiryDate;
  }

  public Quote paymentReceiptDate(OffsetDateTime paymentReceiptDate) {
    this.paymentReceiptDate = paymentReceiptDate;
    return this;
  }

   /**
   * Get paymentReceiptDate
   * @return paymentReceiptDate
  **/
  @Schema(description = "")
  public OffsetDateTime getPaymentReceiptDate() {
    return paymentReceiptDate;
  }

  public void setPaymentReceiptDate(OffsetDateTime paymentReceiptDate) {
    this.paymentReceiptDate = paymentReceiptDate;
  }

  public Quote payInMethod(PayInMethod payInMethod) {
    this.payInMethod = payInMethod;
    return this;
  }

   /**
   * Get payInMethod
   * @return payInMethod
  **/
  @Schema(description = "")
  public PayInMethod getPayInMethod() {
    return payInMethod;
  }

  public void setPayInMethod(PayInMethod payInMethod) {
    this.payInMethod = payInMethod;
  }

  public Quote payOutMethod(PayOutMethod payOutMethod) {
    this.payOutMethod = payOutMethod;
    return this;
  }

   /**
   * Get payOutMethod
   * @return payOutMethod
  **/
  @Schema(description = "")
  public PayOutMethod getPayOutMethod() {
    return payOutMethod;
  }

  public void setPayOutMethod(PayOutMethod payOutMethod) {
    this.payOutMethod = payOutMethod;
  }

  public Quote uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Quote payOutInstruction(PayOutInstruction payOutInstruction) {
    this.payOutInstruction = payOutInstruction;
    return this;
  }

   /**
   * Get payOutInstruction
   * @return payOutInstruction
  **/
  @Schema(description = "")
  public PayOutInstruction getPayOutInstruction() {
    return payOutInstruction;
  }

  public void setPayOutInstruction(PayOutInstruction payOutInstruction) {
    this.payOutInstruction = payOutInstruction;
  }

  public Quote payInInstruction(PayInInstruction payInInstruction) {
    this.payInInstruction = payInInstruction;
    return this;
  }

   /**
   * Get payInInstruction
   * @return payInInstruction
  **/
  @Schema(description = "")
  public PayInInstruction getPayInInstruction() {
    return payInInstruction;
  }

  public void setPayInInstruction(PayInInstruction payInInstruction) {
    this.payInInstruction = payInInstruction;
  }

  public Quote usePayInMethod(AccountMethod usePayInMethod) {
    this.usePayInMethod = usePayInMethod;
    return this;
  }

   /**
   * Get usePayInMethod
   * @return usePayInMethod
  **/
  @Schema(description = "")
  public AccountMethod getUsePayInMethod() {
    return usePayInMethod;
  }

  public void setUsePayInMethod(AccountMethod usePayInMethod) {
    this.usePayInMethod = usePayInMethod;
  }

  public Quote usePayOutMethod(AccountMethod usePayOutMethod) {
    this.usePayOutMethod = usePayOutMethod;
    return this;
  }

   /**
   * Get usePayOutMethod
   * @return usePayOutMethod
  **/
  @Schema(description = "")
  public AccountMethod getUsePayOutMethod() {
    return usePayOutMethod;
  }

  public void setUsePayOutMethod(AccountMethod usePayOutMethod) {
    this.usePayOutMethod = usePayOutMethod;
  }

  public Quote fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @Schema(description = "")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public Quote processingFee(BigDecimal processingFee) {
    this.processingFee = processingFee;
    return this;
  }

   /**
   * Get processingFee
   * @return processingFee
  **/
  @Schema(description = "")
  public BigDecimal getProcessingFee() {
    return processingFee;
  }

  public void setProcessingFee(BigDecimal processingFee) {
    this.processingFee = processingFee;
  }

  public Quote type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Quote netPrice(BigDecimal netPrice) {
    this.netPrice = netPrice;
    return this;
  }

   /**
   * Get netPrice
   * @return netPrice
  **/
  @Schema(description = "")
  public BigDecimal getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(BigDecimal netPrice) {
    this.netPrice = netPrice;
  }

  public Quote grossPrice(BigDecimal grossPrice) {
    this.grossPrice = grossPrice;
    return this;
  }

   /**
   * Get grossPrice
   * @return grossPrice
  **/
  @Schema(description = "")
  public BigDecimal getGrossPrice() {
    return grossPrice;
  }

  public void setGrossPrice(BigDecimal grossPrice) {
    this.grossPrice = grossPrice;
  }

  public Quote amountInGross(BigDecimal amountInGross) {
    this.amountInGross = amountInGross;
    return this;
  }

   /**
   * Get amountInGross
   * @return amountInGross
  **/
  @Schema(description = "")
  public BigDecimal getAmountInGross() {
    return amountInGross;
  }

  public void setAmountInGross(BigDecimal amountInGross) {
    this.amountInGross = amountInGross;
  }

  public Quote amountInNet(BigDecimal amountInNet) {
    this.amountInNet = amountInNet;
    return this;
  }

   /**
   * Get amountInNet
   * @return amountInNet
  **/
  @Schema(description = "")
  public BigDecimal getAmountInNet() {
    return amountInNet;
  }

  public void setAmountInNet(BigDecimal amountInNet) {
    this.amountInNet = amountInNet;
  }

  public Quote fees(Fees fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @Schema(description = "")
  public Fees getFees() {
    return fees;
  }

  public void setFees(Fees fees) {
    this.fees = fees;
  }

  public Quote dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @Schema(description = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Quote lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @Schema(description = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quote quote = (Quote) o;
    return Objects.equals(this.id, quote.id) &&
        Objects.equals(this.from, quote.from) &&
        Objects.equals(this.to, quote.to) &&
        Objects.equals(this.amountIn, quote.amountIn) &&
        Objects.equals(this.amountOut, quote.amountOut) &&
        Objects.equals(this.price, quote.price) &&
        Objects.equals(this.quoteStatus, quote.quoteStatus) &&
        Objects.equals(this.paymentStatus, quote.paymentStatus) &&
        Objects.equals(this.acceptanceExpiryDate, quote.acceptanceExpiryDate) &&
        Objects.equals(this.paymentExpiryDate, quote.paymentExpiryDate) &&
        Objects.equals(this.paymentReceiptDate, quote.paymentReceiptDate) &&
        Objects.equals(this.payInMethod, quote.payInMethod) &&
        Objects.equals(this.payOutMethod, quote.payOutMethod) &&
        Objects.equals(this.uuid, quote.uuid) &&
        Objects.equals(this.payOutInstruction, quote.payOutInstruction) &&
        Objects.equals(this.payInInstruction, quote.payInInstruction) &&
        Objects.equals(this.usePayInMethod, quote.usePayInMethod) &&
        Objects.equals(this.usePayOutMethod, quote.usePayOutMethod) &&
        Objects.equals(this.fee, quote.fee) &&
        Objects.equals(this.processingFee, quote.processingFee) &&
        Objects.equals(this.type, quote.type) &&
        Objects.equals(this.netPrice, quote.netPrice) &&
        Objects.equals(this.grossPrice, quote.grossPrice) &&
        Objects.equals(this.amountInGross, quote.amountInGross) &&
        Objects.equals(this.amountInNet, quote.amountInNet) &&
        Objects.equals(this.fees, quote.fees) &&
        Objects.equals(this.dateCreated, quote.dateCreated) &&
        Objects.equals(this.lastUpdated, quote.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, to, amountIn, amountOut, price, quoteStatus, paymentStatus, acceptanceExpiryDate, paymentExpiryDate, paymentReceiptDate, payInMethod, payOutMethod, uuid, payOutInstruction, payInInstruction, usePayInMethod, usePayOutMethod, fee, processingFee, type, netPrice, grossPrice, amountInGross, amountInNet, fees, dateCreated, lastUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    amountIn: ").append(toIndentedString(amountIn)).append("\n");
    sb.append("    amountOut: ").append(toIndentedString(amountOut)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quoteStatus: ").append(toIndentedString(quoteStatus)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    acceptanceExpiryDate: ").append(toIndentedString(acceptanceExpiryDate)).append("\n");
    sb.append("    paymentExpiryDate: ").append(toIndentedString(paymentExpiryDate)).append("\n");
    sb.append("    paymentReceiptDate: ").append(toIndentedString(paymentReceiptDate)).append("\n");
    sb.append("    payInMethod: ").append(toIndentedString(payInMethod)).append("\n");
    sb.append("    payOutMethod: ").append(toIndentedString(payOutMethod)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    payOutInstruction: ").append(toIndentedString(payOutInstruction)).append("\n");
    sb.append("    payInInstruction: ").append(toIndentedString(payInInstruction)).append("\n");
    sb.append("    usePayInMethod: ").append(toIndentedString(usePayInMethod)).append("\n");
    sb.append("    usePayOutMethod: ").append(toIndentedString(usePayOutMethod)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    processingFee: ").append(toIndentedString(processingFee)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    netPrice: ").append(toIndentedString(netPrice)).append("\n");
    sb.append("    grossPrice: ").append(toIndentedString(grossPrice)).append("\n");
    sb.append("    amountInGross: ").append(toIndentedString(amountInGross)).append("\n");
    sb.append("    amountInNet: ").append(toIndentedString(amountInNet)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
