class TestProg {
    public static void main(String[] args) {
        String bin_s = "111110001";
        int num = Integer.parseInt(bin_s, 2);
        System.out.println("The decimal value of binary " + bin_s + " is: " + num);

        String hex_s = "1F9";
        int num2 = Integer.parseInt(hex_s, 16);
        System.out.println("The decimal value of hexadecimal " + hex_s + " is: " + num2);

        String oct_s = "371";
        int num3 = Integer.parseInt(oct_s, 8);
        System.out.println("The decimal value of octal " + oct_s + " is: " + num3);

        String dec_s = "12345";
        int num4 = Integer.parseInt(dec_s);
        System.out.println("The decimal value of string " + dec_s + " is: " + num4);

    }
}