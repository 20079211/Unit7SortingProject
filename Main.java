//Selection & Insertion Sorts
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main{
  public static void main (String str[]) throws IOException {
    int[] elements = {21, 17, 60, 20, 56, 12}; // unsorted array
    ArrayList<Integer> numArray1 = new ArrayList<Integer>();
    ArrayList<Integer> numArray2 = new ArrayList<Integer>();
    for(int element: elements) {
      numArray1.add(element);
      numArray2.add(element);
    }
    //Selection Sort
    System.out.println("Printing Unsorted Array"); 
    for(int element: elements) 
    {
      System.out.print(element + " ");
    }
    
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    for (int j = 0; j < elements.length -1; j++) // selection sort
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
      
      for(int element: elements) // printing each 'step' of the selection sort
      {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  System.out.println();
//Insertion Sort
  int[] elements2 = {21, 17, 60, 20, 56, 12}; // unsorted array
    System.out.println("Printing Unsorted Array");
    for(int element: elements2) {
      System.out.print(element + " ");
    }
    System.out.println("\nPrinting Each Pass Through the Insertion Sort");
    for (int j = 1; j < elements2.length; j++) // insertion sort
    {
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1])
      {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements2[possibleIndex] = temp;
      for (int num : elements2) // printing each 'step' of the insertion sort
      {
        System.out.print(num + " ");
      }
      System.out.println();
    }
    System.out.println();
    // String methods
    String[] fruits = {"banana", "apple", "cherry", "pomegranate", "grape"};
    String[] veggies = {"celery", "lettuce", "kale", "okra", "artichokes", "potatoes"};

    ArrayList<String> strArray1 = new ArrayList<String>();
    ArrayList<String> strArray2 = new ArrayList<String>();

    for(String fruit: fruits) {
      strArray1.add(fruit);
    }
    for(String veggie: veggies) {
      strArray2.add(veggie);
    }
    insertionSort(fruits);
    System.out.println();
    selectionSort(veggies);
    System.out.println();
    insertionSort1(numArray1);
    System.out.println();
    selectionSort1(numArray2);
    System.out.println();
    insertionSort2(strArray1);
    System.out.println();
    selectionSort2(strArray2);
  }
    
  //
  // String array methods
  //                    
  
  public static String[] selectionSort(String[] elements) // selection sort
  { 
    System.out.println("Printing Unsorted Array"); 
    for(String element: elements) 
    {
      System.out.print(element + " ");
    }
    
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    for (int j = 0; j < elements.length -1; j++) // selection sort
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k].compareTo(elements[minIndex]) < 0)
        {
          minIndex = k;
        }
      }
      String temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
      
      for(String element: elements) // printing each 'step' of the selection sort
      {
        System.out.print(element + " ");
      }
      System.out.println();
    }
    return elements;
  }

  public static String[] insertionSort(String[] elements) // insertion sort
  {
    System.out.println("Printing Unsorted Array");
    for(String element: elements) {
      System.out.print(element + " ");
    }
    System.out.println("\nPrinting Each Pass Through the Insertion Sort");
    for (int j = 1; j < elements.length; j++) // insertion sort
    {
      String temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(elements[possibleIndex - 1]) < 0)
      {
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements[possibleIndex] = temp;
      for (String element : elements) // printing each 'step' of the insertion sort
      {
        System.out.print(element + " ");
      }
      System.out.println();
    }
    return elements;
  }

  //
  // Arraylist Integer methods
  //

  public static void selectionSort1(ArrayList<Integer> elements) // selection sort
  { 
    System.out.println("Printing Unsorted Array"); 
    for(int element: elements) 
    {
      System.out.print(element + " ");
    }
    
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    for (int j = 0; j < elements.size() -1; j++) // selection sort
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.size(); k++)
      {
        if ((elements.get(k)).compareTo((elements.get(minIndex))) < 0)
        {
          minIndex = k;
        }
      }
      int temp = elements.get(j);
      elements.set(j, elements.get(minIndex));
      elements.set(minIndex, temp);
      
      for(int element: elements) // printing each 'step' of the selection sort
      {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
  
  public static void insertionSort1(ArrayList<Integer> elements) 
  {
    System.out.println("Printing Unsorted Array");
    for(int element: elements) {
      System.out.print(element + " ");
    }
    System.out.println("\nPrinting Each Pass Through the Insertion Sort");
    for (int j = 1; j < elements.size(); j++) // insertion sort
    {
      int temp = elements.get(j);
      int possibleIndex = j;
      while ((possibleIndex > 0) && (temp < elements.get((possibleIndex - 1))))
      {
        elements.set(possibleIndex, elements.get(possibleIndex-1));
        possibleIndex--;
        
      }
      elements.set(possibleIndex, temp);
      for (int element : elements) // printing each 'step' of the insertion sort
      {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
  
  //
  // ArrayList String Methods
  //
  
  public static void selectionSort2(ArrayList<String> elements) // selection sort
  { 
    System.out.println("Printing Unsorted Array"); 
    for(String element: elements) 
    {
      System.out.print(element + " ");
    }
    
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    for (int j = 0; j < elements.size()-1; j++) // selection sort
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.size(); k++)
      {
        if (elements.get(k).compareTo(elements.get(minIndex)) < 0)
        {
          minIndex = k;
        }
      }
      String temp = elements.get(j);
      elements.set(j, elements.get(minIndex));
      elements.set(minIndex, temp);
      
      for(String element: elements) // printing each 'step' of the selection sort
      {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }

  public static void insertionSort2(ArrayList<String> elements) // insertion sort
  {
    System.out.println("Printing Unsorted Array");
    for(String element: elements) {
      System.out.print(element + " ");
    }
    System.out.println("\nPrinting Each Pass Through the Insertion Sort");
    for (int j = 1; j < elements.size(); j++) // insertion sort
    {
      String temp = elements.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(elements.get(possibleIndex-1)) < 0)
      {
        elements.set(possibleIndex, elements.get(possibleIndex-1));
        possibleIndex--;
        
      }
      elements.set(possibleIndex, temp);
      for (String element : elements) // printing each 'step' of the insertion sort
      {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}
