import k2hw2.Gryffindor;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри", 80, 75, 89,92,76);
        Gryffindor Germione = new Gryffindor("Гермиона", 81, 70, 81,90,72);
        harryPotter.compare(Germione);
    }
}