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
import org.coindirect.api.model.EncodedFile;
/**
 * AccountDocument
 */


public class AccountDocument {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("file")
  private EncodedFile file = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("statusReason")
  private String statusReason = null;

  public AccountDocument id(Long id) {
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

  public AccountDocument code(String code) {
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

  public AccountDocument description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountDocument file(EncodedFile file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @Schema(description = "")
  public EncodedFile getFile() {
    return file;
  }

  public void setFile(EncodedFile file) {
    this.file = file;
  }

  public AccountDocument status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public AccountDocument statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

   /**
   * Get statusReason
   * @return statusReason
  **/
  @Schema(description = "")
  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDocument accountDocument = (AccountDocument) o;
    return Objects.equals(this.id, accountDocument.id) &&
        Objects.equals(this.code, accountDocument.code) &&
        Objects.equals(this.description, accountDocument.description) &&
        Objects.equals(this.file, accountDocument.file) &&
        Objects.equals(this.status, accountDocument.status) &&
        Objects.equals(this.statusReason, accountDocument.statusReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, description, file, status, statusReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
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