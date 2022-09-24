package LSP.violates;

public class Facebook implements ISocialMedia {
    @Override
    public void chatWithFriend() {
        System.out.println("Facebook Chat");
    }

    @Override
    public void publishPost() {
        System.out.println("Facebook Post");
    }
}
