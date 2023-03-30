package Сalculator.Interface;

import java.io.IOException;

public interface ModelReal {
   int result() throws IOException;

   void setX(int value);

   void setY(int value);
}
