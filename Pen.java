import java.util.Scanner;

public class Pen {
    String type;
    String color;
    static boolean clicked;

    String clickString;
    // reads valeu from input
    Scanner input = new Scanner(System.in);
    
    public static void click(){
        clicked = true;
    }

    public void setClicked(String click){
        System.out.println("Is the pen clicked? Y for Yes and N for No");
        click = input.nextLine();
        if(click == "Y"){
            this.clicked = true;
        } else{
            this.clicked = false;
        }
         
    }
    public void setType(String type){
        System.out.println("Write a type for this pen:\n");
        type = input.nextLine();
        this.type = type;
    }

    public void setColor(String color){
        System.out.println("Write a color for this pen:\n");
        color = input.nextLine();
        this.color = color;
    }

    public String getType(){
        return type;
    }

    public String getColor(){
        return color;
    }

    public boolean getClicked(){
        return clicked;
    }

    public void showProps(){
        if(getClicked() == true){
            System.out.println("The pen is "+getColor()+" and it is of the type: "+getType()+" and it is clicked");
        } else{
                System.out.println("The pen is "+getColor()+" and it is of the type: "+getType()+" and it is not clicked");
        }

     
    }



}
