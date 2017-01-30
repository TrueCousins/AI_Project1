/*****************************************************
CS 4365.001
Colleen Cousins
Matthew Villarreal
******************************************************/
public class Node {


  private char[] tiles;
  private int costval = 1;
  private int pastMove = -1; //-1 for the head node

  public Node(char[] tiles){
    this.tiles = tiles;
  } //end constructor

  public Node(char[] tiles, int costval){
    this.cost = cost;
    this.tiles = tiles;
    this.costval = costval;

  } //end constructor
} //end Node

private int getPastMove() {
  return pastMove;
} //end getPastMove
private int setPastMove(int pastMove) {
  this.pastMove = pastMove;
} //end setPastMove;

private char move(int moveFrom) {
  char temp = 'x';
  for(int i = 0; i < tiles.length; i++) { //loop to find the empty tile
      if(temp == tiles[i]) {
          tiles[i] = tiles[moveFrom];
          tiles[moveFrom] = temp;
          setPastMove(moveFrom);
          break;
      } //end if
    } //end for
} //end move

private Boolean goalTest() {

}
