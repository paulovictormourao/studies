package Chapter_8_throw;

public class Time1 {

    private int hour; // 0 - 23 ÿ
    private int minute; // 0 - 59ÿ
    private int second; // 0 - 59ÿ


    public void setTime(int hour, int minute, int second){

        if (hour < 0 || hour >= 24 || minute < 0 ||
                minute >= 60 || second < 0 || second >= 60) {

            throw new IllegalArgumentException("Type an valid value");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void toUniversalString(){
        System.out.printf("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
