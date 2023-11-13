package DesignPattern.Composite;

public class MainEntry {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("a.txt", 1000));
        root.add(new File("b.txt", 2000));

        Folder sub1 = new Folder("sub1");
        root.add(sub1);
        sub1.add(new File("sa.txt", 100));
        sub1.add(new File("sb.txt", 4000));

        Folder sub2 = new Folder("sub2");
        root.add(sub2);
        sub2.add(new File("SA.txt", 250));
        sub2.add(new File("SB.txt", 340));

        Folder sub3 = new Folder("sub3");
        sub2.add(sub3);
        sub3.add(new File("SA2SA3.txt", 1000));
        sub3.add(new File("SB2SB3.txt", 1500));

        Folder sub4 = new Folder("sub4");
        sub1.add(sub4);
        sub4.add(new File("sa1SA4.txt", 500));
        sub4.add(new File("sb1SB4.txt", 700));

        Folder sub5 = new Folder("sub5");
        sub5.add(new File("sa1SA4.txt", 500));
        sub5.add(new File("sb1SB4.txt", 700));

        root.list();
        sub5.list();

    }
}
