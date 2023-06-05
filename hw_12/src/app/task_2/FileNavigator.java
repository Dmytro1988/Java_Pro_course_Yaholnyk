package app.task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FileNavigator {

    private final Map<String, List<FileData>> filesByPath = new HashMap<>();

    public void add( FileData fileData) {
        if (!filesByPath.containsKey(fileData.getPath())) {
            filesByPath.put(fileData.getPath(), new ArrayList<>());
        }
            List<FileData> files = filesByPath.get(fileData.getPath());
            files.add(fileData);


    }

    public List<FileData> find(String path) {
        return filesByPath.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(long size) {
        return filesByPath.values().stream()
                .flatMap(List::stream)
                .filter(fileData -> fileData.getSize() <= size)
                .collect(Collectors.toList());
    }

    public void remove(String path) {
        filesByPath.remove(path);
    }

    public List<FileData> sortBySize() {
        return filesByPath.values().stream()
                .flatMap(List :: stream)
                .sorted((f1, f2) -> Long.compare(f1.getSize(), f2.getSize()))
                .collect(Collectors.toList());
    }

}
