import java.util.ArrayList;
public class AddressBook {

    public static void main(String[] args) {
        System.out.print("Address Book");
    }
    private ArrayList<BuddyInfo> Friend;

    public AddressBook(ArrayList<BuddyInfo> Friend){
        this.Friend = new ArrayList<BuddyInfo>();

    }
    public void addBuddy(BuddyInfo buddy){
        Friend.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        Friend.remove(buddy);
    }
}
