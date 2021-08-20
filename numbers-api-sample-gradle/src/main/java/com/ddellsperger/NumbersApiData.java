package com.ddellsperger;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NumbersApiData {
    @JsonProperty("text")
    String text;

    @JsonProperty("year")
    Integer year;

    @JsonProperty("number")
    Integer number;

    @JsonProperty("found")
    Boolean found;

    @JsonProperty("type")
    String type;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NumbersApiData{" + "\n\ttext='" + text + '\'' + ",\n\tyear=" + year + ",\n\tnumber=" +
                number + ",\n\tfound=" + found + ",\n\ttype='" + type + '\'' + "\n}";
    }
}
