package k2hw2;

public class Puffenduy extends Students{
    private final int hardWoking;
    private final int loyal;
    private final int honest;

    public Puffenduy(String name, int powerMagic, int tranGression, int hardWoking, int loyal, int honest) {
        super(name, powerMagic, tranGression);
        this.hardWoking = hardWoking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardWoking() {
        return hardWoking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    @Override
    public int calculate() {
        return hardWoking + loyal + honest;
    }

    @Override
    public String toString() {
        return "Puffenduy{" +
                "hardWoking=" + hardWoking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", name='" + name + '\'' +
                ", powerMagic=" + powerMagic +
                ", tranGression=" + tranGression +
                '}';
    }
    public void compare (Puffenduy puffenduy) {
        int sum1 = calculate();
        int sum2 = puffenduy.calculate();
        if (sum1 > sum2){
            System.out.println (name + " лучший Пуффендуец, чем " + puffenduy.getName());
        } else if (sum1 < sum2) {
            System.out.println(puffenduy.getName() + " лучший Пуффендуец, чем " + name);
        } else {
            System.out.println(name + " и " + puffenduy.getName() + " одинаково хороше Пуффендуйцы");
        }
    }
}
