package Sol2;

public class post {
    int postId;
    post repostId;
    int followers;

    public post(int postId, post repostId, int followers) {
        this.postId = postId;
        this.repostId = repostId;
        this.followers = followers;
    }

    public post(){

    }
}
