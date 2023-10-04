package socialmedia;

import java.util.ArrayList;

/**
 * Class to create deleted post objects
 */
public class DeletedPost extends PostWithChildren {
    private static String content = "The original content was removed from the system and is no longer available.";

    /**
     * method to set deleted post variables
     * @param ID
     * @param children
     */
    public DeletedPost(int ID, ArrayList<Integer> children){
        super(ID, 0);
        this.setChildren(children);
    }

    /**
     * method to obtain content
     * @return content
     */
    @Override
    public String getContent() {
        return content;
    }
}
