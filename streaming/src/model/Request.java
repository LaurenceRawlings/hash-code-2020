package model;

public class Request {
    private Video video;
    private Endpoint endpoint;
    private int amount;

    public Request(Video video, Endpoint endpoint, int amount) {
        this.video = video;
        this.endpoint = endpoint;
        this.amount = amount;
    }

    public Video getVideo() {
        return video;
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }

    public int getAmount() {
        return amount;
    }
}
