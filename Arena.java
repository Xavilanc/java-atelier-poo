public class Arena {
    public static void main(String[] args) {
        Monster cell = new Monster("Cell", 20, 100);
        Monster boo = new Monster("Boo", 20, 100);

        while(cell.getLife() > 0 || boo.getLife() > 0) {
            cell.attack(boo);
            System.out.println( cell.getName() + " has " + cell.getLife() + " points remaining");
        }
       System.out.println(cell.getName() + " is KO!"); 
    }
}

