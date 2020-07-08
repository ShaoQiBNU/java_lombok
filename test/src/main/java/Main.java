public class Main {

    public static void main(String[] args) {


        System.out.println("---------------------");

        User user1 = new User();

        user1.setAge(10);
        user1.setName("Jack");
        user1.setId("20000");

        System.out.println(user1.getAge());
        System.out.println(user1.getName());
        System.out.println(user1.getId());

        User2 user2 = User2.builder().id("1").name("builder").age(1).build();
        System.out.println(user2.getAge());
        System.out.println(user2.getName());
        System.out.println(user2.getId());

    }
}
