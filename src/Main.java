import Basic.BasicProgram;
import arrays.ArrayPrograms;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        System.out.println("LinkedList");
//
//        LinkedList linkedList = new LinkedList(12);
//        linkedList.append(2);
//        linkedList.append(1);
//        linkedList.append(21);
//        linkedList.append(4);
//        linkedList.append(5);
//
//        linkedList.swapPairs();
//        linkedList.printLinkedList();


//        BasicProgram basicProgram = new BasicProgram();
//        int[] nums = {1, 2, 3, 2, 1};
//        System.out.println(basicProgram.countCharacter("vikas singh", 's'));


        ArrayPrograms arrayPrograms = new ArrayPrograms();
        arrayPrograms.removeDuplicateValues(new int[]{1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4});


    }
}