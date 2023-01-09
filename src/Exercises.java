import java.util.*;
public class Exercises {

    /*
    * Sum Multiples of Three and Five
     Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
    * */
    static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }


    /*
    * Factorial
     Write a method that calculates the factorial of a given number.
    * */

    static int myFactorial(int n){
        int factorial = n;
        for (int j = n - 1; j > 0; j--) {
            factorial = factorial * j;
        }
        return factorial;
    }

    /*
    * Linear Search
    Write a method that returns the index of the first occurrence of given integer in a list.
    Assume that the index of the first element in the list is zero.
    If the number does not exist return -1.
    * */

    static void indexPosition(int n){
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        int counter = 0;
        int arrayLength = numbers.length;

        while(counter < arrayLength){
            if(numbers[counter] == n){
                System.out.println("The index position is :"+counter);
                break;
            }
            counter++;
        }

    }

    /*
    * Reverse String
    Write a method that reverses a string.
    For example, 'java interview' becomes 'weivretni avaj'.
    * */

    public String reverse(String s) {

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(s.length() - i - 1);
        }
        return result;
    }

    /*
    * Find Maximum
    Write a method that returns the largest integer in the list.
    You can assume that the list has at least one element.
    * */

    public Integer maximum(Integer[] list) {
        int maximum = list[0];
        for (int i : list) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

    /*
    * Average Value (Java 8 Lambdas and Streams)
    Write a method that returns the average of a list of integers.
    * */

    public Double average(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }


    /*
    * Convert to Upper Case (Java 8 Lambdas and Streams)
    Write a method that converts all strings in a list to their upper case.
    * */

    /*
    *
    * Nth Odd Element
    Write a method that returns the nth odd element of a list. If the index of the element exceeds the list size, then return -1.
    * */



    /*
    * Number Of Tree Nodes
    Write a method that returns the number of nodes in a binary tree.
    TreeNode API methods: node.left() and node.right().
    * */

    /*
    * Count Nodes in List
    Count the number of nodes in a list.
    ListNode API methods: node.next().
    * */

    /*
    *Count Number of Leaf Nodes
    Count the number of leaf nodes in a binary tree
    * */

    /*
    * Binary Tree Depth
Write a method that returns the maximum depth of a binary tree. The maximum depth is the number of nodes from the root (inclusive) until the furthest node (inclusive).
    * */

    public static void main(String[] args){
        sum(50);
        myFactorial(3);
        indexPosition(2);
    }
}