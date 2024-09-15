package k2hw2;

public class RavenClaw extends Students{
    private final int smart;
    private final int wise;
    private final int creativity;

    public RavenClaw(String name, int powerMagic, int tranGression, int smart, int wise, int creativity) {
        super(name, powerMagic, tranGression);
        this.smart = smart;
        this.wise = wise;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public int calculate() {
        return smart + wise + creativity;
    }

    @Override
    public String toString() {
        return "RavenClaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", creativity=" + creativity +
                ", name='" + name + '\'' +
                ", powerMagic=" + powerMagic +
                ", tranGression=" + tranGression +
                '}';
    }
    public void compare (RavenClaw ravenClaw) {
        int sum1 = calculate();
        int sum2 = ravenClaw.calculate();
        if (sum1 > sum2){
            System.out.println (name + " лучший Когтевранец, чем " + ravenClaw.getName());
        } else if (sum1 < sum2) {
            System.out.println(ravenClaw.getName() + " лучший Когтевранец, чем " + name);
        } else {
            System.out.println(name + " и " + ravenClaw.getName() + " одинаково хороше Когтевранцы");
        }
    }
}
