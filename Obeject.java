package hometaski;

public class Obeject {
	
		    public static void main(String[] args) {
		        // The soliloquy text
		        String soliloquy = "To be or not to be, that is the question; "
		                + "Whether `tis nobler in the mind to suffer"
		                + " the slings and arrows of outrageous fortune,"
		                + " or to take arms against a sea of troubles,"
		                + " and by opposing end them?";

		        // Split the soliloquy into words by spaces and punctuation
		        String[] words = soliloquy.split("[\\s,;.`]+");

		        // Bubble sort to sort the words alphabetically
		        int n = words.length;
		        boolean swapped;
		        do {
		            swapped = false;
		            for (int i = 1; i < n; i++) {
		                if (words[i - 1].compareToIgnoreCase(words[i]) > 0) {
		                    // Swap words[i-1] and words[i]
		                    String temp = words[i - 1];
		                    words[i - 1] = words[i];
		                    words[i] = temp;
		                    swapped = true;
		                }
		            }
		        } while (swapped);

		        // Print the sorted words
		        for (String word : words) {
		            System.out.println(word);
		        }
		    }		
	}

