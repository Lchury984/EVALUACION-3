import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JFrame{
    private JPanel RetiroPanel;
    private JTextField RetiroTxt;
    private JButton Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9;
    private JButton EnterButton, BorrarButton, volverAlMenúButton;
    private JLabel ValidarLabel;
    public  double valorRetiro, valorSaldo=Saldo.getValorSaldo();

    public Retiro(){
        super("                                     RETIRO                             ");
        setContentPane(RetiroPanel);
        getRootPane().setWindowDecorationStyle(JRootPane.COLOR_CHOOSER_DIALOG);
        setUndecorated(true);

        //------------------------------------------------------------- botones números -----------------------------------------------------------
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {RetiroTxt.setText(RetiroTxt.getText()+Button1.getText());}
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RetiroTxt.setText(RetiroTxt.getText()+Button2.getText());
            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RetiroTxt.setText(RetiroTxt.getText()+Button3.getText());
            }
        });
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RetiroTxt.setText(RetiroTxt.getText()+Button4.getText());
            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RetiroTxt.setText(RetiroTxt.getText()+Button5.getText());
            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RetiroTxt.setText(RetiroTxt.getText()+Button6.getText());
            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RetiroTxt.setText(RetiroTxt.getText()+Button7.getText());
            }
        });
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RetiroTxt.setText(RetiroTxt.getText()+Button8.getText());
            }
        });
        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RetiroTxt.setText(RetiroTxt.getText()+Button9.getText());
            }
        });
        Button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RetiroTxt.setText(RetiroTxt.getText()+Button0.getText());
            }
        });
        //----------------------------------------------- BORRAR ------------------------------------------------------------
        BorrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = RetiroTxt.getText();
                if (textoActual.length() > 0) {
                    RetiroTxt.setText(textoActual.substring(0, textoActual.length() - 1));
                }
            }
        });
        EnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    valorRetiro = Double.parseDouble(RetiroTxt.getText()); // valor obtenido del textField
                    if(valorRetiro == 0) {

                        JOptionPane.showMessageDialog(null,"Ingrese un valor mayor a cero");
                        dispose();

                        Retiro retiro = new Retiro();
                        retiro.setLocationRelativeTo(null);
                        retiro.setVisible(true);
                        retiro.pack();
                        dispose();


                    }else if(valorRetiro>0 && valorRetiro < valorSaldo){
                        JOptionPane.showMessageDialog(null,"Retiro realizado con éxito !!!");
                        dispose();
                        Saldo.Retiro(valorRetiro); // Clase.Función(parametro)
                        Retiro retiro = new Retiro();
                        retiro.setLocationRelativeTo(null);
                        retiro.setVisible(true);
                        retiro.pack();
                        dispose();

                    }else{
                        JOptionPane.showMessageDialog(null,"Su saldo es insuficiente !!!");

                        Retiro retiro = new Retiro();
                        retiro.setLocationRelativeTo(null);
                        retiro.setVisible(true);
                        retiro.pack();
                        dispose();

                    }

                } catch (Exception exception ) {
                    RetiroTxt.setText("");
                    ValidarLabel.setText("Datos inválidos");
                }


            }
        });
        volverAlMenúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transacción transaccion = new Transacción();
                transaccion.setLocationRelativeTo(null);
                transaccion.setVisible(true);
                transaccion.pack();

                dispose();
            }
        });
    }
}