package uke39;

public class Pokemon implements Comparable<Pokemon>{
    String name;
    Integer level;
    Integer hp;

    Pokemon(String name, int level, int hp) {
        this.hp = hp;
        this.name = name;
        this.level = level;
    }

    public int compareTo(Pokemon lommemonster1){
        //level
        int max = this.level.compareTo(lommemonster1.level);
        //hp
        if (max == 0) max = this.hp.compareTo(lommemonster1.hp);
        //navn
        if(max == 0) max = this.name.compareTo(lommemonster1.name);
        return max;
    }
    @Override
    public String toString() {
        return this.name + " level " + this.level + " HP " + this.hp;
    }
}