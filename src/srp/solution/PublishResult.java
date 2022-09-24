package srp.solution;

public class PublishResult {

    PrintResultService prs=new PrintResultService();
    EmailResultService ers=new EmailResultService();
    SaveResultService srs=new SaveResultService();

    public void publishResult(Student student){
        srs.saveResult(student);
        prs.printResult(student);
        ers.emailResult(student);
    }

}
