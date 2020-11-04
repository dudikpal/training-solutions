package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private List<Member> connections;

    public Member(String name) {
        this.name = name;
        connections = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Member> getConnections() {
        return connections;
    }

    public void connectMember(Member member) {
        connections.add(member);
    }

    public String toString() {
        return name + " kapcsolatai: " + connectedNames() ;
    }

    public List<String> connectedNames() {
        List<String> result = new ArrayList<>();
        for (Member member: connections) {
            result.add(member.getName());
        }
        return result;
    }
}
