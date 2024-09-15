package k2hw2;

public class Gryffindor extends Students{
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int powerMagic, int tranGression, int nobility, int honor, int bravery) {
        super(name, powerMagic, tranGression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", name='" + name + '\'' +
                ", powerMagic=" + powerMagic +
                ", tranGression=" + tranGression +
                '}';
    }
    @Override
    public int calculate() {
        return nobility + honor + bravery;
    }

    public void compare (Gryffindor gryffindor) {
        int sum1 = calculate();
        int sum2 = gryffindor.calculate();
        if (sum1 > sum2){
            System.out.println (name + " лучший Гриффиндорец, чем " + gryffindor.getName());
        } else if (sum1 < sum2) {
            System.out.println(gryffindor.getName() + " лучший Гриффиндорец, чем " + name);
        } else {
            System.out.println(name + " и " + gryffindor.getName() + " одинаково хороше Гриффиндорцы");
        }
    }
}
