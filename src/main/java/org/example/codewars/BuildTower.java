package org.example.codewars;

public class BuildTower {
        public static String[] towerBuilder(int nFloors)
        {
            int width = calculateWidth(nFloors);
            int floor = 1;
            String[] tower = new String[nFloors];
            for(int i = 0; i < nFloors; i++){
                tower[i] = buildRow(width , floor);
                floor++;
            }
            printTower(tower);
            return tower;
        }

        private static int calculateWidth(int nFloors){
            return nFloors * 2 - 1;
        }

        private static String buildRow(int width, int floor){
            String row = "";
            //Build The Stars
            int stars = floor * 2 - 1;
            for(int i = 0; i < stars; i++){
                row += "*";
            }
            //Creates Spaces
            int spaces = width - stars;
            for(int i = 0; i < spaces/2; i++){
                row = " " + row;
            }
            for(int i = 0; i < spaces/2; i++){
                row += " ";
            }
            return row;
        }

        private static void printTower(String[] tower){
            for(String s : tower){
                System.out.println(s);
            }
        }

}
