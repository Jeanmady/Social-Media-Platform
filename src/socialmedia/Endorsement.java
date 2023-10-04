package socialmedia;

/**
 * Class to create a Post-endorsement object
 */
public class Endorsement extends Post{
    private static String content = "Post Endorsed";
    private int parentID;

    /**
     * Method to obtain content
     * @return content
     */
    @Override
    public String getContent() {
        return content;
    }

    /**
     * Method to obtain parent ID
     * @return parentID
     */
    public int getParentID() {
        return parentID;
    }

    /**
     * method to set endorsement variables
     * @param ID
     * @param userID
     * @param parentID
     */
    public Endorsement(int ID, int userID, int parentID) {
        super(ID, userID);
        this.parentID = parentID;
    }
}
