package com.xworkz.hasa.tostring;

public class BoardTester {

    public static void main(String[] args) {
        Board board = new Board();
        board.setId(1);
        board.setBoardName("jk");
        board.setSize("12*12");

        System.out.println(board);
    }
}