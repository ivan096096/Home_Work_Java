package OOP.ClassWork.lesson_1;

public class Doctor extends BaseHero {
    private Integer treatment;
    private Integer Max_treatment;

    public Doctor(String name, int hp, Integer treatment, Integer max_treatment) {
        super(String.format("Hero_Magician #%d", ++number),
            r.nextInt(100,200));
        this.treatment = Max_treatment;
        this.Max_treatment = r.nextInt(20,150);
    }

    public String getInfo() {
        return String.format("%s  Treatment: %d", super.getInfo(), this.treatment);
    }
}
