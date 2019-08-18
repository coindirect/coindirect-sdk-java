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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.coindirect.api.model.CountryDocument;
import org.coindirect.api.model.Region;
/**
 * Country
 */


public class Country {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("allowRegistration")
  private Boolean allowRegistration = false;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("documents")
  private List<CountryDocument> documents = null;

  @JsonProperty("defaultCurrency")
  private String defaultCurrency = null;

  @JsonProperty("options")
  private Map<String, Object> options = null;

  @JsonProperty("region")
  private Region region = null;

  public Country id(Long id) {
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

  public Country allowRegistration(Boolean allowRegistration) {
    this.allowRegistration = allowRegistration;
    return this;
  }

   /**
   * Get allowRegistration
   * @return allowRegistration
  **/
  @Schema(description = "")
  public Boolean isAllowRegistration() {
    return allowRegistration;
  }

  public void setAllowRegistration(Boolean allowRegistration) {
    this.allowRegistration = allowRegistration;
  }

  public Country code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Country name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country documents(List<CountryDocument> documents) {
    this.documents = documents;
    return this;
  }

  public Country addDocumentsItem(CountryDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @Schema(description = "")
  public List<CountryDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<CountryDocument> documents) {
    this.documents = documents;
  }

  public Country defaultCurrency(String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Get defaultCurrency
   * @return defaultCurrency
  **/
  @Schema(description = "")
  public String getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public Country options(Map<String, Object> options) {
    this.options = options;
    return this;
  }

  public Country putOptionsItem(String key, Object optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public Map<String, Object> getOptions() {
    return options;
  }

  public void setOptions(Map<String, Object> options) {
    this.options = options;
  }

  public Country region(Region region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.id, country.id) &&
        Objects.equals(this.allowRegistration, country.allowRegistration) &&
        Objects.equals(this.code, country.code) &&
        Objects.equals(this.name, country.name) &&
        Objects.equals(this.documents, country.documents) &&
        Objects.equals(this.defaultCurrency, country.defaultCurrency) &&
        Objects.equals(this.options, country.options) &&
        Objects.equals(this.region, country.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, allowRegistration, code, name, documents, defaultCurrency, options, region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    allowRegistration: ").append(toIndentedString(allowRegistration)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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