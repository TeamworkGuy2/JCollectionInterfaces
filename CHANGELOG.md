# Change Log
All notable changes to this project will be documented in this file.
This project does its best to adhere to [Semantic Versioning](http://semver.org/).


--------
### [0.2.0](N/A) - 2017-09-16
#### Changed
* CollectionAdd.addAll(Collection) -> addAll(Iterable)
* collectionRemove.removeAll(Collection) -> removeAll(Iterable)
* PairCollection.putAll(PairCollection) -> putAll(PairCollectionImmutable)


--------
### [0.1.0](https://github.com/TeamworkGuy2/JCollectionInterfaces/commit/fc5f1d4b6df9fbbe8c1052b20c1a2ec2ec58b45f) - 2016-06-23
#### Added
* Initial commit of existing interfaces moved from the JCollectionFiller library to this one.
* Includes:
  * CollectionAdd
  * CollectionContains
  * CollectionIndexOf
  * CollectionRemove
  * MapIndexed
  * ModifiableCollection
  * ModifiableMapIndexed
  * PairCollection
  * PairCollectionImmutable
  * RandomAccessCollection
  * Sized
