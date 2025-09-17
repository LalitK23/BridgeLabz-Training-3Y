class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {}
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Chirp Chirp");
    }
}

class anim {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Buddy", 3),
                new Cat("Whiskers", 2),
                new Bird("Tweety", 1)
        };

        for (Animal animal : animals) {
            System.out.print(animal.name + " (" + animal.age + "): ");
            animal.makeSound();
        }
    }
}
