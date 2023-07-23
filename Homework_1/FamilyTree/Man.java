package Homework_1.FamilyTree;

public class Man extends Human {
    private int wife;
    public Man(String name, String surname, String patronimico, int birthYear, int birthMonth, int birthDay) {
        super(name, surname, patronimico, birthYear, birthMonth, birthDay);
    }

    public Man(String name, String surname) {
        super(name, surname);
    }

    public Man() {
    }

    public String toString() {
        return super.toString() + ", мужчина.";
    }

    public void getMarried(Human wife) {
        super.getMarried(wife);
    }

    public int getWife() {
        return wife;
    }

    public void setWife(int wife) {
        this.wife = wife;
    }
    //    @Override
//    public void setMother(int mother) {
//        this.mother = mother;
//    }
//
//    @Override
//    public void setFather(int father) {
//        this.father = father;
//    }

}
