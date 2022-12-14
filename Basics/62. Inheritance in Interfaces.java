interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{ // Here meth1 and meth2 is also included.
    void meth3();
    void meth4();
}

class MySamplesClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Meth 1");
    }

    public void meth2(){
        System.out.println("Meth 2");
    }

    public void meth3(){
        System.out.println("Meth 3");
    }

    public void meth4(){
        System.out.println("Meth 4");
    }
}

public class Practice2{
    public static void main(String[] args) {
        MySamplesClass sc = new MySamplesClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}


// Example
interface TVRemote{
    public void on();
    public void off();
}

interface SmartTVRemote extends TVRemote{
    public void change();
    public void volume();
}

class TV implements SmartTVRemote{
    @Override
    public void on(){
        System.out.println("TV ON...");
    }

    @Override
    public void off(){
        System.out.println("TV OFF...");
    }

    @Override
    public void change(){
        System.out.println("Changing channel...");
    }

    @Override
    public void volume(){
        System.out.println("Changing Volume...");
    }
}

public class Practice2{
    public static void main(String[] args) {
        TV t = new TV();
        t.change();
        t.volume();
        t.off();
        t.on();
    }
}
