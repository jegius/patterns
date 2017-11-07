package java8.testinnerclasses;

public class ClassWithInner {
    Color color;

    ClassWithInner(){
        this.color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
