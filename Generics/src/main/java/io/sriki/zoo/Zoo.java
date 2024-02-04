package io.sriki.zoo;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> monkeyCage = new Cage<>(new Monkey(),new Monkey());

        Cage<Lion> lionCage = new Cage<>(new Lion(),new Lion());

//        Cage<Car> carCage = new Cage<>(new Car(),new Car());

    }
}
