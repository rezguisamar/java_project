public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrcages;
    int nbranimal;

    public Zoo(String name, String city, int nbrcages) {
        this.name = name;
        this.city = city;
        this.nbrcages = nbrcages;
        this.animals = new Animal[nbrcages];
    }

    public void Displayzoo() {
        System.out.println("my zoo name is  " + name + "city " + city + "n " + nbrcages);
    }
@Override
    public  String toString()
{
    return "my zoo name is : " +name+"city :"+city+ "nbrc : "+nbrcages;
}

boolean addAnimal(Animal animal)
{
    if (nbrcages>nbranimal)
        return false;
  animals[nbranimal]=animal;
    nbranimal++;


    return false;
}

}


