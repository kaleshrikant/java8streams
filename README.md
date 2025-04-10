#  Interview Questions
## Streams API in Java 

1. What is Java 8 StringJoiner class used for?
Java 8 StringJoiner class is used to construct a sequence of characters separated by a delimiter. It helps in joining multiple strings with a specified delimiter and optionally with a prefix and suffix.

2. What is jjs in Java 8?
jjs is a command-line tool in Java 8 that is used to invoke the Nashorn JavaScript Engine. It allows you to run JavaScript code directly from the command line.

3. What is Nashorn, and what are its advantages?
Nashorn is a JavaScript engine introduced in Java 8. It provides advantages such as improved performance and better compliance with the ECMAScript standard. Nashorn allows seamless integration of JavaScript code with Java applications.

4. How does a lambda expression differ from an anonymous inner class?
lambda expressions do not create a separate class file and can only be used with functional interfaces.

5. Write a Java program to find the second highest number in a list of integers.
List<Integer> integers = List.of(1,2,2,3,4);
Integer sencondHighes  = integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
System.out.println(sencondHighes);
---
Optional<Integer> secondHighest = numbers.stream().sorted((a, b) -> b – a).skip(1).findFirst();
System.out.println(“Second highest number: ” + secondHighest.orElse(null));

5. Write a Java program to remove duplicates from a list of integers.
List<Integer> duplicateList = List.of(1,1,2,2,3,3,4);
List<Integer> disstictList = duplicateList.stream().distinct().collect(Collectors.toList());
disstictList.forEach(System.out::println);

** 6. Write a Java program to partition a list of strings into two lists based on their length (greater than 3 characters or not).
List<String> strings =  Arrays.asList("Java", "Ruby", "Go", "Python", "C");
Map<Boolean, List<String>> partitioned = strings.stream().collect(Collectors.partitioningBy(s -> s.length() > 3));
System.out.println("Strings with length > 3:  "+ partitioned.get(true));
System.out.println("Strings with length <= 3: "+ partitioned.get(false));

7. Write a Java program to convert a list of strings to uppercase.
List<String> strings = Arrays.asList("java", "python", "c++", "javascript");
List<String> stringsUpperCase = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
stringsUpperCase.stream().forEach(System.out::println);

8. You have a list of strings. How would you filter out the strings that start with the letter ‘A’?
List<String> strings = Arrays.asList("Apple", "Banana", "Apricot", "Orange");
List<String> stringsStartsWithA = strings.stream().filter(str -> str.startsWith("A")).collect(Collectors.toList());
stringsStartsWithA.stream().forEach(System.out::println);

9. You have a list of integers. How would you find the sum of all even numbers in the list?
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
Integer result = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();

10. You have a collection of employee objects. How would you retrieve the names of all employeesList<String> employeesNames = List<String> employeesNames = employees.stream().map(Employee::getName).collect(Collectors.toList());
employeesNames.stream().forEach(System.out::println);
 
11. You have a list of transactions. How would you find the transaction with the highest amount? 
List<Double> transactions = Arrays.asList(1100.00,2200.00,3300.00,4400.00,5500.00);
Double higestAmount1 = transactions.stream().sorted(Comparator.reverseOrder()).distinct().findFirst().get();
Double higestAmount2 = transactions.stream().max(Comparator.comparing(Double::doubleValue)).get();
        
12. Write a Java program to find the average length of strings in a list of strings.
List<String> strings =  Arrays.asList("Java", "Ruby", "Go", "Python", "C");
OptionalDouble avgStrLen = strings.stream().mapToInt(String::length).average();
System.out.println("Average String lenth in given list ::  "+avgStrLen.getAsDouble());

13. Write a Java program to check if a given string is a palindrome or not.
`public class Palindrome {
    public static void main(String[] args) {        
        String str = "madam";
        
        // treditional 
            System.out.println("Is string palindorm ? :" + plalimdrom(str));
        // StringBuffer || StringBuilder   
        String clean = str.replaceAll("//s", "").toLowerCase();
            StringBuffer sb = new StringBuffer(clean);
            if (clean.equalsIgnoreCase(sb.reverse().toString())) {
                System.out.println("String is palindrom");
            } else
                System.out.println("String is not palindrom");
        // Stream
        System.out.println("Is string palindorm ? :" + 
          IntStream.range(0, clean.length() / 2)
      .noneMatch(i -> clean.charAt(i) != clean.charAt(clean.length() - i - 1)));
    }
    private static boolean plalimdrom(String input) {
        String clean = input.replaceAll("\\s", "").toLowerCase();
        int forward =0;
        int backword = clean.length() - 1;

        while (backword > forward) {
            if (clean.charAt(forward++) != clean.charAt(backword--)) {
                return false;
            }                
        }
        return true;
    }
}`
14. Sort list of string in incresing order of their lenght
List<String> strings = List.of("Java","Python","GO","JavaScript","SQL");
List<String> sortStrIncrLength = strings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
sortStrIncrLength.stream().forEach(System.out::println);

