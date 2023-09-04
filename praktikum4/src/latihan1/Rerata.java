/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author jordan
 */
public class Rerata {
    public static void main(String[] args) {
        int[][] siswa = {{81, 90, 62}, {50, 83, 87}, {89, 55, 65}, {77, 70, 92}};
        float rerata;
        
        System.out.println("NRP     Rata-rata");
        for (int i = 0; i < siswa.length; i++) {
            System.out.print(i + 1);
            rerata = 0;
            
            for (int j = 0; j < siswa[0].length; j++) {
                rerata += siswa[i][j];
            }
            System.out.println("        " + rerata / siswa[0].length);
        }
    }
}
