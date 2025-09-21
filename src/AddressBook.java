
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null) {
            buddies.add(buddy);
        }
    }
    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }


    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carletons","141");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        BuddyInfo buddy2 = new BuddyInfo("Tom2", "Carletons","14124");

        addressBook.addBuddy(buddy2);
        BuddyInfo buddy3 = new BuddyInfo("Tom3", "Carletons","14124");

        addressBook.addBuddy(buddy3);
    }

}
