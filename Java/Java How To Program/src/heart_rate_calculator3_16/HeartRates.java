package heart_rate_calculator3_16;

public class HeartRates {
    private String name, surname;
    private Integer birthDay, birthMonth, birthYear;

    public HeartRates(String name, String surname, Integer birthDay, Integer birthMonth, Integer birthYear){
        this.name = name;
        this.surname = surname;
        if ((birthDay > 0) && (birthDay <= 31)){
            this.birthDay = birthDay;
        }
        if ((birthMonth > 0) && (birthMonth <= 12)){
            this.birthMonth = birthMonth;
        }
        if ((birthYear > 1910) && (birthYear <= 2023)){
            this.birthYear =  birthYear;
        }
    }
    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setBirthDay (Integer birthDay){
        this.birthDay = birthDay;
    }

    public void setBirthMonth (Integer birthMonth){
        this.birthMonth = birthMonth;
    }

    public void setBirthYear (Integer birthYear){
        this.birthYear = birthYear;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Integer getBirthDay(){
        return birthDay;
    }

    public Integer getBirthMonth(){
        return birthMonth;
    }

    public Integer getBirthYear(){
        return birthYear;
    }

    public Integer age(){
        return 2023 - birthYear;
    }

    public Integer maxHeartRate(Integer age){
        return 220 - age;
    }

    public void goalHeartRate(Integer maxRate){
        System.out.printf("Goal rate is between %.0f bpm and %.0f bpm", maxRate * 0.5, maxRate * 0.85);
    }
}
