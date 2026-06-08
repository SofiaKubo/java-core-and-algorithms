package core.oop.inheritance.post_to_string;

import java.util.Arrays;

public class PostComment {
    private String text;
    private String[] whoLiked;

    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked == null ? null : whoLiked.clone();
    }

    @Override
    public String toString() {
        return "PostComment{"
            + "text='" + text + "', "
            + "whoLiked=" + Arrays.toString(whoLiked)
            + "}";
    }
}
