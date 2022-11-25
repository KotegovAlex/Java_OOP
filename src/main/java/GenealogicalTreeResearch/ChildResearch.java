package GenealogicalTreeResearch;

import java.util.ArrayList;

public class ChildResearch {
    ArrayList<Node> tree;
    private Human hum;

    public ChildResearch(GenTree pd, Human hum) {
        tree = pd.getData();
        this.hum = hum;
    }

    public ArrayList<Human> start() {

        var result = new ArrayList<Human>();

        for (Node node : tree) {
            if (hum.getName().equals(node.hum2.getName())
                    && node.relation == Relationship.child) {
                result.add(node.hum1);
            }
        }

        return result;
    }
}
