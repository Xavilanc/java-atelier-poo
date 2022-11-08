public class Monster {

    //attributes
    private String name;
    private int damage;
    private int life;

    //constructors
    public Monster(String name, int damage, int life) {
        this.name = name;
        this.damage = damage;
        this.life = life;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getLife() {
        return this.life;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setLife(int life) {
        this.life = life;
    }

    //methods
    public String attack(Monster monster) {
        monster.life = monster.life - this.getDamage();
        if (this.getLife() > 0) {
            return this.getName() + " has " + this.getLife() + " points remaining";
        } else {
            return this.getName() + " is KO!";
        }
        
    }
    
}