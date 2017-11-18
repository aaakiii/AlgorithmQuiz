public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(NumberComplement(5));
    }

    public static int NumberComplement(int input) {
        int result = 0;
        int multiplier = 1;

        while(input > 0)
        {
            int residue = input % 2;
            input     = input / 2;
            result      = result + residue * multiplier;

            multiplier  = multiplier * 10;

        }

        String strInt = Integer.toString(result);
        char[] chars = strInt.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '0') {
                chars[i] = '1';
            }else if(chars[i] == '1'){
                chars[i] = '0';
            }
        }

        return Integer.parseInt(new String(chars), 2);
    }
}
