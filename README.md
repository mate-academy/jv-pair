# jv-pair

Implement a generic-class Pair that contains a pair of elements of different types and does not prevent elements from being null.

Implement the `getFirst()`, `getSecond()`, `equals()`, and `hashCode()` methods, as well as the static factory method `of()`. The constructor must be private.

With a correctly implemented class Pair, the following code should compile and work successfully:

```java
Pair<Integer, String> pair = Pair.of(1, "hello");
Integer i = pair.getFirst(); // 1
String s = pair.getSecond(); // "hello"

Pair<Integer, String> pair2 = Pair.of(1, "hello");
boolean mustBeTrue = pair.equals(pair2); // true!
boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
```
