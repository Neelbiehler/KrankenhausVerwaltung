import java.util.Scanner;

public class Krankenhausverwaltung {
    static Scanner sc = new Scanner(System.in);
    static String[] patientenNamen = new String[100];
    static int[] patientenIDs = new int[100];
    static String[] patientenArztNamen = new String[100];
    static int patientenZaehler = 0;
    static String[] aerzteNamen = new String[100];
    static int[] aerzteIDs = new int[100];
    static int arztZaehler = 0;

    public static void Verwaltungsprogramm() {
        int wahl;
        do {
            System.out.println("Krankenhausverwaltung");
            System.out.println("1. Patient hinzufügen");
            System.out.println("2. Arzt hinzufügen");
            System.out.println("3. Patienten und Ärzte anzeigen");
            System.out.println("4. Beenden");
            System.out.print("Wähle eine Option: ");
            wahl = sc.nextInt();
            sc.nextLine();

            switch (wahl) {
                case 1:
                    hinzufuegenPatient();
                    break;
                case 2:
                    hinzufuegenArzt();
                    break;
                case 3:
                    anzeigen();
                    break;
            }
        } while (wahl != 4);
    }

    static void hinzufuegenPatient() {
        System.out.print("Patientenname: ");
        patientenNamen[patientenZaehler] = sc.nextLine();
        System.out.print("Patienten-ID: ");
        patientenIDs[patientenZaehler] = sc.nextInt();
        sc.nextLine();
        System.out.print("Arztname: ");
        patientenArztNamen[patientenZaehler] = sc.nextLine();
        patientenZaehler++;
    }

    static void hinzufuegenArzt() {
        System.out.print("Ärztename: ");
        aerzteNamen[arztZaehler] = sc.nextLine();
        System.out.print("Ärzte-ID: ");
        aerzteIDs[arztZaehler] = sc.nextInt();
        sc.nextLine();
        arztZaehler++;
    }
    static void anzeigen() {
        System.out.println("Patienten: ");
        for (int i = 0; i < patientenZaehler; i++) {
            System.out.println("Name: " + patientenNamen[i] + ", ID: " + patientenIDs[i] + ", behandelnder Arzt: " + patientenArztNamen[i]);
        }
        System.out.println("Ärzte: ");
        for (int i = 0; i < arztZaehler; i++) {
            System.out.println("Name: " + aerzteNamen[i] + ", ID: " + aerzteIDs[i]);
        }
    }
}

