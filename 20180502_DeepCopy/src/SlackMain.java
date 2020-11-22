
public class SlackMain {
    /**
     * This is NOT for submission. 
     * Use this for practice in the discussion section. 
     * 
     * @param args
     */
    public static void main(String[] args) {
        WorkSpace wsCMSC131 = new WorkSpace("CMSC131");
        wsCMSC131.addChannel(new Channel());
        wsCMSC131.addChannel(new Channel("Piazza"));
        
        Channel c = wsCMSC131.getChannel("Piazza");
        c.addMessage("P4 had many things to do");
        c.addMessage("Do we have more?");        
        System.out.println(wsCMSC131 + "\n");

        WorkSpace wsCMSC132 = new WorkSpace(wsCMSC131);
        wsCMSC132.changeWSName("CMSC132");
        
        Channel c2 = wsCMSC132.getChannel("Piazza");
        c2.addMessage("It is just a warm-up compared to CMSC132 projects...");

        System.out.println(wsCMSC132);
    }
}
