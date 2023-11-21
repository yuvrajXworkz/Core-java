package com.xworkz.hasa;

public class CRUD {

    public String [] films={null,null,null,null,null};
    public int position=0;


    public void save(String filmName)
    {

        if(filmName!=null)
        {
films[position]=filmName;
position++;
        }


    }

    public void read(String filmName)
    {
        if(filmName!=null)
        {
            for (int index = 0; index < films.length; index++)
            {
                if(films[index]==filmName)
                {
                    System.out.println("Your Finding name is   "+ filmName);
                    return;
                }


            }

            System.out.println
        ("Does not finding name   ");






        }

    }




    public void display() {
        for (int index = 0; index < films.length; index++)
        {
            System.out.println(films[index]);
        }


    }






}
