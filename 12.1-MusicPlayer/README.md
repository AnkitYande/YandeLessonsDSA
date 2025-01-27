# Project: Create a Simple Music Player with Linked Lists

## Introduction

In this project, you will create a simple music player using a linked list. This project will help you understand how to work with linked lists by storing and manipulating a list of songs. You will also learn how to implement basic functionalities like adding songs, deleting songs, and shuffling the playlist.

## Project Goals

* Understand and manipulate linked lists
* Learn basic operations such as adding, deleting, and accessing elements in a linked list
* Implement additional functionalities like shuffling, searching, and navigating through the playlist

## Project Description

You will build a console-based music player that can:

1. Add songs to the playlist
2. Delete songs from the playlist
3. Display the playlist
4. Play the next song
5. Play the previous song
6. Search for a song by title
7. Shuffle the playlist

### Classes

#### Node.java

You are provided with a **Node** class that you will use to create your Music Player LinkedList. It contains the name of the Song as well as pointers to the next and previous songs.

#### MusicPlayer.java

- This is where you will solve the bulk of the assignment. Solve each method as described in the instructions below.
- As always, feel free to create private help methods if needed.

#### Main.java

- Call all your Music Player methods from here

## Instructions

Complete the Music Player class by filling out the following methods.

#### Method Descriptions for `MusicPlayer` Class

#### `MusicPlayer()`

- **Description**: Constructor to initialize an empty `MusicPlayer` object. It sets `head`, `tail`, and `current` to `null` and `size` to `0`.

#### `addSong(String song)`

- **Description**: Adds a new song to the _end_ of the playlist. It creates a new node for the song and adjusts the pointers of the tail node and the new node accordingly.

#### `deleteSong(String song)`

- **Description**: Deletes a song from the playlist. It searches for the song in the playlist and, if found, removes the corresponding node and adjusts the pointers of the neighboring nodes.

#### `playNextSong()`

- **Description**: Moves to the next song in the playlist and returns its name. If the end of the playlist is reached, it returns `null`.

#### `playPreviousSong()`

- **Description**: Moves to the previous song in the playlist and returns its name. If the start of the playlist is reached, it returns `null`.

#### `playCurrentSong()`

- **Description**: Returns the name of the current song being played. If no song is currently selected, it starts playing from the first song in the playlist. If the playlist is empty, it returns `null`.

#### `playSong(String song)`

- **Description**: Searches for a specific song in the playlist and starts playing it if found. It returns the name of the song if found, otherwise returns `null`.

#### `searchSong(String song)`

- **Description**: Searches for a song in the playlist and returns its index. If the song is not found, it returns `-1`.

#### `shufflePlaylist()` (Extra Credit)

- **Description**: Shuffles the songs in the playlist using an algorithm of your choice. Credit will not be given if you use Arrays or another data structure.

#### `toString()`

- **Description**: Provided for you. Please DO NOT modify this method. Returns a string representation of the playlist. It lists all the songs in the playlist with their corresponding positions.
