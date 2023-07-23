package Homework_1.FamilyTree;

public class Female extends Human {
    private int husband;
    public Female(String name, String surname, String patronimico, int birthYear, int birthMonth, int birthDay) {
        super(name, surname, patronimico, birthYear, birthMonth, birthDay);
    }

    public Female(String name, String surname) {
        super(name, surname);
    }

    public Female() {
    }

    public String toString() {
        return super.toString() + ", женщина.";
    }

    public void getMarried(Human husband) {
        super.getMarried(husband);
    }

    public int getHusband() {
        return husband;
    }

    public void setHusband(int husband) {
        this.husband = husband;
    }
//    @Override
//    public void setMother(int mother) {
//        this.mother = mother;
//
//    }
//
//    @Override
//    public void setFather(int father) {
//        this.father = father;
//    }

}
