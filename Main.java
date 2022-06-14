public class Main {
    public static void main(String[] args){
        Pen p = new Pen();
        HelloWorld helloWorld = new HelloWorld();
    
        helloWorld.ShowMessage();
        System.out.println("--------");
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);
        Pen.click();
        System.out.println(Pen.clicked);
       
        Pen.unclick();
    }
}
