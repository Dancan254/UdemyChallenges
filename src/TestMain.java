public class TestMain {

    public static void main(String[] args) {

        int i = 0;
        int j = 1;

//        while (++i < 5){
//            j++;
//        }
//        System.out.println(j++ + " " + (++i));

        while(i < 5){
            System.out.print(i++ + " ");
            i++;
        }
    }
}
