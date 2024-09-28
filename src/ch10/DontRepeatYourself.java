package ch10;

public class DontRepeatYourself {
    public static void main(String[] args) {
        /*
        long definition:

        Tree tree1 = new Tree("Oak", 2.0f);
        Tree tree2 = new Tree("Poplar");
        Tree tree3 = new Tree(3.0f);
        */

        Tree[] trees = {
                new Tree("Oak", 2.0f),
                new Tree("Poplar"),
                new Tree(3.0f)
        };

        for (Tree tree : trees)
            System.out.println(tree.toString());
    }
}
class Tree {
    String type;
    float height;

    Tree(String type, float height){
        this.type = type;
        this.height = height;
    }
    Tree(String type){
        //Call to 'this()' must be first statement in constructor body
        this(type, 1.0f);
    }
    Tree(float height){
        this("Pine", height);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "type='" + type + '\'' +
                ", height=" + height +
                '}';
    }
}
