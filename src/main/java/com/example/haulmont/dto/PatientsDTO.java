package com.example.haulmont.dto;

public class PatientsDTO {
    Long p_id;
    String p_name;
    String p_family;
    String p_patronymic;
    String p_number;

    public PatientsDTO() {
    }



    public Long getP_id() {
        return p_id;
    }

    public void setP_id(Long p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_family() {
        return p_family;
    }

    public void setP_family(String p_family) {
        this.p_family = p_family;
    }

    public String getP_patronymic() {
        return p_patronymic;
    }

    public void setP_patronymic(String p_patronymic) {
        this.p_patronymic = p_patronymic;
    }

    public String getP_number() {
        return p_number;
    }

    public void setP_number(String p_number) {
        this.p_number = p_number;
    }

    public PatientsDTO(Long p_id, String p_name, String p_family, String p_patronymic, String p_number) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_family = p_family;
        this.p_patronymic = p_patronymic;
        this.p_number = p_number;
    }
}
