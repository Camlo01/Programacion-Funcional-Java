package _10_Chaining;

public class chaining {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hola")
                .append("Como")
                .append("estas");

        Chainer chainer = new Chainer();

        Chainer chainer2 = chainer.sayHi();
        Chainer chainer3 = chainer.sayBye();
        chainer.sayHi().sayBye();
    }

    static class Chainer {
        public Chainer sayHi() {
            System.out.println("Hola");
            return this;
        }

        public Chainer sayBye() {
            System.out.println("Adios");
            return this;
        }
    }
}
