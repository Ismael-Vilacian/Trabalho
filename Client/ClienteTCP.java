package Client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClienteTCP {
    
    public Bhaskara enviarDados(Bhaskara bhaskara) {
        ObjectOutputStream saida;
        ObjectInputStream entrada;

        Socket conexao;

        try {
            conexao = new Socket("localhost", 9000);
            System.out.println("conectado ao servidor na porta 9000");
            saida = new ObjectOutputStream(conexao.getOutputStream());
            entrada = new ObjectInputStream(conexao.getInputStream());

            
            saida.writeObject(bhaskara);

            
            bhaskara = (Bhaskara) entrada.readObject();

            entrada.close();
            saida.close();
            conexao.close();

            return bhaskara;

        } catch (Exception e) {
           
            return null;
        }
    }
}
