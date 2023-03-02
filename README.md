# Basics of Java Programming
This is a repository for programming practice with revision of basics with Java.

## Trying out loops
**Done:** The first thing I tried was loop.
At first I created a for loop in ```TryLoop``` class.
Then when I went on to create while loop, I noticed that I can avoid code duplication by creating an abstract parent class which I named ```TryLoop``` and inheriting them in ```TryForLoop``` and ```TryWhileLoop```.
Then I noticed that the main class would be overpopulated. So I created a static ```executeTryForLoop``` method to contain the codes of running each type of loop.

**Todo:** I need to implement a combination of factory pattern and template method pattern to refactor it even further later. for now, I am leaving it here.

