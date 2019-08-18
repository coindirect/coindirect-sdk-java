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
import java.util.ArrayList;
import java.util.List;
import org.coindirect.api.model.HistoricalDataRequest;
import org.coindirect.api.model.OHLCV;
/**
 * HistoricalData
 */


public class HistoricalData {
  @JsonProperty("data")
  private List<OHLCV> data = null;

  @JsonProperty("metaData")
  private HistoricalDataRequest metaData = null;

  public HistoricalData data(List<OHLCV> data) {
    this.data = data;
    return this;
  }

  public HistoricalData addDataItem(OHLCV dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<OHLCV> getData() {
    return data;
  }

  public void setData(List<OHLCV> data) {
    this.data = data;
  }

  public HistoricalData metaData(HistoricalDataRequest metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @Schema(description = "")
  public HistoricalDataRequest getMetaData() {
    return metaData;
  }

  public void setMetaData(HistoricalDataRequest metaData) {
    this.metaData = metaData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalData historicalData = (HistoricalData) o;
    return Objects.equals(this.data, historicalData.data) &&
        Objects.equals(this.metaData, historicalData.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, metaData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalData {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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