package practice1;

public class Child extends Parent {

    Toy toy;

    void test(Toy toy) {
        toy.handle();
        super.parentTest();
    }


}
