import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree conifer = new Conifer("slim", "many", "needles", "yes", 20, 10);
        Tree leafy = new Leafy("thick", "many", "leafes", "yes", 15, 5);

        List<Tree> trees = List.of(conifer, leafy);

        for (Tree tree : trees) {
            if (tree instanceof Conifer) {
                if (((Conifer) tree).isWinterResistant())
                    System.out.println("I'm resistant to cold " + tree.getClass());
                tree.grow();
            }
            if (tree instanceof Leafy) {
                if (((Leafy) tree).isHasBirds())
                    System.out.print("I have birds " + tree.getClass());
                tree.grow();
            }
        }
    }
}
