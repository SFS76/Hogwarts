package k2hw2;

public abstract class Students {
    protected final String name;
    protected final int powerMagic;
    protected final int tranGression;

    public Students(String name, int powerMagic, int tranGression) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.tranGression = tranGression;

    }

    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTranGression() {
        return tranGression;
    }
    public abstract int calculate();

    private int calculateMagic () {
        return powerMagic + tranGression;
    }
    public void compareStudet (Students students){
        int sum1 = calculate();
        int sum2 = students.calculate();
        if (sum1 > sum2){
            System.out.println (name + " лучший студент Хогватса, чем " + students.getName());
        } else if (sum1 < sum2) {
            System.out.println(students.getName() + " лучший студент Хогватса, чем " + name);
        } else {
            System.out.println(name + " и " + students.getName() + " одинаково хороше студенты Хогватса");
        }
    }
}
