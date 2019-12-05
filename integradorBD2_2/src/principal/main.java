package principal;

public class main {
    public static void main(String[] args) {
        //System.out.println("Carro{"+"Placa= "+"NBZT1"+", Precio= "+99000+", Seminuevo= "+"si"+", Color= Brown"+", Modelo= "+"Tird"+", Marca= "+"yes"+", Year= "+1997+"}");        
        //login
        inicioSesion login = new inicioSesion();
        login.setVisible(false);
    
        //admin
        menuPrincipal admin = new menuPrincipal();
        admin.setVisible(false);
        
        //usuario
        menuPrincipalUsuario usuario = new menuPrincipalUsuario();
        usuario.setVisible(false);
        
        //nuevo coche    
        nuevoCoche form1 = new nuevoCoche();
        form1.setVisible(false);
        
        //actualizar coche
        actualizarCoche actualizar = new actualizarCoche();
        actualizar.setVisible(false);
        
        splash sp = new splash();
        sp.setVisible(true);
        
        //login
        inicioSesion login1 = new inicioSesion();
        login.setVisible(false);
        
        try {
            for (int i = 0; i < 101 ; i++) {
                if(i==100){
                    login.setVisible(true);
                    sp.setVisible(false);
                }
                Thread.sleep(15);
                sp.jLabel3.setText(Integer.toString(i));
                sp.jProgressBar1.setValue(i);
            }
        } catch (Exception e) {
        }
        
    }
    
}


/* 
gray 77, 77, 51
grass green 153, 255, 51
light gray 194, 194, 163
white 255, 255, 255
blue 0, 153, 204
*/