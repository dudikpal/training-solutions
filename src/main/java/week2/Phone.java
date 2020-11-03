package week2;

import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a telefon típusát:");
        String phoneType = sc.nextLine();
        System.out.println("A telefon memóriája:");
        int phoneMem = sc.nextInt();

        Phone phone1 = new Phone("Motolora", 3);
        Phone phone2 = new Phone("Nikoa", 2);

        System.out.println("A telefon márkája: " + phone1.type + ", " + phone1.mem + "Gb RAM");
        System.out.println("A telefon márkája: " + phone2.type + ", " + phone2.mem + "Gb RAM");
        System.out.println("A telefon márkája: " + phoneType + ", " + phoneMem + "Gb RAM");

    }
}
