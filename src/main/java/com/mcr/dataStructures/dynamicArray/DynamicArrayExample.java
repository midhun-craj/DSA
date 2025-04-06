package com.mcr.dataStructures.dynamicArray;

public class DynamicArrayExample {
        /// ********************************************************************************************************

        /// STATIC ARRAY

        /// Static Array has a fixed capacity and is determined at the compile time.
        /// We can randomly access an element in array in O(1) time, since all the elements has a specific index.
        /// However, it takes O(n) time to find a stored value in the array. The larger the dataset the time to  find
        /// the value increases linearly.

        /// To insert or delete the value in the array it takes O(n) time unless done at the end where no shifting of
        /// value is needed.

        ///  DYNAMIC ARRAY

        /// In a dynamic array it has a static array inside, whenever the static array gets filled it will create a
        /// new array based on some values that ranges from 1.5 to 2 based on different languages, in java  1.5, but
        /// mostly we use 2 as the value to increase the size of the array by multiplying the value with the old array
        /// size.
        /// And for shrinking the array we use the same formula and values.

        /// It also takes time since the newly created array has to be filled with values of the old array before
        /// filling it up with the new values.

        /// Inserting and deleting the values are same as from the static array, to insert the value at the end it
        /// takes O(1) since it doesn't take any additional steps, but inserting or deleting the values that are closer
        /// to the 0th index takes linear time O(n).

        /// Advantages:
        /// Random access of elements. O(1)
        /// Good locality of reference and data cache utilization.(since all the data are in consecutive memory
        ///                                                        locations, right next to each other.)
        /// Easy to insert/delete data at the end.

        /// Disadvantages:
        /// Wastes more memory.
        /// Shifting elements is time-consuming. O(n)
        /// Expanding/Shrinking the array is time-consuming. O(n)

        /// ********************************************************************************************************


        public static void main(String[] args) {
//                DynamicArray dynamicArray = new DynamicArray();
//                System.out.println(dynamicArray.getCapacity());

//                DynamicArray dynamicArray = new DynamicArray(15);
//                System.out.println(dynamicArray.getCapacity());


                DynamicArray dynamicArray = new DynamicArray();
                dynamicArray.add("A");
                dynamicArray.add("B");
                dynamicArray.add("C");
                dynamicArray.add("D");
                dynamicArray.add("E");
                dynamicArray.add("F");
                dynamicArray.delete("A");
                dynamicArray.delete("B");
                dynamicArray.delete("C");
//                dynamicArray.insert(1, "X");
//                dynamicArray.delete("A");
//                System.out.println(dynamicArray.search("B"));
                System.out.println(dynamicArray);
                System.out.println("Empty: " + dynamicArray.isEmpty());
                System.out.println("Size: " + dynamicArray.getSize());
                System.out.println("Capacity: " + dynamicArray.getCapacity());
        }
}
