public class master{
    public static void main(String[] args) {
        String name = "Krzysztof";
        String lastName = "Głuchowski";
        int index_number = 51298;
        String message = String.format("%s %s %d", name, lastName,index_number);
        System.out.println(message);
    }
}