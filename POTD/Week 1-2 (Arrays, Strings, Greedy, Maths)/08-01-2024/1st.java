/* 
    link - 
    A. Digit Minimization
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
There is an integer n
 without zeros in its decimal representation. Alice and Bob are playing a game with this integer. Alice starts first. They play the game in turns.

On her turn, Alice must swap any two digits of the integer that are on different positions. Bob on his turn always removes the last digit of the integer. The game ends when there is only one digit left.

You have to find the smallest integer Alice can get in the end, if she plays optimally.

Input
The input consists of multiple test cases. The first line contains a single integer t
 (1≤t≤104
) — the number of test cases. Description of the test cases follows.

The first and the only line of each test case contains the integer n
 (10≤n≤109
) — the integer for the game. n
 does not have zeros in its decimal representation.

Output
For each test case output a single integer — the smallest integer Alice can get in the end of the game.

Example
inputCopy
3
12
132
487456398
outputCopy
2
1
3
Note
In the first test case Alice has to swap 1
 and 2
. After that Bob removes the last digit, 1
, so the answer is 2
.

In the second test case Alice can swap 3
 and 1
: 312
. After that Bob deletes the last digit: 31
. Then Alice swaps 3
 and 1
: 13
 and Bob deletes 3
, so the answer is 1
.


*/

import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int arr[] = new int[num];

        for(int i=0;i<num;i++)
            arr[i] = read.nextInt();

        for(int i:arr)
        {
            List<Integer> al = new ArrayList<>();
            while(i!=0)
            {
                al.add(i%10);
                i=i/10;
            }
            if(al.size()==2)
                System.out.println(al.get(0));
            else
                System.out.println(Collections.min(al));
        }
    }
}