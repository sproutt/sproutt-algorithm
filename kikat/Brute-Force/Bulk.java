package algorithm;

import java.util.Scanner;

public class Bulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] rank = new int[n];
        Person[] persons = new Person[n];
        for(int i = 0; i < n; i++) {
            persons[i] = new Person(scanner.nextInt(), scanner.nextInt());
        }

        for(int i =0; i < persons.length; i++) {
            Person person = persons[i];
            for(int j = i + 1; j < persons.length; j++) {
                if(person.compareTo(persons[j]) == -1) {
                    rank[i]++;
                } else if(person.compareTo(persons[j]) == 1) {
                    rank[j]++;
                }
            }
        }

        for (int i : rank) {
            System.out.print((i + 1) + " ");
        }

    }

    public static class Person implements Comparable<Person> {
        private int weight;
        private int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        @Override
        public int compareTo(Person person) {
            if(this.weight > person.weight & this.height > person.height) {
                return 1;
            } else if(this.weight < person.weight & this.height < person.height) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
