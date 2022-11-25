package GenealogicalTreeResearch;

import java.util.ArrayList;

public class GrandParentsResearch {

    ArrayList<Node> tree;
    private Human hum;

    public GrandParentsResearch(GenTree pd, Human hum) {
        tree = pd.getData();
        this.hum = hum;
    }

    public ArrayList<Human> start() {

        var parentsList = new ArrayList<Human>();

        for (Node node : tree) {
            if (hum.getName().equals(node.hum2.getName())
                    && node.relation == Relationship.parent) {
                parentsList.add(node.hum1);
            }
        }

        var result = new ArrayList<Human>();

        for (Human parent : parentsList) {
            for (Node node : tree) {
                if (parent.getName().equals(node.hum2.getName())
                        && node.relation == Relationship.parent) {
                    result.add(node.hum1);
                }
            }
        }

        return result;
    }
}
