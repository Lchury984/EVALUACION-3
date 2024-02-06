import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel LoginPanel;
    private JTextField UsuarioText;
    private JPasswordField ContraseñaTxt;
    private JButton loginButton;
    private JLabel ValidarLabel;
    public String usuario1="Crespo_Pastillo",contraseña1="EPN123";
    public double valorRetiro;
    public Login() { // Constructor

        super("Login"); // Títilo de la ventana
        setContentPane(LoginPanel); // Panel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Barra de cerrar
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (contraseña1.equals(ContraseñaTxt.getText()) && usuario1.equals(UsuarioText.getText())) {
                    //---------------------------------------- Transacción -----------------------------------------
                    Transacción transaccion = new Transacción();
                    //transaccion.setUndecorated(true);
                    transaccion.setLocationRelativeTo(null);
                    transaccion.setVisible(true);
                    transaccion.pack();

                    dispose();

                } else {
                    // -------------------------------------- Datos incorrectos ----------------------------------------------
                    UsuarioText.setText("");
                    ContraseñaTxt.setText("");
                    ValidarLabel.setText("Credenciales incorrectas");
                    JOptionPane.showMessageDialog(null, "        Intentelo Nuevamente");



                }
            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login(); // Crea el objeto
        login.setLocationRelativeTo(null);
        login.setVisible(true); // mostrar ventana
        login.pack(); // paraa mostrar
    }
}
