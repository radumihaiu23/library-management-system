package com.itschool.library.utils.solid;

public class LSP {
}


//Before: violating LSP
class Bird {
    void fly() {
    }
}

// IS-A relation -> inheritance (Penguin IS A Bird?)


//PenguinPassport
class Penguin extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}

//After: following LSP
class Nonird2 {
    void move() {
    }
}

class FlyingBird extends Bird {
    @Override
    void fly() {
        System.out.println("Flying");
    }
}