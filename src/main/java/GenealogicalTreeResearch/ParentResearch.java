package GenealogicalTreeResearch;

import java.util.ArrayList;

class ParentResearch {
    ArrayList<Node> tree;
    private Human hum;

    public ParentResearch(GenTree pd, Human hum) {
        tree = pd.getData();
        this.hum = hum;
    }

    public ArrayList<Human> start() {

        var result = new ArrayList<Human>();

        for (Node node : tree) {
            if (hum.getName().equals(node.hum2.getName())
                    && node.relation == Relationship.parent) {
                result.add(node.hum1);
            }
        }

        return result;
    }
}
