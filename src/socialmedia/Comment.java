package socialmedia;

/**
 * Class to create Post-comment objects
 */
public class Comment extends PostWithChildren {
    private int parentID;

    /**
     * method to obtain comments parents ID
     * @return parentID
     */
    public int getParentID() {
        return parentID;
    }

    /**
     * Sets super and parentID
     * @param ID
     * @param userID
     * @param content
     * @param parentID
     */
    public Comment(int ID, int userID, String content, int parentID) {
        super(ID, userID, content);
        this.parentID = parentID;
    }
}
