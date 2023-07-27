package com.example.Spring_ex_5.dto;

public class BaseResponse {
    private ValidationEnum status = ValidationEnum.OK;
    public ValidationEnum getStatus() {
        return status;
    }
    public void setStatus(ValidationEnum status) {
        this.status = status;
    }
    public enum ValidationEnum {
        OK("OK"),
        KO("KO");
        private String status;

        ValidationEnum(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

    }
}
