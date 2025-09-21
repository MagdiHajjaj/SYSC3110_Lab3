
public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;
    public BuddyInfo(String name,String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }
    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Homer", "cac","6132313444");

        System.out.printf("Hello %s", buddy1.getName());
    }

    public String getName() {
        return name;
    }
}
