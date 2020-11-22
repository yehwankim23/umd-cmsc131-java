import java.util.ArrayList;

public class Pole {
    private String name;
    private ArrayList<Disc> discs; 
    
    public Pole(String n) {
        name = n;
        discs = new ArrayList<>();
    }

    public void putDisc(Disc d) {
        System.out.println("Put: " + d + " to " + name);
        discs.add(d);
    }
    
    public Disc popDisc() {
        Disc d = getDisc(discs.size()-1);
        discs.remove(discs.size()-1);
        System.out.println("Pop: " + d + " from " + name);
        return d;
    }
    
    public Disc getDisc(int i) {
        return discs.get(i);
    }
    
    public int nDisc() { return discs.size(); }
    
    public String toString() {
        String s = "";
        
        for(Disc d: discs) {
            s += d.toString();
        }
        return s;
    }
}
