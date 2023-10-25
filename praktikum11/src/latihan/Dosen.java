/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author jordan
 */
public class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;
    
    public Dosen() {
        super();
    }
    
    public Dosen(String username, String password) {
        super(username, password);
    }
    
    @Override
    public boolean login(String username, String password) {
        if(super.getUsername() != username || super.getPassword() != password) return false;
        return true;
    }
    
    public boolean login(String username, String password, String key) {
        if(super.getUsername() != username || super.getPassword() != password || this.key != key) return false;
        return true;
    }

//    public String getPangkat() {
//        return pangkat;
//    }
//
//    public void setPangkat(String pangkat) {
//        this.pangkat = pangkat;
//    }
//
//    public String getGolongan() {
//        return golongan;
//    }
//
//    public void setGolongan(String golongan) {
//        this.golongan = golongan;
//    }
//
//    public String getKey() {
//        return key;
//    }
//
//    public void setKey(String key) {
//        this.key = key;
//    }
    
    
}
