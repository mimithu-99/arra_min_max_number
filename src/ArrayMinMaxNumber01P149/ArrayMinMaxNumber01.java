package ArrayMinMaxNumber01P149;

// Step 1 and 2.
public class ArrayMinMaxNumber01 {
    public static void main(String[] args) {
    int abc[][] ={
            {2,4,5},
            {3,0, 7},
            {1,2,9},
    };
       int minimumNumber = abc [0][0];
       //int minimumColumn = 0;

       for (int i = 0; i < 3; i++){
           for (int j = 0; j <3; j++) {
               if (abc[i][j]<minimumNumber) {
                   minimumNumber = abc[i][j];
                  // minimumColumn = j;
               }

           }

    }
        System.out.println(minimumNumber);
      //  System.out.println(minimumColumn);

    }
}
/*
 2 4 5
 3 0 7
 1 2 9
 output = 4;
 Step 1: Find the minimum number.
 Step 2: Identify th column of minimum number.
 Step 3: Find the maximum number in identified column.
  Print the minimum number above the matrix.
 */
/*
ublic class ArrayMinMaxNumber01 {
    public static void main(String[] args) {
        // 2D array তৈরি করা যেখানে প্রতিটি সংখ্যা রাখা আছে
        int abc[][] = {
            {2, 4, 5}, // প্রথম সারি
            {3, 0, 7}, // দ্বিতীয় সারি
            {1, 2, 9}  // তৃতীয় সারি
        };

        // প্রথম সংখ্যাটি নিয়ে শুরু করা
        int minimumNumber = abc[0][0]; // প্রথম সারির প্রথম সংখ্যাটি (2) minimumNumber এ রাখা

        // প্রথম লুপ: সারিগুলির মধ্যে ঘুরবে (3 সারি আছে)
        for (int i = 0; i < 3; i++) {
            // দ্বিতীয় লুপ: প্রতিটি সারির কলামগুলির মধ্যে ঘুরবে (3 কলাম আছে)
            for (int j = 0; j < 3; j++) {
                // যদি বর্তমান সংখ্যাটি minimumNumber এর চেয়ে ছোট হয়
                if (abc[i][j] < minimumNumber) {
                    minimumNumber = abc[i][j]; // ছোট সংখ্যাটি minimumNumber এ রাখা
                }
            }
        }

        // সবচেয়ে ছোট সংখ্যাটি প্রিন্ট করা
        System.out.println(minimumNumber); // প্রোগ্রাম শেষে 0 প্রিন্ট হবে কারণ 0 সবচেয়ে ছোট সংখ্যা
    }
}
সহজভাবে বোঝানো:
2D অ্যারে তৈরি করা:

java
Copy code
int abc[][] = {
    {2, 4, 5}, // প্রথম সারি
    {3, 0, 7}, // দ্বিতীয় সারি
    {1, 2, 9}  // তৃতীয় সারি
};
এখানে আমরা একটি 2D অ্যারে (ম্যাট্রিক্স) তৈরি করেছি, যেখানে ৯টি সংখ্যা ৩টি সারি ও ৩টি কলামে রাখা আছে।
minimumNumber সেট করা:

java
Copy code
int minimumNumber = abc[0][0]; // প্রথম সংখ্যাটি (2) নেয়া
আমরা প্রথম সারির প্রথম সংখ্যাটি (2) দিয়ে শুরু করছি।
সারি ও কলাম চেক করা:

java
Copy code
for (int i = 0; i < 3; i++) { // ৩টি সারির জন্য লুপ
    for (int j = 0; j < 3; j++) { // প্রতিটি সারির ৩টি কলামের জন্য লুপ
        if (abc[i][j] < minimumNumber) { // যদি বর্তমান সংখ্যাটি minimumNumber এর চেয়ে ছোট হয়
            minimumNumber = abc[i][j]; // তাহলে সেটিকে minimumNumber এ রাখো
        }
    }
}
দুটি লুপ ব্যবহার করে আমরা প্রতিটি সংখ্যা চেক করছি।
যদি কোনো সংখ্যা minimumNumber এর চেয়ে ছোট হয়, তাহলে আমরা সেটিকে minimumNumber এ আপডেট করি।
ছোট সংখ্যাটি প্রিন্ট করা:

java
Copy code
System.out.println(minimumNumber); // সবচেয়ে ছোট সংখ্যাটি প্রিন্ট করা
শেষে আমরা সবচেয়ে ছোট সংখ্যাটি প্রিন্ট করছি, যা এখানে 0 হবে।
এই প্রোগ্রামটি
 */