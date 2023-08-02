package learningJava;

public class arraysum {

    public static void main(String[] args) {

        int a[]={10,20,30,10,5,10};
        int sum=0;
        int len=a.length;

        for (int i=0;i<len;i++ )
        {
             sum=sum+a[i];

        }
        System.out.println(sum);

        System.out.println("Thank you");
    }
}
