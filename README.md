# Anagram Finder

## Instructions

The attached file is a word list with one word per line. 
* The task is to create a program that finds all words in the list that have one or more anagrams elsewhere in the list. 
* These must then be listed together with the original word. Not all words have an anagram, and you should only find one-word anagrams.

An anagram is a word or phrase put together by shuffling
the letters of another word or expression (http://no.wikipedia.org/wiki/Anagram)


## Output requirements 
Each line in the result must contain the words that are anagrams of
each other. For example like this

akte teak kate


aldri arild


aller ralle


alt tal


andre rande denar ander

With this assignment, we want to see how you solve programming challenges. You choose the programming language yourself. In the interview, we want you to go through your solution and explain how you solved it.


## Solution
I sort each letter in each word alphabetically ("alle" is sorted "aell", same as "ella").
I use the sorted word ("aell" in the example), as a key in a Map, where the value is a list of all anagrams.

I made an assumption that single letter words, like å and ö, should not be included in the result. a single letter can not be considered an anagram.

The solution also has the option to be case sensitive or not, depending on if a string is considered an anagram if the casing is the same. A letter might possibly not be considered the same if the casing is different.

### Improvements
I would look at adding some logs where it might be usefull. I would also look at checking response time
for getting the anagrams to analyse the effienency of the code.

I like that the code now is clear, and separated so each step can be tested. If the code needs to be optimised, 
one possible optimization would be to reduce the number of iterations over all the strings. 
I could read each line from the file and iterate over them at the same time.

I would add more validation, with focus on reading from the file and parsing the string, to make sure the file is according to specifications, and that the file exists.
I would also check for possible nullpointers.

It would be interesting to look at other solutions to get inspiration on how to see if a string is an anagram.

## Run

Start the main method in Main to get the results in the terminal.

## Tests
There are junit tests that can be executed for the utils used.

