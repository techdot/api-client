/*
 * clients
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.mambu.sdk.model.v2;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * A single change that needs to be made to a resource
 */
@ApiModel(description = "A single change that needs to be made to a resource")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-17T14:40:27.775Z")
public class PatchOperation {
    @SerializedName("op")
    private OpEnum op = null;
    @SerializedName("path")
    private String path = null;
    @SerializedName("from")
    private String from = null;
    @SerializedName("value")
    private Object value = null;

    public PatchOperation op(OpEnum op) {
        this.op = op;
        return this;
    }

    /**
     * The change to perform
     *
     * @return op
     **/
    @ApiModelProperty(required = true, value = "The change to perform")
    public OpEnum getOp() {
        return op;
    }

    public void setOp(OpEnum op) {
        this.op = op;
    }

    public PatchOperation path(String path) {
        this.path = path;
        return this;
    }

    /**
     * The field to perform the operation on
     *
     * @return path
     **/
    @ApiModelProperty(required = true, value = "The field to perform the operation on")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PatchOperation from(String from) {
        this.from = from;
        return this;
    }

    /**
     * The field from where a value should be moved, when using move
     *
     * @return from
     **/
    @ApiModelProperty(value = "The field from where a value should be moved, when using move")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public PatchOperation value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the field, can be null
     *
     * @return value
     **/
    @ApiModelProperty(value = "The value of the field, can be null")
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatchOperation patchOperation = (PatchOperation) o;
        return Objects.equals(this.op, patchOperation.op) &&
                Objects.equals(this.path, patchOperation.path) &&
                Objects.equals(this.from, patchOperation.from) &&
                Objects.equals(this.value, patchOperation.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(op, path, from, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchOperation {\n");

        sb.append("    op: ").append(toIndentedString(op)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

    /**
     * The change to perform
     */
    @JsonAdapter(OpEnum.Adapter.class)
    public enum OpEnum {
        ADD("ADD"),

        REPLACE("REPLACE"),

        REMOVE("REMOVE"),

        MOVE("MOVE");

        private String value;

        OpEnum(String value) {
            this.value = value;
        }

        public static OpEnum fromValue(String text) {
            for (OpEnum b : OpEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<OpEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OpEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OpEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OpEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

