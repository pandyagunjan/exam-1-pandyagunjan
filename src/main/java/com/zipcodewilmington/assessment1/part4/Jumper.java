package com.zipcodewilmington.assessment1.part4;

import java.util.Random;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {

     int storereturn=0;
        Random random=new Random();
        int sum=0;
        int counter=0;

        while(flagHeight%jumpHeight==0)
        {
            if(jumpHeight==1)
                counter=flagHeight;
                //  return storereturn;
            else

                counter++;
        }

return counter;


/*
        Integer storeTempValue = 1;
        for (int i = 1; i <= flagHeight; i++) {
            storeTempValue = storeTempValue * i;
        }
        return storeTempValue;*/

/*
         while(flagHeight%jumpHeight!=0)
            {
                if(jumpHeight==1)
                counter=flagHeight;
              //  return storereturn;
                else

                counter++;
            }*/


       /* if (flagHeight < jumpHeight)
                storereturn = flagHeight;
        while(jumpHeight <= flagHeight) {
                sum += random.nextInt(jumpHeight);
                storereturn +=sum;
            }
        }*/
              //return counter;
        }


}
