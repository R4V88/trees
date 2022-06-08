public class Leafy extends Tree{

    private boolean hasBirds;

    public Leafy(String trunk, String branches, String leaves, String root, int height, int width) {
        super(trunk, branches, leaves, root, height, width);
        this.hasBirds = true;
    }

    public boolean isHasBirds() {
        return hasBirds;
    }

    public void setHasBirds(boolean hasBirds) {
        this.hasBirds = hasBirds;
    }
}
