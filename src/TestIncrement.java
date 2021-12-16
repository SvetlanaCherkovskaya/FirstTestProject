public class TestIncrement {

    public static void main(String[] args) {
        int i = 0;
        int a = i++; //i = i + 1
        System.out.println(a);
        System.out.println(i);

        a = ++i;
        System.out.println(a);
        System.out.println(i);

        int j = i + 1;
        System.out.println(i);
        System.out.println(j);

        a = i+=10;
        System.out.println(a);
        System.out.println(i);






    }
}
