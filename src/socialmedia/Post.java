package socialmedia;

import java.io.Serializable;

/**
 * Class to create post objects
 */
abstract public class Post implements Serializable {
    private final int ID;
    private final int userID;

    private String content;

    /**
     * Method to obtain ID
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Method to obtain user ID
     * @return userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Method to obtain content
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * Method to set post variables
     * @param ID
     * @param userID
     */
    public Post(int ID, int userID){
        this.ID = ID;
        this.userID = userID;
    }

    /**
     * Method to set post variables with content
     * @param ID
     * @param userID
     * @param content
     */
    public Post(int ID, int userID, String content){
        this.ID = ID;
        this.userID = userID;
        this.content = content;
    }
}

