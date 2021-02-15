package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {
  
  private Boat boat;
  private LocalDate sailing;
  private double basicPrice;
  private List<Passenger> passengers = new ArrayList<>();
  
  public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
    this.boat = boat;
    this.sailing = sailing;
    this.basicPrice = basicPrice;
  }
  
  public Map<CruiseClass, Integer> countPassengerByClass() {
    Map<CruiseClass, Integer> result = new HashMap<>();
    for (Passenger passenger : passengers) {
      result.merge(passenger.getCruiseClass(), 1, Integer::sum);
    }
    return result;
  }
  
  public double sumAllBookingsCharged() {
    double sum = 0;
    for (Passenger passenger : passengers) {
      sum += basicPrice * passenger.getCruiseClass().getPriceMultiplier();
    }
    return sum;
  }
  
  public List<String> getPassengerNamesOrdered() {
    List<String> names = new ArrayList<>();
    for (Passenger passenger : passengers) {
      names.add(passenger.getName());
    }
    Collections.sort(names);
    return names;
  }
  
  public Passenger findPassengerByName(String name) {
    for (Passenger passenger : passengers) {
      if (passenger.getName().equals(name)) {
        return passenger;
      }
    }
    return null;
  }
  
  public double getPriceForPassenger(Passenger passenger) {
    return basicPrice * passenger.getCruiseClass().getPriceMultiplier();
  }
  
  public void bookPassenger(Passenger passenger) {
    if (passengers.size() != boat.getMaxPassengers()){
      passengers.add(passenger);
    } else {
      throw new IllegalArgumentException("Boat is full!");
    }
  }
  
  public Boat getBoat() {
    return boat;
  }
  
  public LocalDate getSailing() {
    return sailing;
  }
  
  public double getBasicPrice() {
    return basicPrice;
  }
  
  public List<Passenger> getPassengers() {
    return passengers;
  }
}
