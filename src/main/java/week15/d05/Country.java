package week15.d05;

public class Country {
  
  private String name;
  private int population;
  private int casesWeekly;
  
  public Country(String name, int population, int casesWeekly) {
    this.name = name;
    this.population = population;
    this.casesWeekly = casesWeekly;
  }
  
  public void addCases(int cases) {
    casesWeekly += cases;
  }
  
  public double casesPopulationRate() {
    if (population > 1 && casesWeekly > 1) {
      return casesWeekly / (double)population;
    }
    return 0;
  }
  
  public String getName() {
    return name;
  }
  
  public int getPopulation() {
    return population;
  }
  
  public int getCasesWeekly() {
    return casesWeekly;
  }
  
  public void setCasesWeekly(int casesWeekly) {
    this.casesWeekly = casesWeekly;
  }
  
  @Override
  public String toString() {
    return name + ':' +
               " population=" + population +
               ", casesWeekly=" + casesWeekly +
               ", rate=" + casesPopulationRate() +
               "\n"
               ;
  }
}
