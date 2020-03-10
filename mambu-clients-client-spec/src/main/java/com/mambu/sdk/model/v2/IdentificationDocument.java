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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An Id document represents a document that can be used to identify a person like a passport, a drivers license an id card etc.
 */
@ApiModel(description = "An Id document represents a document that can be used to identify a person like a passport, a drivers license an id card etc.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-17T14:40:27.775Z")
public class IdentificationDocument {
    @SerializedName("encodedKey")
    private String encodedKey = null;

    @SerializedName("clientKey")
    private String clientKey = null;

    @SerializedName("documentType")
    private String documentType = null;

    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("issuingAuthority")
    private String issuingAuthority = null;

    @SerializedName("validUntil")
    private LocalDate validUntil = null;

    @SerializedName("indexInList")
    private Integer indexInList = null;

    @SerializedName("identificationDocumentTemplateKey")
    private String identificationDocumentTemplateKey = null;

    @SerializedName("attachments")
    private List<Document> attachments = null;

    /**
     * The encoded key of the document, generated, unique
     *
     * @return encodedKey
     **/
    @ApiModelProperty(value = "The encoded key of the document, generated, unique")
    public String getEncodedKey() {
        return encodedKey;
    }

    /**
     * The encoded key of the client that owns this document
     *
     * @return clientKey
     **/
    @ApiModelProperty(value = "The encoded key of the client that owns this document")
    public String getClientKey() {
        return clientKey;
    }

    public IdentificationDocument documentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * The type of the document, Passport, Id card Drivers license, etc.
     *
     * @return documentType
     **/
    @ApiModelProperty(required = true, value = "The type of the document, Passport, Id card Drivers license, etc.")
    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public IdentificationDocument documentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * The id of the document
     *
     * @return documentId
     **/
    @ApiModelProperty(required = true, value = "The id of the document")
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public IdentificationDocument issuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /**
     * Authority that issued the document, eg. Police
     *
     * @return issuingAuthority
     **/
    @ApiModelProperty(value = "Authority that issued the document, eg. Police")
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public IdentificationDocument validUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * Date when the validity of the document ends
     *
     * @return validUntil
     **/
    @ApiModelProperty(example = "1987-04-26", value = "Date when the validity of the document ends")
    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public IdentificationDocument indexInList(Integer indexInList) {
        this.indexInList = indexInList;
        return this;
    }

    /**
     * This document&#39;s index in the list of documents
     *
     * @return indexInList
     **/
    @ApiModelProperty(value = "This document's index in the list of documents")
    public Integer getIndexInList() {
        return indexInList;
    }

    public void setIndexInList(Integer indexInList) {
        this.indexInList = indexInList;
    }

    public IdentificationDocument identificationDocumentTemplateKey(String identificationDocumentTemplateKey) {
        this.identificationDocumentTemplateKey = identificationDocumentTemplateKey;
        return this;
    }

    /**
     * Encoded key of the template used for this document
     *
     * @return identificationDocumentTemplateKey
     **/
    @ApiModelProperty(value = "Encoded key of the template used for this document")
    public String getIdentificationDocumentTemplateKey() {
        return identificationDocumentTemplateKey;
    }

    public void setIdentificationDocumentTemplateKey(String identificationDocumentTemplateKey) {
        this.identificationDocumentTemplateKey = identificationDocumentTemplateKey;
    }

    public IdentificationDocument attachments(List<Document> attachments) {
        this.attachments = attachments;
        return this;
    }

    public IdentificationDocument addAttachmentsItem(Document attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<Document>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    /**
     * A list containing information about the attached files for this document
     *
     * @return attachments
     **/
    @ApiModelProperty(value = "A list containing information about the attached files for this document")
    public List<Document> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Document> attachments) {
        this.attachments = attachments;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentificationDocument identificationDocument = (IdentificationDocument) o;
        return Objects.equals(this.encodedKey, identificationDocument.encodedKey) &&
                Objects.equals(this.clientKey, identificationDocument.clientKey) &&
                Objects.equals(this.documentType, identificationDocument.documentType) &&
                Objects.equals(this.documentId, identificationDocument.documentId) &&
                Objects.equals(this.issuingAuthority, identificationDocument.issuingAuthority) &&
                Objects.equals(this.validUntil, identificationDocument.validUntil) &&
                Objects.equals(this.indexInList, identificationDocument.indexInList) &&
                Objects.equals(this.identificationDocumentTemplateKey, identificationDocument.identificationDocumentTemplateKey) &&
                Objects.equals(this.attachments, identificationDocument.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodedKey, clientKey, documentType, documentId, issuingAuthority, validUntil, indexInList, identificationDocumentTemplateKey, attachments);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentificationDocument {\n");

        sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
        sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
        sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
        sb.append("    indexInList: ").append(toIndentedString(indexInList)).append("\n");
        sb.append("    identificationDocumentTemplateKey: ").append(toIndentedString(identificationDocumentTemplateKey)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

