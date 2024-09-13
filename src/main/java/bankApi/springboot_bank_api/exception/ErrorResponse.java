package bankApi.springboot_bank_api.exception;

import bankApi.springboot_bank_api.Entity.CardType;

import java.util.List;

public class ErrorResponse {
    private String message;
    private List<String> details;
    private List<CardType> validCardTypes;
    public ErrorResponse(String message, List<String> details) {
        this.message = message;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public List<CardType> getValidCardTypes() {
        return validCardTypes;
    }

    public void setValidCardTypes(List<CardType> validCardTypes) {
        this.validCardTypes = validCardTypes;
    }
}
