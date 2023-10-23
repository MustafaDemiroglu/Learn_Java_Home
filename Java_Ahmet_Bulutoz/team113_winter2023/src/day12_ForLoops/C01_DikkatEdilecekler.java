package day12_ForLoops;

public class C01_DikkatEdilecekler {

    public static void main(String[] args) {

        for (int i=20;i<20;i++){
            System.out.print(i + " ");

            // for loop calisti ancak ilk deger icin bitis sarti false verdiginden
            // loop bpdy si hic devreye girmedi

            for (int j = 0; j < 10; j--) {
                System.out.print(j + " ");
            }
            // loop basladiktan sonra artis / azalis yöntemi sebebiyle
            // bitis degerinden uzaklasiyorsa, loop teorik olarak sonsuza kadar calisir
            // buna sonsuz Loop denir
        }
    }

}
