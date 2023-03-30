package Сalculator.Interface;

import java.io.IOException;

public interface ModelComplex {
   int resultReal() throws IOException;
   
   int resultImag() throws IOException;

   void setX(int value);

   void setY(int value);

   void setJ(int value);

   void setK(int value);


String toString();
   
}
