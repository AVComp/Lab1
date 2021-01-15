public class Lab1 {
    /*
    Class: CSE 1322L
    Section: J05
    Term: Spring 2021
    Instructor: Jorge Vera
    Name: Amberlee Vang
    Lab#: 1
    */


    public static char[][] make_forward(){
        char[][] pixel = new char[4][13];
        pixel[0][0]=' ';
        pixel[0][1]=' ';
        pixel[0][2]='_';
        pixel[0][3]='_';
        pixel[0][4]='_';
        pixel[0][5]='_';
        pixel[0][6]='_';
        pixel[0][7]='_';
        pixel[0][8]=' ';
        pixel[0][9]=' ';
        pixel[0][10]=' ';
        pixel[0][11]=' ';
        pixel[0][12]=' ';
        pixel[1][0]=' ';
        pixel[1][1]='/';
        pixel[1][2]='|';
        pixel[1][3]='_';
        pixel[1][4]='|';
        pixel[1][5]='|';
        pixel[1][6]='_';
        pixel[1][7]='\\';
        pixel[1][8]='\'';
        pixel[1][9]='.';
        pixel[1][10]='_';
        pixel[1][11]='_';
        pixel[1][12]=' ';
        pixel[2][0]='(';
        pixel[2][1]=' ';
        pixel[2][2]=' ';
        pixel[2][3]=' ';
        pixel[2][4]='_';
        pixel[2][5]=' ';
        pixel[2][6]=' ';
        pixel[2][7]=' ';
        pixel[2][8]=' ';
        pixel[2][9]='_';
        pixel[2][10]=' ';
        pixel[2][11]='_';
        pixel[2][12]='\\';
        pixel[3][0]='=';
        pixel[3][1]='\'';
        pixel[3][2]='-';
        pixel[3][3]='(';
        pixel[3][4]='_';
        pixel[3][5]=')';
        pixel[3][6]='-';
        pixel[3][7]='-';
        pixel[3][8]='(';
        pixel[3][9]='_';
        pixel[3][10]=')';
        pixel[3][11]='-';
        pixel[3][12]='\'';
        return pixel;
    }

    public static void make_mirror(char[][] arr1){
        for(int r = 0; r < arr1.length; r++){
            for(int c = 0; c < arr1[r].length/2; c++){
                if(arr1[r][c] == '('){
                    arr1[r][c] = ')';
                }else if(arr1[r][c] == '/') {
                    arr1[r][c] = '\\';
                }

                char temp = arr1[r][c];
                arr1[r][c] = arr1[r][arr1[r].length-c-1]; //replace column
                arr1[r][arr1[r].length-c-1] = temp;

                if(arr1[r][c] == ')'){
                    arr1[r][c] = '(';
                }else if(arr1[r][c] == '\\'){
                    arr1[r][c] = '/';
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] asciiArt;

        asciiArt = make_forward();

        for(char[] ascii : asciiArt)
        {
            System.out.println(ascii);
        }

        make_mirror(asciiArt);

        for(char[] ascii : asciiArt)
        {
            System.out.println(ascii);
        }



    }
}
