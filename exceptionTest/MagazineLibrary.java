import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary( ) {
        this.magazines =new ArrayList<>() ;
    }
    public Magazine getMagazine(int index){
        return new Magazine(this.magazines.get(index));
    }
    public void setMagazine(int index,Magazine magazineSetObject ){
        this.magazines.set(index,new Magazine(magazineSetObject) );
    }
    public void addMagazine(Magazine magazineaddObject){
        this.magazines.add(new Magazine(magazineaddObject));
    }

    
}
