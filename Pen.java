public class Pen {
    String type;
    String color;
    static boolean clicked;
    
    public static void click(){
        clicked = true;
    }

    public void setClicked(boolean click){
         this.clicked = click;
    }
    public void setType(String type){
        this.type = type;
    }

    public void setColor(String color){
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
