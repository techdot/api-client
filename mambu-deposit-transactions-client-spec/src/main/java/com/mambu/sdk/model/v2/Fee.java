/*
 * deposits/transactions
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
import java.math.BigDecimal;
import java.util.Objects;

/**
 * An amount of predefined fee that was applied or paid on an account.
 */
@ApiModel(description = "An amount of predefined fee that was applied or paid on an account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-16T09:34:36.124Z")
public class Fee {
    @SerializedName("predefinedFeeKey")
    private String predefinedFeeKey = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("amount")
    private BigDecimal amount = null;

    @SerializedName("taxAmount")
    private BigDecimal taxAmount = null;
    @SerializedName("trigger")
    private TriggerEnum trigger = null;

    public Fee predefinedFeeKey(String predefinedFeeKey) {
        this.predefinedFeeKey = predefinedFeeKey;
        return this;
    }

    /**
     * The encoded key of the predefined fee, auto generated, unique
     *
     * @return predefinedFeeKey
     **/
    @ApiModelProperty(required = true, value = "The encoded key of the predefined fee, auto generated, unique")
    public String getPredefinedFeeKey() {
        return predefinedFeeKey;
    }

    public void setPredefinedFeeKey(String predefinedFeeKey) {
        this.predefinedFeeKey = predefinedFeeKey;
    }

    /**
     * The name of the predefined fee
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the predefined fee")
    public String getName() {
        return name;
    }

    public Fee amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The amount of the fee that was applied/paid in the transaction for the given predefined fee.
     *
     * @return amount
     **/
    @ApiModelProperty(value = "The amount of the fee that was applied/paid in the transaction for the given predefined fee.")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Fee taxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * The amount of the taxes on fee that was applied/paid in the transaction.
     *
     * @return taxAmount
     **/
    @ApiModelProperty(value = "The amount of the taxes on fee that was applied/paid in the transaction.")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Shows the event that will trigger a fee
     *
     * @return trigger
     **/
    @ApiModelProperty(value = "Shows the event that will trigger a fee")
    public TriggerEnum getTrigger() {
        return trigger;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fee fee = (Fee) o;
        return Objects.equals(this.predefinedFeeKey, fee.predefinedFeeKey) &&
                Objects.equals(this.name, fee.name) &&
                Objects.equals(this.amount, fee.amount) &&
                Objects.equals(this.taxAmount, fee.taxAmount) &&
                Objects.equals(this.trigger, fee.trigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(predefinedFeeKey, name, amount, taxAmount, trigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Fee {\n");

        sb.append("    predefinedFeeKey: ").append(toIndentedString(predefinedFeeKey)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
     * Shows the event that will trigger a fee
     */
    @JsonAdapter(TriggerEnum.Adapter.class)
    public enum TriggerEnum {
        MANUAL("MANUAL"),

        DISBURSEMENT("DISBURSEMENT"),

        CAPITALIZED_DISBURSEMENT("CAPITALIZED_DISBURSEMENT"),

        UPFRONT_DISBURSEMENT("UPFRONT_DISBURSEMENT"),

        LATE_REPAYMENT("LATE_REPAYMENT"),

        MONTHLY_FEE("MONTHLY_FEE"),

        PAYMENT_DUE("PAYMENT_DUE"),

        PAYMENT_DUE_APPLIED_ON_DUE_DATES("PAYMENT_DUE_APPLIED_ON_DUE_DATES"),

        ARBITRARY("ARBITRARY");

        private String value;

        TriggerEnum(String value) {
            this.value = value;
        }

        public static TriggerEnum fromValue(String text) {
            for (TriggerEnum b : TriggerEnum.values()) {
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

        public static class Adapter extends TypeAdapter<TriggerEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TriggerEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TriggerEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TriggerEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

