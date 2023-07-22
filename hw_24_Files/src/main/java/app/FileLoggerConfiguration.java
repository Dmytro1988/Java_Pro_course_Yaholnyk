package app;

public class FileLoggerConfiguration {


        private String file;
        private LoggingLevel level;
        private Integer maxSize;
        private String format;

        public FileLoggerConfiguration(String file, LoggingLevel level, Integer maxSize, String format) {
            this.file = file;
            this.level = level;
            this.maxSize = maxSize;
            this.format = format;
        }



    public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public LoggingLevel getLevel() {
            return level;
        }

        public void setLevel(LoggingLevel level) {
            this.level = level;
        }

        public Integer getMaxSize() {
            return maxSize;
        }

        public void setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }
    }







