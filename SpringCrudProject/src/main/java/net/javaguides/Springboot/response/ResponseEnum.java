package net.javaguides.Springboot.response;

import org.json.JSONObject;

public enum ResponseEnum {
    Create_SUCCESS("success","Created Leads Successfully");

    private final String status;
    private final String message;
    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }



    //Enum constructor
    ResponseEnum(String status, String message) {
        this.status=status;
        this.message = message;
    }

}
