package socialmedia;

import java.io.Serializable;

/**
 * Class that represents an account object
 * adds all account functionality
 */
public class Account implements Serializable {
    private String handle;
    private int ID;
    private int postCount;
    private int endorseCount;

    /**
     * method to increment post count by 1
     */
    public void incrementPostCount() {
        this.postCount ++;
    }

    /**
     * method to decrement post count by 1
     */
    public void decrementPostCount() {
        this.postCount --;
    }

    /**
     * method to increment endorse count by 1
     */
    public void incrementEndorseCount() {
        endorseCount ++;
    }

    /**
     * method to increment endorse count by 1
     */
    public void decrementEndorseCount() {
        endorseCount --;
    }

    /**
     * method to set the description of an account
     */
    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    /**
     * method to set handle of an account
     */
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * method to set accounts ID, handle, postCount and endorseCount
     */
    public Account(int ID, String handle) {
        this.ID = ID;
        this.handle = handle;
        this.postCount = 0;
        this.endorseCount = 0;
    }

    /**
     * method to set accounts ID, handle, description, postCount and endorseCount
     */
    public Account(int ID, String handle, String description) {
        this.ID = ID;
        this.handle = handle;
        this.description = description;
        this.postCount = 0;
        this.endorseCount = 0;
    }

    /**
     * method to obtain post count
     * @return postCount
     */
    public int getPostCount() {
        return postCount;
    }

    /**
     * method to obtain endorse count
     * @return endorseCount
     */
    public int getEndorseCount() {
        return endorseCount;
    }

    /**
     * method to obtain handle
     * @return handle
     */
    public String getHandle() {
        return handle;
    }

    /**
     * method to obtain ID
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * method to obtain description
     * @return description
     */
    public String getDescription() {
        return description;
    }
}
