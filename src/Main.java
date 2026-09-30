import arrays.ArrayPrograms;

import java.util.Arrays;

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
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println((Arrays.toString(arrayPrograms.sumTwo(nums, target))));


    }
}