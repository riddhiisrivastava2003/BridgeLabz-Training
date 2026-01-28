public class BackUpTask implements Comparable<BackUpTask>{

    private String folderPath;
    private int priority;

    public BackUpTask(String folderPath, int priority) {
        this.folderPath = folderPath;
        this.priority = priority;
    }


    public String getFolderPath() {
        return folderPath;
    }

    public int getPriority() {
        return priority;
    }

    @Override

    public int compareTo(BackUpTask o) {

        return this.priority - o.priority;
    }

    @Override
    public String toString() {
        return "Path: " + folderPath + "| Priority: " + priority;   
    }
}