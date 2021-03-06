/*
 * deposits
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Groups all fields related to a deposit account&#39;s overdraft settings
 */
@ApiModel(description = "Groups all fields related to a deposit account's overdraft settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-17T14:24:31.447Z")
public class DepositAccountOverdraftSettings {
    @SerializedName("allowOverdraft")
    private Boolean allowOverdraft = false;

    @SerializedName("overdraftLimit")
    private BigDecimal overdraftLimit = null;

    @SerializedName("overdraftExpiryDate")
    private OffsetDateTime overdraftExpiryDate = null;

    public DepositAccountOverdraftSettings allowOverdraft(Boolean allowOverdraft) {
        this.allowOverdraft = allowOverdraft;
        return this;
    }

    /**
     * Whether this account supports overdraft or not
     *
     * @return allowOverdraft
     **/
    @ApiModelProperty(value = "Whether this account supports overdraft or not")
    public Boolean isAllowOverdraft() {
        return allowOverdraft;
    }

    public void setAllowOverdraft(Boolean allowOverdraft) {
        this.allowOverdraft = allowOverdraft;
    }

    public DepositAccountOverdraftSettings overdraftLimit(BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
        return this;
    }

    /**
     * How much may be taken out as overdraft, null means 0
     *
     * @return overdraftLimit
     **/
    @ApiModelProperty(value = "How much may be taken out as overdraft, null means 0")
    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public DepositAccountOverdraftSettings overdraftExpiryDate(OffsetDateTime overdraftExpiryDate) {
        this.overdraftExpiryDate = overdraftExpiryDate;
        return this;
    }

    /**
     * The expiration date of an overdraft
     *
     * @return overdraftExpiryDate
     **/
    @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The expiration date of an overdraft")
    public OffsetDateTime getOverdraftExpiryDate() {
        return overdraftExpiryDate;
    }

    public void setOverdraftExpiryDate(OffsetDateTime overdraftExpiryDate) {
        this.overdraftExpiryDate = overdraftExpiryDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DepositAccountOverdraftSettings depositAccountOverdraftSettings = (DepositAccountOverdraftSettings) o;
        return Objects.equals(this.allowOverdraft, depositAccountOverdraftSettings.allowOverdraft) &&
                Objects.equals(this.overdraftLimit, depositAccountOverdraftSettings.overdraftLimit) &&
                Objects.equals(this.overdraftExpiryDate, depositAccountOverdraftSettings.overdraftExpiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowOverdraft, overdraftLimit, overdraftExpiryDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DepositAccountOverdraftSettings {\n");

        sb.append("    allowOverdraft: ").append(toIndentedString(allowOverdraft)).append("\n");
        sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
        sb.append("    overdraftExpiryDate: ").append(toIndentedString(overdraftExpiryDate)).append("\n");
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

