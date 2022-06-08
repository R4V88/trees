public class Conifer extends Tree{
    private boolean winterResistant;

    public Conifer(String trunk, String branches, String leaves, String root, int height, int width) {
        super(trunk, branches, leaves, root, height, width);
        this.winterResistant = true;
    }

    public boolean isWinterResistant() {
        return winterResistant;
    }

    public void setWinterResistant(boolean winterResistant) {
        this.winterResistant = winterResistant;
    }
}
