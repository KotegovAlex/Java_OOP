package GenealogicalTreeResearch;

import java.util.ArrayList;

public class BrotherSisterResearch {
    ArrayList<Node> tree;
    private Human hum;
    private Human parent;

    public BrotherSisterResearch(GenTree pd, Human hum) {
        tree = pd.getData();
        this.hum = hum;
    }

    public ArrayList<Human> start() {

        for (Node node : tree) {
            if (hum.getName().equals(node.hum1.getName())
                    && node.relation == Relationship.child) {
                parent = node.hum2;
                break;
            }
        }

        var result = new ArrayList<Human>();

        for (Node node : tree) {
            if (parent.getName().equals(node.hum1.getName())
                    && node.relation == Relationship.parent && !node.hum2.getName().equals(hum.getName())) {
                result.add(node.hum2);
            }
        }

        return result;
    }
}
