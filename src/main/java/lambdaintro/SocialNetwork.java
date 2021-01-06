package lambdaintro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();

    public SocialNetwork(List<Member> members) {
        this.members = members;
    }

    public List<Member> findMembersBy(Predicate<Member> memberPredicate) {
        return members.stream()
                .filter(memberPredicate)
                .collect(Collectors.<Member>toList());
        /*
        List<Member> found = new ArrayList<>();
        for (Member member: members) {
            if (predicate.test(member)) {
                found.add(member);
            }
        }
        return found;
         */
    }

    public void applyToSelectedMembers(Predicate<Member> memberPredicate, Consumer<Member> memberConsumer) {
        members.stream()
                .filter(memberPredicate)
                .collect(Collectors.<Member>toList())
                .forEach(memberConsumer);

        /*
        for (Member member: members) {
            if (predicate.test(member)) {
                consumer.accept(member);
            }
        }
         */
    }

    public <T> List<T> transformMembers(Function<Member, T> function) {

        List<T> transformed = new ArrayList<>();
        for (Member member: members) {
            transformed.add(function.apply(member));
        }
        return transformed;

    }

}
