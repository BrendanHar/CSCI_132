package Program03;

public class CaesarCipher {

    protected char[] encoder = new char[26];
    protected char[] decoder = new char[26];
    protected int[] subArray = new int[3];

    public CaesarCipher(int rotation){
        String number = String.valueOf(rotation);
        for (int k=0; k < number.length(); k++) {
        encoder[k] = (char)('A' + (k + rotation)%26);
        decoder[k] = (char)('A' + (k - rotation + 26)%26);
        }
    }

    public String encrypt(String message){
        return transform(message, encoder);
    }
    public String decrypt(String secret){
        return transform(secret, decoder);
    }

    private String transform(String original, char[] code){
        char[] msg = original.toCharArray();
        for (int k=0; k<msg.length; k++)
            if (Character.isUpperCase(msg[k])){
                int j = msg[k]- 'A';
                msg[k] = code[j];
            }
        return new String(msg);
    }

}
