package stringbuilder;

public class NameBuilderMain {

    public static void main(String[] args) {
        NameBuilder nb = new NameBuilder();
        String name = "Ms Szilva de Bamao";
        System.out.println(nb.concatNameWesternStyle("Bamao", "de", "Szilva", Title.MS));

        System.out.println(nb.insertTitle("Ms Szilva de Bamao", Title.DR, " "));
        System.out.println(nb.deleteNamePart(name, "de"));

    }
}
