public class Arena {
    public static void main(String[] args) {
        Monster cell = new Monster("Cell", 20, 100);
        Monster boo = new Monster("Boo", 50, 100);

        System.out.println(cell.attack(boo));
    }
}
