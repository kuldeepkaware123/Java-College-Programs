// Interface Program By Kuldeep kaware

interface i_face {
    default void intro() {
        System.out.println("Hello I am Interface!");
    }
}

class S_class implements i_face {
    public void intro() {
        System.out.println("Hello I am Sub-Class!");
        i_face.super.intro();
    }
}

class ih extends S_class {

    public void intro() {
        System.out.println("Hello I am Main Class");
        super.intro();
    }

    public static void main(String a[]) {
        ih ob = new ih();
        ob.intro();
    }

}