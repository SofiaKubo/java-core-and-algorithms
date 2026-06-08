package core.oop.inheritance.movies_by_actor;

import java.util.Objects;

public class Movie {
    private final String title;
    private final int releaseYear;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Movie otherMovie = (Movie) obj;
        return Objects.equals(title, otherMovie.title) && releaseYear == otherMovie.releaseYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseYear);
    }

    public String description() {
        return '"' + title + "\" (" + releaseYear + " год)";
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
