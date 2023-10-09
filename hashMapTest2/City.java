public class City {
    private String name;
    private String country;
    private Long population; 

    public City(String name, String country, Long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }
    public City(City source) {
        setName(source.name);
        setCountry(source.country);
        setPopulation(source.population);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name.isBlank() || name == null){
            throw new IllegalArgumentException("name should not be blank or null");
        }else{
        this.name = name;}
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        if(country.isBlank() || country == null){
            throw new IllegalArgumentException("country should not be blank or null");
        }else{
        this.country = country;}
       
    }

    public Long getPopulation() {
        return this.population;
    }

    public void setPopulation(Long population) {
        if(population<=0){
            throw new IllegalArgumentException("population should not be less than or equal to 0");
        }else{
            this.population=population;
        }
        this.population = population;
    }
    
}
