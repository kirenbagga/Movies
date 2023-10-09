import java.util.Scanner;

public class MagazineLibraryMain {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String title=promptForTitle(scanner);
        String publisher=promptForPublisher(scanner);
        int issueNumber=promptForIssueNumber(scanner);
        int publicationYear=promptForPublicationYear(scanner);

        Magazine newMagazine=new Magazine(title,publisher,issueNumber,publicationYear);
        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);
        System.out.println("magazine added to library" + newMagazine.getTitle());


        // Magazine magazine1 = new Magazine("mag 1", "pub 1", 1, 2020);
        // Magazine magazine2 = new Magazine("mag 2", "pub 2", 2, 2022);
        // MagazineLibrary magazineLibrary = new MagazineLibrary();
        // magazineLibrary.addMagazine(magazine1);
        // magazineLibrary.addMagazine(magazine2);

        // Magazine retrieveMagazine = magazineLibrary.getMagazine(0);
        // System.out.println(retrieveMagazine.getTitle());

        // Magazine newMagazine = new Magazine("mag 3", "pub 3", 3, 2023);
        // magazineLibrary.setMagazine(0, newMagazine);

        // retrieveMagazine = magazineLibrary.getMagazine(0);
        // System.out.println(retrieveMagazine.getTitle());
        // magazine1.setPublicationYear(0);
        // magazine1.setIssueNumber(-1);
        // magazine1.setPublisher(" ");
        // Magazine magazine2=new Magazine("", " ", 0, 0);

    }
    public static boolean isNullOrBlank(String input){
         return (input.isBlank() || input == null);    
    }
    public static boolean incorrectIssueNumber(int issueNumber){
        return issueNumber>=0;
    }
    public static boolean incorrectPublicationYear(int publicationYear){
        return publicationYear>=0;
    }
    public static String promptForTitle(Scanner scanner){
        while(true){
            System.out.println("\n please enter a valid title");
            String title=scanner.nextLine();
            if(!isNullOrBlank(title)){
                return title;
            }
        }
    }
    public static String promptForPublisher(Scanner scanner){
        while(true){
            System.out.println("\n please enter a valid publisher");
            String publisher=scanner.nextLine();
            if(!isNullOrBlank(publisher)){
                return publisher;
            }
        }
    }
    public static int promptForIssueNumber(Scanner scanner){
        while(true){
            System.out.println("\n please enter a valid issue Number");
            if(!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            int issueNumber=scanner.nextInt();
            if(incorrectIssueNumber(issueNumber)){
                return issueNumber;
            }
        }
    }
 public static int promptForPublicationYear(Scanner scanner){
        while(true){
            System.out.println("\n please enter a valid publication year");
            if(!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            int publicationYear=scanner.nextInt();
            if(incorrectPublicationYear(publicationYear)){
                return publicationYear;
            }
        }
    }

}
