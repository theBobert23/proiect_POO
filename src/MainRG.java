import java.util.ArrayList;

public class MainRG {
    public static void main(String[] args) {
        ArrayList<Dormitor> dormitoare = new ArrayList<>();
        ArrayList<Bucatarie> bucatarii = new ArrayList<>();

        Camera c1 = new Camera(),
                c2 = new Camera(4.5, 3.5, 2, 3, false, "galbeni", "0001"),
            c3 = new Camera(2, 3, 1.8, 3, true, "albi", "1234"),
            c4 = new Camera(2, 2, 2, 1, false, "rosii", "4321");



        dormitoare.add(new Dormitor());
        dormitoare.add(new Dormitor(c1, "matrimonial", 2, true, true, 21.5));
        dormitoare.add(new Dormitor(c2, "single", 1, false, false, 20.0));
        dormitoare.add(new Dormitor(c3, "king-size", 3, true, true, 22.0));
        dormitoare.add(new Dormitor(dormitoare.get(1)));
        dormitoare.add(new Dormitor(c1, "matrimonial", 2, false, true, 21.0));
        dormitoare.add(new Dormitor(c4, "single", 1, true, false, 19.5));
        dormitoare.add(new Dormitor(dormitoare.get(0)));
        dormitoare.add(new Dormitor(dormitoare.get(3)));
        dormitoare.add(new Dormitor(c2, "single", 1, false, true, 20.5));


        bucatarii.add(new Bucatarie());
        bucatarii.add(new Bucatarie(c2, 6, 500, true, 4, "granit"));
        bucatarii.add(new Bucatarie(c3, 2, 100, true, 2, "laminat"));
        bucatarii.add(new Bucatarie(bucatarii.get(1)));
        bucatarii.add(new Bucatarie(c2, 8, 1000, true, 5, "cuart"));
        bucatarii.add(new Bucatarie(bucatarii.get(2)));
        bucatarii.add(new Bucatarie(bucatarii.get(4)));
        bucatarii.add(new Bucatarie(c1, 4, 250, false, 4, "lemn"));
        bucatarii.add(new Bucatarie(c4, 6, 400, true, 4, "marmura"));
        bucatarii.add(new Bucatarie(c2, 2, 50, false, 2, "laminat"));

        // Afisare dormitoare
        System.out.println("=== LISTA DORMITOARE ===");
        for (int i = 0; i < dormitoare.size(); i++) {
            System.out.println("\nDormitor #" + (i + 1));
            dormitoare.get(i).afisareInformatii();
        }

        // Afisare bucatarii
        System.out.println("\n=== LISTA BUCATARII ===");
        for (int i = 0; i < bucatarii.size(); i++) {
            System.out.println("\nBucatarie #" + (i + 1));
            bucatarii.get(i).afisareInformatii();
        }
    }
}
