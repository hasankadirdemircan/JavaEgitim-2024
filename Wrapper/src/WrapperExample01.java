public class WrapperExample01 {
    public static void main(String[] args) {

        // javadaki primitive tiplere karşılık gelen sınıflara -> wrapper
        //boolean tf = "true; //error
        // Deprecated since java9;
      /*  Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean(true);
        Boolean b3 = new Boolean("kadir");
        Boolean b4 = new Boolean("trUe");
        Boolean b5 = new Boolean("tRue");

        // boolean b4 = "kadir";
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        boolean b6 = b5;
        boolean b7 = b3;
        System.out.println(b6);
        System.out.println(b7); */

        //After java9

        System.out.println("------------Boolean-------------");
        Boolean b1 = Boolean.parseBoolean("true");
      //  Boolean b2 =  Boolean.parseBoolean(true);
        Boolean b3 =  Boolean.parseBoolean("kadir");
        Boolean b4 =  Boolean.parseBoolean("trUe");
        Boolean b5 =  Boolean.parseBoolean("tRue");

        // boolean b4 = "kadir";
        System.out.println(b1);
      //  System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        boolean b6 = b5;
        boolean b7 = b3;
        System.out.println(b6);
        System.out.println(b7);
        boolean b8 = Boolean.valueOf("trUE");
        System.out.println(b8);

        System.out.println("------------Byte-------------");
        Byte byte1 = Byte.valueOf((byte) 5);
        Byte byte2 = Byte.valueOf("50");
        System.out.println(byte1);
        System.out.println(byte2);

        System.out.println("------------Integer-------------");
        Integer integer1 = Integer.valueOf(10);
        Integer integer2 = Integer.valueOf("15");
        Integer integer3 = integer1 + integer2;
        int int1 = integer1 + integer2;
        System.out.println(integer3);
        System.out.println(int1);


        System.out.println("------------Float-------------");
        Float float1 = Float.valueOf("4.5");
        Float float2 = Float.valueOf(4.5f);
        Float float3 = Float.valueOf(4);
        Float float4 = float1 + float3;
        System.out.println(float4);


        System.out.println("------------Double-------------");
        Double d1 = Double.valueOf("534");
        Double d2 = Double.valueOf(2);
        Double d3 = d1 + d2;
        System.out.println(d3);

        System.out.println("------------Character-------------");
        Character character1 = Character.valueOf('a');
        Character character2 = Character.valueOf((char)65); //ascii + 32
        Character character3 = Character.valueOf((char)97);
        System.out.println(character2);
        System.out.println(character3);


        Integer.parseInt("123232"); //parseXXX -> String to primitive
        Double.parseDouble("12312323");

        double floatToDouble = float2.doubleValue(); // xxxValue
    }
}