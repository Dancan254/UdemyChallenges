package Generics.Introduction;

public class GenericClasses {

    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.setValue(45);
        System.out.println(intBox.toString());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Ian");
        System.out.println(stringBox.toString());
    }

    public static class Box<T> {
        private T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "value=" + value +
                    '}';
        }
    }
}
