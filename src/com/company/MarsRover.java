package com.company;

/**
 * Created by poorvag on 16/07/15.
 */
public class MarsRover {
    private int x,y;
    private String position;

    MarsRover()
    {
        x=0;
        y=0;
        position="N";
    }
    MarsRover(int a,int b,String pos)
    {
        this.x=a;
        this.y=b;
        this.position=pos;
    }

    public void showCurrent()
    {
        System.out.println("Position is: "+x+" "+y+" Heading towards: "+position);

    }
    public void moveLR(char movedirection)
    {
        System.out.print("in moveLR character "+movedirection);
        if(Character.toString(movedirection).matches("L"))
        {
            if(this.position.equals("N"))
            {
                System.out.print("changing position");
                this.position="W";


            }
            else if(this.position.equals("W"))
            {
                this.position="S";

            }
            else if(this.position.equals("S"))
            {
                this.position="E";

            }
            else if(this.position.equals("E"))
            {
                this.position="N";

            }


        }
        if(Character.toString(movedirection).matches("R"))
        {

            if(this.position.equals("N"))
            {
                this.position="E";
                //this.x=this.x+1;

            }
            else if(this.position.equals("E"))
            {
                this.position="S";
                //this.y=this.y-1;
            }
            else if(this.position.equals("S"))
            {
                this.position="W";
                //this.x=this.x-1;
            }
            else if(this.position.equals("W"))
            {
                this.position="N";
                //this.y=this.y+1;
            }

        }
        this.showCurrent();


    }
    public void move()
    {

        System.out.print("in move");
            if(this.position.equals("N"))
            {
                this.y=this.y+1;

            }
            else if(this.position.equals("W"))
            {
                //this.position="S";
                this.x=this.x-1;
            }
            else if(this.position.equals("S"))
            {
                //this.position="E";
                this.y=this.y-1;
            }
            else if(this.position.equals("E"))
            {
                //this.position="N";
                this.x=this.x+1;
            }




    }

}
