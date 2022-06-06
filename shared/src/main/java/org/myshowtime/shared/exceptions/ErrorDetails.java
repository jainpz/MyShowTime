package org.myshowtime.shared.exceptions;

import java.util.Date;

public class ErrorDetails {

    private Date date;
    private String errorMessage;
    private String errorDescription;

    public ErrorDetails(Date date, String errorMessage, String errorDescription) {

        this.date = date;
        this.errorMessage = errorMessage;
        this.errorDescription = errorDescription;

    }

    public Date getDate() {
        return date;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}
