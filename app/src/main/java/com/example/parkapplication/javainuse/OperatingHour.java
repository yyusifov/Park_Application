package com.example.parkapplication.javainuse;

import java.util.ArrayList;
import java.util.List;

public class OperatingHour {
    private List<Exception> exceptions = new ArrayList<Exception>();
    private String description;
    private StandardHours standardHours;
    private String name;
    public List<Exception> getExceptions() {
        return exceptions;
    }
    public void setExceptions(List<Exception> exceptions) {
        this.exceptions = exceptions;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public StandardHours getStandardHours() {
        return standardHours;
    }
    public void setStandardHours(StandardHours standardHours) {
        this.standardHours = standardHours;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}