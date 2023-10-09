import java.util.Scanner;

public class CityPopMain {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int neam=promptForPopulation(scanner);
        
    }
    public static boolean isNullOrBlank(String input){
        return input.isBlank() || input == null;
    }
    public static boolean incorrectPopulation(int population){
        return population<=0;
    }
    public static String promptForCityName(Scanner scanner){
while(true){
    System.out.println("please enter valid city name");
    String cityName=scanner.nextLine();
    if(!isNullOrBlank(cityName)){
    return cityName;
    }  
}
    }
    public static String promptForCountryName(Scanner scanner){
        while(true){
            System.out.println("please enter valid country");
            String countryNme=scanner.nextLine();
            if(!isNullOrBlank(countryName)){
                return countryName;
            }
        }
    }
    public static int promptForPopulation(Scanner scanner){
        while(true){
            System.out.println("please enter valid population");
        if(!scanner.hasNextInt()){
            scanner.next();
            continue;
        }
        int population=scanner.nextInt();
        if(!incorrectPopulation(population)){
            return population;
        }
        }
    }


}
