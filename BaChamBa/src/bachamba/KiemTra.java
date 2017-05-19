/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachamba;

/**
 *
 * @author Minh Tri
 */
public class KiemTra {
    KiemTra(){}
    private static boolean kt_trong;
    private static boolean kt_ngay;
    public static boolean ThucHien_KT_Trong(String Ma, String Ten, String NgaySinh)
    {
        kt_trong = false;
        if(Ma.equals("") || Ten.equals("") || NgaySinh.equals(""))
            kt_trong = true;
        return kt_trong;
    }
    public static boolean ThucHien_KT_Ngay(String NgayThang)
    {
        kt_ngay = false;
        //
        String datePattern = "\\d{1,2}/\\d{1,2}/\\d{4}";
        kt_ngay = NgayThang.matches(datePattern);
        return kt_ngay;
    }
    
}
