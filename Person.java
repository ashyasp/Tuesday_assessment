public abstract class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    private String name;
    private Size size;

    public Person(String size){

    }
    public void printInfo(){

    }

}
