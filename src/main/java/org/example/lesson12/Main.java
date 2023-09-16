package org.example.lesson12;

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
        System.out.println("File info:\n"+fileData.getName() + " | " + fileData.getPath() + " | " + fileData.getSize());
        // [FileData(name=test.txt, size=187, path=C:\test), FileData(name=test1.txt, size=2, path=C:\test)]
        System.out.println("Find some file:\n"+fileNavigator.find("C:\\test"));

        // [FileData(name=test1.txt, size=2, path=C:\test)]
        System.out.println("Size filter:\n"+fileNavigator.filterBySize(100));

        // [FileData(name=test1.txt, size=2, path=C:\test),
        // FileData(name=test.txt, size=187, path=C:\test),
        // FileData(name=test2.txt, size=190, path=C:\home)]
        System.out.println("Sort filter:\n"+fileNavigator.sortBySize());

        // fileNavigator.remove("C:\\test");
    }
}
