public class MainGiulia {
    public static void main(String[] args) {

        Object[] caseVector = new Object[10];

        caseVector[0] = new Casa("Strada 1", 1, 4, 3, 100, true, false, "Caramida");
        caseVector[1] = new Casa("Strada 2", 2, 7, 5, 150, true, true, "Beton");
        caseVector[2] = new Casa("Strada 3", 1, 4, 2, 80, false, false, "Lemn");
        caseVector[3] = new Casa("Strada 4", 2, 8, 6, 200, true, true, "Caramida");
        caseVector[4] = new Casa("Strada 5", 1, 3, 3, 90, true, false, "Lemn");
        caseVector[5] = new Casa("Strada 6", 2, 7, 4, 130, false, true, "Beton");
        caseVector[6] = new Casa("Strada 7", 3, 10, 7, 250, true, true, "Beton");
        caseVector[7] = new Casa("Strada 8", 1, 4, 2, 70, false, false, "Caramida");
        caseVector[8] = new Casa("Strada 9", 2, 8, 5, 170, true, true, "Caramida");
        caseVector[9] = new Casa("Strada 10", 1, 4, 4, 120, true, false, "Lemn");

        Object[] blocuri = new Object[10];

        blocuri[0] = new Bloc("Strada A", 4, 15, 20, 1, false, 1980, true);
        blocuri[1] = new Bloc("Strada B", 10, 32, 80, 2, true, 1990, true);
        blocuri[2] = new Bloc("Strada C", 8, 26, 60, 2, true, 2000, false);
        blocuri[3] = new Bloc("Strada D", 4, 14, 16, 1, false, 1975, false);
        blocuri[4] = new Bloc("Strada E", 6, 20, 36, 2, true, 2010, true);
        blocuri[5] = new Bloc("Strada F", 12, 38, 96, 3, true, 2020, true);
        blocuri[6] = new Bloc("Strada G", 3, 11, 12, 1, false, 1985, false);
        blocuri[7] = new Bloc("Strada H", 5, 17, 30, 2, true, 2005, true);
        blocuri[8] = new Bloc("Strada I", 9, 29, 72, 3, true, 2015, true);
        blocuri[9] = new Bloc("Strada J", 4, 15, 24, 2, false, 1995, false);

        System.out.println("Lista caselor:");

        for (int i = 0; i < caseVector.length; i++) {
            System.out.println(caseVector[i]);
        }

        System.out.println("\nLista blocurilor:");

        for (int i = 0; i < blocuri.length; i++) {
            System.out.println(blocuri[i]);
        }
    }
}