import java.util.ArrayList;
//Jestan Brar 101212208
public class AddressBook {


    public static void main(String[] args) {
        System.out.print("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "661");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    private ArrayList<BuddyInfo> Friend;

    public AddressBook(){
        this.Friend = new ArrayList<BuddyInfo>();

    }
    public void addBuddy(BuddyInfo buddy){
        Friend.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        Friend.remove(buddy);
    }
}
