package core.oop.reference_casting.media_watch_time;

import java.util.List;

public class Calculator {
    private static final int MINUTES = 60;
    private static final int HOURS = 24;

    private Calculator() {
    }

    public static double calculate(List<MediaItem> mediaItems) {
        int totalRuntime = 0;

        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Movie movie) {
                totalRuntime += movie.getRuntime();
            } else if (mediaItem instanceof Series series) {
                totalRuntime += series.getRuntime() * series.getSeriesCount();
            }
        }
        return ((double) totalRuntime) / MINUTES / HOURS;
    }
}
