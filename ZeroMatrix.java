/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview;

/**
 *An algorithm such that if an element in an M*N matrix is 0, its entire row and col is set to 0
 * @author Pooja
 */
public class ZeroMatrix {
    void setZeroes(int[][] m){
        boolean[] row = new boolean[m.length];
        boolean[] col = new boolean[m[0].length];
        
        //store row and col index with val 0
        
        for(int i = 0; i < m.length;i++){
            for(int j = 0; j< m[0].length; j++){
                if(m[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        for(int i = 0; i < row.length; i++){
            if(row[i])
                nullifyRow(m,i);
        }
        
        for(int j =0 ; j < col.length; j++){
            if(col[j])
                nullifyCol(m,j);
        }
        
    }
    
    void nullifyRow(int[][] m, int row){
        for(int j = 0 ; j < m[0].length;j++){
            m[row][j] = 0;
        }
    }
    
    void nullifyCol(int[][]m, int col){
        for(int i = 0; i < m.length; i++){
            m[i][col] = 0;
        }
    }
    
    
    
    
    //Another way using first row and column
    
    void setZero(int[][]m){
        boolean rowHasZero = false;
        boolean colHasZero = false;
        
        //check if first ro has zero
        for(int j= 0; j< m[0].length; j++){
            if(m[0][j] == 0)
                rowHasZero = true;
        }
        
        //check if first col has zero
        for(int i = 0; i < m.length;i++){
            if(m[i][0] ==0)
                colHasZero = true;
        }
        
        //check in rest of the array
        for(int i = 0; i < m.length;i++){
            for(int j = 0; j < m[0].length; j++){
                if(m[i][j] == 0){
                    m[0][j]= 0;
                    m[i][0]=0;
                }
            }
        }
        //nullify based on first col
        for(int i = 0; i < m.length;i++){
            if(m[i][0] == 0)
                nullifyRow(m, i);
        }
        
        //nullify based on first row
        
        for(int j=0;j<m[0].length;j++){
            if(m[0][j] == 0)
                nullifyCol(m, j);
        }
        
        //based on boolean value
        if(rowHasZero)
            nullifyRow(m,0);
        
        if(colHasZero)
            nullifyCol(m,0);
    }
    
}
