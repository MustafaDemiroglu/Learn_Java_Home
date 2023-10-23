package day03_Scanner_DataCasting;

public class C06_ExplicitNarroving {

    public static void main(String[] args) {

        double db1 = 45.32 ;
        int in1 = (int)db1 ;   // int <=== double
        System.out.println(in1);  // 45 ondaliki kismi atti

        db1=3987645754548789641231515564795d;
        in1=(int)db1; // int <===double
        System.out.println(in1);  //  2147483647 = int alabilecegi  maksimum degr

        in1=34;
        byte by1 = (byte)in1; // byte <=== int              byte  =  -128 ....127
        System.out.println(by1);   //34

        in1=130;
        by1 = (byte)in1;
        System.out.println(by1);   // -126
        // maksimum deger olan 1217 den sonra -128 -127 dönerek -126 degerini alir
    }
}
