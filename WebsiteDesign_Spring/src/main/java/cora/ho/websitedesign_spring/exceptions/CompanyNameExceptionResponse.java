package cora.ho.websitedesign_spring.exceptions;

public class CompanyNameExceptionResponse {

    private String companyName;

    public CompanyNameExceptionResponse(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
