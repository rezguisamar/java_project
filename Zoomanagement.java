// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zoomanagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.age = 5;
        lion.family = "cats";
        lion.isMammal = true;
        System.out.println(lion.name);
        System.out.println(lion.age);


        Animal dog = new Animal("camine", "snoopy", 2, true);
        System.out.println(dog.name);
        Zoo myZoo = new Zoo("wildfree", "ariana", 25);



        myZoo.Displayzoo();
        System.out.println("----------------");

        System.out.println(myZoo);
System.out.println(myZoo.toString());


        System.out.println("--------ADD---------");
        System.out.println(myZoo.addAnimal(new Animal()));


    }

}


