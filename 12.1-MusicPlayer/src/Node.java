class Node {

  String song;
  Node next;
  Node prev;

  // constructor
  Node(String song) {
    this.song = song;
    this.next = null;
    this.prev = null;
  }
}
