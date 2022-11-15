package BUS;

import DAO.TaiKhoan_DAO;
import DTO.TaiKhoan_DTO;
import java.util.List;

public class TaiKhoan_BUS {
    private TaiKhoan_DAO taikhoan_DAO;

    public TaiKhoan_BUS() {
        taikhoan_DAO = new TaiKhoan_DAO();
    }
    
    public TaiKhoan_DTO LayTaiKhoanBangMTK(String maSP){
        return taikhoan_DAO.LayTaiKhoanBangMTK(maSP);
    }
}
