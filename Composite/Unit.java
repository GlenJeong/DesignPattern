package DesignPattern.Composite;

public abstract class Unit {// 자식 클래스에서 구현해야할 추상 메서드를 추가

    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "(" + getSize() + ")";
    }

    public abstract int getSize();

}
