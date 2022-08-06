# PC Memory Game
This is the PC version of a memory game I created for Android. It is still incomplete, but close to completion.

Makeshift schema since this is mostly just a proof of concept (POC) project. This isn't intended to be released, so the database schema isn't very thought out. It works, but some stuff could be changed. You can enter whatever name you want, duplicates are allowed, etc. But again, it's only a POC project.

The database is stored locally. I made this project in NetBeans, and I used Glassfish Server to store the names. To run this project, one would only need to create one table: Times, with the below schema. The username/password would need to be changed in GameWindow.java.main as well, if it was not root root.

Database Schema:
  playerID: INT [PK, AI] (primary key, auto increment)
  
  playerName: VARCHAR(50) [NN] (NOT NULL)
  
  theme: INT [NN]
  
  time: INT [NN]
  
