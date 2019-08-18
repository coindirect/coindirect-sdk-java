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
import org.coindirect.api.model.MarketSummary;
/**
 * Market
 */


public class Market {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("minimumPrice")
  private BigDecimal minimumPrice = null;

  @JsonProperty("maximumPrice")
  private BigDecimal maximumPrice = null;

  @JsonProperty("tickSize")
  private BigDecimal tickSize = null;

  @JsonProperty("minimumQuantity")
  private BigDecimal minimumQuantity = null;

  @JsonProperty("maximumQuantity")
  private BigDecimal maximumQuantity = null;

  @JsonProperty("stepSize")
  private BigDecimal stepSize = null;

  @JsonProperty("minimumValue")
  private BigDecimal minimumValue = null;

  @JsonProperty("maximumValue")
  private BigDecimal maximumValue = null;

  @JsonProperty("summary")
  private MarketSummary summary = null;

  public Market id(Long id) {
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

  public Market symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @Schema(description = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Market status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Market minimumPrice(BigDecimal minimumPrice) {
    this.minimumPrice = minimumPrice;
    return this;
  }

   /**
   * Get minimumPrice
   * @return minimumPrice
  **/
  @Schema(description = "")
  public BigDecimal getMinimumPrice() {
    return minimumPrice;
  }

  public void setMinimumPrice(BigDecimal minimumPrice) {
    this.minimumPrice = minimumPrice;
  }

  public Market maximumPrice(BigDecimal maximumPrice) {
    this.maximumPrice = maximumPrice;
    return this;
  }

   /**
   * Get maximumPrice
   * @return maximumPrice
  **/
  @Schema(description = "")
  public BigDecimal getMaximumPrice() {
    return maximumPrice;
  }

  public void setMaximumPrice(BigDecimal maximumPrice) {
    this.maximumPrice = maximumPrice;
  }

  public Market tickSize(BigDecimal tickSize) {
    this.tickSize = tickSize;
    return this;
  }

   /**
   * Get tickSize
   * @return tickSize
  **/
  @Schema(description = "")
  public BigDecimal getTickSize() {
    return tickSize;
  }

  public void setTickSize(BigDecimal tickSize) {
    this.tickSize = tickSize;
  }

  public Market minimumQuantity(BigDecimal minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
    return this;
  }

   /**
   * Get minimumQuantity
   * @return minimumQuantity
  **/
  @Schema(description = "")
  public BigDecimal getMinimumQuantity() {
    return minimumQuantity;
  }

  public void setMinimumQuantity(BigDecimal minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
  }

  public Market maximumQuantity(BigDecimal maximumQuantity) {
    this.maximumQuantity = maximumQuantity;
    return this;
  }

   /**
   * Get maximumQuantity
   * @return maximumQuantity
  **/
  @Schema(description = "")
  public BigDecimal getMaximumQuantity() {
    return maximumQuantity;
  }

  public void setMaximumQuantity(BigDecimal maximumQuantity) {
    this.maximumQuantity = maximumQuantity;
  }

  public Market stepSize(BigDecimal stepSize) {
    this.stepSize = stepSize;
    return this;
  }

   /**
   * Get stepSize
   * @return stepSize
  **/
  @Schema(description = "")
  public BigDecimal getStepSize() {
    return stepSize;
  }

  public void setStepSize(BigDecimal stepSize) {
    this.stepSize = stepSize;
  }

  public Market minimumValue(BigDecimal minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

   /**
   * Get minimumValue
   * @return minimumValue
  **/
  @Schema(description = "")
  public BigDecimal getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(BigDecimal minimumValue) {
    this.minimumValue = minimumValue;
  }

  public Market maximumValue(BigDecimal maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

   /**
   * Get maximumValue
   * @return maximumValue
  **/
  @Schema(description = "")
  public BigDecimal getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(BigDecimal maximumValue) {
    this.maximumValue = maximumValue;
  }

  public Market summary(MarketSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @Schema(description = "")
  public MarketSummary getSummary() {
    return summary;
  }

  public void setSummary(MarketSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Market market = (Market) o;
    return Objects.equals(this.id, market.id) &&
        Objects.equals(this.symbol, market.symbol) &&
        Objects.equals(this.status, market.status) &&
        Objects.equals(this.minimumPrice, market.minimumPrice) &&
        Objects.equals(this.maximumPrice, market.maximumPrice) &&
        Objects.equals(this.tickSize, market.tickSize) &&
        Objects.equals(this.minimumQuantity, market.minimumQuantity) &&
        Objects.equals(this.maximumQuantity, market.maximumQuantity) &&
        Objects.equals(this.stepSize, market.stepSize) &&
        Objects.equals(this.minimumValue, market.minimumValue) &&
        Objects.equals(this.maximumValue, market.maximumValue) &&
        Objects.equals(this.summary, market.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, symbol, status, minimumPrice, maximumPrice, tickSize, minimumQuantity, maximumQuantity, stepSize, minimumValue, maximumValue, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Market {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    minimumPrice: ").append(toIndentedString(minimumPrice)).append("\n");
    sb.append("    maximumPrice: ").append(toIndentedString(maximumPrice)).append("\n");
    sb.append("    tickSize: ").append(toIndentedString(tickSize)).append("\n");
    sb.append("    minimumQuantity: ").append(toIndentedString(minimumQuantity)).append("\n");
    sb.append("    maximumQuantity: ").append(toIndentedString(maximumQuantity)).append("\n");
    sb.append("    stepSize: ").append(toIndentedString(stepSize)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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