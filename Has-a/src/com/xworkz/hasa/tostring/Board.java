package com.xworkz.hasa.tostring;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Board {
     private int id;
     private  String boardName;
     private  String size;

     public  String toString(){
          return " Board (boardId="+this.id+",boardName="+ this.boardName+" ,boardSize="+ this.size+")";


     }

}
