package socialmedia;

import java.util.ArrayList;

/**
 * abstract class to create Post-PostWithChildren object
 */
public abstract class PostWithChildren extends Post{
    public ArrayList<Integer> children;

    /**
     * Method to delete child posts
     * @param id
     */
    public void deleteChild(Integer id) {
        children.remove(id);
    }

    /**
     * Method to output children
     * @return children
     */
    public ArrayList<Integer> getChildren() {
        return children;
    }

    /**
     * Method to add a child to post
     * @param childId
     */
    public void addChild(int childId){
        children.add(childId);
    }

    /**
     * Method to set children to post
     * @param children
     */
    public void setChildren(ArrayList<Integer> children) {
        this.children = children;
    }

    /**
     * Method to set variables for PostWithChildren with content
     * @param ID
     * @param userID
     * @param content
     */
    public PostWithChildren(int ID, int userID, String content) {
        super(ID, userID, content);
        this.children = new ArrayList<>();
    }

    /**
     * Method to set variables for PostWithChildren
     * @param ID
     * @param userID
     */
    public PostWithChildren(int ID, int userID) {
        super(ID, userID);
        this.children = new ArrayList<>();
    }
}
