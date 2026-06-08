package core.oop.inheritance.post_to_string;

import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title;
    private String content;
    private String[] tags;
    private ArrayList<PostComment> comments;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags == null ? null : tags.clone();
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments == null ? null : new ArrayList<>(comments);
    }

    @Override
    public String toString() {
        Integer contentLength = content == null ? null : content.length();

        return "Post{"
            + "title='" + title + "', "
            + "content.length=" + contentLength + ", "
            + "tags=" + Arrays.toString(tags) + ",\n"
            + "comments=" + comments
            + "}";
    }
}
