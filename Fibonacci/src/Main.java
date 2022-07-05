import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//i created this array list called sequence using some research
        ArrayList<Integer> sequence = new ArrayList<Integer>();

//below i created two arrays for the first 2 numbers of the sequence

        sequence.add(0);
        sequence.add(1);
        
// created variable called fib and assigned it to 0
        int fib = 0;
//here i created a while loop which will keep running aslong as fib is less than 1 million
        while (fib < 1000000) {
//below i created 2 new variables for the lastTotal and secondLastTotal
// i made sure that i get the last sequence number and the second last..
            int lastTotal = sequence.get(sequence.size() - 1);
            int secondLastTotal = sequence.get(sequence.size() - 2);
// i made a new variable called nextTotal and assigned it to the calculation below
            int nextTotal = lastTotal + secondLastTotal;
// here im getting the next total and adding it to the end of the sequence
            sequence.add(nextTotal);
//i assigned the nextTotal to fib so the program knows when to stop as it gets to 1 million
            fib = nextTotal;

        }
//i created this for loop it iterate through the sequence and print it
        for (int i = 0; i < sequence.size(); i++) {
            System.out.println(sequence.get(i));
        }
    }
}