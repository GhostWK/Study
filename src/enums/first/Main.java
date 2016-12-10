package enums.first;

import java.util.ArrayList;

/**
 * Created by sasha_zubkov on 28.11.16.
 */
public class Main{
    public static void main(String ... args) {
        for (Actions a :
                Actions.values()) {
            System.out.println(a.toString());
            System.out.println("---");
        }

        Actions a = Actions.valueOf("");

    }
}

enum Actions{
    FIGHT(10, 4),
    SHOT(5, 20);

    private int damage;
    private int range;

    public String toString(){

        return "NAME : "+this.name()+"\nDAMAGE : "+this.damage+"\nRANGE : "+this.range;
    }

    Actions(int damage, int range) {
        this.damage = damage;
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public static ArrayList<Actions> getAll(){
        ArrayList<Actions> list = new ArrayList<Actions>();
        for (Actions a : Actions.values()) {
            list.add(a);
        }
        return list;
    }
}