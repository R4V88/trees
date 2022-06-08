public class Conifer extends Tree{
    private boolean winterResistant;

    public Conifer(String trunk, String branches, String leaves) {
        super(trunk, branches, leaves);
        this.winterResistant = true;
    }

    public boolean isWinterResistant() {
        return winterResistant;
    }

    public void setWinterResistant(boolean winterResistant) {
        this.winterResistant = winterResistant;
    }
}