15. Comman elements between two array
List<Integer> arr1  = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
List<Integer> arr2  = Arrays.asList(2,4,6,8,0);
arr1.stream().filter(arr2::contains).forEach(System.out::println);

16. Find duplicate elements in Array.
arr1.stream().filter(a -> ! set.add(a)).collect(Collectors.toSet());
set.stream().forEach(System.out::println);

17. Reverse the content in Integer array
IntStream.rangeClosed(1, arr1.length).map(i -> arr1[arr1.length - i]).forEach(System.out::println);

**18. Find frequency of each element in an array or a list.**
List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
 // Method 1 : traditional 
        Map<String, Integer> occurances = new HashMap<>();        
        for (String string : stationeryList) {
            occurances.put(string, occurances.getOrDefault(string, 0) +1); 
        }
        System.out.println(occurances);
// Method 2 : streams
        Map<String, Long> stationeryCountMap = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stationeryCountMap);
    }
    
 19. Merge two unsorted arrays into single sorted array using Java streams.
 int [] arr1  = {1,3,5,7,9}; int [] arr2  = {2,4,6,8,0};
 int [] c = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
 System.out.println(Arrays.toString(c));
 
 20. Java program to check if two strings are anagrams or not.
  String s1 = "RaceCar"; String s2 = "CarRace";
   s1 = Stream.of(s1.toUpperCase().split("")).sorted().collect(Collectors.joining());
   s2 = Stream.of(s2.toUpperCase().split("")).sorted().collect(Collectors.joining());
        if (s1.equals(s2)) { System.out.println("Strings are Anagram"); }  else { System.out.println("Strings are not Anagram");}

 21. Find sum of all digits of a number in Java.
       IntStream intStream = IntStream.of(1,2,3,4,5);
        	Integer sum = intStream.sum();
       int i = 12345;
		Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
 
**22. Find the most repeated element in an array.**
  List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book","Pencil");

  Map<String, Long> occurences =listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

  Entry<String, Long> maxOfKey = occurences.entrySet().stream().max(Map.Entry.comparingByKey()).get();
  // System.out.println(occurences));
  System.out.println(maxOfKey.getKey() + "  : " + maxOfKey.getValue());
  
*** 23. MapMulti to Validate Elements 
`public class MapMulti {
    public static void main(String[] args) {
        List<String> intStrings = Arrays.asList("1", " ", "2");

        // Problem : java.lang.NumberFormatException
            // intStrings.stream().map(Integer::parseInt).peek(System.out::println).collect(Collectors.toList());

        // Traditional Solution : redundunt
            /*  intStrings.stream().filter(string -> {
                try {
                    Integer.parseInt(string);
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
            })
            .map(Integer::parseInt)
            .peek(System.out::println)
            .collect(Collectors.toList());
            */
        // Modern Solution
            intStrings
                    .stream()
                    .<Integer>mapMulti((String, consumer) -> {
                        try {
                            consumer.accept(Integer.parseInt(String));
                        } catch (NumberFormatException e) {
                            
                        }
                    })
                    .peek(System.out::println)
                    .collect(Collectors.toList());
    }
}`

24. summarizingDouble
summarizingDouble() is another interesting collector—which applies a double-producing mapping function to each input element and returns a special class containing statistical information for the resulting values:

`@Test
public void whenApplySummarizing_thenGetBasicStats() {
    DoubleSummaryStatistics stats = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

    assertEquals(stats.getCount(), 3);
    assertEquals(stats.getSum(), 600000.0, 0);
    assertEquals(stats.getMin(), 100000.0, 0);
    assertEquals(stats.getMax(), 300000.0, 0);
    assertEquals(stats.getAverage(), 200000.0, 0);
}`
 
 25. takeWhile | dropWhile (Java 9)
 takeWhile : 
 It allows you to consume elements from a stream as long as a specified condition holds. Once the condition becomes false, the method stops and returns a new stream containing only the elements that match the predicate.
  Stream.iterate(1, i -> i + 1).takeWhile(n -> n <= 10).map(x -> x * x).forEach(System.out::println);
 takeWhile vs filter : It stops processing as soon as the predicate is false, whereas filter evaluates the entire stream.
 dropWhile : 
 Instead of taking elements while a condition is true, dropWhile skips elements while the condition is true and starts returning elements once the condition becomes false.
 Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0).dropWhile(x -> x <= 5).forEach(System.out::println);
 
 26. Enhanced iterate Method (Java 9)
 introducing an overloaded version of iterate with an additional predicate parameter to control termination:
 Stream.iterate(1, i -> i < 256, i -> i * 2)
      .forEach(System.out::println);
