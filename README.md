# PC Memory Game
This is the PC version of a memory game I created for Android. It is still incomplete, but close to completion.

Makeshift schema since this is mostly just a proof of concept (POC) project. This isn't intended to be released, so the database schema isn't very thought out. It works, but some stuff could be changed. You can enter whatever name you want, duplicates are allowed, etc. But again, it's only a POC project.


Database Schema:
  playerID: INT [PK, AI] (primary key, auto increment)
  
  playerName: VARCHAR(50) [NN] (NOT NULL)
  
  theme: INT [NN]
  
  time: INT [NN]
  
