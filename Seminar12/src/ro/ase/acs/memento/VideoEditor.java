package ro.ase.acs.memento;

public class VideoEditor {
    private Video video;
    private HistoryManager historyManager;

    public VideoEditor() {
        video = new Video("Untitled", 0);
        historyManager = new HistoryManager();
    }

    public void edit(int minutes) {
        video.setLength(video.getLength() + minutes);
    }

    public void save() {
        historyManager.addToHistory(video);
    }

    public void undo() {
        video = historyManager.getFromHistory();
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "video=" + video +
                '}';
    }
}
