package GenealogicalTreeResearch;

import java.util.ArrayList;

class ParentResearch extends Research {

    public ParentResearch(GenTree pd, Human hum) {
        super(pd, hum);
    }

    @Override
    public ArrayList<Human> start() {

        var result = new ArrayList<Human>();

        for (Node node : tree) {
            if (super.getHum().getName().equals(node.hum2.getName())
                    && node.relation == Relationship.parent) {
                result.add(node.hum1);
            }
        }

        return result;
    }

}
