package StackChallenge;

public class Main {

    public static void main(String[] args) {



        System.out.println(checkForPalindrome("abccba")); // should return true

        System.out.println(checkForPalindrome("Was it a car or a cat I saw?")); // should return true

        System.out.println(checkForPalindrome("I did, did I?")); // should return true

        System.out.println(checkForPalindrome("hello")); // should return false

        System.out.println(checkForPalindrome("Don't nod")); // should return true

    }

    public static boolean checkForPalindrome(String string) {

        // Create an object of LinkedStack class
        LinkedStack stackobj = new LinkedStack();

        char[] charArray = string.toCharArray();

        // if it's an odd length array assign a ? to mid
        if(charArray.length % 2 != 0) {
            int midIndex = charArray.length / 2;
           // System.out.println("midIndex is: " + midIndex);
            charArray[midIndex] = '?';
        }

        // iterate till the end of the array
        for(int i = 0; i < charArray.length; i++) {

            // readability
            char ch = charArray[i];
            // check for punctuation, space
            if(ch == ' ' || ch == '?' || ch == '!' || ch == '\'' || ch == ',') {
                continue;
            }
            // convert to lowercase
            ch = Character.toLowerCase(ch);
            // check if it's empty
            if(stackobj.isEmpty()) {
                stackobj.push(ch);
            }
            else {
                // peek the top & see if they are the same
                char c = stackobj.peek();
                if(c == ch) {
                    stackobj.pop(); // pop!
                }
                else {
                    stackobj.push(ch);
                }
            }

        }

        // where the magic happens! if the stack is empty then we know it's a palindrome
        if(stackobj.isEmpty()) {
            return true;
        }

        return false;
    }
}
