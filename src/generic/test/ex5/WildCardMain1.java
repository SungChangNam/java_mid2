package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox =new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        wildcardEx.printGenericV1(dogBox);
        wildcardEx.printWildcardV1(dogBox);


        wildcardEx.printGenericV2(dogBox);
        wildcardEx.printWildcardV2(dogBox);

        Dog dog=wildcardEx.printAndReturnGeneric(dogBox);
        Animal animal=wildcardEx.printAndReturnGeneric(dogBox);


    }
}
