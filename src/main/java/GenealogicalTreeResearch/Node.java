package GenealogicalTreeResearch;

class Node {

    public Node(Human hum1, int relation, Human hum2) {
        this.hum1 = hum1;
        this.relation = relation;
        this.hum2 = hum2;
    }

    Human hum1;
    int relation;
    Human hum2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", hum1, relation, hum2);
    }
}
