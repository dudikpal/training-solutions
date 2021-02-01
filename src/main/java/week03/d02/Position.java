package week03.d02;

import java.util.List;

public class Position {
  private String name;
  private int bonus;
  
  public Position(String name, int bonus) {
    this.name = name;
    this.bonus = bonus;
  }
  
  public static void main(String[] args) {
    List<Position> positions = List.of(new Position("első", 100000), new Position("második", 200000));
    for (Position position : positions) {
      if (position.bonus > 150000) {
        System.out.println(position);
      }
    }
  }
  
  @Override
  public String toString() {
    return "Position{" +
               "name='" + name + '\'' +
               ", bonus=" + bonus +
               '}';
  }
}
