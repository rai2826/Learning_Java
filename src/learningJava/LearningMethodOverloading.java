package learningJava;

public class LearningMethodOverloading {

    // Method overloading is having same method name but passing different method arguments, check below 2 methods with same name but different params
    // Static keyword will help in calling these methods with making the objects of the class

        public static void car(String carname ){
            System.out.println(" hello i am automatic Car");
        }
        public static void car(int carmodel){
            System.out.println(" helllo my car model is numeric");
        }

    public static void main(String[] args) {
            //  method gets called depending what parameter is being passed
        car("bmw");
        car(2021);
    }
}