modern alternative to :
for (int i = 1; i < 256; i *= 2) { System.out.println(i); }


 27. ofNullable (Java 9)
 This method avoids potential NullPointerExceptions and helps keep your code cleaner:

Integer number = null;
Stream<Integer> result = Stream.ofNullable(number);
result.map(x -> x * x).forEach(System.out::println);

If the number is null, ofNullable returns an empty stream, effectively preventing runtime errors in cases where a null value would usually cause issues.

28. concat 
merges two streams into a single stream.
Stream<String> firstStream = Stream.of("A", "B", "C"); Stream<String> secondStream = Stream.of("D", "E", "F");
Stream<String> concatenatedStream = Stream.concat(firstStream, secondStream);
E.g. IntStream.concat(IntStream a, IntStream b) LongStream.concat(LongStream a, LongStream b) DoubleStream.concat(DoubleStream a, DoubleStream b)

29. partitionBy vs groupingBy :
Diff 1 : Map<Boolean, List<Student>> vs Map<Object, List<Student>> 
Diff 2 : Predicate vs Function

List<Student> students = Arrays.asList( new Student(8, "Fiat", "Dave"),new Student(15, "Fiat", "MadMax"),new Student(14, "Ferrari", "Paul"));
// PartitioningBy 
Map<Boolean, List<Student>> resultPartitioningBy = students.stream().collect(Collectors.partitioningBy(student -> student.getgrade() > 10));
resultPartitioningBy.forEach((key, value) -> System.out.println("Key : "+key+" Value : "+value));
  /* Output 
      Key : false Value : [Student [grade=8, car=Fiat, name=Dave]]
      Key : true Value : [Student [grade=15, car=Fiat, name=MadMax], Student [grade=14, car=Ferrari, name=Paul]]
  */ 
    
// GroupingBy .collect(Collectors.groupingBy(student -> student.getCar()));
                resultGroupingBy.forEach((key, value) -> System.out.println("Key : "+key+" Value : "+value));

  /* Output 
      Key : Ferrari Value : [Student [grade=14, car=Ferrari, name=Paul]]
      Key : Fiat Value : [Student [grade=8, car=Fiat, name=Dave], Student [grade=15, car=Fiat, name=MadMax]]
  */ 

29. Findout all the vovels from string.(CAPG)
String input = "Hello World";
List <Charaters> vovels = input.chars().mapToObj(c -> (char) c).filter(c -> "aeiouAEIOU".indexOf(c) !=-1).collect(collectors.toList());
29. Find the longest string in a list of strings using Java streams
List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
List<String> longestString = strings.stream().sorted(Comparator.reverseOrder()).limit(1).collect(Collectors.toList());
        longestString.stream().forEach(System.out::println);
Optional<String> max = longestString.stream().max(Comparator.comparing(String::length));
        System.out.println("Max : " + max.get());

30. Calculate the average age of a list of Person objects using Java streams
List<Person> persons = Arrays.asList(new Person("Alice", 25),new Person("Bob", 30),new Person("Charlie", 35));
Double avgAge = persons.stream().collect(Collectors.averagingDouble(Person::getAge));
        System.out.println("Average Person age : "+avgAge);
Double avggAge = persons.stream().mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("Avg Age : "+avggAge);
        
31. Check if a list of integers contains a prime number using Java streams
List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.groupingBy(PrimeNumber::isPrime));
System.out.println("Prime Numers : "+collect.get(true));
    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }
    
32. Spliterator : 
An interface introduced in Java 8 that supports parallel traversal of a source of elements, like a collection or an array, enabling efficient processing of data in multiple threads.

Key Methods:
............
#tryAdvance(Consumer<? super T> action):
	Moves to the next element and performs the given action on it, returning true if an element was processed, otherwise false. 

**forEachRemaining(Consumer<? super T> action):**
	Iterates through all remaining elements sequentially, performing the given action on each. 
**trySplit():**
	Returns a new Spliterator that covers a portion of the elements, allowing for further splitting and parallel processing. 
**estimateSize():**
	Returns an estimate of the remaining elements in the Spliterator. 
**characteristics():**
	Returns a set of characteristics about the Spliterator, such as ORDERED, SIZED, SUBSIZED, NONNULL, etc. 

`public class SpliteratorExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");

        Spliterator<String> spliterator = list.spliterator();

        // Iterate using tryAdvance
        System.out.println("Iterating using tryAdvance:");
        while (spliterator.tryAdvance(System.out::println)) {
            // Process each element
        }

        // Reset spliterator
        spliterator = list.spliterator();

        // Iterate using forEachRemaining
        System.out.println("\nIterating using forEachRemaining:");
        spliterator.forEachRemaining(System.out::println);
    }
}`
