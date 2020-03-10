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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The deposit transaction terms
 */
@ApiModel(description = "The deposit transaction terms")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-16T09:34:36.124Z")
public class DepositTerms {
    @SerializedName("interestSettings")
    private DepositTransactionInterestSettings interestSettings = null;

    @SerializedName("overdraftInterestSettings")
    private DepositOverdraftInterestSettings overdraftInterestSettings = null;

    @SerializedName("overdraftSettings")
    private DepositOverdraftSettings overdraftSettings = null;

    public DepositTerms interestSettings(DepositTransactionInterestSettings interestSettings) {
        this.interestSettings = interestSettings;
        return this;
    }

    /**
     * Groups all fields having interest purpose concerning a transaction
     *
     * @return interestSettings
     **/
    @ApiModelProperty(value = "Groups all fields having interest purpose concerning a transaction")
    public DepositTransactionInterestSettings getInterestSettings() {
        return interestSettings;
    }

    public void setInterestSettings(DepositTransactionInterestSettings interestSettings) {
        this.interestSettings = interestSettings;
    }

    public DepositTerms overdraftInterestSettings(DepositOverdraftInterestSettings overdraftInterestSettings) {
        this.overdraftInterestSettings = overdraftInterestSettings;
        return this;
    }

    /**
     * Holds the deposit overdraft interest settings
     *
     * @return overdraftInterestSettings
     **/
    @ApiModelProperty(value = "Holds the deposit overdraft interest settings")
    public DepositOverdraftInterestSettings getOverdraftInterestSettings() {
        return overdraftInterestSettings;
    }

    public void setOverdraftInterestSettings(DepositOverdraftInterestSettings overdraftInterestSettings) {
        this.overdraftInterestSettings = overdraftInterestSettings;
    }

    public DepositTerms overdraftSettings(DepositOverdraftSettings overdraftSettings) {
        this.overdraftSettings = overdraftSettings;
        return this;
    }

    /**
     * Holds the deposit interest settings
     *
     * @return overdraftSettings
     **/
    @ApiModelProperty(value = "Holds the deposit interest settings")
    public DepositOverdraftSettings getOverdraftSettings() {
        return overdraftSettings;
    }

    public void setOverdraftSettings(DepositOverdraftSettings overdraftSettings) {
        this.overdraftSettings = overdraftSettings;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DepositTerms depositTerms = (DepositTerms) o;
        return Objects.equals(this.interestSettings, depositTerms.interestSettings) &&
                Objects.equals(this.overdraftInterestSettings, depositTerms.overdraftInterestSettings) &&
                Objects.equals(this.overdraftSettings, depositTerms.overdraftSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interestSettings, overdraftInterestSettings, overdraftSettings);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DepositTerms {\n");

        sb.append("    interestSettings: ").append(toIndentedString(interestSettings)).append("\n");
        sb.append("    overdraftInterestSettings: ").append(toIndentedString(overdraftInterestSettings)).append("\n");
        sb.append("    overdraftSettings: ").append(toIndentedString(overdraftSettings)).append("\n");
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
