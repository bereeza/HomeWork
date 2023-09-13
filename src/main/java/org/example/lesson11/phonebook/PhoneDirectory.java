package org.example.lesson11.phonebook;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDirectory {
    private List<PhoneRecord> recordList = new ArrayList<>();

    public void add(PhoneRecord phoneRecord) {
        String name = phoneRecord.getName();
        for (PhoneRecord record : recordList) {
            if (record.getName().equals(name)) {
                record.getPhones().addAll(phoneRecord.getPhones());
                return;
            }
        }
        recordList.add(phoneRecord);
    }

    public void find(String name) {
        for (PhoneRecord record : recordList) {
            if (record.getName().equals(name)) {
                System.out.println(record.getName() + " --- " + record.getPhones().get(0));
            }
        }
    }

    public void findAll(String name) {
        for (PhoneRecord record : recordList) {
            if (record.getName().equals(name)) {
                System.out.println(record.getName() + " --- " + record.getPhones());
            }
        }
    }
}