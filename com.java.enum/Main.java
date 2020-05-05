public class Main {

    public static void main(String[] args) {

        //To print the value of the enum
        System.out.println(WorkStatus.PENDING.getStatus());

        System.out.println(WorkStatus.findByValue("pending"));

    }
}
