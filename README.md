JCollectionInterfaces
==============
version: 0.2.0

A modular set of interfaces which allow you to create collections mimicking java.util collections.
For example, the CollectionAdd interfaces only defines `add(E)` and `addAll(Iterable<E>)`, your implementation doesn't need to be iterable or have a toArray method or even a size method!
This also allows you to create methods which take parameters with explicit types narrowed to only the operation you need to perform.
Unfortunately, I haven't yet found a way to insert these interfaces onto Java library types without some classloader manipulation and modifying your jdk version of said classes to get the compiler working.
However, the interfaces are very useful for new custom collections built from scratch.
