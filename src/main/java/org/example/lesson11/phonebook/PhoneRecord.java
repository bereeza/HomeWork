package org.example.lesson11.phonebook;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class PhoneRecord {
    private String name;
    private List<String> phones;

    public PhoneRecord(String name, List<String> phones) {
        this.name = name;
        this.phones = new ArrayList<>(phones);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneRecord that = (PhoneRecord) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
