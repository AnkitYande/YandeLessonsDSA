# File System Tree using Tree Data Structures
In this project, you will create a representation of a file system using a tree data structures. Your program will implement the `cd`, `ls`, `mkdir`, and `touch` commands, and will be able to use both absolute and relative paths.

## Project Requirements
Your program should meet the following requirements:

- The file system should be represented as a **tree data structure**, where each directory is represented by a node in the tree and each node has a list of child nodes that represent subdirectories and files. The root of the tree should be the root directory ("/"). The root directories parent can point to itself. 

- The `mkdir` command should create a new directory with the specified name in the current directory. For example, if the current directory is /home/user/Documents and the user enters the command mkdir Projects, a new directory named Projects should be created in /home/user/Documents.

- The `touch` command should create a new file with the specified name in the current directory. For example, if the current directory is /home/user/Documents and the user enters the command touch report.txt, a new file named report.txt should be created in /home/user/Documents. Note you do not need to be able to store anything in this file.

- The `cd` command should change the current directory to the directory specified by the path. The path can be either an absolute path (starting with /) or a relative path ( starting with ./ or ../). For example, if the current directory is /home/user/Documents and the user enters the command cd ../Downloads, the current directory should be changed to /home/user/Downloads.

- The `ls` command should list the contents of the current directory.

Your program should continue running until the user enters the `exit` command. Note this is just a representation of a file system, you do not need to access your actual file system. Your should also handle errors if the user enters an incorrect path or command.

## Example Usage
```
/ $ ls
home
tmp
/ $ cd home
/home $ ls
user
/home $ mkdir user/Documents
/home $ cd user/Documents
/home/user/Documents $ touch report.txt
/home/user/Documents $ ls
report.txt
/home/user/Documents $ cd ../Downloads
/home/user/Downloads $ ls
/home/user/Downloads $ exit
```

## Tips
- Use the java.util.Scanner class to read input from the user
- Keep track of your parent in the Node class
- Store the children in a list in the Node class
- Store the currentPath in the tree to display it before the "$"
- You can use a recursive function to traverse the tree and find the node corresponding to a given path
- You can set the root directory's parent to itself so you can never cd out of it (this is what Linux does!)

### CD function pseudocode:

- 1 check what the path starts with
  - if "/" change current dir to home
  - if "./" or anything else continue
- 2 use .split("/") to break the string into parts
- 3 loop through each part
  - if ".." change directory to parent
  - else see if child exits in current dir
    - if so change to child
    - if not print a error message

## Test you will be graded on
```
1   cd ../
2   mkdir a
3   mkdir b
4   touch c
5   ls
6   cd c
7   cd a
8   cd ../b
9   cd ../
10  cd ./a
11  cd /b
12  mkdir z
13  cd z
14  cd ../../
15  cd b/dne
16  cd b/z
```