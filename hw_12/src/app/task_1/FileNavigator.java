package app.task_1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileNavigator {
    private final String path;
    private final List<String> files;

    public FileNavigator(String path) {
        this.path = path;
        this.files = new ArrayList<>();
        loadFiles();
    }

    private void loadFiles() {
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] fileList = directory.listFiles();
            if (fileList != null) {
                for (File file1 : fileList) {
                    files.add(file1.getName());

                }
            }
        }
    }

    public List<String> getFiles() {
        return files;

    }
}

