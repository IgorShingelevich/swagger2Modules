/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 3.7.1-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model.adobeModel;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import java.io.IOException;
/**
 * EtcTruststoreBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-15T21:05:42.103338900+03:00[Europe/Moscow]")
public class EtcTruststoreBody {
  @SerializedName("truststore.p12")
  private File truststoreP12 = null;

  public EtcTruststoreBody truststoreP12(File truststoreP12) {
    this.truststoreP12 = truststoreP12;
    return this;
  }

   /**
   * Get truststoreP12
   * @return truststoreP12
  **/
  @Schema(description = "")
  public File getTruststoreP12() {
    return truststoreP12;
  }

  public void setTruststoreP12(File truststoreP12) {
    this.truststoreP12 = truststoreP12;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtcTruststoreBody etcTruststoreBody = (EtcTruststoreBody) o;
    return Objects.equals(this.truststoreP12, etcTruststoreBody.truststoreP12);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(truststoreP12));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtcTruststoreBody {\n");
    
    sb.append("    truststoreP12: ").append(toIndentedString(truststoreP12)).append("\n");
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
