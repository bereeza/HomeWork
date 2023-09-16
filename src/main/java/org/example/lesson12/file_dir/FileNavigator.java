package org.example.lesson12.file_dir;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.lesson12.exception.IncorrectFileDirException;

import java.util.*;

@NoArgsConstructor
@ToString
public class FileNavigator {
    private final Map<String, List<FileData>> listData = new HashMap<>();

    public void add(String path, FileData data) {
        if (path.equals(data.getPath())) {
            List<FileData> dataList = listData.computeIfAbsent(path, k -> new ArrayList<>());
            dataList.add(data);
        } else {
            throw new IncorrectFileDirException("Directories " + path + " and "
                    + data.getPath() + " are not compatible");
        }
    }

    public List<FileData> find(String path) {
        return listData.get(path);
    }

    public List<FileData> filterBySize(int size) {
        return listData.values()
                .stream()
                .flatMap(List::stream)
                .filter(x -> x.getSize() <= size)
                .toList();
    }

    public void remove(String path) {
        listData.remove(path);
    }

    public List<FileData> sortBySize() {
        return listData.values()
                .stream()
                .flatMap(List::stream)
                .sorted(Comparator.comparingInt(FileData::getSize))
                .toList();
    }
}