package emaillistcleaner;
import java.util.*;
public class EmailListCleaner {
  private List<String>emailList;
  private Set<String>uniqueEmails;
  public EmailListCleaner(){
      emailList=new ArrayList<>();
      uniqueEmails=new HashSet<>();
  }
    void addEmails(List<String> emails){
      emailList.addAll(emails);
    }
    public void removeDuplicates(){
      uniqueEmails.addAll(emailList);
    }
    public void displayUniqueEmails(){
      for (String email:uniqueEmails){
          System.out.println(email);
      }
    }

    public static void main(String[] args) {
        EmailListCleaner cleaner =new EmailListCleaner();
        List<String> emails = new ArrayList<>();
        emails.add("shravani@gmail.com");
        emails.add("kummari@gmail.com");
        emails.add("chikitha@gmail.com");
        emails.add("soujanya@gmail.com");
        emails.add("pooja@gmail.com");
        emails.add("shravani@gmail.com");

        cleaner.addEmails(emails);
        cleaner.removeDuplicates();
        System.out.println("Unique email addresses:");
        cleaner.displayUniqueEmails();
    }
}