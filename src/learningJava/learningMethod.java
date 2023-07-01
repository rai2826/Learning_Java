package learningJava;

public class learningMethod {

    public static void main(String[] args) {

        learningMethod();
        learningMethod d= new learningMethod();
        d.learningmethoddd();

    }
// As we are using static here we can just call this method in this class without an object of this class
    public static void learningMethod()
    {
        System.out.println("hi i am in method");
    }


// As we are not using static hence we have to use object of this class to call this method
    public void learningmethoddd()
    {
        System.out.println("hey i am in second method");
    }

}
