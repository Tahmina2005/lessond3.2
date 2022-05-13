public class Main {
    public static void main(String[] args) {

        double [] d = {-2.5,3.5,2.2,-6.0,4.20,4.4,1.20,45.7,500.6,45.4,66.6,8.2,2.5,5.5,11.4};

        for  (int i = 15; i > 1; i--){
            if (i == 3){
                break;
            }
            System.out.println("3 х " + i + " = " + (3 * i));
        }

        for (int i = 14; i > 1; i--){
            if (i%3 == 0){
                continue;
            }
            System.out.println(701.3/13);
        }

    }
}
