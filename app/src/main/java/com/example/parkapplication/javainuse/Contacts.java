package com.example.parkapplication.javainuse;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
    private List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();
    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }
    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }
    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }
}