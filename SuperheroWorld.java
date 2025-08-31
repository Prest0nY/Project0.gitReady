import java.util.Scanner;

public class SuperheroWorld
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a superhero name: ");
        String superheroName1 = scanner.nextLine();

        Superhero hero1 = new Superhero();
        Superhero hero2 = new Superhero();


        hero1.setName(superheroName1);
        hero1.setSuperpower("Rich");
        hero1.setCatchPhrase("I'm Batman");
        System.out.println("Name: " + hero1.getName());
        System.out.println("Power: " + hero1.getSuperpower());
        hero1.speak();

        hero2.setName("The Flash");
        hero2.setSuperpower("Super Speed");
        hero2.setCatchPhrase("I'm the fastest man alive.");
        System.out.println(hero2.getName());
        System.out.println(hero2.getSuperpower());
        hero2.speak();
    }
}