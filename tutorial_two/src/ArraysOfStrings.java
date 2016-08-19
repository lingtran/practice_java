
public class ArraysOfStrings {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "World";
		words[2] = "howdy";
		
		String[] moreWords = {"hello", "to", "you"};
		
		// declare element and point to collection to iterate through
		for(String word: moreWords) {
			System.out.println(word);
		}

		int value = 0;
		
		// String is a class, not a primitive type; not allocating memory in this line, but enough memory for a reference, like scribbling an address on a piece of paper but is not an actual house
		String text = null;
		
		System.out.println(text);
		
		// another allocation of memory to two references
		String[] texts = new String[2];
		
		System.out.println(texts[0]);
		
		texts[0] = "one";
		
		System.out.println(texts[0]);
	}

}
