public class DragonReference {
    public static void main(String[] args) {
        StringBuilder warriorProfession=new StringBuilder("Dragon ");
        String warriorWeapon="Sword ";

        changeWarriorClass(warriorProfession,warriorWeapon);
        System.out.println(warriorProfession + warriorWeapon);
        System.out.println();
    }
      static void changeWarriorClass(StringBuilder wf,String w){
        wf.append("append knight");
        w=w+"kirna";
        wf=null;
        w=null;
     }
    
}
