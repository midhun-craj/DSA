package com.mcr.dataStructures;

import java.util.Hashtable;

public class HashTables {

    /// A data structure that stores unique keys to values. ex: <Integer, String>
    /// Each key value pair is Know as an Entry.
    /// FAST insertion, look up, deletion of key/value pairs.
    /// Not ideal for small datasets, great for large datasets.
    ///
    /// hashing = takes a key and compute and integer.(Formula will vary based on key & data type.)
    /// In a hash table we use the hash % capacity to calculate an index number.
    ///
    ///         key.hashcode() % capacity = index
    ///
    /// bucket = an indexed storage location for one or more entries.
    /// can store multiple entries in case of collision (linked similarly as a linked list)
    ///
    /// collision = hash function generates the same index for more than one key
    ///             less collision = more efficiency
    ///
    /// Runtime complexity = best case O(1) constant time
    ///                      worst case O(n) linear time

    public static void main(String[] args) {

        Hashtable<String, String> table = new Hashtable<>(21);
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squid ward");
        table.put("777", "Gary");

//        table.remove("777");

        for(String key : table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key.hashCode() % 21 + "\t" + key + "\t" + table.get(key));
        }
    }
}
