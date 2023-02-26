public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
    Magic magic = new Magic();
    Warrior warrior = new Warrior();
    Hero hero [] = {medic,magic,warrior};
        for (int i = 0; i < hero.length; i++ ) {
            hero[i].applySuperAbility();
            System.out.println(hero);

        }





    }
}