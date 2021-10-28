package guop1.Homework.lesson9;

import java.lang.reflect.Array;

public class CharArray {
  //  քանի հատ կա c-փոփոխականից  մասիվի մեջ, ու տպել այդ քանակը։

int count = 0;

  void printCount(char c, char[] charList) {
  //  count = 0;
    for (int i = 0; i < charList.length; i++) {
      if (charList[i] == c) {
        count++;
      }
    }
    System.out.println(count);
    // պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
    System.out.println(charList[charList.length/2]);
    System.out.println(charList[charList.length/2+1]);


// պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

  }
  void answer(char b,char d, char[] Array ) {

    boolean isanswer = false;
    if(Array[Array.length-1]== b && Array[Array.length-2] == d) {
      isanswer = true;

    }
    System.out.println(isanswer);
  }

//Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։

  void simbol(char b1, char[] Array) {
    boolean isbob = false;
    for (int i = 0; i < Array.length - 2; i++) {
      if (Array[i] == b1 && Array[i+2] == b1) {
        isbob = true;
        break;
      }
    }
    System.out.println(isbob);
  }


}

