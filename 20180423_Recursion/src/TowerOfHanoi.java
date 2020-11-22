
public class TowerOfHanoi {
    public static void main(String[] args) {
        int nDisc = 3;
        
        Pole leftPole = new Pole("Left");
        Pole middlePole = new Pole("Middle");
        Pole rightPole = new Pole("Right");

        for(int i = 0 ; i < nDisc ; i++) {
            leftPole.putDisc(new Disc(nDisc-i));
        }
        
        // Call the method that solves the Tower of Hanoi here.
        // The method will call itself recursively. 
        throw new UnsupportedOperationException("replace with your implementation");
    }

}
