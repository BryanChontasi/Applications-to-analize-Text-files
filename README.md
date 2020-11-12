# Applications-to-analize-Text-files
NetBeans
by Bryan Chontasi

# Application1-
App inspects the Text file Called sonnet1-a.txt (This file contains one of Shakespeare’s famous sonnets)
the application counts:
  -the total number of words
  -the total number of letters
  -the total number of words with an even number of letters (even if word is repeated)
  -the total number of words with an odd number of letters. (even if word is repeated)

The program also stores the sets of odd words and even words, where each word is translated into an upper-case equivalent
However, for these two sets of words, each unique word is stored once. For example, even if the word ‘And’ occurs several times, it is stored once in the set of odd words.
The program prints the results in alphabetical order

In addition to the console output, the program also saves all of the output
to a text file called results.txt. 

# Application2-
The App inspects the test file called sonnet1-b.txt. (This is the same Shakespeare sonnet, only this time the sonnet contains the correct punctuation)

This is an extended version of the program designed for Application1, but this time the stadistics should take into account correct punctuation.

In addition to white space, words are  delimited using punctuation marks with the exception of the apostrophe character. That is to say, words such as dimm’d and summer’s are treated as a single word.

Also note that when an apostrophe does appear in a word, the apostrophe is not  included in the letter count.
For example, the word dimm’d is be counted as a single word with 5 letters.

Apart from this extension, the program operates in the same way as that for Application1

As before, all console outputs are copied and pasted to a solution document, and saved to the results.txt file.

# App2 extra
The app also inspects sonnet2.txt, which contains another Shakespeare sonnet.
Note that the phrase world-without-end should be treated as three separate words.
All outputs for this second test are also  copied and pasted to a solution document, called results.txt

# Application3-
The App inspects the test file called sonnet3.txt.
This program should account for punctuation in the same way as Task 2 above. The output to this program start similar to above i.e.,
    File analysed: sonnet3.txt
    There were W words and Y letters
    There were Y even words, and Z odd words
    
The program counts how many times each unique word appears in the sonnet (ignoring case),
WORD1 [FREQUENCY]
WORD2 [FREQUENCY]
Etc.

And makes a list of all unique words that appear four or more times.

All console outputs are copied and pasted to a solution document, and saved to the results.txt file.

  
