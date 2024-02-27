package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        // 변수 선언된 것 제거하고 바로 인스턴스로 바꾸는 단축키:
        // ctrl + alt + n

        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};

        // 메서드 뽑는 단축키
        // ctrl + alt + m

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
