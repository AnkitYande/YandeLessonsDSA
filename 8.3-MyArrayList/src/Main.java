public class Main {

  // Main method for testing
  public static void main(String[] args) {
    MyArrayList<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println("List: " + list);
    System.out.println("Element at index 1: " + list.get(1));
    list.set(1, 20);
    System.out.println("List after setting index 1 to 20: " + list);
    list.remove(1);
    System.out.println("List after removing element at index 1: " + list);
    System.out.println("Size: " + list.size());

    MyArrayList<Character> list2 = new MyArrayList<>();
    for(int i=33; i<126; i++){
      list2.add((char)i);
    }
    System.out.println("Unicode Characters: " + list2);
    System.out.println("Size: " + list2.size());
  }
}
