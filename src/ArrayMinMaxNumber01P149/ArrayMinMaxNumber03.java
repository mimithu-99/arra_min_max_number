package ArrayMinMaxNumber01P149;

public class ArrayMinMaxNumber03 {
    public static void main(String[] args) {
        int abc[][] = {
                {2, 4, 5},
                {3, 2, 10},
                {1, 2, 0},
        };
        int minimumNumber = abc[0][0];
        int minimumColumn = 0;
        //int maximumNumber;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if (abc[i][j] < minimumNumber) {
                    minimumNumber = abc[i][j];
                    minimumColumn = j;
                }

            }

        }
        int maximumNumber = abc[0][minimumColumn];
        int k = 0;
        while (k < 3)
        {
            if(abc[k][minimumColumn] > maximumNumber)
            {
                maximumNumber = abc[k][minimumColumn];
            }
            k++;
        }

        System.out.println(maximumNumber);

    }
}

/*
 2 4 5
 3 2 10
 1 2 0
 output = 4;
 Step 1: Find the minimum number.
 Step 2: Identify th column of minimum number.
 Step 3: Find the maximum number in identified column.
  Print the minimum number above the matrix.
 */
/*

public class ArrayMinMaxNumber03 { // এই ক্লাসের নাম ArrayMinMaxNumber03
    public static void main(String[] args) { // এই প্রোগ্রামের প্রধান মেথড
        // 2D array তৈরি করা যেখানে প্রতিটি সংখ্যা রাখা আছে
        int abc[][] = {
            {2, 4, 5},  // প্রথম সারি
            {3, 2, 10}, // দ্বিতীয় সারি
            {1, 2, 0}   // তৃতীয় সারি
        };

        // প্রথম সংখ্যাটি নিয়ে শুরু করা
        int minimumNumber = abc[0][0]; // প্রথম সারির প্রথম সংখ্যাটি (2) minimumNumber এ রাখা
        int minimumColumn = 0; // প্রথম কলামকে minimumColumn হিসেবে ধরে রাখা

        // প্রথম লুপ: সারিগুলির মধ্যে ঘুরবে (3 সারি আছে)
        for (int i = 0; i < 3; i++) {
            // দ্বিতীয় লুপ: প্রতিটি সারির কলামগুলির মধ্যে ঘুরবে (3 কলাম আছে)
            for (int j = 0; j < 3; j++) {
                // যদি বর্তমান সংখ্যাটি minimumNumber এর চেয়ে ছোট হয়
                if (abc[i][j] < minimumNumber) {
                    minimumNumber = abc[i][j]; // ছোট সংখ্যাটি minimumNumber এ রাখা
                    minimumColumn = j; // ছোট সংখ্যার কলামের ইনডেক্সটি minimumColumn এ রাখা
                }
            }
        }

        // সবচেয়ে ছোট সংখ্যার কলামের প্রথম সংখ্যাটি নিয়ে শুরু করা
        int maximumNumber = abc[0][minimumColumn]; // সেই কলামের প্রথম সংখ্যাটি maximumNumber এ রাখা
        int k = 0; // লুপ শুরু করার জন্য k কে 0 এ সেট করা

        // while লুপ: সারিগুলির মধ্যে ঘুরবে (3 সারি আছে)
        while (k < 3) {
            // যদি বর্তমান সংখ্যাটি maximumNumber এর চেয়ে বড় হয়
            if (abc[k][minimumColumn] > maximumNumber) {
                maximumNumber = abc[k][minimumColumn]; // বড় সংখ্যাটি maximumNumber এ রাখা
            }
            k++; // k এর মান 1 করে বাড়ানো
        }

        // সবচেয়ে বড় সংখ্যাটি প্রিন্ট করা
        System.out.println(maximumNumber); // সবচেয়ে বড় সংখ্যাটি প্রিন্ট করা
    }
}
সহজভাবে বোঝানো:
2D অ্যারে তৈরি করা:


int abc[][] = {
    {2, 4, 5},  // প্রথম সারি
    {3, 2, 10}, // দ্বিতীয় সারি
    {1, 2, 0}   // তৃতীয় সারি
};
এখানে আমরা একটি 2D অ্যারে (ম্যাট্রিক্স) তৈরি করেছি, যেখানে ৯টি সংখ্যা ৩টি সারি ও ৩টি কলামে রাখা আছে।
minimumNumber এবং minimumColumn সেট করা:


int minimumNumber = abc[0][0]; // প্রথম সংখ্যাটি (2) নিয়ে শুরু করা
int minimumColumn = 0; // প্রথম কলামকে ধরে রাখা
আমরা প্রথম সারির প্রথম সংখ্যাটি (2) এবং প্রথম কলাম থেকে শুরু করছি।
সারি ও কলাম চেক করা:


for (int i = 0; i < 3; i++) { // ৩টি সারির জন্য লুপ
    for (int j = 0; j < 3; j++) { // প্রতিটি সারির ৩টি কলামের জন্য লুপ
        if (abc[i][j] < minimumNumber) { // যদি বর্তমান সংখ্যাটি minimumNumber এর চেয়ে ছোট হয়
            minimumNumber = abc[i][j]; // তাহলে সেটিকে minimumNumber এ রাখো
            minimumColumn = j; // এবং সেই কলামটিকে minimumColumn এ রাখো
        }
    }
}
দুটি লুপ ব্যবহার করে আমরা প্রতিটি সংখ্যা চেক করছি।
যদি কোনো সংখ্যা minimumNumber এর চেয়ে ছোট হয়, তাহলে আমরা সেটিকে minimumNumber এ আপডেট করি এবং সেই কলামটিকে minimumColumn এ রাখি।
maximumNumber সেট করা:


int maximumNumber = abc[0][minimumColumn]; // সেই কলামের প্রথম সংখ্যাটি maximumNumber এ রাখা
int k = 0; // লুপ শুরু করার জন্য k কে 0 এ সেট করা
আমরা minimumColumn এর প্রথম সংখ্যাটি maximumNumber এ রাখছি।
while লুপ ব্যবহার করা:

while (k < 3) { // ৩টি সারির জন্য while লুপ
    if (abc[k][minimumColumn] > maximumNumber) { // যদি বর্তমান সংখ্যাটি maximumNumber এর চেয়ে বড় হয়
        maximumNumber = abc[k][minimumColumn]; // তাহলে সেটিকে maximumNumber এ রাখো
    }
    k++; // k এর মান 1 করে বাড়ানো
}
আমরা minimumColumn এর প্রতিটি সংখ্যা চেক করছি।
যদি কোনো সংখ্যা maximumNumber এর চেয়ে বড় হয়, তাহলে সেটিকে maximumNumber এ আপডেট করছি।
সবচেয়ে বড় সংখ্যাটি প্রিন্ট করা:


System.out.println(maximumNumber); // সবচেয়ে বড় সংখ্যাটি প্রিন্ট করা
শেষে আমরা সবচেয়ে বড় সংখ্যাটি প্রিন্ট করছি।
এই প্রোগ্রামটি প্রথমে 2D অ্যারেতে সবচেয়ে ছোট সংখ্যাটি খুঁজে বের করে, তারপর সেই সংখ্যাটি যেই কলামে আছে সেই কলামের সবচেয়ে বড় সংখ্যাটি খুঁজে বের করে এবং প্রিন্ট করে।







 */
