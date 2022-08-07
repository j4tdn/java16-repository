package condition.loop;

public class Ex01If {
    public static void main(String[] args) {
        int number = 9;
        if(isEven(number)){
            System.out.println(number + " is even number!!!");
        }

        System.out.println("Finish ...");
    }

    private static boolean isEven(int n){
        return n % 2 == 0;
    }


}
