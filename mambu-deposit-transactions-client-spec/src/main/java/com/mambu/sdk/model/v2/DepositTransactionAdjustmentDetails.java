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
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Contains the details of the transaction adjustment
 */
@ApiModel(description = "Contains the details of the transaction adjustment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-16T09:34:36.124Z")
public class DepositTransactionAdjustmentDetails {
    @SerializedName("notes")
    private String notes = null;

    @SerializedName("bookingDate")
    private OffsetDateTime bookingDate = null;

    public DepositTransactionAdjustmentDetails notes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Notes detailing why the transaction is adjusted
     *
     * @return notes
     **/
    @ApiModelProperty(value = "Notes detailing why the transaction is adjusted")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public DepositTransactionAdjustmentDetails bookingDate(OffsetDateTime bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    /**
     * Date when the adjustment transaction is logged into accounting. Can be null. Available only for DEPOSIT and WITHDRAWAL
     *
     * @return bookingDate
     **/
    @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "Date when the adjustment transaction is logged into accounting. Can be null. Available only for DEPOSIT and WITHDRAWAL")
    public OffsetDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(OffsetDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DepositTransactionAdjustmentDetails depositTransactionAdjustmentDetails = (DepositTransactionAdjustmentDetails) o;
        return Objects.equals(this.notes, depositTransactionAdjustmentDetails.notes) &&
                Objects.equals(this.bookingDate, depositTransactionAdjustmentDetails.bookingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes, bookingDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DepositTransactionAdjustmentDetails {\n");

        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
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

