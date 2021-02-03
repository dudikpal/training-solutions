package week14.d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserFilters {
  
  public UserFilter createFilter(List<Predicate<User>> predicates) {
    
    
    return users -> {
    return users.stream()
        .filter(predicates.stream().reduce(a -> true, Predicate::and))
        .collect(Collectors.toList());
    
      /*ekvivalens ezzel
        .filter(predicates.stream().reduce(a -> true, (pred0, pred1) -> pred0.and(pred1)))
        .collect(Collectors.toList());
      */
      
      /* Meg ezzel
      Iterator<User> userIter = users.iterator();
      while (userIter.hasNext()) {
        User user = userIter.next();
        boolean should = false;
        for (Predicate<User> predicate : predicates) {
          if (!predicate.test(user)) {
            should = true;
          }
        }
        if (should) {
          userIter.remove();
        }
      }
      return users;*/
    };
  }
  
  public static void main(String[] args) {
    final UserFilter filter = new UserFilters().createFilter(Arrays.asList(
        (user) -> user.getAge() > 18,
        (user) -> user.getName().startsWith("A")
    ));
    System.out.println(filter.filter(new ArrayList<>(Arrays.asList(
        new User("Marton", 16, "Racz Aladar utca 99/b"),
        new User("Attila", 19, "Kazmer utca 4")
    ))));
  }
}
