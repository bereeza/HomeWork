package org.example.lesson11.phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        PhoneRecord phoneRecord = new PhoneRecord("Bob", List.of("11-22-33-44"));
        phoneDirectory.add(phoneRecord);
        List<PhoneRecord> records = phoneDirectory.getRecordList();
        System.out.println("\nTest 1");
        for (PhoneRecord record : records) {
            System.out.println("Name: " + record.getName());
            System.out.println("Phones: " + record.getPhones());
        }

//        Test 1
//        Name: Bob
//        Phones: [11-22-33-44]

        PhoneRecord phoneRecord1 = new PhoneRecord("Bob", List.of("234-324-4566"));
        phoneDirectory.add(phoneRecord1);
        System.out.println("\nTest 2");
        for (PhoneRecord record : records) {
            System.out.println("Name: " + record.getName());
            System.out.println("Phones: " + record.getPhones());
        }

//        Test 2
//        Name: Bob
//        Phones: [11-22-33-44, 234-324-4566]

        PhoneRecord phoneRecord2 = new PhoneRecord("Tom", List.of("23-235-66"));
        phoneDirectory.add(phoneRecord2);
        System.out.println("\nTest 3");
        for (PhoneRecord record : records) {
            System.out.println("Name: " + record.getName());
            System.out.println("Phones: " + record.getPhones());
        }
//        Test 3
//        Name: Bob
//        Phones: [11-22-33-44, 234-324-4566]
//        Name: Tom
//        Phones: [23-235-66]

        phoneDirectory.find("Bob");
        phoneDirectory.findAll("Bob");
//        Bob --- 11-22-33-44
//        Bob --- [11-22-33-44, 234-324-4566]
    }
}
