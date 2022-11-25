package GenealogicalTreeResearch;

import java.util.ArrayList;

class GenTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getData() {
        return tree;
    }

    public void append(Human parent, Human child) {

        tree.add(new Node(parent, Relationship.parent, child));
        tree.add(new Node(child, Relationship.child, parent));
    }
}




