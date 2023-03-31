package D01_Modul_1_Quiz;

public class C01_PlayAnimals {
    public void play(){
        Frog fred = new Frog();
        Cat jiang = new Cat();
        fred.hop(4);
        jiang.jump(5, fred);
        String greet = That is all";
        fred.say(greet,3);
    }
}
// Only Hop