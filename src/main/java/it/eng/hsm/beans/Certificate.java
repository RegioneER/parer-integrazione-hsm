package it.eng.hsm.beans;

import java.util.Date;

/**
 * This bean contains the certificate informations.
 *
 * @author Moretti_Lu
 *
 */
public class Certificate {

    /**
     * Certificate bytestream
     */
    private byte[] x509;
    private String version;
    private String type;
    private String serialNumber;
    private String certKeyUsage;
    private String givenName;
    private String surname;
    private String fiscalCode;
    private String organisation;
    private String orgUnity;
    private String id;
    private String trustServiceProvider;
    private Date validityFrom;
    private Date validityTo;

    public Certificate() {
    }

    public Certificate(byte[] x509) {
        this.x509 = x509;
    }

    public byte[] getX509() {
        return x509;
    }

    public void setX509(byte[] x509) {
        this.x509 = x509;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCertKeyUsage() {
        return certKeyUsage;
    }

    public void setCertKeyUsage(String certKeyUsage) {
        this.certKeyUsage = certKeyUsage;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getOrgUnity() {
        return orgUnity;
    }

    public void setOrgUnity(String orgUnity) {
        this.orgUnity = orgUnity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrustServiceProvider() {
        return trustServiceProvider;
    }

    public void setTrustServiceProvider(String trustServiceProvider) {
        this.trustServiceProvider = trustServiceProvider;
    }

    public Date getValidityFrom() {
        Date d = null;
        if (validityFrom != null) {
            d = new Date(validityFrom.getTime());
        }
        return d;
    }

    public void setValidityFrom(Date validityFrom) {
        if (validityFrom != null) {
            this.validityFrom = new Date(validityFrom.getTime());
        }
    }

    public Date getValidityTo() {
        Date d = null;
        if (validityTo != null) {
            d = new Date(validityTo.getTime());
        }
        return d;
    }

    public void setValidityTo(Date validityTo) {
        if (validityTo != null) {
            this.validityTo = new Date(validityTo.getTime());
        }
    }

    @Override
    protected Object clone() {
        Certificate result = null;
        try {
            Object obj = super.clone();
            result = (Certificate) obj;
        } catch (CloneNotSupportedException e) {
            result = new Certificate();
        }

        result.x509 = this.x509;
        result.version = this.version;
        result.type = this.type;
        result.serialNumber = this.serialNumber;
        result.certKeyUsage = this.certKeyUsage;
        result.givenName = this.givenName;
        result.surname = this.surname;
        result.fiscalCode = this.fiscalCode;
        result.organisation = this.organisation;
        result.orgUnity = this.orgUnity;
        result.id = this.id;
        result.trustServiceProvider = this.trustServiceProvider;

        result.validityFrom = new Date(validityFrom.getTime());
        result.validityTo = new Date(validityTo.getTime());

        return result;
    }
}