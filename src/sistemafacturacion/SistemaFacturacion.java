
package sistemafacturacion;
import datos.AdministradorDAO;
import datos.SupermercadoDAO;
import entidad.Administrador;
import entidad.Supermercado;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import presentacion.DialogAdministrador;
import presentacion.DialogSupermercado;
import presentacion.FrmPrincipal;
import presentacion.FrmLoginAdministrador;
import presentacion.FrmRegistrarAdministrador;
import presentacion.FrmRegistrarSupermercado;

public class SistemaFacturacion {
    private static Supermercado supermercado;
    private static Administrador administrador;
    
    public static void main(String[] args) {
        traerSuper();

    }
    
    
    private static void traerSuper() {
        try {
            supermercado = SupermercadoDAO.getInstancia().obtenerPrimerSupermercado();
            if(supermercado == null) {
                FrmRegistrarSupermercado frmSuper = new FrmRegistrarSupermercado();
                frmSuper.setVisible(true);    
            } else {
                traerAdmin();
            }
        } catch (SQLException sup) {
            JOptionPane.showMessageDialog(null,sup.getMessage());
        }
    }
    
    private static void traerAdmin() {
        try {
            Administrador administrador = AdministradorDAO.getInstancia().obtenerPrimerAdmin();
            if(administrador == null) {
                FrmRegistrarAdministrador frmRegistrar = new FrmRegistrarAdministrador();
                frmRegistrar.setVisible(true);
            } else {
                FrmLoginAdministrador frmLogin = new FrmLoginAdministrador();
                frmLogin.setVisible(true);
            }
        } catch (SQLException su) {
            JOptionPane.showMessageDialog(null,su.getMessage());
        }
    }
    
    
}
