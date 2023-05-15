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
        int  aux, count = 0, pos = 1, encrypted = 0;

        while (count < 4){
            aux = num % 10 + 7;
            aux %= 10;
            encrypted = aux * pos + encrypted;
            num /= 10;
            pos *= 10;
            count++;
        }
        count = 1;
        num = encrypted;


        while (count <= 4) {
            aux = num % 10;

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


}
