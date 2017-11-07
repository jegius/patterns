package java8.testinnerclasses;

public class Runner {
    public static void main(String[] args) {
        ClassWithInner classWithInner = new ClassWithInner();
        classWithInner.color.setDescription("test");
        System.out.println(classWithInner.color.getDescription());
    }
}
