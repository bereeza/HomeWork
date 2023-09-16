package org.example.lesson12;

import org.example.lesson12.file_dir.FileData;
import org.example.lesson12.file_dir.FileNavigator;

public class Main {
    public static void main(String[] args) {
        FileData fileData = new FileData("test.txt", "C:\\test");
        FileData fileData1 = new FileData("test1.txt", "C:\\test");
        FileData fileData2 = new FileData("test2.txt", "C:\\home");
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C:\\test", fileData);
        // exception
        // fileNavigator.add("C:\\incorrect_test", fileData1);
        fileNavigator.add("C:\\home", fileData2);

        // test.txt | C:\test | 187
        System.out.println(fileData.getName() + " | " + fileData.getPath() + " | " + fileData.getSize());
        // [FileData(name=test.txt, size=187, path=C:\test), FileData(name=test1.txt, size=2, path=C:\test)]
        System.out.println(fileNavigator.find("C:\\test"));

        // [FileData(name=test1.txt, size=2, path=C:\test)]
        System.out.println(fileNavigator.filterBySize(100));

        // [FileData(name=test1.txt, size=2, path=C:\test),
        // FileData(name=test.txt, size=187, path=C:\test),
        // FileData(name=test2.txt, size=190, path=C:\home)]
        System.out.println(fileNavigator.sortBySize());

        // fileNavigator.remove("C:\\test");
    }
}
