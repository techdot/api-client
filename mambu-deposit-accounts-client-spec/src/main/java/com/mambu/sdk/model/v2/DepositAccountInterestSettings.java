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

import java.util.Objects;

/**
 * Groups all fields related to a deposit account&#39;s interest settings
 */
@ApiModel(description = "Groups all fields related to a deposit account's interest settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-17T14:24:31.447Z")
public class DepositAccountInterestSettings {
    @SerializedName("interestRateSettings")
    private DepositAccountInterestRateSettings interestRateSettings = null;

    @SerializedName("interestPaymentSettings")
    private DepositAccountInterestPaymentSettings interestPaymentSettings = null;

    public DepositAccountInterestSettings interestRateSettings(DepositAccountInterestRateSettings interestRateSettings) {
        this.interestRateSettings = interestRateSettings;
        return this;
    }

    /**
     * Interest rate settings for deposit accounts
     *
     * @return interestRateSettings
     **/
    @ApiModelProperty(value = "Interest rate settings for deposit accounts")
    public DepositAccountInterestRateSettings getInterestRateSettings() {
        return interestRateSettings;
    }

    public void setInterestRateSettings(DepositAccountInterestRateSettings interestRateSettings) {
        this.interestRateSettings = interestRateSettings;
    }

    public DepositAccountInterestSettings interestPaymentSettings(DepositAccountInterestPaymentSettings interestPaymentSettings) {
        this.interestPaymentSettings = interestPaymentSettings;
        return this;
    }

    /**
     * Interest payment settings for the account
     *
     * @return interestPaymentSettings
     **/
    @ApiModelProperty(value = "Interest payment settings for the account")
    public DepositAccountInterestPaymentSettings getInterestPaymentSettings() {
        return interestPaymentSettings;
    }

    public void setInterestPaymentSettings(DepositAccountInterestPaymentSettings interestPaymentSettings) {
        this.interestPaymentSettings = interestPaymentSettings;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DepositAccountInterestSettings depositAccountInterestSettings = (DepositAccountInterestSettings) o;
        return Objects.equals(this.interestRateSettings, depositAccountInterestSettings.interestRateSettings) &&
                Objects.equals(this.interestPaymentSettings, depositAccountInterestSettings.interestPaymentSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interestRateSettings, interestPaymentSettings);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DepositAccountInterestSettings {\n");

        sb.append("    interestRateSettings: ").append(toIndentedString(interestRateSettings)).append("\n");
        sb.append("    interestPaymentSettings: ").append(toIndentedString(interestPaymentSettings)).append("\n");
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

