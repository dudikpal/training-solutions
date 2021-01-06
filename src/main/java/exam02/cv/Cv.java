package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public int findSkillLevelByName(String skillName) {
        for (Skill skill: skills) {
            if (skill.getName().equals(skillName)) {
                return skill.getLevel();
            }
        }
        throw new SkillNotFoundException("This person have not this skill");
    }

    public void addSkills(String... skills) {
        for (String skill: skills) {
            String skillName = skill.substring(0, skill.indexOf('(') - 1);
            int skillLevel = Integer.parseInt(skill.substring(skill.indexOf('(') + 1, skill.length() - 1));
            this.skills.add(new Skill(skillName, skillLevel));
        }
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
