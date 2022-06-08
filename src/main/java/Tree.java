public class Tree {
    private String trunk;
    private String branches;
    private String leaves;
    private String root;
    private int height;
    private int width;

    public Tree() {
    }

    public Tree(String trunk, String branches, String leaves, String root, int height, int width) {
        this.trunk = trunk;
        this.branches = branches;
        this.leaves = leaves;
        this.root = root;
        this.height = height;
        this.width = width;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public String getBranches() {
        return branches;
    }

    public void setBranches(String branches) {
        this.branches = branches;
    }

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void grow() {
        System.out.println("Tree is growing");
    }
}
