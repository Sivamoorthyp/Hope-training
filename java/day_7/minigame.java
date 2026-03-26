package day_7;
class game{
    String name;
    game(String name) {
        this.name = name;
    }
    void attack(){

    }
}
class warrior extends game{
     warrior(String name) {
        super(name); 
    }
    @Override
    void attack() {
        System.out.println(name + " is attacking with a sword!");
    }
}
class mage extends game{
    mage(String name) {
        super(name);
    }
    @Override
    void attack() {
        System.out.println(name + " is attacking with magic!");
    }
}
class archer extends game{
    archer(String name) {
        super(name);
    }
    @Override
    void attack() {
        System.out.println(name + " is attacking with an arrow!");
    }
}
public class minigame{
    public static void main(String[] args) {
        game m;
        m = new warrior("Alice");
        m.attack();
        m = new mage("Bob");
        m.attack();
        m = new archer("Charlie");
        m.attack();
    }
}
