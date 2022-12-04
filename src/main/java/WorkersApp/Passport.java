package WorkersApp;

public class Passport {
    int s;
    int n;

    public Passport(int s, int n) {
        this.s = s;
        this.n = n;
    }

    @Override
    public String toString() {
        return s + " " + n;
    }
}
