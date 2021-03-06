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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.coindirect.api.model.Form;
/**
 * AmlCheckResponse
 */


public class AmlCheckResponse {
  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    REDIRECT("REDIRECT"),
    FORM("FORM"),
    OTHER("OTHER");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("action")
  private ActionEnum action = null;

  @JsonProperty("form")
  private Form form = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("metadata")
  private Map<String, Object> metadata = null;

  public AmlCheckResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public AmlCheckResponse form(Form form) {
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @Schema(description = "")
  public Form getForm() {
    return form;
  }

  public void setForm(Form form) {
    this.form = form;
  }

  public AmlCheckResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AmlCheckResponse provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @Schema(description = "")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public AmlCheckResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @Schema(description = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public AmlCheckResponse metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public AmlCheckResponse putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmlCheckResponse amlCheckResponse = (AmlCheckResponse) o;
    return Objects.equals(this.action, amlCheckResponse.action) &&
        Objects.equals(this.form, amlCheckResponse.form) &&
        Objects.equals(this.url, amlCheckResponse.url) &&
        Objects.equals(this.provider, amlCheckResponse.provider) &&
        Objects.equals(this.reference, amlCheckResponse.reference) &&
        Objects.equals(this.metadata, amlCheckResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, form, url, provider, reference, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmlCheckResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
