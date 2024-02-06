import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Depósito extends JFrame {
    private JPanel DepósitoPanel;
    private JTextField DepositoTxt;
    private JButton a0Button ,a1Button, a2Button, a3Button ,a4Button, a5Button, a6Button, a7Button ,a8Button, a9Button;
    private JButton puntoButton, deleteButton, ENTERButton, volverButton;
    private JLabel ValidarLabel;

    public  double valorDeposito, valorSaldo=Saldo.getValorSaldo();

    public Depósito(){
        super("                                   DEPÓSITO                          ");
        setContentPane(DepósitoPanel);
        getRootPane().setWindowDecorationStyle(JRootPane.COLOR_CHOOSER_DIALOG);
        setUndecorated(true);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+a1Button.getText());}
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+a2Button.getText());}
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+a3Button.getText());}
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+a4Button.getText());}
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+a5Button.getText());}
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+a6Button.getText());}
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+a7Button.getText());}
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+a8Button.getText());}
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+a9Button.getText());}
        });
        puntoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+puntoButton.getText());}
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {DepositoTxt.setText(DepositoTxt.getText()+a0Button.getText());}
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = DepositoTxt.getText();
                if (currentText.length() > 0) {
                    DepositoTxt.setText(currentText.substring(0, currentText.length() - 1));
                }

            }
        });
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    valorDeposito = Double.parseDouble(DepositoTxt.getText());
                    JOptionPane.showMessageDialog(null,"Depósito realizado con éxito !!!");
                    Saldo.Depósito(valorDeposito);
                    Retiro retiro = new Retiro();
                    retiro.setLocationRelativeTo(null);
                    retiro.setVisible(true);
                    retiro.pack();
                    dispose();
                }catch (Exception exception){
                    DepositoTxt.setText("");
                    ValidarLabel.setText("Datos inválidos");
                }


            }
        });


        volverButton.addActionListener(new ActionListener() {
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