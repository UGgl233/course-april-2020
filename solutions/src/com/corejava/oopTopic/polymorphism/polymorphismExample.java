package com.corejava.oopTopic.polymorphism;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public class polymorphismExample {
    class animal {
        String type;

        public animal(String type){
            this.type = type;
        }

        public void bark() {
            System.out.println("Bark! Bark!");
        }

        // Static polymorphism / Overload
        public void bark(String animal) {
            System.out.println(animal + " Bark! Bark!");
        }
    }

    class cat extends animal {
        public cat(String type) {
            super(type);
        }

        // Dynamic polymorphism / override
        @Override
        public void bark() {
            System.out.println("Meow! Meow");
        }
    }

}
