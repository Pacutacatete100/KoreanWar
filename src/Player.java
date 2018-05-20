public class Player {
    public Story story;

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public Player(Story story) {

        this.story = story;
    }
}
