public class MainIVN{
    public static void main(String[] args) {
        Scoala s1 = new Scoala("Str. Oltului", 3, 3.5, "Liceul Dunarea", 600, 40, 20, "Real");
        System.out.println(s1);
        s1.afisareInformatii();
        System.out.println("Inaltime totala: " + s1.calculeazaInaltimeTotala());
        s1.verificaLift();
        s1.verificaDimensiuneScoala();

        System.out.println();

        Spital sp1 = new Spital("Gheorghe Asachi", 5, 4.0, "Spitalul Judetean", 350, 90, 12, "Galati");
        Spital sp2 = new Spital(sp1);
        sp2.setNume("Spitalul Clinic");

        System.out.println(sp1);
        sp1.afiseazaTipCladire();
        sp1.verificaCapacitateSpital();
        System.out.println("Copie: " + sp2);


        Object[] vectorScoli = new Object[10];

        vectorScoli[0] = new Scoala("Str. Lalelelor 1", 2, 3.2, "Scoala Nr. 1", 320, 22, 14, "General");
        vectorScoli[1] = new Scoala("Bd. Unirii 15", 3, 3.5, "Liceul Mihai Eminescu", 650, 45, 24, "Real");
        vectorScoli[2] = new Scoala("Str. Florilor 8", 2, 3.0, "Scoala Nr. 5", 280, 19, 12, "General");
        vectorScoli[3] = new Scoala("Calea Victoriei 40", 4, 3.6, "Colegiul National", 820, 60, 30, "Uman");
        vectorScoli[4] = new Scoala("Str. Teiului 12", 1, 3.1, "Scoala Primara Nr. 3", 150, 10, 6, "Primar");
        vectorScoli[5] = new Scoala("Bd. Independentei 22", 3, 3.4, "Liceul Teoretic", 540, 38, 20, "Real");
        vectorScoli[6] = new Scoala("Str. Garii 9", 2, 3.2, "Scoala Gimnaziala Nr. 7", 410, 28, 16, "General");
        vectorScoli[7] = new Scoala("Str. Parcului 3", 3, 3.5, "Liceul de Arte", 390, 35, 18, "Artistic");
        vectorScoli[8] = new Scoala("Bd. Pacii 50", 4, 3.7, "Colegiul Tehnic", 710, 52, 26, "Tehnic");
        vectorScoli[9] = new Scoala((Scoala) vectorScoli[1]);

        System.out.println("LISTA SCOLI 10 ELEMENTE");
        for (int i = 0; i < vectorScoli.length; i++) {
            System.out.println((i + 1) + ". " + vectorScoli[i]);
        }

        System.out.println();


        Object[] vectorSpitale = new Object[10];

        vectorSpitale[0] = new Spital("Bd. Eroilor 10", 5, 4.0, "Spitalul Judetean", 450, 120, 14, "Bucuresti");
        vectorSpitale[1] = new Spital("Str. Spitalului 2", 4, 3.8, "Spitalul Municipal", 300, 80, 10, "Cluj");
        vectorSpitale[2] = new Spital("Calea Bucuresti 33", 6, 4.2, "Spitalul Clinic Universitar", 600, 180, 18, "Iasi");
        vectorSpitale[3] = new Spital("Str. Sanatati 7", 3, 3.5, "Spitalul de Pediatrie", 180, 55, 7, "Timisoara");
        vectorSpitale[4] = new Spital("Bd. Republicii 19", 4, 3.9, "Spitalul de Urgenta", 380, 110, 12, "Brasov");
        vectorSpitale[5] = new Spital("Str. Libertatii 14", 2, 3.4, "Spitalul Orasenesc", 120, 35, 5, "Sibiu");
        vectorSpitale[6] = new Spital("Calea Moldovei 28", 5, 4.0, "Spitalul Regional", 500, 140, 15, "Constanta");
        vectorSpitale[7] = new Spital("Str. Viitorului 6", 3, 3.6, "Spitalul de Recuperare", 210, 48, 6, "Oradea");
        vectorSpitale[8] = new Spital("Bd. Carol 11", 4, 3.8, "Spitalul Militar", 260, 75, 9, "Craiova");
        vectorSpitale[9] = new Spital((Spital) vectorSpitale[0]);


        System.out.println(" LISTA SPITALE 10 ELEMENTE");
        for (int i = 0; i < vectorSpitale.length; i++) {
            System.out.println((i + 1) + ". " + vectorSpitale[i]);
        }
    }
}