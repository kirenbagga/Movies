public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }
    public Magazine(Magazine source){
        setTitle(source.title);
        setPublisher(source.publisher);
        setIssueNumber(source.issueNumber);
        setPublicationYear(source.publicationYear);

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title.isBlank() || title==null) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        } else {
        }
        this.title = title;
    }

    

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher.isBlank() || publisher==null) {
            throw new IllegalArgumentException("publisher cannot be null or blank");
        } else {
            this.publisher = publisher;
        }

    }

    public int getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("issue number  cannot be less than or equal to 0");
        } else {
            this.issueNumber = issueNumber;
        }
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        
        if(publicationYear<=0){
            throw new IllegalArgumentException("publication year  cannot be less than or equal to 0");
        }else{
        this.publicationYear = publicationYear;}
    }
}