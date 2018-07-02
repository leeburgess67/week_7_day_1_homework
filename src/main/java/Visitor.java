public class Visitor {

private String name;
private int height;
private double money;
private int age;

public Visitor(String name, int age, int height, double money){
    this.name = name;;
    this.age = age;
    this.height = height;
    this.money = money;

}

    public String getName() {
    return this.name;
    }
    public int getAge() {
    return this.age;
    }
    public double getMoney() {
    return this.money;
    }
    public int getHeight() {
    return this.height;
    }
}
