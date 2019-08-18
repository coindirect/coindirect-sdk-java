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
 * CurrencySnapshot
 */


public class CurrencySnapshot {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("bestSellOfferPrice")
  private BigDecimal bestSellOfferPrice = null;

  @JsonProperty("bestBuyOfferPrice")
  private BigDecimal bestBuyOfferPrice = null;

  @JsonProperty("circulatingSupply")
  private BigDecimal circulatingSupply = null;

  @JsonProperty("currencyAccepted")
  private Currency currencyAccepted = null;

  @JsonProperty("currencyForSale")
  private Currency currencyForSale = null;

  @JsonProperty("percentChange1h")
  private BigDecimal percentChange1h = null;

  @JsonProperty("percentChange24h")
  private BigDecimal percentChange24h = null;

  @JsonProperty("percentChange7d")
  private BigDecimal percentChange7d = null;

  @JsonProperty("rank")
  private Long rank = null;

  @JsonProperty("totalSupply")
  private BigDecimal totalSupply = null;

  @JsonProperty("volumeUsd24h")
  private BigDecimal volumeUsd24h = null;

  public CurrencySnapshot id(Long id) {
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

  public CurrencySnapshot bestSellOfferPrice(BigDecimal bestSellOfferPrice) {
    this.bestSellOfferPrice = bestSellOfferPrice;
    return this;
  }

   /**
   * Get bestSellOfferPrice
   * @return bestSellOfferPrice
  **/
  @Schema(description = "")
  public BigDecimal getBestSellOfferPrice() {
    return bestSellOfferPrice;
  }

  public void setBestSellOfferPrice(BigDecimal bestSellOfferPrice) {
    this.bestSellOfferPrice = bestSellOfferPrice;
  }

  public CurrencySnapshot bestBuyOfferPrice(BigDecimal bestBuyOfferPrice) {
    this.bestBuyOfferPrice = bestBuyOfferPrice;
    return this;
  }

   /**
   * Get bestBuyOfferPrice
   * @return bestBuyOfferPrice
  **/
  @Schema(description = "")
  public BigDecimal getBestBuyOfferPrice() {
    return bestBuyOfferPrice;
  }

  public void setBestBuyOfferPrice(BigDecimal bestBuyOfferPrice) {
    this.bestBuyOfferPrice = bestBuyOfferPrice;
  }

  public CurrencySnapshot circulatingSupply(BigDecimal circulatingSupply) {
    this.circulatingSupply = circulatingSupply;
    return this;
  }

   /**
   * Get circulatingSupply
   * @return circulatingSupply
  **/
  @Schema(description = "")
  public BigDecimal getCirculatingSupply() {
    return circulatingSupply;
  }

  public void setCirculatingSupply(BigDecimal circulatingSupply) {
    this.circulatingSupply = circulatingSupply;
  }

  public CurrencySnapshot currencyAccepted(Currency currencyAccepted) {
    this.currencyAccepted = currencyAccepted;
    return this;
  }

   /**
   * Get currencyAccepted
   * @return currencyAccepted
  **/
  @Schema(description = "")
  public Currency getCurrencyAccepted() {
    return currencyAccepted;
  }

  public void setCurrencyAccepted(Currency currencyAccepted) {
    this.currencyAccepted = currencyAccepted;
  }

  public CurrencySnapshot currencyForSale(Currency currencyForSale) {
    this.currencyForSale = currencyForSale;
    return this;
  }

   /**
   * Get currencyForSale
   * @return currencyForSale
  **/
  @Schema(description = "")
  public Currency getCurrencyForSale() {
    return currencyForSale;
  }

  public void setCurrencyForSale(Currency currencyForSale) {
    this.currencyForSale = currencyForSale;
  }

  public CurrencySnapshot percentChange1h(BigDecimal percentChange1h) {
    this.percentChange1h = percentChange1h;
    return this;
  }

   /**
   * Get percentChange1h
   * @return percentChange1h
  **/
  @Schema(description = "")
  public BigDecimal getPercentChange1h() {
    return percentChange1h;
  }

  public void setPercentChange1h(BigDecimal percentChange1h) {
    this.percentChange1h = percentChange1h;
  }

  public CurrencySnapshot percentChange24h(BigDecimal percentChange24h) {
    this.percentChange24h = percentChange24h;
    return this;
  }

   /**
   * Get percentChange24h
   * @return percentChange24h
  **/
  @Schema(description = "")
  public BigDecimal getPercentChange24h() {
    return percentChange24h;
  }

  public void setPercentChange24h(BigDecimal percentChange24h) {
    this.percentChange24h = percentChange24h;
  }

  public CurrencySnapshot percentChange7d(BigDecimal percentChange7d) {
    this.percentChange7d = percentChange7d;
    return this;
  }

   /**
   * Get percentChange7d
   * @return percentChange7d
  **/
  @Schema(description = "")
  public BigDecimal getPercentChange7d() {
    return percentChange7d;
  }

  public void setPercentChange7d(BigDecimal percentChange7d) {
    this.percentChange7d = percentChange7d;
  }

  public CurrencySnapshot rank(Long rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @Schema(description = "")
  public Long getRank() {
    return rank;
  }

  public void setRank(Long rank) {
    this.rank = rank;
  }

  public CurrencySnapshot totalSupply(BigDecimal totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * Get totalSupply
   * @return totalSupply
  **/
  @Schema(description = "")
  public BigDecimal getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(BigDecimal totalSupply) {
    this.totalSupply = totalSupply;
  }

  public CurrencySnapshot volumeUsd24h(BigDecimal volumeUsd24h) {
    this.volumeUsd24h = volumeUsd24h;
    return this;
  }

   /**
   * Get volumeUsd24h
   * @return volumeUsd24h
  **/
  @Schema(description = "")
  public BigDecimal getVolumeUsd24h() {
    return volumeUsd24h;
  }

  public void setVolumeUsd24h(BigDecimal volumeUsd24h) {
    this.volumeUsd24h = volumeUsd24h;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencySnapshot currencySnapshot = (CurrencySnapshot) o;
    return Objects.equals(this.id, currencySnapshot.id) &&
        Objects.equals(this.bestSellOfferPrice, currencySnapshot.bestSellOfferPrice) &&
        Objects.equals(this.bestBuyOfferPrice, currencySnapshot.bestBuyOfferPrice) &&
        Objects.equals(this.circulatingSupply, currencySnapshot.circulatingSupply) &&
        Objects.equals(this.currencyAccepted, currencySnapshot.currencyAccepted) &&
        Objects.equals(this.currencyForSale, currencySnapshot.currencyForSale) &&
        Objects.equals(this.percentChange1h, currencySnapshot.percentChange1h) &&
        Objects.equals(this.percentChange24h, currencySnapshot.percentChange24h) &&
        Objects.equals(this.percentChange7d, currencySnapshot.percentChange7d) &&
        Objects.equals(this.rank, currencySnapshot.rank) &&
        Objects.equals(this.totalSupply, currencySnapshot.totalSupply) &&
        Objects.equals(this.volumeUsd24h, currencySnapshot.volumeUsd24h);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bestSellOfferPrice, bestBuyOfferPrice, circulatingSupply, currencyAccepted, currencyForSale, percentChange1h, percentChange24h, percentChange7d, rank, totalSupply, volumeUsd24h);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencySnapshot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bestSellOfferPrice: ").append(toIndentedString(bestSellOfferPrice)).append("\n");
    sb.append("    bestBuyOfferPrice: ").append(toIndentedString(bestBuyOfferPrice)).append("\n");
    sb.append("    circulatingSupply: ").append(toIndentedString(circulatingSupply)).append("\n");
    sb.append("    currencyAccepted: ").append(toIndentedString(currencyAccepted)).append("\n");
    sb.append("    currencyForSale: ").append(toIndentedString(currencyForSale)).append("\n");
    sb.append("    percentChange1h: ").append(toIndentedString(percentChange1h)).append("\n");
    sb.append("    percentChange24h: ").append(toIndentedString(percentChange24h)).append("\n");
    sb.append("    percentChange7d: ").append(toIndentedString(percentChange7d)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    volumeUsd24h: ").append(toIndentedString(volumeUsd24h)).append("\n");
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