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
/**
 * CurrencyRate
 */


public class CurrencyRate {
  @JsonProperty("baseCode")
  private String baseCode = null;

  @JsonProperty("counterCode")
  private String counterCode = null;

  @JsonProperty("rate")
  private BigDecimal rate = null;

  public CurrencyRate baseCode(String baseCode) {
    this.baseCode = baseCode;
    return this;
  }

   /**
   * Get baseCode
   * @return baseCode
  **/
  @Schema(description = "")
  public String getBaseCode() {
    return baseCode;
  }

  public void setBaseCode(String baseCode) {
    this.baseCode = baseCode;
  }

  public CurrencyRate counterCode(String counterCode) {
    this.counterCode = counterCode;
    return this;
  }

   /**
   * Get counterCode
   * @return counterCode
  **/
  @Schema(description = "")
  public String getCounterCode() {
    return counterCode;
  }

  public void setCounterCode(String counterCode) {
    this.counterCode = counterCode;
  }

  public CurrencyRate rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @Schema(description = "")
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyRate currencyRate = (CurrencyRate) o;
    return Objects.equals(this.baseCode, currencyRate.baseCode) &&
        Objects.equals(this.counterCode, currencyRate.counterCode) &&
        Objects.equals(this.rate, currencyRate.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCode, counterCode, rate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyRate {\n");
    
    sb.append("    baseCode: ").append(toIndentedString(baseCode)).append("\n");
    sb.append("    counterCode: ").append(toIndentedString(counterCode)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
