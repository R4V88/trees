public class Tree {
    private String trunk;
    private String branches;
    private String leaves;

    public Tree() {
    }

    public Tree(String trunk, String branches, String leaves) {
        this.trunk = trunk;
        this.branches = branches;
        this.leaves = leaves;
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

    public void grow() {
        System.out.println("Tree is growing");
    }
}
