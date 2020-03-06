cd C:\Users\DAVID\eclipse-workspace\SoftwareTesting\Task_3.1\out
java -javaagent:../covered-class-4.2.2.jar -classpath ../randoop-all-4.2.1.jar;../../automaton/build randoop.main.Main gentests --testclass=st1920.automaton.REGEXWrapper --testclass=st1920.automaton.REString --require-covered-classes=../classes.txt --output-limit=30
PAUSE