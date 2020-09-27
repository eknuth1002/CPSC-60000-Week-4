# CPSC-60000-Week-4

This is my Week 4 project.  It is based around two stores joining their ordering systems into one.  Because we have two different systems, an iterator is used to allow for 1 API for accessing the inventories of both (and more if needed) stores.  This prevents from having to write a print function for every type of collection, leading to cleaner code.

This project uses the Iterator pattern to remove the need to know the type of collection we are running through to get traverse it.  I included a previous function because I believe an Iterator should be capable of moving forward and backwards, even though most usually only them to move forward.  I also made the Iterator automatically so that the user does not need to worry about if it is instantiated. 