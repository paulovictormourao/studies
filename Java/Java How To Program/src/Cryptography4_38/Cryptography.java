package Cryptography4_38;

public class Cryptography {
    private int num;

    public Cryptography(int num){

        if ( (num > 0) && (num < 9999) ){
            this.num = num;
        }
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int getEncrypt(){
        int  aux, count = 1, pos = 1, encrypted = 0;


        while (count <= 4) {
            aux = num % 10 + 7;
            aux %= 10;

            if (count == 1){
                encrypted = aux * 100;
            }
            else if (count == 2){
                encrypted += aux * 1000;
            }
            else if (count == 3) {
                encrypted += aux;
            }
            else{
                encrypted += aux * 10;
            }

            num /= 10;
            pos *= 10;
            count++;
        }
        return encrypted;
    }

    public int decrypt(int code) {
        int aux, count = 1, pos = 1, decrypted = 0;

        while (count <= 4) {
            aux = code % 10 - 7;

            if (count == 1) {
                decrypted += aux * 100;
            }
            else if (count == 2) {
                decrypted += aux * 1000;
            }
            else if (count == 3) {
                decrypted += aux;
            }
            else {
                decrypted += aux * 10;
            }

            code /= 10;
            pos *= 10;
            count++;
        }


        return decrypted;
    }


}
