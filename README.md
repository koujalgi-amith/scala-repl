# scala-repl

Run Scala interpreter from inside of a Java container.

Run:

```sh
mvn clean compile assembly:single
java -jar ./target/scala-repl-embedded-jar-with-dependencies.jar
```