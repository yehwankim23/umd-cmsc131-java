import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;
    private List<String> messages;

    /**
     * Add a constructor that initializes the name and the messages of the new
     * object with the parameters given.
     * 
     * @param name
     * @param messages
     */
    public Channel(String name, List<String> messages) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * Add a default constructor. Implement this as a chained constructor by calling
     * the constructor above. Use "Untitled" for the channel name and initialize the
     * messages into an empty list.
     * 
     */
    public Channel() {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * Add a overloaded constructor that takes a String. Use the String value to
     * initialize the channel name. messages should be initialized to an empty
     * ArrayList.
     * 
     * @param name
     */
    public Channel(String name) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * Give a copy constructor. The new channel should include all messages from the
     * original channel. Is this method a correct copy constructor? Otherwise, fix
     * it.
     * 
     * @param c
     */
    public Channel(Channel c) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * a getter method 
     * @return
     */
    public String getName() {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /** 
     * a updater method to add a message to the message list
     * 
     * @param s
     */
    public void addMessage(String s) {
        throw new UnsupportedOperationException("replace with your implementation");
    }
    
    /**
     * You may not modify this method. 
     * 
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("Channel: " + this.name + "\n");
        for (String m : this.messages) {
            sb.append(m);
        }
        return sb.toString();
    }
}
