package LSP.violates;

public class Whatsapp implements  ISocialMedia{

    @Override
    public void chatWithFriend() {
        System.out.println("Whatsapp Chat");
    }

    //This is violates LSP rolls .....
    // Sub Class should not be substitutable for base class....
    @Override
    public void publishPost() {
        System.out.println("Not Supported");
    }
}
