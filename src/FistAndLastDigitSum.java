public class FistAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        if (number >= 0) {                                                                                             //1. Check if the number has 2 digits or more.

            int lastNumber = number % 10;
            int firstNumber = 0;                                                                                        //2. In case is 10 or more, saving the last number before the loop and declaring the variable for the first number.


            int valueToCheck = number;                                                                                  //3. Storing the value of the parameter number into the variable 'counter'.

            int counterLoops = 0;                                                                                       //4. Creating a index var named 'counterLoops' to store the n of loops processed.

            while (counterLoops >= 0) {                                                                                 //5. Creating a while loop that runs until the break.

                valueToCheck /= 10;                                                                                     //6. Divide by 10 the value inserted ( 125 / 10 = 12) and store it back in the same value replacing the original.

                counterLoops++;                                                                                         //7. Increment the counter by 1.

                //8. If statement to be executed only when the value to check become 0.

                if (valueToCheck == 0) {                                                                                //9. Decrement the counter loop by one and then multiply the orginal number by 10^counterLoops
                    //Example:  input number = 29872 --> lastNumber = (number % 10) = 2,  after the loop, counterloops = 5, if value to check = 0, counterloops =4
                    counterLoops--;                                                                                     //firstNumber = 29872 / 10^(counterloops) = 29872 / 10 ^ 4 = 29872 /10000 = 2
                    firstNumber = number / (int) Math.pow(10, counterLoops);
                    break;
                }

            }

            return (firstNumber + lastNumber);

        }else{
            return -1;
        }

    }
}








    /* Alternative
            public static int sumFirstAndLastDigit(int number) {

                if(number < 0) {
                    return -1;
                }

                // extracts the last digit into variable lastSum
                int lastSum = number % 10;

                int firstSum = 0;
                // loops and discards insignificant digits until extracting the first digit to firstSum
                while(number > 0) {
                    firstSum = number % 10;
                    number /= 10;



                }
                // adds the two digits and returns the value
                return lastSum + firstSum;
            }
        }

     */

