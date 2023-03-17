/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ReadOnlyFirst;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * ArrayTest
 */
@JsonPropertyOrder({
  ArrayTest.JSON_PROPERTY_ARRAY_OF_STRING,
  ArrayTest.JSON_PROPERTY_ARRAY_ARRAY_OF_INTEGER,
  ArrayTest.JSON_PROPERTY_ARRAY_ARRAY_OF_MODEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArrayTest {
  public static final String JSON_PROPERTY_ARRAY_OF_STRING = "array_of_string";
  private List<String> arrayOfString;

  public static final String JSON_PROPERTY_ARRAY_ARRAY_OF_INTEGER = "array_array_of_integer";
  private List<List<Long>> arrayArrayOfInteger;

  public static final String JSON_PROPERTY_ARRAY_ARRAY_OF_MODEL = "array_array_of_model";
  private List<List<ReadOnlyFirst>> arrayArrayOfModel;

  public ArrayTest() { 
  }

  public ArrayTest arrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
    return this;
  }

  public ArrayTest addArrayOfStringItem(String arrayOfStringItem) {
    if (this.arrayOfString == null) {
      this.arrayOfString = new ArrayList<>();
    }
    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

   /**
   * Get arrayOfString
   * @return arrayOfString
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_OF_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getArrayOfString() {
    return arrayOfString;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_OF_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }


  public ArrayTest arrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  public ArrayTest addArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    if (this.arrayArrayOfInteger == null) {
      this.arrayArrayOfInteger = new ArrayList<>();
    }
    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

   /**
   * Get arrayArrayOfInteger
   * @return arrayArrayOfInteger
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_ARRAY_OF_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_ARRAY_OF_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }


  public ArrayTest arrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  public ArrayTest addArrayArrayOfModelItem(List<ReadOnlyFirst> arrayArrayOfModelItem) {
    if (this.arrayArrayOfModel == null) {
      this.arrayArrayOfModel = new ArrayList<>();
    }
    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }

   /**
   * Get arrayArrayOfModel
   * @return arrayArrayOfModel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_ARRAY_OF_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_ARRAY_OF_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }


  /**
   * Return true if this ArrayTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
    return Objects.equals(this.arrayOfString, arrayTest.arrayOfString) &&
        Objects.equals(this.arrayArrayOfInteger, arrayTest.arrayArrayOfInteger) &&
        Objects.equals(this.arrayArrayOfModel, arrayTest.arrayArrayOfModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfString, arrayArrayOfInteger, arrayArrayOfModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

