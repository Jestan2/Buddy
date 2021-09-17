public class BuddyInfo {
    //Jestan Brar
    //101212208
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Henry");
        System.out.print("Hello" + " " + buddyInfo.getName());

    }


}