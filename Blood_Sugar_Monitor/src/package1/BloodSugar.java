package package1;


public class BloodSugar {

    private int id;
    private String name;
    private String yob;
    private int sugar_level;

    public BloodSugar() {
    }

    public BloodSugar(int id, String name, String yob, int sugar_level) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.sugar_level = sugar_level;
    }

    public void calculate() {

    }

    public void display() {
        System.out.print("patient Id :");
        System.out.print(this.id);
        System.out.print(" ,patient Name :");
        System.out.print(this.name);
        System.out.print(" , patient Date Of Birth :");
        System.out.print(this.yob);
        System.out.print(" , patient Sugar Level :");
        System.out.println(this.sugar_level);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public int getSugar_level() {
        return sugar_level;
    }

    public void setSugar_level(int sugar_level) {
        this.sugar_level = sugar_level;
    }

}
