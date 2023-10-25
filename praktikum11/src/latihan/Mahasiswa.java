/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author jordan
 */
public class Mahasiswa extends User {
    private Dosen dosenWali;
    private String kelas;
    
    public Mahasiswa() {
        super();
    }
    
    public Mahasiswa(String username, String password) {
        super(username, password);
    }
    
    public boolean login(String username, String password, String key) {
        return true;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    
}
