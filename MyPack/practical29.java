// Make  a  package  called  “MyPack”  in  which declare one class called “PackDemo” which displays the string from three different classes of that same package

package MyPack;

class ClassOne {
    public String getMessage() {
        return "This is a string from ClassOne.";
    }
}

class ClassTwo {
    public String getMessage() {
        return "This is a string from ClassTwo.";
    }
}

class ClassThree {
    public String getMessage() {
        return "This is a string from ClassThree.";
    }
}

class PackDemo {
    public void displayStrings() {
        System.out.println(new ClassOne().getMessage());
        System.out.println(new ClassTwo().getMessage());
        System.out.println(new ClassThree().getMessage());
    }
}

public class practical29 {
    public static void main(String[] args) {
        PackDemo demo = new PackDemo();
        demo.displayStrings();
    }
}
