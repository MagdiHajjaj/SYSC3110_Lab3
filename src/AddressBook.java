
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

    public int getBuddyCount() {
        return buddies.size();
    }
    public int getBuddyCount2() {
        return buddies.size();
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
        BuddyInfo buddy4 = new BuddyInfo("Tom4", "Carletons","14124");

        addressBook.addBuddy(buddy4);
        BuddyInfo buddy5 = new BuddyInfo("Tom5", "Carletons","14124");

        addressBook.addBuddy(buddy5);
        BuddyInfo buddy6 = new BuddyInfo("Tom6", "Carletons","14124");

        addressBook.addBuddy(buddy6);
    }

}
