package Base;
public abstract class Pet extends Animals {
    private String nickname;
    private String breed;
    private String vaccination;
    private String coatColor;
    private String birthdate;

    protected Pet(String nickname,
                  String breed, 
                  String vaccination, 
                  String coatColor, 
                  String birthdate, 
                  int weight, 
                  int height, 
                  String eyeColor) {
        super(weight, height, eyeColor);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccination = vaccination;
        this.coatColor = coatColor;
        this.birthdate = birthdate;
    }
    public String getNickname() {
        return nickname;
    }

    public String getBreed() {
        return breed;
    }

    public String getVaccination() {
        return vaccination;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public abstract void tenderness();

    @Override
    public String toString() {
        return String.format(
            "Имя: %s; Порода: %s; Наличие прививок: %s; Цвет шерсти: %s; Дата рождения: %s; %s;", 
            this.nickname, this.breed, this.vaccination, this.coatColor, this.birthdate, super.toString());
    }
}
