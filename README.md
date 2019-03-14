# Atividades Ordenação

Project for class **Estrutura de Dados e Complexidade de Algoritmos**

## Requirements
  - JDK 11
  - Maven 4

## Steps to..

### Test
     mvn test
    
### Create executable
     mvn install
    
###Run (from root folder)
    java -jar main/target/sorter.jar < main/src/main/resources/instancias-num/num.1000.1.in

#### Notes
The sort algorithm used by default is Insertion Sort. To change it to Selection Sort you must 
to change the line 14 in Main.class and replace the InsertionSort class for the respective class algorithm. 
After that you must create a new executable jar and run normally.

