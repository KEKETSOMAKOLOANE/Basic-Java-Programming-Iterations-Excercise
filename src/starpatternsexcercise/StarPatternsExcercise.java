/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatternsexcercise;

/**
 *
 * @author Reverside
 */
public class StarPatternsExcercise {
    //-----------------------------------F start------------------------------------------------
    public void drawSquireStarPattern(int num)
    {
        for (int i=0;i<num;i++){
         for (int j=0;j<num;j++){
             System.out.print("*");
         }
         System.out.println();
     }
    
    }
    //-----------------------------------F start------------------------------------------------
    public void drawHallowSquareStarPattern(int num)
    {
       for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawRhombusStarPattern(int num)
    {
       for (int i = 1; i <= num; i++)
        {
            // Print space
            for (int j = i; j < num; j++) {
                System.out.print(' ');
            }

            // Print n stars
            for (int j = 1; j <= num; j++) {
                System.out.print('*');
            }

            // Move to the next row
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawHollowRhombusStarPattern(int n)
    {
       for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if(i==1 || i==n)
                for(int j=1;j<=n;j++) {
                    System.out.print("*");
                }
            else {
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n)
                        System.out.print("*");
                    else

                        System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawMirroredRhombusStarPattern(int n)
    {
        char c = '*';
       for (int row = 0;row < n ; row++){
            //first print the space
            for (int space = n - row ; space < n ; space ++){
                System.out.print(" ");
            }
            for (int i = 0 ; i<n ; i++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawMirroredHollowRhombusStarPattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            // Print space
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <= n; j++)
            {
                // Print '*' for boundaries
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

            // Move to the next row
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawRightTriangleStarPattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            // Print '*' i times
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawHollowRightTriangleStarPattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            // Print '*' i times
            for (int j = 1; j <= i; j++)
            {
                // Print '*' for boundaries
                if (i == n || j == 1 || j == i) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawMirroredRightTriangleStarPattern(int n)
    {
       for (int i = 1; i <= n; i++)
        {
            // Loop for printing space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            // Loop for printing '*'
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }

            // Move to the next row
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawHollowMirroredRightTriangleStarPattern(int n)
    {
      for (int i = 1; i <= n; i++)
        {
            // Loop for printing space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            // Loop for printing '*'
            for (int k = 1; k <= i; k++)
            {
                // Print '*' for boundaries
                if (i == n || k == 1 || k == i) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

            // Move to the next row
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawInvertedRightTriangleStarPattern(int n)
    {
      for (int i = n; i >= 1; i--)
        {
            // Print '*' i times
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawHollowInvertedRightTriangleStarPattern(int n)
    {
      for (int i = n; i >= 1; i--)
        {
            // Print '*' i times
            for (int j = 1; j <= i; j++) {
                {
                    // Print '*' for boundaries
                    if (i == n || j == 1 || j == i) {
                        System.out.print('*');
                    }
                    else {
                        System.out.print(' ');
                    }
                }
            }
            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawInvertedMirroredRightTriangleStarPattern(int n)
    {
      for (int i = 1; i <= n; i++)
        {
            // Loop for printing space
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }

            // Loop for printing '*'
            for (int k = i; k <= n; k++) {
                System.out.print('*');
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawHollowInvertedMirroredRightTriangleStarPattern(int n)
    {
      for (int i = 1; i <= n; i++)
        {
            // Loop for printing space
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }

            // Loop for printing '*'
            for (int k = i; k <= n; k++) {
                // Print '*' for boundaries
                if (i == 1 || k == i || k == n) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawPyramidStarPattern(int n)
    {
      int space = n - 1;
        for (int j = 1; j <= n; j++){
            for (int i = 1; i <= space; i++){
                System.out.print(" ");
            }
            space--;
            for (int i = 1; i <= 2 * j - 1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
    }
    //-----------------------------------F start------------------------------------------------
    public void drawHollowPyramidStarPattern(int n)
    {
      for (int i = 1; i <= n; i++)
        {
            // Print space
            for (int j = i; j < n; j++) {
                System.out.print(' ');
            }

            // Print '*'
            for (int k = 1; k < 2*i; k++)
            {
                // Print '*' for boundaries
                if (i == n || (k == 1 || k == 2*i - 1)) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawHollowInvertedPyramidStarPattern(int n)
    {
      for (int i = n; i >= 1; i--)
        {
            // Print space
            for (int j = n; j > i; j--) {
                System.out.print(' ');
            }

            // Print '*'
            for (int k = 1; k < 2*i; k++) {
                // Print '*' for boundaries
                if (i == n || (k == 1 || k == 2*i - 1)) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    public void drawHalfDiamondStarPattern(int n)
    {
      // Print upper half
        for (int i = 1; i <= n; i++)
        {
            // Print '*' i times
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }

        // Print lower half
        for (int i = n - 1; i >= 1; i--)
        {
            // Print '*' i times
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
    //-----------------------------------F start------------------------------------------------
    
    //-----------------------------------F start------------------------------------------------
    
    
    public void drawMirroredHalfDiamondStarPattern(int n)
    {
     for (int i = 1; i <= n; i++)
        {
            // Loop for printing space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            // Loop for printing '*'
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }

            // Move to the next row
            System.out.print(System.lineSeparator());
        }

        // Print lower half
        for (int i = 2; i <= n; i++)
        {
            // Loop for printing space
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }

            // Loop for printing '*'
            for (int k = i; k <= n; k++) {
                System.out.print('*');
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }

    }
    public static void main(String[] args) {
        // TODO code application logic here
        int rowssize = 5;
        StarPatternsExcercise testProgram = new StarPatternsExcercise();
        String solutionsDivisionLine ="--------------------------------------------------------";
        //---------------------Testing methods/functions----------------
        System.out.println(solutionsDivisionLine+"SQUARE STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawSquireStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"HOLLOW SQUARE STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawHallowSquareStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"RHOMBUS STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawRhombusStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"HOLLOW RHOMBUS STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawHollowRhombusStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"MIRRORED RHOMBUS STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawMirroredRhombusStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"HOLLOW MIRRORED RHOMBUS STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawMirroredHollowRhombusStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"RIGHT TRIANGLE STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawRightTriangleStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"HOLLOW RIGHT TRIANGLE STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawHollowRightTriangleStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"MIRRORED RIGHT TRIANGLE STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawMirroredRightTriangleStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"HOLLOW MIRRORED RIGHT TRIANGLE STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawHollowMirroredRightTriangleStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"INVERTED RIGHT TRIANGLE STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawInvertedRightTriangleStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"HOLLOW INVERTED RIGHT TRIANGLE STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawHollowInvertedRightTriangleStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"INVERTED MIRRORED RIGHT TRIANGLE STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawInvertedMirroredRightTriangleStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"HOLLOW INVERTED MIRRORED RIGHT TRIANGLE STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawHollowInvertedMirroredRightTriangleStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"PYRAMID STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawPyramidStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"HOLLOW PYRAMID STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawHollowPyramidStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"HOLLOW INVERTED PYRAMID STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawHollowInvertedPyramidStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"HALF DIAMOND STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawHalfDiamondStarPattern(rowssize);
        
        System.out.println(solutionsDivisionLine+"MIRRORED HALF DIAMOND STAR PATTERN"+solutionsDivisionLine);
        testProgram.drawMirroredHalfDiamondStarPattern(rowssize);
        
        
    }
    
}
