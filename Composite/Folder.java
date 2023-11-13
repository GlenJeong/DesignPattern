package DesignPattern.Composite;

import java.util.Iterator;
import java.util.LinkedList;

public class Folder extends Unit {

    private LinkedList<Unit> unitList = new LinkedList<Unit>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Unit> it = unitList.iterator();

        while (it.hasNext()) {
            Unit unit = it.next();
            size += unit.getSize();
        }

        return size;
    }

    public boolean add(Unit unit) {
        unitList.add(unit);
        return true;
    }

    private void list(String indent, Unit unit) {
        if (unit instanceof File) {
            System.out.println(indent + unit);
        } else {
            Folder dir = (Folder) unit;
            Iterator<Unit> it = dir.unitList.iterator();
            System.out.println(indent + "+ " + unit);
            while (it.hasNext()) {
                list(indent + "    ", it.next()); // 재귀함수 구문으로 작성됨
                // 단 일체와 집합체를 동일한 개념으로 처리하다보니 재귀함수를 사용하게 됨
            }
        }
    }

    public void list() {
        list("", this);
    }

}
