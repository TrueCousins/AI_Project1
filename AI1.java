/*****************************************************
CS 4365.001
Colleen Cousins
Matthew Villarreal
******************************************************/


import java.io.*;
import java.util.Scanner;

class AI1 {

  public static void main(String[] args) {

    Boolean costFlag = false;
    String searchAlg;
    String arguments = "BFS DFS UCS GS A-Star";
    File inputfile = null;

    if(args[0].equals("-cost")) {
      costFlag = true;
      searchAlg = args[1];
      inputfile = new File(args[2]);
    } //end if
    else {
      searchAlg = args[0];
      inputfile = new File(args[1]);
    } //end else

    Scanner scan = null;
    String puzzle = " ";

    try {
      scan = new Scanner(inputfile);

      while(scan.hasNext())
        puzzle = scan.next();

      scan.close();
    } //end try
    catch(FileNotFoundException e) {
      e.printStackTrace();
    } //end catch

    char[] tiles = puzzle.toCharArray();

    System.out.println(tiles.length);
    //System.out.println(tiles[0]);
    //System.out.println(tiles[1]);

    switch(searchAlg) {
      case "BFS":
        BFSSearch(costFlag, tiles);
        break;
      case "DFS":
        DFSSearch(costFlag, tiles);
        break;
      case "UCS":
        UFSSearch(costFlag, tiles);
        break;
      case "GS":
        GSSearch(costFlag, tiles);
        break;
      case "A-Star":
        AStarSearch(costFlag, tiles);
        break;
      default:
        System.out.println("ERROR! incorrect arguments");
        System.exit(0);
    } //end switch-case
  } //end main

  public static void BFSSearch(Boolean costFlag, char[] tiles) {
    return;
  }
  public static void DFSSearch(Boolean costFlag, char[] tiles) {
    return;
  }
  public static void UFSSearch(Boolean costFlag, char[] tiles) {
    return;
  }
  public static void GSSearch(Boolean costFlag, char[] tiles) {
    return;
  }
  public static void AStarSearch(Boolean costFlag, char[] tiles) {
    return;
  }
} //end class
