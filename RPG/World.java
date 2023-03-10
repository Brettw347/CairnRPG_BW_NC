public class World {
    String gameName = "Earth";
    String publisher = "Brett & Nico";


    public String Info(){
        return "The World class creates the environment for the user by establishing " +
                "a game name and being able to provide information about the publishers.";
    }
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

