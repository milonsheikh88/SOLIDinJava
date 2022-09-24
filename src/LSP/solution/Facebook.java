package LSP.solution;

public class Facebook implements IPostMedia{

    @Override
    public void publishPost() {
        System.out.println("Facebook Post");
    }

    @Override
    public void chatWithFriend() {
        System.out.println("Facebook Chat");
    }


}
