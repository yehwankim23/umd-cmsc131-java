import java.util.Map;
import java.util.TreeMap;

public class WorkSpace {
    private String wsName;
    private String URL;
    private Map<String, Channel> channelMap;

    /**
     * 
     * Add a constructor that initializes the instance variables with the parameters
     * given.
     * 
     * @param name
     * @param URL
     * @param channelMap
     */
    public WorkSpace(String name, String URL, Map<String, Channel> channelMap) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * Add a overloaded constructor that takes a String. Use the String value to
     * initialize the WorkSpace name. messages should be initialized to an empty
     * map.
     * 
     * @param wsName
     */
    public WorkSpace(String wsName) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * Give a copy constructor. The new WorkSpace object should be an exact
     * duplicate of the WorkSpace copied from.
     * 
     * @param c
     */
    public WorkSpace(WorkSpace w) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * a getter method
     * 
     * @return
     */
    public Channel getChannel(String cName) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * an updater method to add a channel
     * 
     * @param s
     */
    public void addChannel(Channel c) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * an updater method to remove a channel
     * 
     * @param s
     */
    public void removeChannel(String cName) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * a setter method. Throws an IllegalArgumentException if wsName is null or an
     * empty string.
     * 
     * @return
     */
    public void changeWSName(String wsName) {
        throw new UnsupportedOperationException("replace with your implementation");
    }

    /**
     * You may not modify this method.
     * 
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("WorkSpace: " + wsName + "\n");
        for (String cName : this.channelMap.keySet()) {
            sb.append(this.channelMap.get(cName).toString() + "\n");
        }
        return sb.toString();
    }
}
