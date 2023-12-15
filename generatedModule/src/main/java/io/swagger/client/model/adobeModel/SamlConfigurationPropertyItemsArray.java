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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SamlConfigurationPropertyItemsArray
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-15T21:05:42.103338900+03:00[Europe/Moscow]")
public class SamlConfigurationPropertyItemsArray {
  @SerializedName("description")
  private String description = null;

  @SerializedName("is_set")
  private Boolean isSet = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("optional")
  private Boolean optional = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("values")
  private List<String> values = null;

  public SamlConfigurationPropertyItemsArray description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Property description
   * @return description
  **/
  @Schema(description = "Property description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SamlConfigurationPropertyItemsArray isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

   /**
   * True if property is set
   * @return isSet
  **/
  @Schema(description = "True if property is set")
  public Boolean isIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  public SamlConfigurationPropertyItemsArray name(String name) {
    this.name = name;
    return this;
  }

   /**
   * property name
   * @return name
  **/
  @Schema(description = "property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SamlConfigurationPropertyItemsArray optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * True if optional
   * @return optional
  **/
  @Schema(description = "True if optional")
  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public SamlConfigurationPropertyItemsArray type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
   * @return type
  **/
  @Schema(description = "Property type, 1=String, 3=long, 11=boolean, 12=Password")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public SamlConfigurationPropertyItemsArray values(List<String> values) {
    this.values = values;
    return this;
  }

  public SamlConfigurationPropertyItemsArray addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Property value
   * @return values
  **/
  @Schema(description = "Property value")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfigurationPropertyItemsArray samlConfigurationPropertyItemsArray = (SamlConfigurationPropertyItemsArray) o;
    return Objects.equals(this.description, samlConfigurationPropertyItemsArray.description) &&
        Objects.equals(this.isSet, samlConfigurationPropertyItemsArray.isSet) &&
        Objects.equals(this.name, samlConfigurationPropertyItemsArray.name) &&
        Objects.equals(this.optional, samlConfigurationPropertyItemsArray.optional) &&
        Objects.equals(this.type, samlConfigurationPropertyItemsArray.type) &&
        Objects.equals(this.values, samlConfigurationPropertyItemsArray.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isSet, name, optional, type, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationPropertyItemsArray {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
