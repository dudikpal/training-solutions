package stringbuilder;

public class NameBuilder {

    /*private Title title;
    private String familyName;
    private String middleName;
    private String givenName;

    public NameBuilder(Title title, String familyName, String middleName, String givenName) {

        this.title = title;

        this.familyName = isEmptyFamilyOrGivenName(familyName);
        this.middleName = middleName;
        this.givenName = isEmptyFamilyOrGivenName(givenName);
    }*/

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {
        isEmptyFamilyOrGivenName(familyName);
        isEmptyFamilyOrGivenName(givenName);

        StringBuilder sb = new StringBuilder();

        if (title != null) {
            sb.append(title.getTitle() + " ");
        }
        sb.append(givenName + " ");
        if (!isEmpty(middleName)) {
            sb.append(middleName + " ");
        }
        sb.append(familyName);

        return sb.toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title) {
        isEmptyFamilyOrGivenName(familyName);
        isEmptyFamilyOrGivenName(givenName);

        StringBuilder sb = new StringBuilder();

        if (title != null) {
            sb.append(title.getTitle() + " ");
        }
        sb.append(familyName + " ");
        if (!isEmpty(middleName)) {
            sb.append(middleName + " ");
        }
        sb.append(givenName);

        return sb.toString();
    }
    public String insertTitle(String name, Title title, String where) {
        StringBuilder sb = new StringBuilder(name);
        int index = sb.indexOf(where);
        sb.insert(index + 1, title.getTitle() + " ");
        return sb.toString();
    }

    public String deleteNamePart(String name, String delete) {
        StringBuilder sb = new StringBuilder(name);
        int index = sb.indexOf(delete);
        return sb.delete(index, index + delete.length()).toString();
    }

    private String isEmptyFamilyOrGivenName(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        } else if (str.isBlank()) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        return str;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank() ? true : false;
    }
}
