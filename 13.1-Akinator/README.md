# Akinator with Binary Trees

## Project Overview

In this project, you'll create a simple game similar to Akinator. Play Akinator here: [https://en.akinator.com/theme-selection](https://en.akinator.com/theme-selection)!

 The game will use a binary tree to store a series of yes/no questions and possible results. By asking the player a sequence of questions, the program will try to guess what the player is thinking of. This project will help you understand the structure and traversal of binary trees in Java.

## Project Structure

1. **Binary Tree Implementation**

   - Create a `TreeNode` class to represent each node in the tree.
   - Create a `BinaryTree` class to manage the tree operations.
2. **Game Logic**

   - Implement methods to traverse the tree based on user input.
   - Implement a method to update the tree with new questions and answers.
3. **User Interface**

   - Create a simple console-based user interface to interact with the player.

## Instructions

### Step 1: Draw out your Decision Tree

- Navigate to [draw.io](https://app.diagrams.net/)
- Create your binary decision tree as a flow chart. Your category can be anything you like (animals, TV show characters, )
  - Each node should have 2 branches, one for 'yes' and one for 'no'
  - Each middle node should contain a yes or no question such as "Does it live on land?"
  - Each leaf node should be the final result such as 'whale' or 'lion'
    - Your final tree must have **at least 8 child nodes**.
- Once you are complete go to File > Export > PDF and upload your decision tree to this folder.

### Step 2: Create the TreeNode Class

- Define a class `TreeNode` with attributes for the data (question or results), and references for the yes and no child nodes.
- Think of how to initialize a node with data and null children.

### Step 3: Create the BinaryTree Class

- Define a class `BinaryTree` with an attribute for the root node.
- Implement a constructor to initialize the tree with a root question.
- Create methods to:
  - Print all the leaf nodes
  - Insert new questions and answers at the appropriate place in the tree.
  - Traverse the tree based on yes/no answers.

### Step 4: Initialize Tree

- Based on the chart you created in Step 1, recrate your tree in java using the methods created in Step 3
- Just like your drawing the data should be either the question or answer and the yes or no children should point ot the next question/ answer

### Step 5: Game logic

- Print all the possible results  before beginning the game so that the user can choose one of them. Use the `getLeafNodes()` function for this.
- Create a game loop that asks the user a series of yes or no questions which it will use to traverse the tree.
- When you reach a leaf node you have reached your final result. Announce it to the user.

### Step 6: Learn Answers (Extra Credit)

- The real Akinator can  guess nearly any character you can think of. It does this by allowing the user to enter the correct answer if it gets stumped, essentially crowdsourcing more results.
- For extra credit you can add this functionality by allowing the user to add more results as follows:

  - After reaching a leaf node, ask the player if the guess is correct.
  - If not, ask for the correct answer and a distinguishing question as well as if it is the 'yes' or 'no' case.
  - Update the tree by creating a new question node at the position of the incorrect guess and adding the new results as children.

## Submission

- Turn in your code as well as a PDF of the Draw.io flowchart you made

---
