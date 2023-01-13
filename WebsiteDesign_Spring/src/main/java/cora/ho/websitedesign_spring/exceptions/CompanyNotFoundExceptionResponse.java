package cora.ho.websitedesign_spring.exceptions;

public class CompanyNotFoundExceptionResponse {
    private String companyNotFound;

    public CompanyNotFoundExceptionResponse(String companyNotFound) {
        this.companyNotFound = companyNotFound;
    }

    public String getCompanyNotFound() {
        return companyNotFound;
    }

    public void setCompanyNotFound(String companyNotFound) {
        this.companyNotFound = companyNotFound;
    }
}
