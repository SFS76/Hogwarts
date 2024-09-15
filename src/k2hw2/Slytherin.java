package k2hw2;

public class Slytherin extends Students{
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourceFulness;
    private final int lustPower;

    public Slytherin(String name, int powerMagic, int tranGression, int cunning, int determination, int ambition, int resourceFulness, int lustPower) {
        super(name, powerMagic, tranGression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourceFulness = resourceFulness;
        this.lustPower = lustPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourceFulness() {
        return resourceFulness;
    }

    public int getLustPower() {
        return lustPower;
    }
    @Override
    public int calculate() {
        return cunning + determination + ambition + resourceFulness + lustPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourceFulness=" + resourceFulness +
                ", lustPower=" + lustPower +
                ", name='" + name + '\'' +
                ", tranGression=" + tranGression +
                ", powerMagic=" + powerMagic +
                '}';
    }
    public void compare (Slytherin slytherin) {
        int sum1 = calculate();
        int sum2 = slytherin.calculate();
        if (sum1 > sum2){
            System.out.println (name + " лучший Слизеринец, чем " + slytherin.getName());
        } else if (sum1 < sum2) {
            System.out.println(slytherin.getName() + " лучший Слизеринец, чем " + name);
        } else {
            System.out.println(name + " и " + slytherin.getName() + " одинаково хороше Слизеринцы");
        }
    }
}
