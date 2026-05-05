public class demo {
    public static void main(String[] args) {
        int b = 24;
        short a = b;
        // this will give error cannot convert int to short 
        System.out.println(a);
          

        // IMPLICIT conversion 
        // this is implicit conversion because we are converting the smaller data type value into bigger data type value.
        // Think like we can store small thing into some bigger thing


        short a = 10;
        int b = a;
        System.out.println(b);




        // TRUNCATING conversion 
        // this is truncating conversion we are converting float to int. converting from float or double to integer is called truncating conversion

        float f = 7.546f;
        int i;
        i=(int)f;
        System.out.println(i);



        // EXPLICIT conversion -> in explicit conversion we store bigger data value into the smaller data value. we cannot do it automatically
        // we have to do it explicitly by the help of the casting
        int i= 300;
        byte b = (byte)i;
        System.out.println(b);
         

        // OUTPUT -> 44


        // IMPORTANT
        // this will print 44 not 300  because in byte we have the range of -128 to +127 but we are using 300 so what will happen 300%256 will
        // happen and we get 44
}
}