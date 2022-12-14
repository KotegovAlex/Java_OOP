package GenealogicalTreeResearch;

import java.util.ArrayList;

public class GenTree implements DataKeeper {
    private ArrayList<Node> tree = new ArrayList<>();

    @Override
    public ArrayList<Node> getData() {
        return tree;
    }

    @Override
    public void addData(Human parent, Human child) {
        tree.add(new Node(parent, Relationship.parent, child));
        tree.add(new Node(child, Relationship.child, parent));
    }
}




