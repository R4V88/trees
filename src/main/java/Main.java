import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree conifer = new Conifer("slim", "many", "needles");
        Tree leafy = new Leafy("thick", "many", "leafes");

        List<Tree> trees = List.of(conifer, leafy);

        for (Tree tree : trees) {
            if (tree instanceof Conifer) {
                if (((Conifer) tree).isWinterResistant())
                    System.out.println("I'm resistant to cold " + tree.getClass());
            }
            if (tree instanceof Leafy) {
                System.out.print(tree.getClass() + " ");
                tree.grow();
            }
        }
    }
}
