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
import org.coindirect.api.model.Currency;
/**
 * ExchangeRate
 */


public class ExchangeRate {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("baseCurrency")
  private Currency baseCurrency = null;

  @JsonProperty("counterCurrency")
  private Currency counterCurrency = null;

  @JsonProperty("period")
  private String period = null;

  @JsonProperty("lastTraded")
  private BigDecimal lastTraded = null;

  @JsonProperty("lastAsk")
  private BigDecimal lastAsk = null;

  @JsonProperty("lastBid")
  private BigDecimal lastBid = null;

  public ExchangeRate id(Long id) {
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

  public ExchangeRate baseCurrency(Currency baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * Get baseCurrency
   * @return baseCurrency
  **/
  @Schema(description = "")
  public Currency getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(Currency baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public ExchangeRate counterCurrency(Currency counterCurrency) {
    this.counterCurrency = counterCurrency;
    return this;
  }

   /**
   * Get counterCurrency
   * @return counterCurrency
  **/
  @Schema(description = "")
  public Currency getCounterCurrency() {
    return counterCurrency;
  }

  public void setCounterCurrency(Currency counterCurrency) {
    this.counterCurrency = counterCurrency;
  }

  public ExchangeRate period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public ExchangeRate lastTraded(BigDecimal lastTraded) {
    this.lastTraded = lastTraded;
    return this;
  }

   /**
   * Get lastTraded
   * @return lastTraded
  **/
  @Schema(description = "")
  public BigDecimal getLastTraded() {
    return lastTraded;
  }

  public void setLastTraded(BigDecimal lastTraded) {
    this.lastTraded = lastTraded;
  }

  public ExchangeRate lastAsk(BigDecimal lastAsk) {
    this.lastAsk = lastAsk;
    return this;
  }

   /**
   * Get lastAsk
   * @return lastAsk
  **/
  @Schema(description = "")
  public BigDecimal getLastAsk() {
    return lastAsk;
  }

  public void setLastAsk(BigDecimal lastAsk) {
    this.lastAsk = lastAsk;
  }

  public ExchangeRate lastBid(BigDecimal lastBid) {
    this.lastBid = lastBid;
    return this;
  }

   /**
   * Get lastBid
   * @return lastBid
  **/
  @Schema(description = "")
  public BigDecimal getLastBid() {
    return lastBid;
  }

  public void setLastBid(BigDecimal lastBid) {
    this.lastBid = lastBid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRate exchangeRate = (ExchangeRate) o;
    return Objects.equals(this.id, exchangeRate.id) &&
        Objects.equals(this.baseCurrency, exchangeRate.baseCurrency) &&
        Objects.equals(this.counterCurrency, exchangeRate.counterCurrency) &&
        Objects.equals(this.period, exchangeRate.period) &&
        Objects.equals(this.lastTraded, exchangeRate.lastTraded) &&
        Objects.equals(this.lastAsk, exchangeRate.lastAsk) &&
        Objects.equals(this.lastBid, exchangeRate.lastBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, baseCurrency, counterCurrency, period, lastTraded, lastAsk, lastBid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    counterCurrency: ").append(toIndentedString(counterCurrency)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    lastTraded: ").append(toIndentedString(lastTraded)).append("\n");
    sb.append("    lastAsk: ").append(toIndentedString(lastAsk)).append("\n");
    sb.append("    lastBid: ").append(toIndentedString(lastBid)).append("\n");
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
