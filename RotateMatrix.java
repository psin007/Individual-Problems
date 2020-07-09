/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview;

/**
 *
 * @author Pooja
 */
public class RotateMatrix {
    
        public boolean rotate(int[][] m){
            
            if(m.length == 0 || m.length != m[0].length)
                return false;
            
            for(int layer = 0; layer < m.length / 2; layer ++){
                int first = layer;
                int last = m.length - 1 - layer;
                for(int i = first; i < last ; i++){
                    int offset = i- first;
                    int top = m[first][i]; //save top
                    m[first][i] = m[last - offset][first]; // left - > top
                    m[last - offset][first] = m[last][last - offset]; // bottom - > left
                    m[last][last-offset] = m[i][last]; // right - > bottom
                    m[i][last] = top;// top -> right
                    //to visualise, remember first and last are not moving ; i and last - offset are moving
                }
            } 
            return true;
        }
    
        public static void main(String args[]){
            RotateMatrix obj = new RotateMatrix();
            int[][] matrix  = {{1,2},{3,4}};
            boolean returnValue;
            returnValue = obj.rotate(matrix);
            System.out.println(returnValue);
        }
}
